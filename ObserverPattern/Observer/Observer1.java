package Observer;

public class Observer1 implements Observer {
    private Publisher publisher;
    public Observer1(Publisher p) {
    	this.publisher = p;
    	this.publisher.addObserver(this);
    	
    }
    public void update(){
    	System.out.println(Integer.toBinaryString(this.publisher.getState()));
    }

}
