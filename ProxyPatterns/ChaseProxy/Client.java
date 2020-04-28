package ChaseProxy;

public class Client {
	public static void main(String[] args) {
		Girl Lex = new Girl();
		Lex.setName("Lex");
		Pursuit Xan = new Pursuit(Lex);
		ChaseProxy proxy = new ChaseProxy(Xan);
		
		proxy.giveDolls();
		proxy.giveflower();
		proxy.goOutsides();
	}
}
