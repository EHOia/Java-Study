import java.util.Scanner;
public class Week6_1_���¿� {

	public static void main(String[] args) {
		System.out.println("1971067\n���̹���������\n���¿�");
		Buyer Buyer1=new Buyer();//�����Ҷ� ���ݰ� ������ ������ Ŭ����
		Tv t=new Tv();//�ڷ������� �����ϴ� ��� ���Ǵ� Ŭ����
		Computer c=new Computer();//��ǻ�͸� �����ϴ� ��� ���Ǵ� Ŭ����
		Video v=new Video();//������ �����ϴ� ��� ���Ǵ� Ŭ����
		Audio a=new Audio();//������� �����ϴ� ��� ���Ǵ� Ŭ����
		NoteBook n=new NoteBook();//��Ʈ���� �����ϴ� ��� ���Ǵ� Ŭ����
		Scanner k=new Scanner(System.in);//Scanner ��ü ����
		System.out.println("How much money do you have?");
		Buyer1.money=k.nextInt();//nextInt �޼ҵ带 �̿��� Buyer�� money�� ����ڷκ��� �Է¹��� �� ����
		int choose=1;
		while(choose!=0) {//����ڰ� �Է��� ���� 0�� ��� �ݺ����� ����
			System.out.println("What do you want to buy? Input 0 to quit.");
			System.out.println("1. TV(100)\t2. Computer(200)\t3. Video(110)\t4. Audio(50)\t5. NoteBook(300)");
			choose=k.nextInt();//nextInt �޼ҵ带 �̿��� choose�� ����ڷκ��� �Է¹��� �� ����
			switch(choose) {//choose�� ���� ���� ��� ���Ǻ��� �޼ҵ带 ����
			case 1://tv�� �����ϴ� ���
				Buyer1.buy(t);
				break;
			case 2://computer��  �����ϴ� ���
				Buyer1.buy(c);
				break;
			case 3://video��  �����ϴ� ���
				Buyer1.buy(v);
				break;
			case 4://audio��  �����ϴ� ���
				Buyer1.buy(a);
				break;
			case 5://notebook�� �����ϴ� ���
				Buyer1.buy(n);
				break;
			default://�߸� �Է��� ���
				System.out.println("No such item.");	
			}
		}
		Buyer1.summary();

	}

}
