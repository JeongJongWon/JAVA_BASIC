import java.util.*;

class Rect {
	private int width, height;
	static String name;
	
	public Rect(int w, int h) {
		width = w;
		height = h;
	}
	public Rect() {
		this(0,0); //this-(��ü �ڱ��ڽ�) this()-(�����ڸ� �ҷ����ÿ� ��� ��ɾ�)
		//width = height = 0;
	}
	public void setWidth(int x){
		width = x;
	}
	int getArea(){
		return width * height;
	}
}

public class RectExample1 {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.print("�簢�� ��: ");
		x = sc.nextInt();
		System.out.print("�簢�� ����: ");
		y = sc.nextInt();
		
		Rect r = new Rect(x,y); //��ü�� �ڵ��ʱ�ȭ�� �Ǿ� ������� 0���� ��.
		Rect r2 = new Rect();
		//r.width = x;
		//r.height = y;
		System.out.println("�簢�� ������ >> " + r.getArea());
		System.out.print("�簢�� ��: ");
		x = sc.nextInt();
		r.setWidth(x);
		System.out.println("�簢�� ������ >> " + r.getArea());
		Rect.name = "busan";
		System.out.println(r.name);
		r2.name = "ulsan";
		System.out.println(r2.name);
		System.out.println(r.name);
	}
}
