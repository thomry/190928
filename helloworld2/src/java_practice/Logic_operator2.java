package java_practice;

public class Logic_operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		System.out.println(5<a && a<15);            //true
		System.out.println((5<a && a<15)&& a%2==0); //true
		
		a = 4;
		System.out.println((5<a && a<15)&& a%2==0); //false
		System.out.println((5<a && a<15)|| a%2==0); //true

	}

}
