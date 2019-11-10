package x.y;

public class Teacher extends Person {
	//private String name;
	//private int age;
	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	void print() {
		System.out.printf("이    름: %s,  나   이:%s,   담당과목: %s \n",getName(),getAge(),this.subject);
	}
}
