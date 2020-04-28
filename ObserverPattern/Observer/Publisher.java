package Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    
    public void addObserver(Observer ob){
    	observers.add(ob);
    }

    public void notifyAllObserver(){
    	for(Observer observer: observers) {
    		observer.update();
    		
    	}
    }

    public int getState(){
        return this.state;
    }

    public void setState(int state){
    	this.state = state;
    	this.notifyAllObserver();
    }

}
