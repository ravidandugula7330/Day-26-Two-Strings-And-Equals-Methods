package tostringMethodAndDotEqualsMethod;

import java.util.Scanner;

public class Employee {
	String name;
	int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	
		
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();//read emp name
		int id=scanner.nextInt();//read emp id
		
		Employee e=new Employee(name,id);
		System.out.println(e);
	}
		
	
}
