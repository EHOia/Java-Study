import java.util.Scanner;
public class Week1_2_김태영 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============\n전공: 사이버보안\n학번: 1971067\n성명: 김태영\n============");
		System.out.println("정수 세 개 입력");
		Scanner keyboard = new Scanner(System.in);//사용자로부터 내용을 입력받을 수 있게 Scanner클래스를 keyboard라는 변수로 불러옴
		int a,b,c;//정수 세개를 각각 담을 변수 선언
		a=keyboard.nextInt();//사용자로부터 받은 첫번째 정수를 a에 대입
		b=keyboard.nextInt();//사용자로부터 받은 두번째 정수를 b에 대입
		c=keyboard.nextInt();//사용자로부터 받은 세번째 정수를 c에 대입
		float fin;//평균값은 소수점 이하 2자리인 실수로 나타내야 하기때문에 실수형태로 선언
		fin=(float)(a+b+c)/3;//소수점 이하 숫자가 표현되기 위해서는 실수형태여야 하기때문에 세 정수의 합을 float으로 형변환 후 /3을 해서 변수에 대입
		System.out.printf("평균: %.2f",fin);//소수점 이하 2자리로 결과값 출력

	}

}
