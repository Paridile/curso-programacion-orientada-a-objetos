class Main {
	public static void main(String[] args) {
		Car car = new Car("asdd", new Account("El nombre", "ASD432"));
		car.setPassenger(4);
		car.printData();

		UberVan uberVan = new UberVan("ASDFSD",new Account("ASDGDFG", "FDGDF3434"));
		uberVan.setPassenger(6);
		uberVan.printData();
	}
}