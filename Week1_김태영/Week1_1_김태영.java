import java.util.Scanner;
public class Week1_1_���¿� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============\n����: ���̹�����\n�й�: 1971067\n����: ���¿�\n============");
		int base,height;//�غ��� ���̸� ������ ���� ���� ����
		Scanner keyboard =new Scanner(System.in);//����ڷκ��� ������ �Է¹��� �� �ְ� ScannerŬ������ keyboard��� ������ �ҷ���
		System.out.println("Input base:");
		base=keyboard.nextInt();
		System.out.println("Input height:");
		height=keyboard.nextInt();
		float fin;//���̴� �Ҽ��� ���� 2�ڸ��� ǥ���ؾ� �ϱ⶧���� �Ǽ����·� ����
		fin=(float)(base*height)/2;//�غ�*������ ���� ����Ÿ���̹Ƿ� �Ǽ�Ÿ������ ������ /2�� �ؼ� �Ǽ� ���·� fin�� ����ǵ��� ��
		System.out.println("The area:"+fin);//����� ���

	}

}
