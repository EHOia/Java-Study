import java.util.*;

public class HW2_2_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공 1971067 김태영");
		Scanner k=new Scanner(System.in);

		while(true) {
			LinkedList<Character> myStack=new LinkedList<Character>();//char 타입의 linked list 생성
			String input=null;//사용자의 입력을 받을 변수
			boolean isWrong=false;//사용자가 (){}[]외의 값을 입력한 경우를 체크하기 위한 변수
			boolean isCorrect=false;//사용자가 입력한 괄호들이 쌍이 맞는지 체크하는 변수
			System.out.print("\nInput: ");
			input=k.nextLine();//입력 받음
			if(input.equalsIgnoreCase("0")) {//0을 입력하면 종료
				break;
			}
			char[] strToChar=input.toCharArray();//입력받은 내용을 한글자씩 char형태의 배열에 저장
			for(int i=0;i<strToChar.length;i++) {//길이만큼 반복문 실행
				if(strToChar[i]=='('||strToChar[i]=='['||strToChar[i]=='{') {//열리는 괄호가 나온 경우
					myStack.addLast(strToChar[i]);//push
				}
				else if(strToChar[i]==']'||strToChar[i]=='}'||strToChar[i]==')') {//닫히는 괄호가 나온경우
					if(myStack.isEmpty()) {//스택이 비어있으면
						isCorrect=false;//쌍이 맞지 않는다
						break;//for문 종료
					}
					else if(strToChar[i]==']') {
						if(myStack.removeLast()=='[') {//쌍이 맞는 괄호가 stack에 있으면
							isCorrect=true;//쌍이 맞는다
						}
						else {
							isCorrect=false;//쌍이 맞지 않는다
							break;//for문 종료
						}
					}
					else if(strToChar[i]=='}') {//밑은 같은내용 반복
						if(myStack.removeLast()=='{') {
							isCorrect=true;
						}
						else {
							isCorrect=false;
							break;
						}
					}
					else if(strToChar[i]==')') {
						if(myStack.removeLast()=='(') {
							isCorrect=true;
						}
						else {
							isCorrect=false;
							break;
						}
					}
				}
				else {
					isWrong=true;//이외의 문자를 입력한 경우
					break;//for문 종료
				}
			}
			if(isWrong) {//잘못 입력한경우
				System.out.println("Wrong Input");
			}
			else{
				if(!myStack.isEmpty()) {//반복 끝났는데 stack에 남아있는 경우
					isCorrect=false;//쌍이 맞지 않음
				}
				if(isCorrect) {//쌍이 맞다고 확인이 완료
					System.out.println("Correct");
				}
				else {//쌍이 맞지 않음
					System.out.println("Incorrect");
				}
			}
		}
		System.out.println("Program finished");
	}

}
