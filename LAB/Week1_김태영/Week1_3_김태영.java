import java.util.Scanner;
public class Week1_3_���¿� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============\n����: ���̹�����\n�й�: 1971067\n����: ���¿�\n========");
		System.out.println("ȭ���µ� �Է�:");
		Scanner keyboard = new Scanner(System.in);//����ڷκ��� ������ �Է¹��� �� �ְ� ScannerŬ������ keyboard��� ������ �ҷ���
		int f;//ȭ���µ��� �������·� ����
		f=keyboard.nextInt();//ȭ���µ��� ������ �޾� f�� ����
		float c;//�����µ��� �Ǽ����·� ����
		c=(float)5/9*(f-32);//5/9�� ����/�����̱⶧���� �Ҽ��� ���� ���� �˼� ���Ե� ���� �Ǽ����·� ����ȯ�� 5�� ������ �������ν� �Ǽ����·� ��� ���� ǥ���ǵ��� ��
		System.out.printf("\nȭ���µ�:%d\n", f);
		System.out.printf("�����µ�:%.1f", c);//�Ҽ������� ���ڸ��� �����µ� ��갪�� ��µǵ��� ��

	}

}
