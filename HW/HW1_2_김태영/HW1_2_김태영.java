import java.util.Scanner;
public class HW1_2_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영");
		DiceGame dg=new DiceGame();//DiceGame객체 생성
		Scanner k=new Scanner(System.in);//Scanner객체 생성
		while(true) {
			System.out.println("<< GAME START >>");
			dg.startPlaying();//DiceGame 클래스의 startPlaying 매서드 실행
			System.out.println("Try again?(y/n)");
			String again=k.nextLine();//사용자가 다시 실행할지 여부를 선택하면 again에 저장
			if(again.equalsIgnoreCase("N")) {System.out.println("Game finished.");
			break;}//사용자가 n을 입력하면 게임이 끝남
			System.out.println();//줄바꿈
		}
	}

}
