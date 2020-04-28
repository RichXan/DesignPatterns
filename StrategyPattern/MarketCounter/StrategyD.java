package MarketCounter;

public class StrategyD implements Strategy {
	//满两百减五十
    public float operation(float totle){
    	if (totle >=200) {
        	return (float)(totle-50);
        }
        else {
        	return totle;
        }
    }
}
