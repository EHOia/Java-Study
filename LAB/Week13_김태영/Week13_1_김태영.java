import java.util.Scanner;

public class Week13_1_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공 1971067 김태영");
		Scanner k=new Scanner(System.in);
		System.out.println("Input the number of coin toss:");
		int n=k.nextInt();//사용자로부터 동전을 던질 횟수를 받음
		SharedArea sa=new SharedArea();
		SimulThread st=new SimulThread(sa,n);//shared area와 n을 받는 simul thread 생성
		PrintThread pt=new PrintThread(sa);//shared area를 갖는 print thread 생성
		
		st.start();//thread 실행
		pt.start();
	}

}

class SimulThread extends Thread{
	SharedArea sa;
	int n;
	double ratio;
	SimulThread(SharedArea sharedArea, int n){
		sa=sharedArea;//main과 동일한 shared area를 가짐
		this.n=n;//사용자의 숫자 입력을 받아옴
	}
	public void run() {
		int front=0;//앞면이 나온 횟수
		for(int i=0;i<n;i++) {
			int coin=(int)Math.round(Math.random());//1,0를 랜덤으로 생성, 1이 앞면을 뜻함
			front+=coin;//앞면이 나올때마다 1을 더함, 뒷면인 경우 0을 더함
		}
		ratio=(double)front/n;//비율을 계산
		sa.ratio=this.ratio;//계산한 비율을 shared area에 전달
		sa.isReady=true;//thread가 shared area 사용을 끝내고 변수를 true로 바꿈
		synchronized(sa) {//동기화
			sa.notify();//사용이 끝났다고 전달
		}
	}
}

class PrintThread extends Thread{
	SharedArea sa;
	PrintThread(SharedArea sharedArea){
		sa=sharedArea;//main과 동일한 shared area를 가짐
	}
	public void run() {
		if(sa.isReady!=true) {
			try {
				synchronized(sa) {
					sa.wait();//사용이 끝날때까지 기다림
				}
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("Front Ratio: %.2f",sa.ratio*100);//비율을 출력
		System.out.println("%");
	}
}

class SharedArea{
	double ratio;
	boolean isReady;
}