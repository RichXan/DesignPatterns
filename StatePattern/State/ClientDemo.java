package State;

public class ClientDemo {
	public static void main(String[] args) {
	      Context context = new Context();
		 
	      StartState startState = new StartState();
	      startState.action(context);
	 
	      System.out.println(context.getState().getClass());
	 
	      stopState stopState = new stopState();
	      stopState.action(context);
	 
	      System.out.println(context.getState().getClass());
	}
}
