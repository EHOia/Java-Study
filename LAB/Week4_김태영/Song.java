//사이버보안전공 1971067 김태영
import java.util.Scanner;
public class Song {
	public String title;
	public String singer;
	public int price;
	
	public Song(String title, int price) {
		this(title, "모름", price);//사용자가 가수명을 입력하지 않은경우 가수명에 자동으로 "모름"을 넣어서 생성자로 보냄
	}
	public Song(String title, String singer, int price) {//이 생성자를 통해 각각의 인스턴스 변수에 내용을 넣음
		this.title=title;//Song class의 인스턴스변수인 title에 사용자가 입력한 title을 넣음
		this.singer=singer;//Song class의 인스턴스변수인 singer에 사용자가 입력한 singer을 넣음
		this.price=price;//Song class의 인스턴스변수인 price에 사용자가 입력한 price을 넣음
	}
	public Song() {
		
	}
	public void play() {
		System.out.println("몇번 들으시겠습니까?");
		Scanner k=new Scanner(System.in);
		int rep=k.nextInt();//곡의 반복수를 받음
		for (int i=0;i<rep;i++) {//곡의 반복수만큼 출력을 반복함
		System.out.println(title+" by "+singer);}
		System.out.println("총 "+rep*price+"원입니다.");//곡의 반복수만큼 가격을 계산해서 출력
	}
}
