import java.util.Scanner;
public class Week5_1_김태영 {

	public static void main(String[] args) {
		System.out.println("1971067\n사이버보안전공\n김태영");
		System.out.println("Input Title for Play");
		Play play=new Play();//플레이 클래스 불러옴
		Scanner k=new Scanner(System.in);
		play.setTitle(k.nextLine());//입력받은 제목을 클래스의 타이틀 항목에 넣어주는 함수로 보냄
		System.out.println("Input Director for Play");
		play.setDirector(k.nextLine());//입력받은 디렉터를 클래스의 디렉터 항목에 넣어주는 함수로 보냄
		System.out.println("Input Writer for Play");
		play.setWriter(k.nextLine());//입력받은 writer를 클래스의 writer항목에 넣어주는 함수로 보냄
		System.out.println("Input Title for Film");
		Film film=new Film();//필름 클래스 불러옴
		film.setTitle(k.nextLine());//입력받은 제목을 클래스의 타이틀 항목에 넣어주는 함수로 보냄
		System.out.println("Input Director for Film");
		film.setDirector(k.nextLine());//입력받은 디렉터를 클래스의 디렉터 항목에 넣어주는 함수로 보냄
		System.out.println("Input Writer for Film");
		film.setWriter(k.nextLine());//입력받은 writer를 클래스의 writer항목에 넣어주는 함수로 보냄
		System.out.println("Input Performance Cost for Play");
		play.setPerformanceCost(k.nextInt());//입력받은 가격을 클래스의 가격항목에 넣어주는 함수로 보냄
		System.out.println("Input boxOfficeGross for Film");
		film.setBoxOfficeGross(k.nextInt());//입력받은 내용을 클래스의 해당 항목에 넣어주는 함수로 보냄
		play.display();//플레이 클래스의 내용을 불러옴
		System.out.println();
		film.display();//필름 클래스의 내용을 불러옴
	}

}
