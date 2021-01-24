package entities;

public class Produto {

	private String nomeProd;
	private Double precoProd;
	
	public Produto() {
		
	}
	
	public Produto(String nomeProd, Double precoProd) {
		this.nomeProd = nomeProd;
		this.precoProd = precoProd;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public Double getPrecoProd() {
		return precoProd;
	}

	public void setPrecoProd(Double precoProd) {
		this.precoProd = precoProd;
	}
	
}
