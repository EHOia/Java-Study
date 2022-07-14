import javax.swing.JOptionPane;

public class Week13_2_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹��������� 1971067 ���¿�");
		String[] words=new String[15];//�ܾ�迭 ����
		words[0]="happy";
		words[1]="cake";
		words[2]="dog";
		words[3]="giant";
		words[4]="cat";
		words[5]="love";
		words[6]="apple";
		words[7]="bear";
		words[8]="banana";
		words[9]="grape";
		words[10]="smile";
		words[11]="word";
		words[12]="study";
		words[13]="work";
		words[14]="come";
		SharedArea2 sa=new SharedArea2(words);//�ܾ� �迭�� sharedarea�� ����
		MyThread th=new MyThread(sa);//sa�� ������ my thread ����
		InputThread it=new InputThread(sa);//sa�� ������ input thread ����
		th.start();//thread ����
		it.start();
		
	}

}

class MyThread extends Thread{//�ܾ� �迭�� �������� �ܾ ���
	String word;//�迭�� �������� ���õ� �ܾ ����
	SharedArea2 sa;
	MyThread(SharedArea2 sa) {
		this.sa=sa;//shared area�� ����
	}
	public void run() {
		while(true) {
			if(sa.stop==false) break;//stop�� false�� ��� thread�� ����
			word=sa.words[(int)(Math.random()*15)];//�������� �ܾ ����
			System.out.println(word);
			sa.word=this.word;//���� �ܼ�â�� ��µ� �ܾ shared area�� ����
			sa.check+=1;//������� ����� �ܾ��� ������ shared area�� ����
			try {
				sleep(1000);//1�ʾ� ���� ��
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class InputThread extends Thread{
	SharedArea2 sa;
	InputThread(SharedArea2 sa){
		this.sa=sa;//���� shared area�� ����
	}
	public void run() {
		while(true) {
			String st=JOptionPane.showInputDialog("���ڿ� �Է�");//�˾�â���� �ܾ �Է¹���
			System.out.println("<"+st+">�� �Է��ϼ̽��ϴ�.");//�Է��� �ܾ �ܼ�â�� ���
			
			if(st.equalsIgnoreCase(sa.word)) {//�Է��� �ܾ ���� �ܼ�â�� �ִ� �ܾ�� ������ �Ʒ� ���� ��� �� �ݺ��� ����
				System.out.println("����!");
				System.out.println("Timer is stopped.");
				break;
			}
			else if(sa.check==20) {//���� ��µ� �ܾ��� ���� 20���� �����ϸ� ���� ��� �� �ݺ��� ����
				System.out.println("����!");
				break;
			}
		}
		sa.stop=false;//my thread ���Ḧ ���� shared area�� stop������ false ����
		
	}
}

class SharedArea2{
	String[] words=new String[15];
	boolean stop=true;
	String word;
	int check=0;
	SharedArea2(String[] words){
		this.words=words;//main���κ��� �ܾ� �迭�� �޾ƿͼ� shared area�� ����
	}
}