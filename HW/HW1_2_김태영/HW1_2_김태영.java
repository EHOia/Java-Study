import java.util.Scanner;
public class HW1_2_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�");
		DiceGame dg=new DiceGame();//DiceGame��ü ����
		Scanner k=new Scanner(System.in);//Scanner��ü ����
		while(true) {
			System.out.println("<< GAME START >>");
			dg.startPlaying();//DiceGame Ŭ������ startPlaying �ż��� ����
			System.out.println("Try again?(y/n)");
			String again=k.nextLine();//����ڰ� �ٽ� �������� ���θ� �����ϸ� again�� ����
			if(again.equalsIgnoreCase("N")) {System.out.println("Game finished.");
			break;}//����ڰ� n�� �Է��ϸ� ������ ����
			System.out.println();//�ٹٲ�
		}
	}

}
