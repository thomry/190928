package chapter4_practice;
import java.util.*; //Scanner class �߰�
public class If_else_if {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int age;
		age = input.nextInt();
		//age = Integer.parseInt(tmp);
		//String tmp = input.nextLine();
		
		if (age > 19) { //19�� �̻��� ���
			System.out.println("�����Դϴ�.");
			System.out.println("���ο���� ����˴ϴ�.");
		}
		else if (age > 13) { //14~19��
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("û�ҳ� ����� ����˴ϴ�.");
		}
		else if (age > 8) { //9~13��
			System.out.println("����Դϴ�.");
			System.out.println("��� ����� ����˴ϴ�.");
		}
		else { //9�� �̸�
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����� ����˴ϴ�.");
		}
		System.out.println("������ �������ּ���.");

	}

}
