import java.util.Scanner;
public class Week3_4_���¿� {

	public static void main(String[] args) {
		System.out.println("============\n����: ���̹�����\n�й�: 1971067\n����: ���¿�\n========");
		Scanner kbd=new Scanner(System.in);
		MenuOrder user=new MenuOrder();
		System.out.println("--- ���ᰡ�� ���� ---");
		System.out.print("Coke����:");
		user.setPrice("coke",kbd.nextInt());//setPrice�� coke�� �������� �˷��ְ� coke������ �Է¹���
		System.out.print("Lemonade����:");
		user.setPrice("lemonade", kbd.nextInt());//setPrice�� lemonade�� �������� �˷��ְ� �Է�
		System.out.print("Coffee����:");
		user.setPrice("coffee", kbd.nextInt());//setPrice�� coffee�� �������� �˷��ְ� �Է�
		String toggle="Y";//while���� ó���� ���۵Ǿ�� �ϱ⋚���� y�� �ʱⰪ ����
		while(toggle.equalsIgnoreCase("Y")) {//toggle�� ���� y�� �ƴѰ�� while�� �ߴ�
			System.out.println("\n--- ���� �������� ---");
			user.setMoney(kbd.nextInt());//money�� �Է¹޾� MenuOrder Ŭ������ inputMoney�� ����ֱ�
			System.out.println("--- ���Ḧ �����ϼ��� ---");
			user.showMenu();//�ռ� �Է��� ������ ������ �޴��� ������
			user.showResult(kbd.nextInt());//������ ���� ��ȣ�� showResult�� ������
			kbd.nextLine();//nextInt������ nextLine�� ����ϱ� ������ \n�� ���ֱ����� ��ġ
			System.out.println("����Ͻðڽ��ϱ�? (y/n)");
			toggle=kbd.nextLine();//��� �����Ұ����� ���
		}
	}
}