//���̹��������� 1971067 ���¿�
import java.util.Scanner;
public class DiceGame {
	private int diceFace;
	private int userGuess;
	
	public DiceGame() {//�����ڸ� �����ϰ� �����϶�°� ���϶�°��� �� �𸣰ڽ���
		
		
	}
	
	private int rollDice() {
		int randNum=(int)(Math.random()*6)+1;//1~6������ ������ �����ϰ� ����
		System.out.println("Dice is rolled!!!");
		return randNum;//������ ���� ���� ��ȯ
	}
	private int getUserInput() {
		Scanner k=new Scanner(System.in);//Scanner ��ü ����
		System.out.println("Guess the number! What do you think?");
		int uNumber=0;
		while(true) {
			uNumber=k.nextInt();//����ڷκ��� �Է¹��� ���� uNumber�� ����
			if(uNumber>=1&&uNumber<=6) break;//����ڰ� 1-6������ ���� �Է��Ѱ�� �ݺ��� ����
			else System.out.println("Input number between 1~6.");//�߸��Է��Ѱ�� �ٽ� �Է��� �� �ֵ��� �ȳ�
		}
		return uNumber;//����ڷκ��� �Է¹��� ���� ��ȯ
	}
	private void checkUserGuess(int dNumber) {
		int uNumber=getUserInput();//getUserInput���� ��ȯ�� ����� �Է� ���� uNumber�� ����
		if(uNumber==dNumber) System.out.println("Bingo!!!");//�ֻ������� ������ ���
		else System.out.println("Wrong!\nThe face was "+dNumber);//�ֻ��� ���� �ٸ��� ���
	}
	public void startPlaying() {
		int dNumber=rollDice();//�����ϰ� ���� �ֻ����� ���� dNumber�� ����
		checkUserGuess(dNumber);//�ֻ��� ���� checkUserGuess �ż��忡 ����
	}
}
