package Single;

public class SingleUser {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.show();
	}
}
