package MarketCounter;

public class StrategyC implements Strategy {
	//��һ�ټ���ʮ
    public float operation(float totle){
        if (totle >=100) {
        	return (float)(totle-20);
        }
        else {
        	return totle;
        }
    }

}
