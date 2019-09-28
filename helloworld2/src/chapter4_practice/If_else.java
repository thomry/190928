package chapter4_practice;

public class If_else {

	public static void main(String[] args) {
		int age = 15;
		
		if(age>19) { //조건식은 false
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
		}
		
		else {
			System.out.println("청소년입니다.");
			System.out.println("청소년요금이 적용됩니다.");
		}
		
		System.out.println("결제를 진행해주세요.");
		

	}

}
