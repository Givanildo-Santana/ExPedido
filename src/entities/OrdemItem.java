package entities;

public class OrdemItem {
	private Integer quantity;
	private Double price;

	public OrdemItem() {

	}

	public OrdemItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Order data \n");
		sb.append("Quantity: " + quantity + "\n");
		sb.append("Price: " + price);
		
		
		return sb.toString();
		
	}

}
