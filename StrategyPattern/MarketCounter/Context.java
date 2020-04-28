package MarketCounter;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
    	this.strategy = strategy;
    }

    public float executeOperation(float totle){
        return strategy.operation(totle);
    }

}
