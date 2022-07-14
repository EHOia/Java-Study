import java.util.*;

public class HW2_2_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹��������� 1971067 ���¿�");
		Scanner k=new Scanner(System.in);

		while(true) {
			LinkedList<Character> myStack=new LinkedList<Character>();//char Ÿ���� linked list ����
			String input=null;//������� �Է��� ���� ����
			boolean isWrong=false;//����ڰ� (){}[]���� ���� �Է��� ��츦 üũ�ϱ� ���� ����
			boolean isCorrect=false;//����ڰ� �Է��� ��ȣ���� ���� �´��� üũ�ϴ� ����
			System.out.print("\nInput: ");
			input=k.nextLine();//�Է� ����
			if(input.equalsIgnoreCase("0")) {//0�� �Է��ϸ� ����
				break;
			}
			char[] strToChar=input.toCharArray();//�Է¹��� ������ �ѱ��ھ� char������ �迭�� ����
			for(int i=0;i<strToChar.length;i++) {//���̸�ŭ �ݺ��� ����
				if(strToChar[i]=='('||strToChar[i]=='['||strToChar[i]=='{') {//������ ��ȣ�� ���� ���
					myStack.addLast(strToChar[i]);//push
				}
				else if(strToChar[i]==']'||strToChar[i]=='}'||strToChar[i]==')') {//������ ��ȣ�� ���°��
					if(myStack.isEmpty()) {//������ ���������
						isCorrect=false;//���� ���� �ʴ´�
						break;//for�� ����
					}
					else if(strToChar[i]==']') {
						if(myStack.removeLast()=='[') {//���� �´� ��ȣ�� stack�� ������
							isCorrect=true;//���� �´´�
						}
						else {
							isCorrect=false;//���� ���� �ʴ´�
							break;//for�� ����
						}
					}
					else if(strToChar[i]=='}') {//���� �������� �ݺ�
						if(myStack.removeLast()=='{') {
							isCorrect=true;
						}
						else {
							isCorrect=false;
							break;
						}
					}
					else if(strToChar[i]==')') {
						if(myStack.removeLast()=='(') {
							isCorrect=true;
						}
						else {
							isCorrect=false;
							break;
						}
					}
				}
				else {
					isWrong=true;//�̿��� ���ڸ� �Է��� ���
					break;//for�� ����
				}
			}
			if(isWrong) {//�߸� �Է��Ѱ��
				System.out.println("Wrong Input");
			}
			else{
				if(!myStack.isEmpty()) {//�ݺ� �����µ� stack�� �����ִ� ���
					isCorrect=false;//���� ���� ����
				}
				if(isCorrect) {//���� �´ٰ� Ȯ���� �Ϸ�
					System.out.println("Correct");
				}
				else {//���� ���� ����
					System.out.println("Incorrect");
				}
			}
		}
		System.out.println("Program finished");
	}

}
