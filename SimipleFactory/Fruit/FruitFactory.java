package Fruit;
public class FruitFactory {

    public Fruit creatFruit(String fruit){
    	if(fruit.equals("A")) {
    		return new Apple();
    	}
    	else if(fruit.equals("B")) {
    		return new Banana();
    	}
    	else
    		return null;
    }

}
