import java.util.Scanner;
public class Week6_2_김태영 {

	public static void main(String[] args) {
		System.out.println("1971067\n사이버보안전공\n김태영");
		Scanner k=new Scanner(System.in);//Scanner 객체 생성
		Emergency e=new Emergency();//Emergency 객체 생성
		FireEngine f=new FireEngine();//FireEngine 객체 생성
		Ambulance a=new Ambulance();//Ambulance 객체 생성
		PoliceCar p=new PoliceCar();//PoliceCar 객체 생성
		for(int i=0;i<10;i++) {//배열의 길이인 10만큼 사용자가 응급콜을 할수 있도록 반복
		System.out.println("What kind of Emergency?");
		System.out.println("1. Fire\t2. Patient\t3. Thief\t4. Record\t5. End");
		int choose=k.nextInt();//사용자로부터 선택한 번호를 입력받음
		switch(choose) {//입력받은 번호에 맞는 객체를 EM_Call 매소드나 EM_record 메소드에 보냄
		case 1://Fire->FireEngine
			e.EM_Call(f);
			break;
		case 2://Patient->Ambulance
			e.EM_Call(a);
			break;
		case 3://Thief->PoliceCar
			e.EM_Call(p);
			break;
		case 4://기록을 출력
			e.EM_record();
			i--;//배열에 추가되지 않는 내용이므로 반복문을 한번 더 실행
			break;
		case 5:
			System.out.println("Finished");//종료버튼을 누른경우 finished를 출력하고
			System.exit(0);//프로그램 종료
		default:
			System.out.println("Wrong Input");//잘못입력한경우 Wrong Input을 출력하고 다시 입력을 받음
			i--;//배열에 추가되지 않는 내용이므로 반복문을 한번 더 실행
			break;
		}
		}
	}

}
