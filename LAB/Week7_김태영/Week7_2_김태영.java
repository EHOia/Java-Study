import java.util.Scanner;
public class Week7_2_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�");
		Scanner k=new Scanner(System.in);//Scanner ��ü ����
		double c,s,t1,t2,t3;//��꿡 �ʿ��� ���̵��� �Է¹��� �ν��Ͻ� ����
		System.out.println("Input radius for a circle");
		c=k.nextDouble();//�� ������ ����
		System.out.println("Input length for a square");
		s=k.nextDouble();//�簢�� ���� ����
		System.out.println("Input a for a triangle");
		t1=k.nextDouble();//�ﰢ�� ���� ����1
		System.out.println("Input b for a triangle");
		t2=k.nextDouble();//�ﰢ�� ���� ���� 2
		System.out.println("Input c for a triangle");
		t3=k.nextDouble();//�ﰢ�� ���� ���� 3
		Circle C=new Circle(c);//Circle��ü ������ ���ÿ� �����ڿ� ������ ���̸� ����
		Square S=new Square(s);//Square��ü ������ ���ÿ� �����ڿ� ���� ���̸� ����
		Triangle T=new Triangle(t1,t2,t3);//Triangle��ü ������ ���ÿ� �����ڿ� ���� ���̸� ����
		
		
	}

}
