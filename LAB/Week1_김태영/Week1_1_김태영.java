import java.util.Scanner;
public class Week1_1_김태영 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============\n전공: 사이버보안\n학번: 1971067\n성명: 김태영\n============");
		int base,height;//밑변과 높이를 정수로 받을 변수 선언
		Scanner keyboard =new Scanner(System.in);//사용자로부터 내용을 입력받을 수 있게 Scanner클래스를 keyboard라는 변수로 불러옴
		System.out.println("Input base:");
		base=keyboard.nextInt();
		System.out.println("Input height:");
		height=keyboard.nextInt();
		float fin;//넓이는 소수점 이하 2자리로 표현해야 하기때문에 실수형태로 선언
		fin=(float)(base*height)/2;//밑변*높이의 값은 정수타입이므로 실수타입으로 변경후 /2를 해서 실수 형태로 fin에 저장되도록 함
		System.out.println("The area:"+fin);//결과값 출력

	}

}
