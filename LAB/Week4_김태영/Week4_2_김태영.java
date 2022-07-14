import java.util.Scanner;
public class Week4_2_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영");
		Facto e1=new Facto();//첫번째 원소를 계산할 클래스
		Facto e2=new Facto();//두번째 원소를 계산할 클래스
		Scanner k=new Scanner(System.in);
		System.out.print("첫번째 원소 입력:");
		int n1=k.nextInt();
		int r1=e1.factoVal(n1);//입력받은 원소1을 factoVal로 보내 팩토리얼 계산 후 r1으로 결과값을 받음
		System.out.print("두번째 원소 입력:");
		int n2=k.nextInt();
		int r2=e2.factoVal(n2);//입력받은 원소2을 factoVal로 보내 팩토리얼 계산 후 r2으로 결과값을 받음
		System.out.println("Factorial("+n1+") - Factorial("+n2+") = "+(r1-r2));//받은 결과값의 차를 출력
	}
}