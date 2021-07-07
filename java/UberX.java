public class UberX extends Car{
	String brand;
	String model;	
	public UberX(String license, Account driver,String brand,String model) {
		super(license,driver);
		this.brand = brand;
		this.model = model;
	}	

	@Override
	public void printData() {
		System.out.println("Id: " + this.getId() + " license: " + this.getLicense() + " driver: " + this.getDriver().getName() + " passengers: " + this.getPassenger() + " brand: " + this.brand + " model: " + this.model);
	}
}
