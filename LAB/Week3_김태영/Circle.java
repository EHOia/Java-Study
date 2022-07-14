//사이버보안전공 1971067 김태영
public class Circle {
	final double PI=3.14159;//상수 PI선언
	private double radius;//인스턴스 변수 radius를 double로 선언
	
	public void setRadius(double rad){//setter; main에서 반지름을 입력받으면 인스턴스 변수가 private이기 때문에 setter을 이용해서 값을 입력
		radius=rad;
	}
	public double getRadius() {//getter; private인 radius를 출력할 때 사용
		return radius;
	}
	public double perimeter(){//반지름을 이용해서 둘레 길이 게산
		double perimeter = PI*2*radius;
		return perimeter;//결과값 반환
	}
	public double area() {//반지름을 이용해서 넓이 계산
		double area=PI*radius*radius;
		return area;//결과값 반환
	}
	public void circleInfo(){//계산한 값을 바탕으로 원의 정보를 출력
		System.out.printf("원둘레:%.2f\n",perimeter());//원 둘레 계산후 출력
		System.out.printf("원넓이:%.2f",area());//원 넓이 계산후 출력
	}
}