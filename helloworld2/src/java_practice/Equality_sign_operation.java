package java_practice;

public class Equality_sign_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3.14;
		double b = 5.14;
		
		System.out.println(a==b);  //false
		System.out.println(a!=b);  //true
		
		String c1 = "Hello JAVA!";
		System.out.println(c1.contentEquals("Hello java!")); //false
		System.out.println(c1.contentEquals("Hello JAVA!")); //true

	}

}
