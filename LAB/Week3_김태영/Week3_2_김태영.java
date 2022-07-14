import java.util.Scanner;
public class Week3_2_김태영 {
	public static void main(String[] args) {
		System.out.println("============\n전공: 사이버보안\n학번: 1971067\n성명: 김태영\n========");
		Circle circle = new Circle();//Circle class를 갖는 circle 선언
		System.out.print("반지름입력:");
		Scanner kbd=new Scanner(System.in);
		circle.setRadius(kbd.nextDouble());//circle이 가리키는 Circle class의 radius에 반지름 값을 넣기 위해 setRadius를 이용
		System.out.println("반지름:"+circle.getRadius());//circle의 radius 값을 출력하기 위해 getRadius를 이용
		circle.circleInfo();//circle의 원 둘레와 넓이를 출력함
	}
}