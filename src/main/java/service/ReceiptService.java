package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.ReceiptDTO;
import model.Receipt;
import repository.ReceiptRepository;

@Service
public class ReceiptService {
	@Autowired
	ReceiptRepository receiptRepository;

	public Receipt findOne(String id) {
		return receiptRepository.findOne(id);
	}

	public List<Receipt> findAll() {
		return receiptRepository.findAll();
	}

	public Receipt save(Receipt receipt) {
		return receiptRepository.save(receipt);
	}

	public void remove(String id) {
		receiptRepository.delete(id);
	}

	public Receipt getEntity(ReceiptDTO e) {
		return findOne(e.getId());
	}
}
