package java_practice;

class A {}
class B extends A{}

public class hello {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println("a instanceof A: "+(a instanceof A)); //true
		System.out.println("a instanceof A: "+(b instanceof A)); //true
		System.out.println("a instanceof A: "+(a instanceof B)); //false
		System.out.println("a instanceof A: "+(b instanceof B)); //true

	}

}
