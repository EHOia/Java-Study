import java.util.Scanner;
public class Week1_3_김태영 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============\n전공: 사이버보안\n학번: 1971067\n성명: 김태영\n========");
		System.out.println("화씨온도 입력:");
		Scanner keyboard = new Scanner(System.in);//사용자로부터 내용을 입력받을 수 있게 Scanner클래스를 keyboard라는 변수로 불러옴
		int f;//화씨온도는 정수형태로 선언
		f=keyboard.nextInt();//화씨온도를 정수로 받아 f에 대입
		float c;//섭씨온도는 실수형태로 선언
		c=(float)5/9*(f-32);//5/9는 정수/정수이기때문에 소수점 이하 값을 알수 없게됨 따라서 실수형태로 형변환한 5와 정수를 나눔으로써 실수형태로 모든 값이 표현되도록 함
		System.out.printf("\n화씨온도:%d\n", f);
		System.out.printf("섭씨온도:%.1f", c);//소수점이하 한자리로 섭씨온도 계산값이 출력되도록 함

	}

}
