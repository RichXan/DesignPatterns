package MarketCounter;

public class StrategyA implements Strategy {
	//����
    public float operation(float totle){
        return (float) (totle*0.9);
    }

}
