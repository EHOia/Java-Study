import java.util.Scanner;//ScannerŬ���� �ҷ�����
public class Week2_1_���¿� {
	public static void main(String[] args) {
		System.out.println("============\n����: ���̹�����\n�й�: 1971067\n����: ���¿�\n============");
		System.out.print("Input the amount of money(0~100000) : ");
		
		Scanner keyboard=new Scanner(System.in);
		int money;//����ڰ� �Է��� ���� �׼��� ���� money�� ����
		
		int [] won=new int[8];//�ݺ����� �������� ���� ������ �� �� �� �ִ� ũ���� ����� ����
		won[0]=50000;//����ϴ� ���� ������ ��Ŀ� ���� ����
		won[1]=10000;
		won[2]=5000;
		won[3]=1000;
		won[4]=500;
		won[5]=100;
		won[6]=50;
		won[7]=10;
		
		money=keyboard.nextInt();//����ڷκ��� ���� �׼��� ���� ���·� �Է¹���
		if(money<=100000 && money>=0) {//���� 0~100000���� ���� ���� �Է��ϸ� ���α׷��� ������� ����
			System.out.println("The output will be");
			for (int i=0;i<8;i++) {//��� index 0���� 7���� �ݺ��� �ݺ���
				if(i%2==0) {//����� ¦����°�� �Ǿ��� ���ڰ� 5�̹Ƿ� 1�϶��� ������ ���̰� �־� ���ǹ����� �и�
					System.out.println(won[i]+" won: "+(money/(won[i]/5)%10)/5);}//money�� index�� ���� 5�� ���� ���� �ٽ��ѹ� ����� ���� ���ѵ� 1�ڸ� ���ڷ� ����� 5�� ���� ���� ���� ����(����)�� �󸶳� ������ ���
				else {//�Ǿ� ���ڰ� 1�� ���
					System.out.println(won[i]+" won: "+(money/won[i]%10));}//money�� index�� ������ ���� ���� 1�ڸ��� ����� �ش��ϴ� ���� ����(����)�� �󸶳� ������ ���
				
				money%=won[i];}//�ݺ����� �ѹ� ������ ����� ������ ������ �ϱ� ������ �ε��� ������ ���� �������� �ٽ� money�� �ְ� ���� �ݺ��� ����
			
			System.out.println("Reminder: "+money);}//������ ���� ���
		else System.out.println("�߸��� �Է�");
	}
}
