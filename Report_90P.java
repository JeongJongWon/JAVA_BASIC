import java.util.Scanner;

public class Report_90P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2021년 3월 18일 과제: 정종원");
		Scanner A = new Scanner (System.in);
		
		//변수선언
		double result = 0;
		double a = 0;
		double b = 0;
		
		//식 입력받기
		System.out.print("식을 입력해 주세요>> ");
		a = A.nextDouble();
		String c = A.next();
		b = A.nextDouble();
		
		//연산하는 파트
		switch(c) {
		case"+":
			result = a + b;
			break;
		case"-":
			result = a - b;
			break;
		case"*":
			result = a * b;
			break;
		case"/":
			if (b==0) {
				System.out.println("0으로는 나눌수 없습니다.");
				return;
			}
			result = a / b;
			break;
		case"^":
			result = Math.pow(a,b);
			break;
		default:
			System.out.println("연산 기호가 잘못되었습니다.");
		}
		
		System.out.println(result);
	}
}
