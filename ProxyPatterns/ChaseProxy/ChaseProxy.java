package ChaseProxy;

public class ChaseProxy implements ChaseWay {
	protected Pursuit pur;
	public ChaseProxy(Pursuit pur) {
		this.pur = pur;
	}
	
    public void giveflower(){
    	pur.giveflower();
    }

    public void giveDolls(){
    	pur.giveDolls();
    }

    public void goOutsides(){
    	pur.goOutsides();
    }

}
