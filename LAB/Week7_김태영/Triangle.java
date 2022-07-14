//사이버보안전공 1971067 김태영
public class Triangle {
	private double a,b,c;//세변의 길이를 담을 인스턴스 생성
	
	Triangle(double a, double b, double c){
		this.a=a;//각 변의 길이를 전달
		this.b=b;
		this.c=c;
		System.out.println("<Triangle>");
		System.out.println("Area: "+area());//넓이 출력
		System.out.println("Circumference: "+parameter());//둘레 출력
	}
	public double area() {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));//넓이 계산
	}
	public double parameter() {
		return a+b+c;//둘레 계산
	}
}
