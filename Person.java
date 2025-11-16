package tostringMethodAndDotEqualsMethod;

public class Person {
	int id;
	String name;
	int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	//overriding
	public String toString() {

		return id + "," + name + "," + age;


		}

	public static void main(String[] args) {

		Person p1=new Person(1,"malli",27);
		System.out.println(p1.toString());
		Person p2=new Person(1,"malli",27);
		System.out.println(p2);
		Person p3=new Person(1,"malli",27);
		System.out.println(p3);
	}

}
