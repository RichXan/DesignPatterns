package MarketCounter;

public class StrategyD implements Strategy {
	//�����ټ���ʮ
    public float operation(float totle){
    	if (totle >=200) {
        	return (float)(totle-50);
        }
        else {
        	return totle;
        }
    }
}
