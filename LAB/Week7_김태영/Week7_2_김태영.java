import java.util.Scanner;
public class Week7_2_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영");
		Scanner k=new Scanner(System.in);//Scanner 객체 생성
		double c,s,t1,t2,t3;//계산에 필요한 길이들을 입력받을 인스턴스 생성
		System.out.println("Input radius for a circle");
		c=k.nextDouble();//원 반지름 길이
		System.out.println("Input length for a square");
		s=k.nextDouble();//사각형 변의 길이
		System.out.println("Input a for a triangle");
		t1=k.nextDouble();//삼각형 변의 길이1
		System.out.println("Input b for a triangle");
		t2=k.nextDouble();//삼각형 변의 길이 2
		System.out.println("Input c for a triangle");
		t3=k.nextDouble();//삼각형 변의 길이 3
		Circle C=new Circle(c);//Circle객체 생성과 동시에 생성자에 반지름 길이를 보냄
		Square S=new Square(s);//Square객체 생성과 동시에 생성자에 변의 길이를 보냄
		Triangle T=new Triangle(t1,t2,t3);//Triangle객체 생성과 동시에 생성자에 번의 길이를 보냄
		
		
	}

}
