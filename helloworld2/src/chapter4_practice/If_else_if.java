package chapter4_practice;
import java.util.*; //Scanner class 추가
public class If_else_if {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int age;
		age = input.nextInt();
		//age = Integer.parseInt(tmp);
		//String tmp = input.nextLine();
		
		if (age > 19) { //19세 이상인 경우
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
		}
		else if (age > 13) { //14~19세
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}
		else if (age > 8) { //9~13세
			System.out.println("어린이입니다.");
			System.out.println("어린이 요금이 적용됩니다.");
		}
		else { //9살 미만
			System.out.println("유아입니다.");
			System.out.println("유아 요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해주세요.");

	}

}
