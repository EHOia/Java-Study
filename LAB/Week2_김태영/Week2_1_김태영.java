import java.util.Scanner;//Scanner클래스 불러오기
public class Week2_1_김태영 {
	public static void main(String[] args) {
		System.out.println("============\n전공: 사이버보안\n학번: 1971067\n성명: 김태영\n============");
		System.out.print("Input the amount of money(0~100000) : ");
		
		Scanner keyboard=new Scanner(System.in);
		int money;//사용자가 입력한 돈의 액수는 변수 money로 선언
		
		int [] won=new int[8];//반복문을 쓰기위해 기준 값들이 다 들어갈 수 있는 크기의 행렬을 선언
		won[0]=50000;//계산하는 기준 값들을 행렬에 각각 저장
		won[1]=10000;
		won[2]=5000;
		won[3]=1000;
		won[4]=500;
		won[5]=100;
		won[6]=50;
		won[7]=10;
		
		money=keyboard.nextInt();//사용자로부터 돈의 액수를 정수 형태로 입력받음
		if(money<=100000 && money>=0) {//만약 0~100000범위 밖의 수를 입력하면 프로그램이 실행되지 않음
			System.out.println("The output will be");
			for (int i=0;i<8;i++) {//행렬 index 0부터 7까지 반복할 반복문
				if(i%2==0) {//행렬의 짝수번째는 맨앞의 숫자가 5이므로 1일때와 계산식의 차이가 있어 조건문으로 분리
					System.out.println(won[i]+" won: "+(money/(won[i]/5)%10)/5);}//money에 index의 값을 5로 나눈 몫을 다시한번 나누어서 몫을 구한뒤 1자리 숫자로 만들고 5로 나눈 몫을 취해 지폐(동전)이 얼마나 들어가는지 계산
				else {//맨앞 숫자가 1인 경우
					System.out.println(won[i]+" won: "+(money/won[i]%10));}//money를 index의 값으로 나눈 몫을 1자리로 만들어 해당하는 값에 지폐(동전)이 얼마나 들어가는지 계산
				
				money%=won[i];}//반복문이 한번 끝나면 사용한 단위는 지워야 하기 때문에 인덱스 값으로 나눈 나머지를 다시 money에 넣고 다음 반복을 실행
			
			System.out.println("Reminder: "+money);}//나머지 값을 출력
		else System.out.println("잘못된 입력");
	}
}
