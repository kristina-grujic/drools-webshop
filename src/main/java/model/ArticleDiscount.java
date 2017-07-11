package model;

public class ArticleDiscount extends Discount {
	public Receipt receipt;
	public ReceiptItem item;

	public ArticleDiscount(String id, int discount, boolean is_additional, Receipt receipt, ReceiptItem receipt_item) {
		super(id, discount, is_additional);
		this.receipt = receipt;
		this.item = receipt_item;
	}

	public Receipt getReceipt() {
		return receipt;
	}

	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}

	public ReceiptItem getItem() {
		return item;
	}

	public void setItem(ReceiptItem item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ArticleDiscount [receipt=" + receipt + ", item=" + item + ", id=" + id + ", discount=" + discount
				+ ", is_additional=" + is_additional + "]";
	}
	
	
	
}
