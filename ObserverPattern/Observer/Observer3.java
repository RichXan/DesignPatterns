package Observer;

public class Observer3 implements Observer {
    private Publisher publisher;
    public Observer3(Publisher p ) {
    	this.publisher = p;
    	this.publisher.addObserver(this);
    }

    public void update(){
    	System.out.println(Integer.toOctalString(this.publisher.getState()));
    }

}
