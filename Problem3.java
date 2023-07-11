
class Person{
	
	private String name;
	private int age;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
public class Problem3 {
	public static void main(String[] args) {
	
		Person p1 = new Person();
		p1.setName("Kohli");
		p1.setAge(34);
		p1.setAddress("RCB");
		
		System.out.println("Name of the person is " + p1.getName());
		System.out.println("Age of the person is " + p1.getAge());
		System.out.println("Address of the person is " + p1.getAddress());
	}
}
