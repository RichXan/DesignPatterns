package menento;

public class Client {
	 public static void main(String[] args) {
	      Originator originator = new Originator();
	      Caretaker careTaker = new Caretaker();
	      originator.setState("State 1");
	      originator.setState("State 2");
	      careTaker.add(originator.setStateToMemento());
	      originator.setState("State 3");
	      careTaker.add(originator.setStateToMemento());
	      originator.setState("State 4");
	 
	      System.out.println("Current State: " + originator.getState());    
	      originator.getStateFromMenmento(careTaker.get(0));
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMenmento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getState());
	   }
}
