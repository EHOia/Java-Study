//���̹��������� 1971067 ���¿�
public class Circle implements Geometry {
	private double radius;//�������� ���̸� �Է¹��� �ν��Ͻ� ����
	
	Circle(double radius){
		this.radius=radius;//���� ������ ���̸� ����
		System.out.println("<Circle>");
		System.out.println("Area: "+area());//���� ���
		System.out.println("Circumference: "+parameter());//�ѷ� ���
	}
	public double area() {
		return radius*radius*PI;//���� ���
	}
	public double parameter() {
		return radius*2*PI;//�ѷ� ���
	}
}
