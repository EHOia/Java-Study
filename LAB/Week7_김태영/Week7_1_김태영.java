import java.util.Scanner;
public class Week7_1_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�");
		Scanner k=new Scanner(System.in);//Scanner��ü ����
		Pet[] pet=new Pet[10];//Pet ��ü�迭 ����, �ִ�ũ�� 10
		boolean flag=true;//���� �����Ҷ� �߸��� �Է��� �����ϱ� ����
		int choose;
		
		for(int i=0;i<10;i++) {//�ִ�ũ�⿡ �°� �ݺ�
		
		if (flag) {//���α׷��� �����ϰ� ó�� �Է��ϴ� ����̰ų� �Է��� �ƹ��� ������ ���°�� 
			System.out.println("���ϴ� �۾��� �����Դϱ�?");
			System.out.println("1. New input\t2. Output\t3. Exit");
			choose=k.nextInt();//���ð��� ����
		}
		else choose=1;//�� ���ÿ��� 1~4�̿��� ���ڸ� �Է��Ѱ�� �ٽ� ���������� ���ư��� ����
		AA:switch(choose) {
		case 1:
			System.out.println("���� �����Դϱ�?");
			System.out.println("1. Dog\t2. Cat\t3. Snake\t4.Bird");
			switch(k.nextInt()) {
			case 1:
				pet[i]=new Dog();//dog ������ ��� Pet�迭�� DogŬ������ ���� �ν��Ͻ� ����
				break;
			case 2:
				pet[i]=new Cat();//���� Ŭ���� ������ �ٸ��� ������ ����
				break;
			case 3:
				pet[i]=new Snake();//���� Ŭ���� ������ �ٸ��� ������ ����
				break;
			case 4:
				pet[i]=new Bird();//���� Ŭ���� ������ �ٸ��� ������ ����
				break;
			default:
				System.out.println("�߸��� �Է�");	
				i--;//�߸� �Է��� ��� �迭�� �߰��ε����� ������� �ʵ��� i����
				flag=false;//�߸� �Է��Ѱ�� �ٽ� ���� �����ϴ� �޴��� ���ư����� false�� ����
				break AA;
			}
			k.nextLine();
			System.out.print("Name:");
			pet[i].name=k.nextLine();//�̸� ����
			System.out.print("Age:");
			pet[i].age=k.nextInt();//���� ����
			flag=true;//������ �߸��� �Է��� �� �� �ٽ� ���������� ������ ���� ���
			break;
		case 2:
			System.out.println("Species\tName\tAge\tMovement");
			for(int j=0;j<i;j++) {//for������ i�� �þ Ƚ��=�ݺ����� �Է��� Ƚ����ŭ �ݺ����� ���� ���
			System.out.print(pet[j].species+"\t"+pet[j].name+"\t"+pet[j].age+"\t");
			pet[j].move();
			}
			i--;//���������� �Է��� ���� �ʾұ� ������ �迭�� ������� ������ �ʵ��� i����
			break;
		case 3:
			System.out.println("����");
			System.exit(0);
		default:
			System.out.println("�߸��� �Է�");
			i--;//�߸� �Է��� ��� �迭�� �߰��ε����� ������� �ʵ��� i����
		}
		System.out.println();//����
	}
	}

}
