import java.util.*;
public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int divident, divisor;
		
		try {
			System.out.print("������ �Է�: ");
			divident = scan.nextInt();
			System.out.print("������ �Է�: ");
			divisor = scan.nextInt();
			System.out.println(divident+"�� "+divisor+"�� ������ "+(divident/divisor)+"�Դϴ�.");
		}
		catch(Exception e) {
			System.out.println("���� �߸� �ƾ��....");
		}
		/*catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�....");
		}
		catch(InputMismatchException e) {
			System.out.println("�Է��� �߸��Ǿ����ϴ�. ���ڸ� �Է��ϼ���....");
		}*/
		finally {
			scan.close();
		}
	}
}
