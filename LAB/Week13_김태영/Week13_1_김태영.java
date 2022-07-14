import java.util.Scanner;

public class Week13_1_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹��������� 1971067 ���¿�");
		Scanner k=new Scanner(System.in);
		System.out.println("Input the number of coin toss:");
		int n=k.nextInt();//����ڷκ��� ������ ���� Ƚ���� ����
		SharedArea sa=new SharedArea();
		SimulThread st=new SimulThread(sa,n);//shared area�� n�� �޴� simul thread ����
		PrintThread pt=new PrintThread(sa);//shared area�� ���� print thread ����
		
		st.start();//thread ����
		pt.start();
	}

}

class SimulThread extends Thread{
	SharedArea sa;
	int n;
	double ratio;
	SimulThread(SharedArea sharedArea, int n){
		sa=sharedArea;//main�� ������ shared area�� ����
		this.n=n;//������� ���� �Է��� �޾ƿ�
	}
	public void run() {
		int front=0;//�ո��� ���� Ƚ��
		for(int i=0;i<n;i++) {
			int coin=(int)Math.round(Math.random());//1,0�� �������� ����, 1�� �ո��� ����
			front+=coin;//�ո��� ���ö����� 1�� ����, �޸��� ��� 0�� ����
		}
		ratio=(double)front/n;//������ ���
		sa.ratio=this.ratio;//����� ������ shared area�� ����
		sa.isReady=true;//thread�� shared area ����� ������ ������ true�� �ٲ�
		synchronized(sa) {//����ȭ
			sa.notify();//����� �����ٰ� ����
		}
	}
}

class PrintThread extends Thread{
	SharedArea sa;
	PrintThread(SharedArea sharedArea){
		sa=sharedArea;//main�� ������ shared area�� ����
	}
	public void run() {
		if(sa.isReady!=true) {
			try {
				synchronized(sa) {
					sa.wait();//����� ���������� ��ٸ�
				}
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("Front Ratio: %.2f",sa.ratio*100);//������ ���
		System.out.println("%");
	}
}

class SharedArea{
	double ratio;
	boolean isReady;
}