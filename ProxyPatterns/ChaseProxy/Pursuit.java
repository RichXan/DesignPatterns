package ChaseProxy;


public class Pursuit implements ChaseWay {
	protected Girl mm;
	
	public Pursuit(Girl mm) {
		this.mm = mm;
	}
	
    public void giveflower(){
    	System.out.println(mm.getName() +"give you flower");
    }

    public void giveDolls(){
    	System.out.println(mm.getName() + "give you $$$");
    }

    public void goOutsides(){
    	System.out.println(mm.getName() + "Could you make a date with me?");
    }

}
