package chapter4_practice;
import java.util.Scanner;
public class If_if {

	public static void main(String[] args) {
		
		String id, password;
		Scanner input = new Scanner(System.in);
		System.out.printf("���̵� �Է����ּ��� : ");
		id = input.nextLine();
		
		if(id.contentEquals("java")) {
			System.out.println("id ��ġ");
			System.out.printf("��и�ȣ�� �Է����ּ��� : ");
			password = input.nextLine();
			if(password.contentEquals("abc123")) {
				System.out.println("password ��ġ");
				System.out.printf("�α��� ����!");
			}
			else {
				System.out.println("password ����ġ");
			}
		}
		else {
			System.out.println("id ����ġ");
		}

	}

}
