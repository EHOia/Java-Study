//사이버보안전공 1971067 김태영
public class Facto {
	static int result;
	static int factoVal(int x) {
		result=1;//클래스변수라서 첫번째 계산하고 다음 계산을 진행할때 이전 값이 남아있기 때문에 매서드 실행시마다 1로 초기화
		for (int i=x;i>0;i--) {//팩토리얼 계산
			result=result*i;
		}
		return result;//팩토리얼 계산 값을 main으로 return
	}
}
