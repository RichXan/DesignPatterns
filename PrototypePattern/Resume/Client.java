package Resume;

public class Client {
	public static void main(String[] args) {
		Resume resume = new Resume(20, "RichXan", "boy", "2000-XX¹«Ë¾");
		Resume a = (Resume) resume.clone();
		a.setAge(29);
		a.setTimeArea("2005-°¢Àï");
		resume.display();
		a.display();
		
	}
}
