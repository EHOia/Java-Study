
public class Week4_3_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영");
		int a=5,b=10;
		double da=3.4,db=5.2;
		char ca='a',cb='b';
		int iarr[]= {1,2,3};
		double darr[]= {1.1,2.2,3.3};
		char carr[]= {'a','p','p','l','e'};
		System.out.println("a+b="+sum(a,b));
		System.out.println("da+b="+sum(da,b));
		System.out.println("a+db="+sum(a,db));
		System.out.println("da+db="+sum(da,db));
		System.out.println("ca+cb="+sum(ca,cb));
		System.out.println("sum of Int_Arr="+sum(iarr));
		System.out.println("sum of Double_Arr="+sum(darr));
		System.out.println("sum of Char_Arr="+sum(carr));
		}
	static int sum(int a,int b){//받는 인자가 모두 정수형일때
		return a+b;//결과값이 int이기 때문에 int로 반환
	}
	static double sum(int a, double b) {//받는 인자가 순서대로 정수, double형일때
		return a+b;//결과값이 double이기 때문에 double로 반환
	}
	static double sum(double a, int b) {//받는 인자가 순서대로 double, int type일때
		return a+b;//결과값이 double이기 때문에 double로 반환
	}
	static double sum(double a, double b) {//받는 인자가 모두 double형일때
		return a+b;//결과값이 double이기 때문에 double로 반환
	}
	static String sum(char a, char b) {//받는 인자가 char형일때
		String str="";//char을 string으로 바꾸기 위해 string형의 str을 선언&""로 초기화
		str+=a;//string+char을 하면 string으로 결과가 나오기 때문에 ""만 있던 str에 받은 char a를 더함
		str+=b;//"a"이던 str에 나머지 b도 더함
		return str;//결과는 String type
	}
	static int sum(int[] a) {//받는 인자가 정수형 배열인경우
		int result=0;
		for (int i=0;i<a.length;i++) {//배열의 수만큼 반복문 돌아감
			result+=a[i];
		}
		return result;//결과는 정수타입
	}
	static double sum(double[] a) {//받는인자가 double type의 배열인경우
		double result=0;
		for (int i=0;i<a.length;i++) {//배열의 수만큼 반복문 돌아감
			result+=a[i];
		}
		return result;//결과는 double type
	}
	static String sum(char[] a) {//char type의 배열을 인자로 받는경우
		String result="";//char을 여러개 합치기 위해서는 String type로 바꿔야함, 먼저 String 타입의 result를 생성, ""로 초기화
		for (int i=0;i<a.length;i++) {//배열의 수만큼 반복문 돌아감
			result+=a[i];//""상태인 result에 각 배열의 char 변수를 하나씩 추가함
		}
		return result;//반환은 String type
	}

}