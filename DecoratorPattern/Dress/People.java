package Dress;

public class People {
	protected String name;
    public People() {
		super();
	}
	public People(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.print("µÄ"+ name);
    }

}
