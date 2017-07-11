package model;

public class ReceiptDiscount extends Discount {
	public Receipt receipt;

	public ReceiptDiscount(String id, int discount, boolean is_additional, Receipt receipt) {
		super(id, discount, is_additional);
		this.receipt = receipt;
	}

	public Receipt getReceipt() {
		return receipt;
	}

	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}

	@Override
	public String toString() {
		return "ReceiptDiscount [receipt=" + receipt + ", id=" + id + ", discount=" + discount + ", is_additional="
				+ is_additional + "]";
	}
	
}
