import java.util.Scanner;
public class Week3_2_���¿� {
	public static void main(String[] args) {
		System.out.println("============\n����: ���̹�����\n�й�: 1971067\n����: ���¿�\n========");
		Circle circle = new Circle();//Circle class�� ���� circle ����
		System.out.print("�������Է�:");
		Scanner kbd=new Scanner(System.in);
		circle.setRadius(kbd.nextDouble());//circle�� ����Ű�� Circle class�� radius�� ������ ���� �ֱ� ���� setRadius�� �̿�
		System.out.println("������:"+circle.getRadius());//circle�� radius ���� ����ϱ� ���� getRadius�� �̿�
		circle.circleInfo();//circle�� �� �ѷ��� ���̸� �����
	}
}