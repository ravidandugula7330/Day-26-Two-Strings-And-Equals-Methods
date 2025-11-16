package tostringMethodAndDotEqualsMethod;

public class EqalsMethod {

	public static void main(String[] args) {
		String s1 = new String("malli");

		String s2 = new String("malli");

		String s3 = new String("Malli");
		String s4=s1;

		System.out.println(s1.equals(s2));//t

		System.out.println(s1.equals(s3));//f small m and capital M

		System.out.println(s1 == s2);

		System.out.println(s1 == s3);
		System.out.println(s1==s4);
	}

}
