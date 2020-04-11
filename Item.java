class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char ddv;

	//TODO constructor
	void Item(int id, String name, double price, char ddv) {
	this.id = id;
	this.name = name;
	this.price = price;
	this.ddv = ddv;}

	//TODO setters and getters

	void setId(int id) {this.id = id;}

	void setName(String name) {this.name = name;}

	void setPrice(double price) {this.price = price;}

	void setDdv(char ddv) {this.ddv = ddv;}


	int getId() {return this.id;}

	String getName() {return this.name;}

	double getPrice() {return this.price;}

	char getDdv() {return this.ddv;}



	double taxReturn () {
		double ostatok = this.price;
		if (this.ddv == 'A') then ostatok = ostatok*0.18;
			else
				{ if (this.ddv == 'Б') then ostatok = ostatok*0.05;
					else ostatok = 0; }
		return ostatok*0.15;		
		
	}
}

class Receipt {

	List<Item> Receipt= new ArrayList<>();

	double Final (List<Item> Receipt){
	double final = 0;
	while (!Receipt.isEmpty()) {
		final = final + Receipt.getPrice();
		Receipt = Receipt.next();}

	return final;}

	List<Item> addItem (int id, String name, double price, char ddv) {
		while (!Receipt.isEmpty()) Receipt = Receipt.next();

		item a = new item(id, name, price, ddv);
		Receipt = item;

}