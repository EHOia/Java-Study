import java.util.Scanner;
public class Week4_1_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�");
		Scanner k=new Scanner(System.in);
		Song song1;//�ڿ� � �����ڰ� ������ �𸣱⶧���� �׳� ���������� ���� ����
		System.out.println("*Song ����*");
		String title="";//����� ���������� �ٽ� �Է��϶�� ��û�ؾ��ϱ� ������ ��ĭ���� �ʱ�ȭ
		String singer="";//�������� ����ִ� ��� �Է����� �ʾҴٰ� �����ؼ� �����ڸ� �ҷ����ϱ� ������ ��ĭ���� �ʱ�ȭ
		int price;
		while(title.equals("")) {//ó���� �ݺ����� ������ �̹� ����� ����ֱ� ������ �� �� �ְ�, ����ڰ� �Է��� �ϱ� ������ �ݺ����� ��ӵ�
			System.out.print("��� : ");
			title=k.nextLine();//����ڰ� �Է��� ������ �޾ƿ�
			if (title.equals("")) System.out.println("����� �ݵ�� �ʿ��մϴ�.");//����ڰ� ����� �Է����� �������
		}
		System.out.print("������ : ");
		singer=k.nextLine();//����ڷκ��� �������� ����
		System.out.print("���� : ");
		price=k.nextInt();//����ڷκ��� �뷡�� ������ ����
		if(singer.equals("")) {//����ڰ� �������� �Է����� ���� ���
			song1=new Song(title, price);//������ "��"�� �־� �����ϴ� �����ڷ� ����
		}
		else {//����ڰ� �������� �Է��Ѱ��
			song1=new Song(title, singer, price);//����ڷκ��� ���� ��� ������ class�� ������ �����ϴ� �����ڷ� ����
		}
		song1.play();//���� ������ ����ϴ� �ż����
	}

}
