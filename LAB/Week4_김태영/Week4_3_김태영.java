
public class Week4_3_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�");
		int a=5,b=10;
		double da=3.4,db=5.2;
		char ca='a',cb='b';
		int iarr[]= {1,2,3};
		double darr[]= {1.1,2.2,3.3};
		char carr[]= {'a','p','p','l','e'};
		System.out.println("a+b="+sum(a,b));
		System.out.println("da+b="+sum(da,b));
		System.out.println("a+db="+sum(a,db));
		System.out.println("da+db="+sum(da,db));
		System.out.println("ca+cb="+sum(ca,cb));
		System.out.println("sum of Int_Arr="+sum(iarr));
		System.out.println("sum of Double_Arr="+sum(darr));
		System.out.println("sum of Char_Arr="+sum(carr));
		}
	static int sum(int a,int b){//�޴� ���ڰ� ��� �������϶�
		return a+b;//������� int�̱� ������ int�� ��ȯ
	}
	static double sum(int a, double b) {//�޴� ���ڰ� ������� ����, double���϶�
		return a+b;//������� double�̱� ������ double�� ��ȯ
	}
	static double sum(double a, int b) {//�޴� ���ڰ� ������� double, int type�϶�
		return a+b;//������� double�̱� ������ double�� ��ȯ
	}
	static double sum(double a, double b) {//�޴� ���ڰ� ��� double���϶�
		return a+b;//������� double�̱� ������ double�� ��ȯ
	}
	static String sum(char a, char b) {//�޴� ���ڰ� char���϶�
		String str="";//char�� string���� �ٲٱ� ���� string���� str�� ����&""�� �ʱ�ȭ
		str+=a;//string+char�� �ϸ� string���� ����� ������ ������ ""�� �ִ� str�� ���� char a�� ����
		str+=b;//"a"�̴� str�� ������ b�� ����
		return str;//����� String type
	}
	static int sum(int[] a) {//�޴� ���ڰ� ������ �迭�ΰ��
		int result=0;
		for (int i=0;i<a.length;i++) {//�迭�� ����ŭ �ݺ��� ���ư�
			result+=a[i];
		}
		return result;//����� ����Ÿ��
	}
	static double sum(double[] a) {//�޴����ڰ� double type�� �迭�ΰ��
		double result=0;
		for (int i=0;i<a.length;i++) {//�迭�� ����ŭ �ݺ��� ���ư�
			result+=a[i];
		}
		return result;//����� double type
	}
	static String sum(char[] a) {//char type�� �迭�� ���ڷ� �޴°��
		String result="";//char�� ������ ��ġ�� ���ؼ��� String type�� �ٲ����, ���� String Ÿ���� result�� ����, ""�� �ʱ�ȭ
		for (int i=0;i<a.length;i++) {//�迭�� ����ŭ �ݺ��� ���ư�
			result+=a[i];//""������ result�� �� �迭�� char ������ �ϳ��� �߰���
		}
		return result;//��ȯ�� String type
	}

}