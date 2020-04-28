package Observer;

public class Observer2 implements Observer {
    private Publisher publisher;
    public Observer2(Publisher p) {
    	this.publisher =p;
    	this.publisher.addObserver(this);
    }
    public void update(){
    	System.out.println(Integer.toHexString(publisher.getState()));
    }

}
