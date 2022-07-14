import javax.swing.JOptionPane;

public class Week13_2_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공 1971067 김태영");
		String[] words=new String[15];//단어배열 생성
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
		SharedArea2 sa=new SharedArea2(words);//단어 배열을 sharedarea에 보냄
		MyThread th=new MyThread(sa);//sa를 가지고 my thread 생성
		InputThread it=new InputThread(sa);//sa를 가지고 input thread 생성
		th.start();//thread 실행
		it.start();
		
	}

}

class MyThread extends Thread{//단어 배열중 무작위로 단어를 출력
	String word;//배열중 무작위로 선택된 단어를 저장
	SharedArea2 sa;
	MyThread(SharedArea2 sa) {
		this.sa=sa;//shared area를 받음
	}
	public void run() {
		while(true) {
			if(sa.stop==false) break;//stop이 false인 경우 thread를 멈춤
			word=sa.words[(int)(Math.random()*15)];//랜덤으로 단어를 선택
			System.out.println(word);
			sa.word=this.word;//현재 콘솔창에 출력된 단어를 shared area에 보냄
			sa.check+=1;//현재까지 출력한 단어의 개수를 shared area에 보냄
			try {
				sleep(1000);//1초씩 텀을 줌
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
		this.sa=sa;//같은 shared area를 받음
	}
	public void run() {
		while(true) {
			String st=JOptionPane.showInputDialog("문자열 입력");//팝업창에서 단어를 입력받음
			System.out.println("<"+st+">을 입력하셨습니다.");//입력한 단어를 콘솔창에 출력
			
			if(st.equalsIgnoreCase(sa.word)) {//입력한 단어가 현재 콘솔창에 있는 단어와 같으면 아래 내용 출력 및 반복문 종료
				System.out.println("성공!");
				System.out.println("Timer is stopped.");
				break;
			}
			else if(sa.check==20) {//현재 출력된 단어의 수가 20개에 도달하면 실패 출력 및 반복문 종료
				System.out.println("실패!");
				break;
			}
		}
		sa.stop=false;//my thread 종료를 위해 shared area의 stop변수에 false 저장
		
	}
}

class SharedArea2{
	String[] words=new String[15];
	boolean stop=true;
	String word;
	int check=0;
	SharedArea2(String[] words){
		this.words=words;//main으로부터 단어 배열을 받아와서 shared area에 저장
	}
}