import java.util.Scanner;
public class HW1_3_김태영 {
	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영");
		Scanner k=new Scanner(System.in);//scanner 객체 생성
		String again="Y";//다시 실행 여부를 저장할 인스턴스 생성 후 y로 초기화
		while(again.equalsIgnoreCase("y")) {//사용자가 y를 입력하면 실행이 반복되도록
			System.out.println("Input a word");
			String str=k.next();//사용자에게 단어를 입력받음
			char Arr[]=new char[100];//배열 생성
			Arr=str.toCharArray();//스트링을 문자배열로 변환
			boolean flag=check(Arr);//check 매서드에 배열을 보내서 확인후 true 또는 false를 flag에 저장
			if(flag) System.out.println("symmetry");//true인경우 출력
			else System.out.println("Asymmetry");//false인경우 출력
			System.out.println("\nTry again?(y/n)");
			again=k.next();//다시실행여부를 입력받음
			System.out.println();//줄바꿈
		}
	}
	public static boolean check(char[] Arr) {
		for(int i=0;i<(Arr.length/2);i++) {//받은 배열이 대칭인지 확인
			if(Arr[i]!=Arr[Arr.length-1-i]) {//대칭이 아닌 부분이 발견되면 false반환하고 반복을 끝냄
				return false;
			}
		}
		return true;//반복문 실행중에 대칭이 아닌 부분이 발견되지 않고 정상적으로 끝나면 true를 반환
	}
}
