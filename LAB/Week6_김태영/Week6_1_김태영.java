import java.util.Scanner;
public class Week6_1_김태영 {

	public static void main(String[] args) {
		System.out.println("1971067\n사이버보안전공\n김태영");
		Buyer Buyer1=new Buyer();//구매할때 가격과 정보를 저장할 클래스
		Tv t=new Tv();//텔레비전을 구매하는 경우 사용되는 클래스
		Computer c=new Computer();//컴퓨터를 구매하는 경우 사용되는 클래스
		Video v=new Video();//비디오를 구매하는 경우 사용되는 클래스
		Audio a=new Audio();//오디오를 구매하는 경우 사용되는 클래스
		NoteBook n=new NoteBook();//노트북을 구매하는 경우 사용되는 클래스
		Scanner k=new Scanner(System.in);//Scanner 객체 생성
		System.out.println("How much money do you have?");
		Buyer1.money=k.nextInt();//nextInt 메소드를 이용해 Buyer의 money에 사용자로부터 입력받은 값 저장
		int choose=1;
		while(choose!=0) {//사용자가 입력한 값이 0인 경우 반복문을 끝냄
			System.out.println("What do you want to buy? Input 0 to quit.");
			System.out.println("1. TV(100)\t2. Computer(200)\t3. Video(110)\t4. Audio(50)\t5. NoteBook(300)");
			choose=k.nextInt();//nextInt 메소드를 이용해 choose에 사용자로부터 입력받은 값 저장
			switch(choose) {//choose의 값에 따라 사는 물건별로 메소드를 실행
			case 1://tv를 구매하는 경우
				Buyer1.buy(t);
				break;
			case 2://computer을  구매하는 경우
				Buyer1.buy(c);
				break;
			case 3://video를  구매하는 경우
				Buyer1.buy(v);
				break;
			case 4://audio를  구매하는 경우
				Buyer1.buy(a);
				break;
			case 5://notebook을 구매하는 경우
				Buyer1.buy(n);
				break;
			default://잘못 입력한 경우
				System.out.println("No such item.");	
			}
		}
		Buyer1.summary();

	}

}
