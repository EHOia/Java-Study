//사이버보안전공 1971067 김태영
public class Square implements Geometry {
	private double side;//변의 길이를 담을 인스턴스 생성
	
	Square(double side){
		this.side=side;//받은 값을 전달
		System.out.println("<Square>");
		System.out.println("Area: "+area());//넓이 출력
		System.out.println("Circumference: "+parameter());//둘레 출력
	}

	public double area() {
		return side*side;//넓이 계산
	}
	public double parameter() {
		return side*4;//둘레 계산
	}
}
