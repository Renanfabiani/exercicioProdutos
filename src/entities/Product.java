package entities;

public class Product {
	private String name;//usa o private para encapsulamento
	private double price;//usa o private para encapsulamento
	private int quantity;//usa o private para encapsulamento

	
	public Product() {//construtor padrão
		}
	
	public Product (String name, double price, int quantity) {//isso é um construtor, vem a palavra public e o nome dele
		this.name = name;//informa que o atributo name recebe o name que deu no projeto
		this.price = price;//informa que o atributo price recebe o price que deu no projeto
		this.quantity = quantity;//informa que o atributo quantity recebe o quantity que deu no projeto
	}
	
	public Product (String name, double price) {//faz com que o quantity inicie com 0
		this.name = name;
		this.price = price;
		}
	
	public String getName () {//o get serve para chamar o atributo no programa
		return name;
	}
		
	public void setName (String name) {//o set serve para alterar valores do atributo, sempre usa o void nele
		this.name = name;
	}
		
	public double getPrice() {
		return price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public int getQuantity () {//não criar o set nesse caso porque ele só altera a quantidade com entrada e saída de material, não pode dar um valor x pra ele
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}