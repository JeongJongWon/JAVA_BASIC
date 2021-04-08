import java.util.*;

class Rect {
	private int width, height;
	static String name;
	
	public Rect(int w, int h) {
		width = w;
		height = h;
	}
	public Rect() {
		this(0,0); //this-(객체 자기자신) this()-(생성자를 불러오시오 라는 명령어)
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
		System.out.print("사각형 폭: ");
		x = sc.nextInt();
		System.out.print("사각형 높이: ");
		y = sc.nextInt();
		
		Rect r = new Rect(x,y); //객체는 자동초기화가 되어 결과값이 0으로 옴.
		Rect r2 = new Rect();
		//r.width = x;
		//r.height = y;
		System.out.println("사각형 면적은 >> " + r.getArea());
		System.out.print("사각형 폭: ");
		x = sc.nextInt();
		r.setWidth(x);
		System.out.println("사각형 면적은 >> " + r.getArea());
		Rect.name = "busan";
		System.out.println(r.name);
		r2.name = "ulsan";
		System.out.println(r2.name);
		System.out.println(r.name);
	}
}
