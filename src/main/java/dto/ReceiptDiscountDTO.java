package dto;
import model.ReceiptDiscount;

public class ReceiptDiscountDTO extends DiscountDTO {
	public ReceiptDTO receipt;
	
	public ReceiptDiscountDTO(ReceiptDiscount ad) {
		super(ad);
		this.receipt = new ReceiptDTO(ad.getReceipt());
	}

	public ReceiptDTO getReceipt() {
		return receipt;
	}

	public void setReceipt(ReceiptDTO receipt) {
		this.receipt = receipt;
	}
	
}
