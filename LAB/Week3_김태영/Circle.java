//���̹��������� 1971067 ���¿�
public class Circle {
	final double PI=3.14159;//��� PI����
	private double radius;//�ν��Ͻ� ���� radius�� double�� ����
	
	public void setRadius(double rad){//setter; main���� �������� �Է¹����� �ν��Ͻ� ������ private�̱� ������ setter�� �̿��ؼ� ���� �Է�
		radius=rad;
	}
	public double getRadius() {//getter; private�� radius�� ����� �� ���
		return radius;
	}
	public double perimeter(){//�������� �̿��ؼ� �ѷ� ���� �Ի�
		double perimeter = PI*2*radius;
		return perimeter;//����� ��ȯ
	}
	public double area() {//�������� �̿��ؼ� ���� ���
		double area=PI*radius*radius;
		return area;//����� ��ȯ
	}
	public void circleInfo(){//����� ���� �������� ���� ������ ���
		System.out.printf("���ѷ�:%.2f\n",perimeter());//�� �ѷ� ����� ���
		System.out.printf("������:%.2f",area());//�� ���� ����� ���
	}
}