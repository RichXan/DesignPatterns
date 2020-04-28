package OperationDemo;

public class TestDemo {
	public static void main(String[] args) {
		Operation op = OperationFactor.createOperate("+");
		op.NumberA = 3;
		op.NumberB = 7;
		System.out.println(op.GetResult());
	}
}
