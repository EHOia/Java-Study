import java.util.*;
public class Week10_2_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영\n");
		System.out.println("학생의 ID와 이름을 차례로 입력하세요.(종료시 0 0 입력)");
		Map<String,String> stuIn=new HashMap<String,String>();//Key, Value값을 String으로 받는 hashmap생성
		Scanner k=new Scanner(System.in);//Scanner객체 생성
		String ID, name, key,maxID,minID;
		int maxLength, minLength;//길이비교를 위해 사용될 인스턴스변수
		while(true) {
			ID=k.next();//아이디입력
			name=k.next();//이름입력
			if(ID.equalsIgnoreCase("0")&&name.equalsIgnoreCase("0")) break;//사용자가 0 0을 입력한경우 반복문 종료
			stuIn.put(ID,name);//키는 아이디 value는 이름으로 해서 해쉬맵에 추가
		}
		//학생명단 출력
		System.out.println("<학생명단>");
		System.out.println("[ID]\t[NAME]");
		Set keys=stuIn.keySet();
		//minLength, maxLength를 임의의 값으로 초기화
		Iterator<String> it1=keys.iterator();//iterator 선언
		String tempm=it1.next();
		minLength=stuIn.get(tempm).length();
		String tempM=it1.next();
		maxLength=stuIn.get(tempM).length();
		maxID=tempM;//임의의 값으로 초기화 된 value에 해당하는 아이디를 대입
		minID=tempm;
		//입력된 정보 출력 및 길이 비교
		Iterator<String> it=keys.iterator();//앞서 선언된 iterator이 사용되었기때문에 다시 iterator 선언
		while(it.hasNext()) {//key가 존재하는 만큼 반복문 실행
			key=it.next();//가장 앞에있는 키값을 받음
			String temp=stuIn.get(key);//임시로 키값에 해당하는 value를 저장
			System.out.println(key+"\t"+temp);//키와 value값을 출력
			//value값의 길이 비교
			if(temp.length()<minLength) {
				minLength=temp.length();
				minID=key;
			}
			else if(temp.length()>maxLength) {
				maxLength=temp.length();
				maxID=key;
			}
		}
		System.out.println("\n전체 학생수:"+stuIn.size());//전체 학생수 출력
		//가장 긴 이름과 가장 짧은 이름에 대한 정보 출력
		System.out.println("<가장 긴 이름을 가진 학생>");
		System.out.println("ID:"+maxID+" NAME:"+stuIn.get(maxID)+" 길이:"+maxLength);
		System.out.println("<가장 짧은 이름을 가진 학생>");
		System.out.println("ID:"+minID+" NAME:"+stuIn.get(minID)+" 길이:"+minLength);

	}

}
