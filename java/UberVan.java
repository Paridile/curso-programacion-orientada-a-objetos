import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
	Map<String,Map<String,Integer>> typeCarAccepted;
	ArrayList<String> seatsMaterial;
	private Integer passenger;

	public UberVan(String license, Account driver, Map<String,Map<String,Integer>> typeCarAccepted ,ArrayList<String> seatsMaterial) {
		super(license,driver);
		this.typeCarAccepted = typeCarAccepted;
		this.seatsMaterial = seatsMaterial;
	}

	public UberVan(String license, Account driver) {
		super(license,driver);
	}

	
	@Override
	public void setPassenger(Integer passenger) {
		if(passenger == 6)
			this.passenger = passenger;
		else
			System.out.println("Necesitas asignar 4 pasajeros");
	}

	public Integer getPassenger() {
		return passenger;
	}

	@Override
	public void printData() {
		System.out.println("Id: " + this.getId() + " license: " + this.getLicense() + " driver: " + this.getDriver().getName() + " passengers: " + this.passenger);
	}


}