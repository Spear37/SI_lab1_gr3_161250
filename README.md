# SI_lab1_gr3_161250
Лабораториска Вежба бр.1
1. osnovnite komanda user.name i user.email, za prvo da se vnesam kako korisnik so ime i email 
 git clone za da ja prezemam datotekata od linkot
 git name za promena na imeto na datotekata
 pravenje na rescan, stage i commit na povekje chekori
 sinhronizacija so remotnata datoteka na povekje chekori 
 branch za novata granka, i merge za posle da ja spojam so master
 
2. 

 >> (16, makaroni, 52)
(17, sok, 60)
(18, chokolado, 59)
(19. chips, 30)
(20, kolac, 120)

>> (16, makaroni, 52)
(17, sok, 60)
(18, chokolado, 59)
(19. chips, 30)
(20, kolac, 120)
(16, makaroni, 52, A)
(17, sok, 60, B)
(18, chokolado, 59, Б)
(19. chips, 30, A)
(20, kolac, 120, B)

>> 

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
		//TODO
		double ostatok = this.price;
		if (this.ddv == 'A') then ostatok = ostatok*0.18;
			else
				{ if (this.ddv == 'Б') then ostatok = ostatok*0.05;
					else ostatok = 0; }
		return ostatok*0.15;		

>> 

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



(16, makaroni, 52, A)
(17, sok, 60, B)
(18, chokolado, 59, Б)
(19. chips, 30, A)
(20, kolac, 120, B)
(19. chips, 35, A)
(20, kolac, 120, B)
(21, kornishon, 60, Б)
(22, feferona, 70, A) 

3. https://github.com/Spear37/SI_lab1_gr3_161250.git
