//사이버보안전공 1971067 김태영
public class Circle implements Geometry {
	private double radius;//반지름의 길이를 입력받을 인스턴스 생성
	
	Circle(double radius){
		this.radius=radius;//받은 반지름 길이를 전달
		System.out.println("<Circle>");
		System.out.println("Area: "+area());//넓이 출력
		System.out.println("Circumference: "+parameter());//둘레 출력
	}
	public double area() {
		return radius*radius*PI;//넓이 계산
	}
	public double parameter() {
		return radius*2*PI;//둘레 계산
	}
}
