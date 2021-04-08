import java.util.*;
public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int divident, divisor;
		
		try {
			System.out.print("나뉠수 입력: ");
			divident = scan.nextInt();
			System.out.print("나눌수 입력: ");
			divisor = scan.nextInt();
			System.out.println(divident+"를 "+divisor+"로 나누면 "+(divident/divisor)+"입니다.");
		}
		catch(Exception e) {
			System.out.println("뭔가 잘못 됐어요....");
		}
		/*catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다....");
		}
		catch(InputMismatchException e) {
			System.out.println("입력이 잘못되었습니다. 숫자만 입력하세요....");
		}*/
		finally {
			scan.close();
		}
	}
}
