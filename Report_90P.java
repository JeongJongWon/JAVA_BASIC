import java.util.Scanner;

public class Report_90P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2021�� 3�� 18�� ����: ������");
		Scanner A = new Scanner (System.in);
		
		//��������
		double result = 0;
		double a = 0;
		double b = 0;
		
		//�� �Է¹ޱ�
		System.out.print("���� �Է��� �ּ���>> ");
		a = A.nextDouble();
		String c = A.next();
		b = A.nextDouble();
		
		//�����ϴ� ��Ʈ
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
				System.out.println("0���δ� ������ �����ϴ�.");
				return;
			}
			result = a / b;
			break;
		case"^":
			result = Math.pow(a,b);
			break;
		default:
			System.out.println("���� ��ȣ�� �߸��Ǿ����ϴ�.");
		}
		
		System.out.println(result);
	}
}
