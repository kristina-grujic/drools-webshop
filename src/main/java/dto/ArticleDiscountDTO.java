package dto;

import model.ArticleDiscount;

public class ArticleDiscountDTO extends DiscountDTO {
	public ReceiptDTO receipt;
	public ReceiptItemDTO item;
	
	public ArticleDiscountDTO(ArticleDiscount ad) {
		super(ad);
		this.receipt = new ReceiptDTO(ad.getReceipt());
		this.item = new ReceiptItemDTO(ad.getItem());
	}

	public ReceiptDTO getReceipt() {
		return receipt;
	}

	public void setReceipt(ReceiptDTO receipt) {
		this.receipt = receipt;
	}

	public ReceiptItemDTO getItem() {
		return item;
	}

	public void setItem(ReceiptItemDTO item) {
		this.item = item;
	}
	
}
