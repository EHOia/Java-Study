import java.util.Scanner;//Scanner class �ҷ�����
public class Week2_2_���¿� {
	public static void main(String[] args) {
		System.out.println("============\n����: ���̹�����\n�й�: 1971067\n����: ���¿�\n============");
		Scanner keyboard=new Scanner(System.in);
		String type, again="Y";//����, ȭ���� ������ type�� ������� ����� again�� string���� ����, while�� ���� ���ǿ� ������ϱ� ������ again���� "Y"�� �ʱⰪ���� ����
		int degF;//ȭ���µ��� ��������
		double degC;//�����µ��� �Ǽ�(double)���·� ����
		while(again.equalsIgnoreCase("Y")) {//��ҹ��� ������� again�� y�̸� while���� ����
			System.out.println("\n�Է��� �µ��� ����? C(����) �Ǵ� F(ȭ��) : ");
			type=keyboard.nextLine();//type�� string�����̱� ������ nextLine���� �Է°��� ����
			if(type.equalsIgnoreCase("C")||type.equalsIgnoreCase("F")) {//c��f�� ����� �Է����� ���� ��츦 �ɷ����� ���� if�� ������ ����
				if(type.equalsIgnoreCase("C")) {//��ҹ��� ������� c�� �Է��ϸ� �����µ��� ȭ���µ��� �ٲ��ִ� if�� ����
					System.out.println("�����µ�(�Ǽ�) �Է�");
					degC=keyboard.nextDouble();//�����µ��� double������ �����߱⶧���� nextDouble�� ���� �޾ƿ�
					degF=(int)(9*degC/5)+32;//ȭ���µ��� int������ �����߱� ������ ���� �߰��� ���� int�� ����ȯ
					System.out.println("���� "+degC+"��/ȭ�� "+degF+"��");
				}
				else {
					System.out.println("ȭ���µ�(����) �Է�");
					degF=keyboard.nextInt();//ȭ���µ��� int������ �����߱� ������ nextInt�� ���� �޾ƿ�
					degC=5*(double)(degF-32)/9;//�����µ��� double���̱� ������ ������ �߰��� int������ ���� double�� ����ȯ
					System.out.printf("ȭ�� %d��/���� %.1f��\n", degF,degC);//�����µ��� �Ҽ��� ���� 1�ڸ��� �������� ���� printf�� ���
				}
				System.out.println("����Ͻðڽ��ϱ�? (Y)");
				keyboard.nextLine();//����ڿ��� ���α׷� ������ �ٽ� �Ұ����� �Է��� �ޱ� ���� ���ڸ� �޾Ҿ��� ������ �����ִ� \n�� ������
				again=keyboard.nextLine();
			}
			else {System.out.println("�߸��� �Է�\n");
				System.out.println("����Ͻðڽ��ϱ�? (Y)");
				again=keyboard.nextLine();}
			}
		System.out.println("���α׷� ����");
		

	}

}
