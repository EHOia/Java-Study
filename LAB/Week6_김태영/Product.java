//1971067 ���̹��������� ���¿�
class Product {
	int price;//��ǰ�� ������ �Է¹��� ����
	int bonusPoint;//����Ʈ ���� �Է¹��� ����
	Product(int price){//��ǰ�� �������� �� ��ǰ�� ������ �޾� �ν��Ͻ� ������ ���ݰ� ���ʽ�����Ʈ�� �־���
		this.price=price;
		bonusPoint=(int)(price/10.0);//���ʽ�����Ʈ�� ������ 10%�̴�
	}
}
class Tv extends Product {//��ǰ���� tv�� �����Ѱ��
	Tv(){
		super(100);//���� 100�� ����
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product {//��ǰ���� ��ǻ�͸� �����Ѱ��
	Computer(){
		super(200);//���� 200�� ����
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product{//��ǰ���� ������� �����Ѱ��
	Audio(){
		super(50);//���� 50�� ����
	}
	public String toString() {
		return "Audio";
	}
}
class Video extends Product{//��ǰ���� ������ �����Ѱ��
	Video(){
		super(110);//���� 110�� ����
	}
	public String toString() {
		return "Video";
	}
}
class NoteBook extends Product{//��ǰ���� ��Ʈ���� �����Ѱ��
	NoteBook(){
		super(300);//���� 300�� ����
	}
	public String toString() {
		return "NoteBook";
	}
}