import java.util.Scanner;
public class Week4_2_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�");
		Facto e1=new Facto();//ù��° ���Ҹ� ����� Ŭ����
		Facto e2=new Facto();//�ι�° ���Ҹ� ����� Ŭ����
		Scanner k=new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		int n1=k.nextInt();
		int r1=e1.factoVal(n1);//�Է¹��� ����1�� factoVal�� ���� ���丮�� ��� �� r1���� ������� ����
		System.out.print("�ι�° ���� �Է�:");
		int n2=k.nextInt();
		int r2=e2.factoVal(n2);//�Է¹��� ����2�� factoVal�� ���� ���丮�� ��� �� r2���� ������� ����
		System.out.println("Factorial("+n1+") - Factorial("+n2+") = "+(r1-r2));//���� ������� ���� ���
	}
}