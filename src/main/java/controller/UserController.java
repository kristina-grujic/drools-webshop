package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dto.LoginDTO;
import dto.CustomerDTO;
import model.User;
import model.Customer;
import security.SecurityConfiguration;
import security.TokenUtils;
import service.CustomerService;


@RestController
public class UserController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private CustomerService userService;

	@Autowired
	private SecurityConfiguration securityConfig;

	@Autowired
	TokenUtils tokenUtils;


	@RequestMapping(value = "/api/login", produces = "text/plain", method = RequestMethod.POST)
	public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
        try {
			UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
					loginDTO.getUsername(), loginDTO.getPassword());
            Authentication authentication = authenticationManager.authenticate(token);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            UserDetails details = userDetailsService.loadUserByUsername(loginDTO.getUsername());
            return new ResponseEntity<String>(tokenUtils.generateToken(details), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<String>("Invalid login", HttpStatus.UNAUTHORIZED);
        }
	}

	@RequestMapping(value = "/api/register", method = RequestMethod.POST)
	public ResponseEntity<String> addUser(@RequestBody CustomerDTO registrationDTO) {
		User exists = userService.findOne(registrationDTO.getUsername());
		if (exists != null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Customer user  = new Customer();
		user.setUsername(registrationDTO.getUsername());
		user.setFirst_name(registrationDTO.getFirstName());
		user.setLast_name(registrationDTO.getLastName());
		user.setPassword(securityConfig.passwordEncoder().encode(registrationDTO.getPassword()));

		userService.save(user);
		return new ResponseEntity<String>("Created", HttpStatus.OK);
	}
}
