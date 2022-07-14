import java.util.Scanner;
public class Week4_1_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영");
		Scanner k=new Scanner(System.in);
		Song song1;//뒤에 어떤 생성자가 사용될지 모르기때문에 그냥 참조변수만 먼저 선언
		System.out.println("*Song 정보*");
		String title="";//곡명이 비어있을경우 다시 입력하라고 요청해야하기 때문에 빈칸으로 초기화
		String singer="";//가수명이 비어있는 경우 입력하지 않았다고 구별해서 생성자를 불러야하기 때문에 빈칸으로 초기화
		int price;
		while(title.equals("")) {//처음에 반복문에 들어갈때는 이미 곡명이 비어있기 때문에 들어갈 수 있고, 사용자가 입력을 하기 전까지 반복문이 계속됨
			System.out.print("곡명 : ");
			title=k.nextLine();//사용자가 입력한 내용을 받아옴
			if (title.equals("")) System.out.println("곡명은 반드시 필요합니다.");//사용자가 곡명을 입력하지 않은경우
		}
		System.out.print("가수명 : ");
		singer=k.nextLine();//사용자로부터 가수명을 받음
		System.out.print("가격 : ");
		price=k.nextInt();//사용자로부터 노래의 가격을 받음
		if(singer.equals("")) {//사용자가 가수명을 입력하지 않은 경우
			song1=new Song(title, price);//가수명에 "모름"을 넣어 전달하는 생성자로 연결
		}
		else {//사용자가 가수명을 입력한경우
			song1=new Song(title, singer, price);//사용자로부터 받은 모든 정보를 class의 변수에 저장하는 생성자로 연결
		}
		song1.play();//곡의 내용을 출력하는 매서드로
	}

}
