package tostringMethodAndDotEqualsMethod;

import java.util.Objects;
import java.util.Scanner;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(length, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//read input
		double length1=scanner.nextDouble();
		double width1=scanner.nextDouble();
		
		double length2=scanner.nextDouble();
		double width2=scanner.nextDouble();
		
		//obj
		Rectangle rc1=new Rectangle(length1,width1);
		Rectangle rc2=new Rectangle(length2,width2);

		if(rc1.equals(rc2)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
			
		}
		scanner.close();
	}

	

}
