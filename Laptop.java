package tostringMethodAndDotEqualsMethod;

import java.util.Scanner;

public class Laptop {
	String brand;
	int ram;

	public Laptop(String brand, int ram) {
		super();
		this.brand = brand;
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + "]";
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//end user
		String brand=scanner.nextLine();//for reding brand
		int ram=scanner.nextInt();//for reading ram
		
		//object for constructor
		Laptop l=new Laptop(brand,ram);
		System.out.println(l);
		scanner.close();
		
		

	}

}
