//���̹��������� 1971067 ���¿�
public class Triangle {
	private double a,b,c;//������ ���̸� ���� �ν��Ͻ� ����
	
	Triangle(double a, double b, double c){
		this.a=a;//�� ���� ���̸� ����
		this.b=b;
		this.c=c;
		System.out.println("<Triangle>");
		System.out.println("Area: "+area());//���� ���
		System.out.println("Circumference: "+parameter());//�ѷ� ���
	}
	public double area() {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));//���� ���
	}
	public double parameter() {
		return a+b+c;//�ѷ� ���
	}
}
