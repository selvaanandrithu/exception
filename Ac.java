package exception;

public class Ac {
	private String brand;
	private String model;
	private int price;
	private int noOfMonthsWarranty;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfMonthsWarranty() {
		return noOfMonthsWarranty;
	}
	public void setNoOfMonthsWarranty(int noOfMonthsWarranty) {
		this.noOfMonthsWarranty = noOfMonthsWarranty;
	}
	public Ac(String brand, String model, int price, int noOfMonthsWarranty) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.noOfMonthsWarranty = noOfMonthsWarranty;
		gud
	}
	@Override
	public String toString() {
		return "Ac [brand=" + brand + ", model=" + model + ", price=" + price + ", noOfMonthsWarranty="
				+ noOfMonthsWarranty + "]";
	}
	

}
