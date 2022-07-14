//사이버보안전공 1971067 김태영
import java.util.Scanner;
public class DiceGame {
	private int diceFace;
	private int userGuess;
	
	public DiceGame() {//생성자를 적절하게 생성하라는게 뭘하라는건지 잘 모르겠슴다
		
		
	}
	
	private int rollDice() {
		int randNum=(int)(Math.random()*6)+1;//1~6사이의 정수를 랜덤하게 생성
		System.out.println("Dice is rolled!!!");
		return randNum;//생성된 랜덤 수를 반환
	}
	private int getUserInput() {
		Scanner k=new Scanner(System.in);//Scanner 객체 생성
		System.out.println("Guess the number! What do you think?");
		int uNumber=0;
		while(true) {
			uNumber=k.nextInt();//사용자로부터 입력받은 수를 uNumber에 저장
			if(uNumber>=1&&uNumber<=6) break;//사용자가 1-6사이의 수를 입력한경우 반복을 끝냄
			else System.out.println("Input number between 1~6.");//잘못입력한경우 다시 입력할 수 있도록 안내
		}
		return uNumber;//사용자로부터 입력받은 수를 반환
	}
	private void checkUserGuess(int dNumber) {
		int uNumber=getUserInput();//getUserInput에서 반환된 사용자 입력 값을 uNumber에 저장
		if(uNumber==dNumber) System.out.println("Bingo!!!");//주사위값과 같으면 출력
		else System.out.println("Wrong!\nThe face was "+dNumber);//주사위 값과 다를때 출력
	}
	public void startPlaying() {
		int dNumber=rollDice();//랜덤하게 나온 주사위의 값을 dNumber에 저장
		checkUserGuess(dNumber);//주사위 값을 checkUserGuess 매서드에 보냄
	}
}
