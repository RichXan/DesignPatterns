package Resume;

public class Resume implements IClone {
    private int age;
	private String name;
    private String sex;
    private String timeArea;
    public Resume(int age,String name,String sex,String timeArea) {
    	this.age = age;
    	this.name = name;
    	this.sex = sex;
    	this.timeArea = timeArea;
    	
	}

    public Resume(Resume resume) {
    	this.age = resume.age;
    	this.name = resume.name;
    	this.sex = resume.sex;
    	this.timeArea = resume.timeArea;
	}

    public IClone clone(){
    	return new Resume(this);
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTimeArea() {
		return timeArea;
	}

	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
	
	public void display() {
		System.out.println(name + "  " + sex + "  " + age );
		System.out.println("工作经历：" + timeArea);
		
	}

}
