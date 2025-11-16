package tostringMethodAndDotEqualsMethod;

import java.util.Objects;

public class Student {
	String name;
	int rollno;
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	/*public boolean equals(Object o){
		try{
		Student s2=(Student)o;
		if(name.equals(s2.name) &&rollno==s2.rollno){
		return true;
		}
		}catch(ClassCastException e){
		return false;
		}catch(NullPointerException e){
		return false;
		}
		return false;
	}*/
	
	
	


	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}

public static void main(String[] args) {
	Student s1=new Student("malli",101);
	Student s2=new Student("ravi",101);
	Student s3=new Student("malli",101);
	Student s4=s1;
	System.out.println(s1.equals(s2));//false
	System.out.println(s1.equals(s3));//true
	System.out.println(s1.equals(s4));//true
	
}
	
}
