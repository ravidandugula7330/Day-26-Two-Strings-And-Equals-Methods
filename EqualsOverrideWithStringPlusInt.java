package tostringMethodAndDotEqualsMethod;

import java.util.Objects;
import java.util.Scanner;

public class EqualsOverrideWithStringPlusInt {
	int emoId;
	String department;
	public EqualsOverrideWithStringPlusInt(int emoId, String department) {
		super();
		this.emoId = emoId;
		this.department = department;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(department, emoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsOverrideWithStringPlusInt other = (EqualsOverrideWithStringPlusInt) obj;
		return Objects.equals(department, other.department) && emoId == other.emoId;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//read inputs
		int empId1=scanner.nextInt();
		String department1=scanner.nextLine();
		
		int empId2=scanner.nextInt();
		String department2=scanner.nextLine();
		//object
		
		EqualsOverrideWithStringPlusInt e1=new EqualsOverrideWithStringPlusInt(empId1,department1);
		EqualsOverrideWithStringPlusInt e2=new EqualsOverrideWithStringPlusInt(empId2,department2);
		
		if(e1.equals(e2)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		
		scanner.close();
		

	}

}
