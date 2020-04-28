package Observer;

public class Demo {
	public static void main(String[] args) {
		Publisher publisher = new Publisher();

		new Observer1(publisher);
		new Observer2(publisher);
		new Observer3(publisher);
 
		System.out.println("First state change: 15");   
		publisher.setState(15);
		System.out.println("Second state change: 10");  
		publisher.setState(10);
	}
}
