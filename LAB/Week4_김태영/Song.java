//���̹��������� 1971067 ���¿�
import java.util.Scanner;
public class Song {
	public String title;
	public String singer;
	public int price;
	
	public Song(String title, int price) {
		this(title, "��", price);//����ڰ� �������� �Է����� ������� ������ �ڵ����� "��"�� �־ �����ڷ� ����
	}
	public Song(String title, String singer, int price) {//�� �����ڸ� ���� ������ �ν��Ͻ� ������ ������ ����
		this.title=title;//Song class�� �ν��Ͻ������� title�� ����ڰ� �Է��� title�� ����
		this.singer=singer;//Song class�� �ν��Ͻ������� singer�� ����ڰ� �Է��� singer�� ����
		this.price=price;//Song class�� �ν��Ͻ������� price�� ����ڰ� �Է��� price�� ����
	}
	public Song() {
		
	}
	public void play() {
		System.out.println("��� �����ðڽ��ϱ�?");
		Scanner k=new Scanner(System.in);
		int rep=k.nextInt();//���� �ݺ����� ����
		for (int i=0;i<rep;i++) {//���� �ݺ�����ŭ ����� �ݺ���
		System.out.println(title+" by "+singer);}
		System.out.println("�� "+rep*price+"���Դϴ�.");//���� �ݺ�����ŭ ������ ����ؼ� ���
	}
}
