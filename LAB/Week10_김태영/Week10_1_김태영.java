import java.util.*;
public class Week10_1_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�\n");
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");
		Scanner k=new Scanner(System.in);//Scanner ��ü ����
		List <Student> stud=new ArrayList<Student>();//Student class�� ��� ArrayList stud����

		while(true) {
			String name=k.next();//�̸� �Է�
			if(name.equalsIgnoreCase("0")) break;//���� 0�� �ӷ��ϸ� �ݺ��� ����
			String id=k.next();//���̵� �Է�
			int age=k.nextInt();//���� �Է�
			
			stud.add(new Student(name,id,age));//�Է¹��� �л��� ������ StudentŬ������ ������ �� Ŭ������ stud�� �߰�
		}
		
		printResult(stud);//�Էµ� ������� ���
		
		for(int i=0;i<10;i++) {
			System.out.println("\nChoose the operation you want.");
			System.out.println("1.add information 2.delete information 3.show list 4.Finish program");
			int choose=k.nextInt();//����ڰ� ������ ��ȣ
			switch(choose) {
			default://�߸� �Է��Ѱ��
				System.out.println("Wrong Input.");
				break;
			case 1://�л��� ������ �߰�
				addStudent(stud);
				printResult(stud);
				break;
			case 2://�л��� ������ ����
				deleteStudent(stud);
			case 3://���ݱ��� �Էµ� ������ ���
				printResult(stud);
				break;
			case 4://���α׷�����
				System.exit(0);
			}
		}
		

	}
	public static void printResult(List<Student> student){//������ ������ִ� �ż���
		System.out.println("NUMBER\tNAME\tID\tAGE");
		for(int i=0;i<student.size();i++) {//ArrayList�� �����ŭ �ݺ�
			System.out.println(i+1+"\t"+student.get(i));
		}
	}
	public static void deleteStudent(List<Student> Stu) {//������ �������ִ� �ż���
		Scanner k=new Scanner(System.in);//Scanner��ü ����
		System.out.println("Input Student Number to delete");
		int remo=k.nextInt()-1;
		Stu.remove(remo);//����ڰ� �Է��� ��ȣ�� �´� �ε����� ����
	}
	public static void addStudent(List<Student> Stu) {//������ �߰����ִ� �ż���
		Scanner k=new Scanner(System.in);//Scanner��ü ����
		System.out.println("Input new Student Name, ID, and age, and the location");
		String name=k.next();
		String id=k.next();
		int age=k.nextInt();
		int next=k.nextInt()-1;//�������� ������ �� ��ȣ�� �Է�
		Stu.add(next,new Student(name,id,age));//�Էµ� ��ȣ�� �´� �ε����� ������ �߰�
	}
}

class Student{//�л��� ������ ��� Ŭ����
	String name;
	String id;
	int age;
	Student(String name, String id, int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public String toString() {//�ԷµǾ��ִ� ������ ��ȯ
		return name+"\t"+id+"\t"+age;
	}
}
