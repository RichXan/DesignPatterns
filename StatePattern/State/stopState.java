package State;

public class stopState implements State {

    public void action(Context context){
    	System.out.println("Game Stop");
    	context.setState(this);
    }

}
