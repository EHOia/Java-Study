import java.util.Scanner;
public class HW1_1_���¿� {

	public static void main(String[] args) {
		System.out.println("1971067\n���̹���������\n���¿�");
		Scanner k=new Scanner(System.in);//Scanner��ü ����
		System.out.println("Hour:");
		int hour=k.nextInt();//nextInt�޼ҵ�� ����ڷκ��� �Է¹��� ���� hour�� ����
		System.out.println("Minute:");
		int minute=k.nextInt();//nextInt�޼ҵ�� ����ڷκ��� �Է¹��� ���� minute�� ����
		Time t=new Time();//Time ��ü ����
		t.setTime(hour, minute);//�Է¹��� �ð��� �� ���� setTime�� ���� Time class�� ����
		int ghour=t.getTime('h');//Time class�� �ִ� �ð� ���� �޾� ghour�� ����
		int gminute=t.getTime('m');//Time class�� �ִ� �� ���� �޾� gminute�� ����
		if(ghour!=hour&&gminute!=minute) {//����ڰ� �ð��� �� �Է��� �߸����� ��� Time class���� �Է��� ���� 0���� �����ϱ� ������ ó�� ���� ���� �ٸ���츦 �з�
			System.out.println("Wrong Input");
		}
		System.out.println(ghour+":"+gminute);//Time class���� ���� ���� ���
	}
}
