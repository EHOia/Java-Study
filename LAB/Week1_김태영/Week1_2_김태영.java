import java.util.Scanner;
public class Week1_2_���¿� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============\n����: ���̹�����\n�й�: 1971067\n����: ���¿�\n============");
		System.out.println("���� �� �� �Է�");
		Scanner keyboard = new Scanner(System.in);//����ڷκ��� ������ �Է¹��� �� �ְ� ScannerŬ������ keyboard��� ������ �ҷ���
		int a,b,c;//���� ������ ���� ���� ���� ����
		a=keyboard.nextInt();//����ڷκ��� ���� ù��° ������ a�� ����
		b=keyboard.nextInt();//����ڷκ��� ���� �ι�° ������ b�� ����
		c=keyboard.nextInt();//����ڷκ��� ���� ����° ������ c�� ����
		float fin;//��հ��� �Ҽ��� ���� 2�ڸ��� �Ǽ��� ��Ÿ���� �ϱ⶧���� �Ǽ����·� ����
		fin=(float)(a+b+c)/3;//�Ҽ��� ���� ���ڰ� ǥ���Ǳ� ���ؼ��� �Ǽ����¿��� �ϱ⶧���� �� ������ ���� float���� ����ȯ �� /3�� �ؼ� ������ ����
		System.out.printf("���: %.2f",fin);//�Ҽ��� ���� 2�ڸ��� ����� ���

	}

}
