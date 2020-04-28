package OperationDemo;
public class OperationFactor {

    public static Operation createOperate(String operate){
    	Operation oper = null;
    	switch (operate) {
    		case "+":
    			oper = new OperationAdd();
    			break;
    		case "-":
    			oper = new OperationSub();
    			break;
    		case "*":
    			oper = new OperationMul();
    			break;
    		case "/":
    			oper = new OperationDiv();
    			break;
    		default :
    			System.out.println("You must enter the correat operate!");
    			break;
    	}
    	return oper;
    }

}
