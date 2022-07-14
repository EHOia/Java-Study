import java.util.Scanner;//Scanner class 불러오기
public class Week2_2_김태영 {
	public static void main(String[] args) {
		System.out.println("============\n전공: 사이버보안\n학번: 1971067\n성명: 김태영\n============");
		Scanner keyboard=new Scanner(System.in);
		String type, again="Y";//섭씨, 화씨를 선택할 type과 계속할지 물어보는 again을 string으로 선언, while문 시작 조건에 맞춰야하기 때문에 again에는 "Y"를 초기값으로 설정
		int degF;//화씨온도는 정수형태
		double degC;//섭씨온도는 실수(double)형태로 선언
		while(again.equalsIgnoreCase("Y")) {//대소문자 관계없이 again이 y이면 while문을 실행
			System.out.println("\n입력할 온도의 종류? C(섭씨) 또는 F(화씨) : ");
			type=keyboard.nextLine();//type은 string형태이기 때문에 nextLine으로 입력값을 받음
			if(type.equalsIgnoreCase("C")||type.equalsIgnoreCase("F")) {//c나f를 제대로 입력하지 않은 경우를 걸러내기 위해 if문 조건을 설정
				if(type.equalsIgnoreCase("C")) {//대소문자 관계없이 c를 입력하면 섭씨온도를 화씨온도로 바꿔주는 if문 실행
					System.out.println("섭씨온도(실수) 입력");
					degC=keyboard.nextDouble();//섭씨온도는 double형으로 선언했기때문에 nextDouble로 값을 받아옴
					degF=(int)(9*degC/5)+32;//화씨온도는 int형으로 선언했기 때문에 계산식 중간에 값을 int로 형변환
					System.out.println("섭씨 "+degC+"도/화씨 "+degF+"도");
				}
				else {
					System.out.println("화씨온도(정수) 입력");
					degF=keyboard.nextInt();//화씨온도는 int형으로 선언했기 때문에 nextInt로 값을 받아옴
					degC=5*(double)(degF-32)/9;//섭씨온도는 double형이기 때문에 계산과정 중간에 int형태인 값을 double로 형변환
					System.out.printf("화씨 %d도/섭씨 %.1f도\n", degF,degC);//섭씨온도를 소수점 이하 1자리로 내보내기 위해 printf를 사용
				}
				System.out.println("계속하시겠습니까? (Y)");
				keyboard.nextLine();//사용자에게 프로그램 실행을 다시 할것인지 입력을 받기 전에 숫자를 받았었기 때문에 남아있는 \n을 없애줌
				again=keyboard.nextLine();
			}
			else {System.out.println("잘못된 입력\n");
				System.out.println("계속하시겠습니까? (Y)");
				again=keyboard.nextLine();}
			}
		System.out.println("프로그램 종료");
		

	}

}
