package MarketCounter;

public class Client {
	public static void main(String[] args) {
		Context context = new Context(new StrategyC());
		System.out.println(context.executeOperation((float) 220.0));
	}
}
