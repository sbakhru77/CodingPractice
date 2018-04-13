package DataStructureAndAlgo;

public class Link {

	protected String fname;
	protected String lname;
	protected int age;
	public Link next;
	
	public Link(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public void displayLink() {
		System.out.println("{ Name: " + fname + " " + lname + ", age: " + age + " }");
	}
}
