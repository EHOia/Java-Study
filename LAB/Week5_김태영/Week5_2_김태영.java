import java.util.Scanner;
public class Week5_2_���¿� {

	public static void main(String[] args) {
		System.out.println("1971067\n���̹���������\n���¿�");
		Dog[] d=new Dog[3];//ũ�� 3 �迭 ����
		Scanner k=new Scanner(System.in);
		for(int i=0;i<3;i++) {//�Է��� 3�� ������ �ֵ��� �ݺ�
			System.out.println("<<Dog "+(i+1)+">>");
			d[i]=new Dog();
			System.out.print("Name: ");
			d[i].setName(k.nextLine());//�̸��Է�
			System.out.print("Age: ");
			d[i].setAge(k.nextInt());//�����Է�
			System.out.print("Weight: ");
			d[i].setWeight(k.nextDouble());//�����Է�
			System.out.print("BoosterShot(y/n): ");
			k.nextLine();
			d[i].setBoosterShot(k.nextLine().equalsIgnoreCase("y"));//�������� �Է�
			System.out.println();
		}
		Cat[] c=new Cat[3];//ũ�� 3 �迭 ����
		for(int i=0;i<3;i++) {//3���ݺ�
			System.out.println("<<Cat "+(i+1)+">>");
			c[i]=new Cat();
			System.out.print("Name: ");//�̸��Է�
			c[i].setName(k.nextLine());
			System.out.print("Age: ");//�����Է�
			c[i].setAge(k.nextInt());
			System.out.print("Weight: ");//�����Է�
			c[i].setWeight(k.nextDouble());
			System.out.print("Color: ");//�����Է�
			k.nextLine();
			c[i].setColor(k.nextLine());
			System.out.println();
		}
		System.out.println("<<Dog List>>");//������ ����Ʈ ���
		for(int i=0;i<3;i++) {//3�� �ݺ�
			d[i].writeOutput();
			d[i].move();
			System.out.println();
		}
		System.out.println("<<Cat List>>");//����� ����Ʈ ���
		for (int i=0;i<3;i++) {//3���ݺ�
			c[i].writeOutput();
			c[i].move();
			System.out.println();
		}
		System.out.println("* Dogs older than 2 years and no boostershot are...");
		for (int i=0;i<3;i++) {
			if(d[i].getAge()<=2||d[i].getBoosterShot());
			else System.out.print(d[i].getName());//�ش��ϴ� ������ �̸� ���
		}
		System.out.println();
		System.out.println("* Black cats weights more than 3Kg are...");
		for (int i=0;i<3;i++) {
			if(c[i].getColor().equalsIgnoreCase("black")&&c[i].getWeight()>=3) System.out.print(c[i].getName());//�ش��ϴ� ����� �̸� ���
		}

	}

}
