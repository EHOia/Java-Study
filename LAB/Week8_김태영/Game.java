//사이버보안전공 1971067 김태영
import java.util.Scanner;
public class Game {
	Scanner k=new Scanner(System.in);//Scanner객체 생성
	int scoreY=0, scoreC=0;//사용자와 컴퓨터 각자의 이긴 횟수를 입력받을 변수
	
	public void play() {
		System.out.println("가위바위보 게임을 시작합니다.");
		while(scoreY<3&&scoreC<3) {//3번 이긴 사람이 생길때까지 반복문 실행
			input();
		}
		System.out.println("\nYou("+scoreY+")\tCom("+scoreC+")");//게임 종료 후 결과를 출력
		if (scoreY<scoreC)
			System.out.println("컴퓨터가 이겼습니다.");
		else System.out.println("당신이 이겼습니다");
		System.out.println("게임을 종료합니다.");
	}
	public void input() {
		int chooseY, chooseC;//사용자의 입력과 컴퓨터가 랜덤하게 생성한 숫자를 입력받을 변수 생성
		try {//try block
			System.out.println("\n당신의 선택은?(You("+scoreY+") - Com("+scoreC+"))");
			System.out.println("가위(1) 바위(2) 보(3)");
			chooseY=k.nextInt();//사용자로부터 1~3사이의 숫자를 입력받음
			if(chooseY<1||chooseY>3)//입력을 잘못한경우 예외처리
				throw new Exception("범위가 잘못되었습니다.");//exception이 발생한경우 바로 인스턴스 생성해서 catch block으로 보냄
		chooseC=(int)(Math.random()*3)+1;//컴퓨터의 입력은 랜덤 매서드를 이용해 설정
		System.out.println("<You>\t<Com>");
		System.out.println(rsp(chooseY)+"\t"+rsp(chooseC));//나와 컴퓨터가 무엇을 냈는지 숫자를 문자로 바꾸는 매서드를 사용하여 보여줌
		writeOutput(chooseY, chooseC);//누가 이겼는지 결과를 알려주기 위해 writeOutput 매서드를 이용
		}
		catch(Exception e) {//catch block
			System.out.println(e.getMessage());//exception 인스턴스 생성시 입력된 String을 받아서 출력
		}
		
	}
	public void writeOutput(int y, int c) {//컴퓨터와 사용자가 낸 값을 비교해서 결과를 출력해주는 매서드
		switch(y-c) {
		case 0:
			System.out.println("비김");
			break;
		case 1:
		case -2:
			System.out.println("당신 승");
			scoreY++;
			break;
		case 2:
		case -1:
			System.out.println("컴퓨터 승");
			scoreC++;
			break;
		}
	}
	public String rsp(int num) {//사용자와 컴퓨터의 선택값을 숫자에서 문자로 바꾸어 반환해주는 매서드
		switch(num) {//입력한 수에 맞는 내용을 반환
		case 1:
			return "가위";
		case 2:
			return "바위";
		default:
			return "보";
		}
	}
}
