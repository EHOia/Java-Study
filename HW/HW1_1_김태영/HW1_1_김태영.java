import java.util.Scanner;
public class HW1_1_김태영 {

	public static void main(String[] args) {
		System.out.println("1971067\n사이버보안전공\n김태영");
		Scanner k=new Scanner(System.in);//Scanner객체 생성
		System.out.println("Hour:");
		int hour=k.nextInt();//nextInt메소드로 사용자로부터 입력받은 값을 hour에 저장
		System.out.println("Minute:");
		int minute=k.nextInt();//nextInt메소드로 사용자로부터 입력받은 값을 minute에 저장
		Time t=new Time();//Time 객체 생성
		t.setTime(hour, minute);//입력받은 시간과 분 값을 setTime을 통해 Time class로 전송
		int ghour=t.getTime('h');//Time class에 있는 시간 값을 받아 ghour에 저장
		int gminute=t.getTime('m');//Time class에 있는 분 값을 받아 gminute에 저장
		if(ghour!=hour&&gminute!=minute) {//사용자가 시간과 분 입력을 잘못했을 경우 Time class에서 입력한 값을 0으로 변경하기 때문에 처음 값과 값이 다른경우를 분류
			System.out.println("Wrong Input");
		}
		System.out.println(ghour+":"+gminute);//Time class에서 받은 값을 출력
	}
}
