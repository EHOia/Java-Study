import java.util.*;
public class Week10_2_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�\n");
		System.out.println("�л��� ID�� �̸��� ���ʷ� �Է��ϼ���.(����� 0 0 �Է�)");
		Map<String,String> stuIn=new HashMap<String,String>();//Key, Value���� String���� �޴� hashmap����
		Scanner k=new Scanner(System.in);//Scanner��ü ����
		String ID, name, key,maxID,minID;
		int maxLength, minLength;//���̺񱳸� ���� ���� �ν��Ͻ�����
		while(true) {
			ID=k.next();//���̵��Է�
			name=k.next();//�̸��Է�
			if(ID.equalsIgnoreCase("0")&&name.equalsIgnoreCase("0")) break;//����ڰ� 0 0�� �Է��Ѱ�� �ݺ��� ����
			stuIn.put(ID,name);//Ű�� ���̵� value�� �̸����� �ؼ� �ؽ��ʿ� �߰�
		}
		//�л���� ���
		System.out.println("<�л����>");
		System.out.println("[ID]\t[NAME]");
		Set keys=stuIn.keySet();
		//minLength, maxLength�� ������ ������ �ʱ�ȭ
		Iterator<String> it1=keys.iterator();//iterator ����
		String tempm=it1.next();
		minLength=stuIn.get(tempm).length();
		String tempM=it1.next();
		maxLength=stuIn.get(tempM).length();
		maxID=tempM;//������ ������ �ʱ�ȭ �� value�� �ش��ϴ� ���̵� ����
		minID=tempm;
		//�Էµ� ���� ��� �� ���� ��
		Iterator<String> it=keys.iterator();//�ռ� ����� iterator�� ���Ǿ��⶧���� �ٽ� iterator ����
		while(it.hasNext()) {//key�� �����ϴ� ��ŭ �ݺ��� ����
			key=it.next();//���� �տ��ִ� Ű���� ����
			String temp=stuIn.get(key);//�ӽ÷� Ű���� �ش��ϴ� value�� ����
			System.out.println(key+"\t"+temp);//Ű�� value���� ���
			//value���� ���� ��
			if(temp.length()<minLength) {
				minLength=temp.length();
				minID=key;
			}
			else if(temp.length()>maxLength) {
				maxLength=temp.length();
				maxID=key;
			}
		}
		System.out.println("\n��ü �л���:"+stuIn.size());//��ü �л��� ���
		//���� �� �̸��� ���� ª�� �̸��� ���� ���� ���
		System.out.println("<���� �� �̸��� ���� �л�>");
		System.out.println("ID:"+maxID+" NAME:"+stuIn.get(maxID)+" ����:"+maxLength);
		System.out.println("<���� ª�� �̸��� ���� �л�>");
		System.out.println("ID:"+minID+" NAME:"+stuIn.get(minID)+" ����:"+minLength);

	}

}
