package Juicer;

public class Adapter implements InewJuicer {
    private OldJuicer oJuicer;
    
    public Adapter() {
    	oJuicer = new OldJuicer();
    }
    public String newPort(Fruit fruit1, Fruit fruit2){
    	String str = "��Ϲ�֭����"+oJuicer.onePort(fruit1) + oJuicer.onePort(fruit2);
        return str;
    }

}
