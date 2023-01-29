package syain;

public class Item {

	private Integer item_ID;
	private String item_name;
	private Integer unit_price;
	private Integer quantity;
	private Integer qty_amount;
	private Integer price;

	public Integer getItem_ID() {
		return item_ID;
	}

	public void setItem_ID(Integer item_ID) {
		this.item_ID = item_ID;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Integer getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Integer unit_price) {
		this.unit_price = unit_price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getQty_amount() {
		return qty_amount;
	}

	public void setQty_amount(Integer qty_amount) {
		this.qty_amount = qty_amount;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
