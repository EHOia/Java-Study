import java.util.Scanner;
public class Week3_1_���¿� {

	public static void main(String[] args) {
		System.out.println("============\n����: ���̹�����\n�й�: 1971067\n����: ���¿�\n========");

		Song song1=new Song();//�뷡1�� Song type����
		Song song2=new Song();//�뷡2�� Song type����
		Scanner kbd=new Scanner(System.in);
		System.out.println("*Song 1*");//�뷡1������ ���� �Է�
		System.out.print("����Է�:");
		song1.title=kbd.nextLine();//class Song���� ������ song1�� title�� �Է�
		System.out.print("�������Է�:");
		song1.singer=kbd.nextLine();//class Song���� ������ song1�� singer�� �Է�
		System.out.print("�����Է�:");
		song1.price=kbd.nextInt();//class Song���� ������ song1�� price�� �Է�
		kbd.nextLine();//�տ��� nextInt�� �̿��ؼ� �Է°��� ���� �� ���� �Է³����� nextLine���� �ޱ� ���ؼ��� ���� \n�� ���־� ��
		
		System.out.println("\n*Song 2*");//song2������ ���� �Է�
		System.out.print("����Է�:");
		song2.title=kbd.nextLine();//class Song���� ������ song2�� title�� �Է�
		System.out.print("�������Է�:");
		song2.singer=kbd.nextLine();//class Song���� ������ song2�� singer�� �Է�
		System.out.print("�����Է�:");
		song2.price=kbd.nextInt();//class Song���� ������ song2�� price�� �Է�
		
		System.out.println("\n�뷡�� ������");
		System.out.println("1:"+song1.title+" 2:"+song2.title);//song1,song2�� title�� �����ͼ� ���
		int choose;
		choose=kbd.nextInt();
		switch(choose) {//1,2�� ������ ��ȣ�� ���� ����ϴ� ���� �ٲ�°��� switch�� �̿��� ����
		case 1://song1�� ������ ��� �뷡1�� ���� ������ ���
			song1.play();
			song1.price();
			break;
		case 2://song2�� ������ ��� �뷡2�� ���� ������ ���
			song2.play();
			song2.price();
			break;
		}
		System.out.println("�����մϴ�.");
	}
}