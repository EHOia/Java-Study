//���̹��������� 1971067 ���¿�
public class Square implements Geometry {
	private double side;//���� ���̸� ���� �ν��Ͻ� ����
	
	Square(double side){
		this.side=side;//���� ���� ����
		System.out.println("<Square>");
		System.out.println("Area: "+area());//���� ���
		System.out.println("Circumference: "+parameter());//�ѷ� ���
	}

	public double area() {
		return side*side;//���� ���
	}
	public double parameter() {
		return side*4;//�ѷ� ���
	}
}
