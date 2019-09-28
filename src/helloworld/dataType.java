package helloworld;

public class dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 127; //byte가 가질 수 있는 최댓값.
		int  b = a;   //자동형변환(byte -> int). 실행값 127
		System.out.println(b);
		
		float c = b; //자동형변환(int -> float). 실행값 127.0
		System.out.println(c);

	}

}
