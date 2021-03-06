package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Receipt;

public interface ReceiptRepository extends JpaRepository<Receipt, String> {
	public Receipt findById(String id);
}
