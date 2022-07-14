import java.util.*;
public class Week10_1_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영\n");
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");
		Scanner k=new Scanner(System.in);//Scanner 객체 생성
		List <Student> stud=new ArrayList<Student>();//Student class를 담는 ArrayList stud생성

		while(true) {
			String name=k.next();//이름 입력
			if(name.equalsIgnoreCase("0")) break;//만약 0을 임력하면 반복문 종료
			String id=k.next();//아이디 입력
			int age=k.nextInt();//나이 입력
			
			stud.add(new Student(name,id,age));//입력받은 학생의 정보를 Student클래스에 보내고 그 클래스를 stud에 추가
		}
		
		printResult(stud);//입력된 내용들을 출력
		
		for(int i=0;i<10;i++) {
			System.out.println("\nChoose the operation you want.");
			System.out.println("1.add information 2.delete information 3.show list 4.Finish program");
			int choose=k.nextInt();//사용자가 선택한 번호
			switch(choose) {
			default://잘못 입력한경우
				System.out.println("Wrong Input.");
				break;
			case 1://학생의 정보를 추가
				addStudent(stud);
				printResult(stud);
				break;
			case 2://학생의 정보를 삭제
				deleteStudent(stud);
			case 3://지금까지 입력된 정보를 출력
				printResult(stud);
				break;
			case 4://프로그램종료
				System.exit(0);
			}
		}
		

	}
	public static void printResult(List<Student> student){//정보를 출력해주는 매서드
		System.out.println("NUMBER\tNAME\tID\tAGE");
		for(int i=0;i<student.size();i++) {//ArrayList의 사이즈만큼 반복
			System.out.println(i+1+"\t"+student.get(i));
		}
	}
	public static void deleteStudent(List<Student> Stu) {//정보를 삭제해주는 매서드
		Scanner k=new Scanner(System.in);//Scanner객체 생성
		System.out.println("Input Student Number to delete");
		int remo=k.nextInt()-1;
		Stu.remove(remo);//사용자가 입력한 번호에 맞는 인덱스를 삭제
	}
	public static void addStudent(List<Student> Stu) {//정보를 추가해주는 매서드
		Scanner k=new Scanner(System.in);//Scanner객체 생성
		System.out.println("Input new Student Name, ID, and age, and the location");
		String name=k.next();
		String id=k.next();
		int age=k.nextInt();
		int next=k.nextInt()-1;//마지막에 정보가 들어갈 번호를 입력
		Stu.add(next,new Student(name,id,age));//입력된 번호에 맞는 인덱스에 정보를 추가
	}
}

class Student{//학생의 정보를 담는 클래스
	String name;
	String id;
	int age;
	Student(String name, String id, int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public String toString() {//입력되어있는 정보를 반환
		return name+"\t"+id+"\t"+age;
	}
}
