class Account {
	private Integer id;
	public  String name;
	private String document;
	private String email;
	private String password;

	public Account(String name,String document) {
		this.name = name;
		this.document = document;
	}

	public Account(Integer id,String name,String document,String email,String password) {
		this.id=id;
		this.name= name;
		this.document=document;
		this.email=email;
		this.password=password;
	}



}
