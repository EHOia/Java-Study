import java.util.Scanner;
public class Week3_1_김태영 {

	public static void main(String[] args) {
		System.out.println("============\n전공: 사이버보안\n학번: 1971067\n성명: 김태영\n========");

		Song song1=new Song();//노래1를 Song type으로
		Song song2=new Song();//노래2를 Song type으로
		Scanner kbd=new Scanner(System.in);
		System.out.println("*Song 1*");//노래1에대한 정보 입력
		System.out.print("곡명입력:");
		song1.title=kbd.nextLine();//class Song으로 생성된 song1의 title에 입력
		System.out.print("가수명입력:");
		song1.singer=kbd.nextLine();//class Song으로 생성된 song1의 singer에 입력
		System.out.print("가격입력:");
		song1.price=kbd.nextInt();//class Song으로 생성된 song1의 price에 입력
		kbd.nextLine();//앞에서 nextInt를 이용해서 입력값을 받은 후 다음 입력내용을 nextLine으로 받기 위해서는 남은 \n을 없애야 함
		
		System.out.println("\n*Song 2*");//song2에대한 정보 입력
		System.out.print("곡명입력:");
		song2.title=kbd.nextLine();//class Song으로 생성된 song2의 title에 입력
		System.out.print("가수명입력:");
		song2.singer=kbd.nextLine();//class Song으로 생성된 song2의 singer에 입력
		System.out.print("가격입력:");
		song2.price=kbd.nextInt();//class Song으로 생성된 song2의 price에 입력
		
		System.out.println("\n노래를 고르세요");
		System.out.println("1:"+song1.title+" 2:"+song2.title);//song1,song2의 title을 가져와서 출력
		int choose;
		choose=kbd.nextInt();
		switch(choose) {//1,2중 선택한 번호에 따라 출력하는 값이 바뀌는것을 switch를 이용해 구현
		case 1://song1을 선택한 경우 노래1에 대한 정보를 출력
			song1.play();
			song1.price();
			break;
		case 2://song2을 선택한 경우 노래2에 대한 정보를 출력
			song2.play();
			song2.price();
			break;
		}
		System.out.println("감사합니다.");
	}
}