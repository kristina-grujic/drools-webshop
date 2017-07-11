package security;

import java.util.ArrayList;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class AuthorizationUtils {
	
	public static boolean hasAuthority(Authentication authentication, String authority){
		ArrayList<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(authentication.getAuthorities());
	    GrantedAuthority auth = new SimpleGrantedAuthority(authority);
		return authorities.contains(auth);
	}

}
