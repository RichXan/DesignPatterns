package Dress;

public class Client {
	public static void main(String[] args) throws NullPointerException{
		People people = new People("xan");
		UnderWear underwear = new UnderWear();
		Shirts shirts = new Shirts();
		Jeans jeans = new Jeans();
		
		underwear.setpeople(people);
		shirts.setpeople(underwear);
		jeans.setpeople(shirts);
		
		jeans.show();
		
	}

}
