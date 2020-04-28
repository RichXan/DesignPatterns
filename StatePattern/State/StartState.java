package State;

public class StartState implements State {

    public void action(Context context){
    	System.out.println("Player is in start state");
    	context.setState(this);
    }

}
