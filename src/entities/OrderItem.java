package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	private Produto produto;
	
	public OrderItem() {
		
	}
	public OrderItem(Integer quantity, Double price, Produto produto) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.produto = produto;
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
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		return  getProduto().getNomeProd()
			  + ", R$ "
			  + String.format("%.2f", price)
			  + ", Quantidade: "
			  + quantity
			  + ", SubTotal: R$ "
			  + String.format("%.2f", subTotal());
	}
	
}
