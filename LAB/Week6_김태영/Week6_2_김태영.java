import java.util.Scanner;
public class Week6_2_���¿� {

	public static void main(String[] args) {
		System.out.println("1971067\n���̹���������\n���¿�");
		Scanner k=new Scanner(System.in);//Scanner ��ü ����
		Emergency e=new Emergency();//Emergency ��ü ����
		FireEngine f=new FireEngine();//FireEngine ��ü ����
		Ambulance a=new Ambulance();//Ambulance ��ü ����
		PoliceCar p=new PoliceCar();//PoliceCar ��ü ����
		for(int i=0;i<10;i++) {//�迭�� ������ 10��ŭ ����ڰ� �������� �Ҽ� �ֵ��� �ݺ�
		System.out.println("What kind of Emergency?");
		System.out.println("1. Fire\t2. Patient\t3. Thief\t4. Record\t5. End");
		int choose=k.nextInt();//����ڷκ��� ������ ��ȣ�� �Է¹���
		switch(choose) {//�Է¹��� ��ȣ�� �´� ��ü�� EM_Call �żҵ峪 EM_record �޼ҵ忡 ����
		case 1://Fire->FireEngine
			e.EM_Call(f);
			break;
		case 2://Patient->Ambulance
			e.EM_Call(a);
			break;
		case 3://Thief->PoliceCar
			e.EM_Call(p);
			break;
		case 4://����� ���
			e.EM_record();
			i--;//�迭�� �߰����� �ʴ� �����̹Ƿ� �ݺ����� �ѹ� �� ����
			break;
		case 5:
			System.out.println("Finished");//�����ư�� ������� finished�� ����ϰ�
			System.exit(0);//���α׷� ����
		default:
			System.out.println("Wrong Input");//�߸��Է��Ѱ�� Wrong Input�� ����ϰ� �ٽ� �Է��� ����
			i--;//�迭�� �߰����� �ʴ� �����̹Ƿ� �ݺ����� �ѹ� �� ����
			break;
		}
		}
	}

}
