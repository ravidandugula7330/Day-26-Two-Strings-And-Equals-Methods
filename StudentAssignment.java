package tostringMethodAndDotEqualsMethod;

import java.util.Objects;
import java.util.Scanner;


public class StudentAssignment {
	  int id;
	 String name;

	public StudentAssignment(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentAssignment other = (StudentAssignment) obj;
		return id == other.id && Objects.equals(name, other.name);
	}


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int id1=scanner.nextInt();
		scanner.nextLine();
		String name1=scanner.nextLine();
		
		
		int id2=scanner.nextInt();
		scanner.nextLine();
		String name2=scanner.nextLine();
		
		//obj
		StudentAssignment s1=new StudentAssignment(id1,name1);
		StudentAssignment s2=new StudentAssignment(id2,name2);
		//comparing using equals()
		if(s1.equals(s2)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
			
		}
		scanner.close();
	}
}
	




