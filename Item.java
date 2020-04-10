class Item {
	int id;
	String name;
	double price;

	//TODO add variable.

	char taxType; //A=18%, B=5%, C=0%

	//TODO constructor

	public Item() {}

	public Item(int id, String name, double price, char taxType) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}


	//TODO setters and getters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getTaxType() {
		return taxType;
	}

	public void setTaxType(char taxType) {
		this.taxType = taxType;
	}

	double getTaxReturn () {
		//TODO
		double res=0;
		double DDV=0;
		if(taxType=='A'){
			DDV= (price*18)/100;
		}else if(taxType=='B'){
			DDV= (price*5)/100;
		}else if(taxType=='C'){
			DDV = price*0;
		}
		res=(DDV*15)/100;
		return res;
	}

}

