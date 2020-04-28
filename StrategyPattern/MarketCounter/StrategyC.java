package MarketCounter;

public class StrategyC implements Strategy {
	//满一百减二十
    public float operation(float totle){
        if (totle >=100) {
        	return (float)(totle-20);
        }
        else {
        	return totle;
        }
    }

}
