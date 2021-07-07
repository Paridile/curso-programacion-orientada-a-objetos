public class Car {
	private Integer id;
	private String  license;
	private Account  driver;
	private Integer passenger;

	public Car(){}
	
	public Car(Integer id,String license, Account driver, Integer passenger) {
		this.id=id;
		this.license=license;
		this.driver=driver;
		this.passenger=passenger;		
	}	

	public Car(String license, Account driver) {
		this.license = license;
		this.driver = driver;		
	}
		

	public void printData() {
		System.out.println("Id: " + id + " license: " + license + " driver: " + driver.name + " passengers: " + passenger);
	}

	public Integer getPassenger() {
		return passenger;
	}

	public void setPassenger(Integer passenger) {
		if(passenger == 4)
			this.passenger = passenger;
		else
			System.out.println("Necesitas asignar 4 pasajeros");
	}

}
