package tostringMethodAndDotEqualsMethod;

import java.lang.reflect.Method;

public class ObjectClassMethods {

	public static void main(String[] args) {
		
			Class<?> objectClass = Object.class;

			Method[] methods = objectClass.getDeclaredMethods();

			System.out.println("methods declared in java.lang Object : "); 

			int count = 0;

			for (Method method: methods) {

			count++;

			System.out.println(count + "  : " + method);

			}

			System.out.println("declared methods in java.lang.Object : + count");

			}

}


