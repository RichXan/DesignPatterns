package Single;
public class SingleObject {
    private static SingleObject instance;

    private SingleObject(){
 
    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void show(){
    	System.out.println("hhhhiiiiii");
    }

}
