import java.util.Scanner;
public class HW1_3_���¿� {
	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�");
		Scanner k=new Scanner(System.in);//scanner ��ü ����
		String again="Y";//�ٽ� ���� ���θ� ������ �ν��Ͻ� ���� �� y�� �ʱ�ȭ
		while(again.equalsIgnoreCase("y")) {//����ڰ� y�� �Է��ϸ� ������ �ݺ��ǵ���
			System.out.println("Input a word");
			String str=k.next();//����ڿ��� �ܾ �Է¹���
			char Arr[]=new char[100];//�迭 ����
			Arr=str.toCharArray();//��Ʈ���� ���ڹ迭�� ��ȯ
			boolean flag=check(Arr);//check �ż��忡 �迭�� ������ Ȯ���� true �Ǵ� false�� flag�� ����
			if(flag) System.out.println("symmetry");//true�ΰ�� ���
			else System.out.println("Asymmetry");//false�ΰ�� ���
			System.out.println("\nTry again?(y/n)");
			again=k.next();//�ٽý��࿩�θ� �Է¹���
			System.out.println();//�ٹٲ�
		}
	}
	public static boolean check(char[] Arr) {
		for(int i=0;i<(Arr.length/2);i++) {//���� �迭�� ��Ī���� Ȯ��
			if(Arr[i]!=Arr[Arr.length-1-i]) {//��Ī�� �ƴ� �κ��� �߰ߵǸ� false��ȯ�ϰ� �ݺ��� ����
				return false;
			}
		}
		return true;//�ݺ��� �����߿� ��Ī�� �ƴ� �κ��� �߰ߵ��� �ʰ� ���������� ������ true�� ��ȯ
	}
}
