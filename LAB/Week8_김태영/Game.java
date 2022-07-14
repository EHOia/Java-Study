//���̹��������� 1971067 ���¿�
import java.util.Scanner;
public class Game {
	Scanner k=new Scanner(System.in);//Scanner��ü ����
	int scoreY=0, scoreC=0;//����ڿ� ��ǻ�� ������ �̱� Ƚ���� �Է¹��� ����
	
	public void play() {
		System.out.println("���������� ������ �����մϴ�.");
		while(scoreY<3&&scoreC<3) {//3�� �̱� ����� ���涧���� �ݺ��� ����
			input();
		}
		System.out.println("\nYou("+scoreY+")\tCom("+scoreC+")");//���� ���� �� ����� ���
		if (scoreY<scoreC)
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		else System.out.println("����� �̰���ϴ�");
		System.out.println("������ �����մϴ�.");
	}
	public void input() {
		int chooseY, chooseC;//������� �Է°� ��ǻ�Ͱ� �����ϰ� ������ ���ڸ� �Է¹��� ���� ����
		try {//try block
			System.out.println("\n����� ������?(You("+scoreY+") - Com("+scoreC+"))");
			System.out.println("����(1) ����(2) ��(3)");
			chooseY=k.nextInt();//����ڷκ��� 1~3������ ���ڸ� �Է¹���
			if(chooseY<1||chooseY>3)//�Է��� �߸��Ѱ�� ����ó��
				throw new Exception("������ �߸��Ǿ����ϴ�.");//exception�� �߻��Ѱ�� �ٷ� �ν��Ͻ� �����ؼ� catch block���� ����
		chooseC=(int)(Math.random()*3)+1;//��ǻ���� �Է��� ���� �ż��带 �̿��� ����
		System.out.println("<You>\t<Com>");
		System.out.println(rsp(chooseY)+"\t"+rsp(chooseC));//���� ��ǻ�Ͱ� ������ �´��� ���ڸ� ���ڷ� �ٲٴ� �ż��带 ����Ͽ� ������
		writeOutput(chooseY, chooseC);//���� �̰���� ����� �˷��ֱ� ���� writeOutput �ż��带 �̿�
		}
		catch(Exception e) {//catch block
			System.out.println(e.getMessage());//exception �ν��Ͻ� ������ �Էµ� String�� �޾Ƽ� ���
		}
		
	}
	public void writeOutput(int y, int c) {//��ǻ�Ϳ� ����ڰ� �� ���� ���ؼ� ����� ������ִ� �ż���
		switch(y-c) {
		case 0:
			System.out.println("���");
			break;
		case 1:
		case -2:
			System.out.println("��� ��");
			scoreY++;
			break;
		case 2:
		case -1:
			System.out.println("��ǻ�� ��");
			scoreC++;
			break;
		}
	}
	public String rsp(int num) {//����ڿ� ��ǻ���� ���ð��� ���ڿ��� ���ڷ� �ٲپ� ��ȯ���ִ� �ż���
		switch(num) {//�Է��� ���� �´� ������ ��ȯ
		case 1:
			return "����";
		case 2:
			return "����";
		default:
			return "��";
		}
	}
}
