package Dress;

public class Clothes extends People {
	protected People con;

	public void show() {
		if (con != null) {
			con.show();
		}
	}
	public void setpeople(People con) {
		this.con = con;
	}
}
