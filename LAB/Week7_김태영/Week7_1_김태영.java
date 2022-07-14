import java.util.Scanner;
public class Week7_1_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영");
		Scanner k=new Scanner(System.in);//Scanner객체 생성
		Pet[] pet=new Pet[10];//Pet 객체배열 생성, 최대크기 10
		boolean flag=true;//종을 선택할때 잘못된 입력을 구분하기 위함
		int choose;
		
		for(int i=0;i<10;i++) {//최대크기에 맞게 반복
		
		if (flag) {//프로그램을 실행하고 처음 입력하는 경우이거나 입력이 아무런 문제가 없는경우 
			System.out.println("원하는 작업은 무엇입니까?");
			System.out.println("1. New input\t2. Output\t3. Exit");
			choose=k.nextInt();//선택값을 받음
		}
		else choose=1;//종 선택에서 1~4이외의 숫자를 입력한경우 다시 종선택으로 돌아가기 위함
		AA:switch(choose) {
		case 1:
			System.out.println("종은 무엇입니까?");
			System.out.println("1. Dog\t2. Cat\t3. Snake\t4.Bird");
			switch(k.nextInt()) {
			case 1:
				pet[i]=new Dog();//dog 선택한 경우 Pet배열에 Dog클래스로 만든 인스턴스 저장
				break;
			case 2:
				pet[i]=new Cat();//위와 클래스 종류만 다르고 내용은 동일
				break;
			case 3:
				pet[i]=new Snake();//위와 클래스 종류만 다르고 내용은 동일
				break;
			case 4:
				pet[i]=new Bird();//위와 클래스 종류만 다르고 내용은 동일
				break;
			default:
				System.out.println("잘못된 입력");	
				i--;//잘못 입력한 경우 배열의 중간인덱스가 비어있지 않도록 i감소
				flag=false;//잘못 입력한경우 다시 종을 선택하는 메뉴로 돌아가도록 false를 넣음
				break AA;
			}
			k.nextLine();
			System.out.print("Name:");
			pet[i].name=k.nextLine();//이름 저장
			System.out.print("Age:");
			pet[i].age=k.nextInt();//나이 저장
			flag=true;//이전에 잘못된 입력을 한 뒤 다시 정상적으로 실행이 끝난 경우
			break;
		case 2:
			System.out.println("Species\tName\tAge\tMovement");
			for(int j=0;j<i;j++) {//for문에서 i가 늘어난 횟수=반복으로 입력한 횟수만큼 반복문을 돌려 출력
			System.out.print(pet[j].species+"\t"+pet[j].name+"\t"+pet[j].age+"\t");
			pet[j].move();
			}
			i--;//마찬가지로 입력을 하지 않았기 떄문에 배열의 빈공간이 생기지 않도록 i감소
			break;
		case 3:
			System.out.println("종료");
			System.exit(0);
		default:
			System.out.println("잘못된 입력");
			i--;//잘못 입력한 경우 배열의 중간인덱스가 비어있지 않도록 i감소
		}
		System.out.println();//개행
	}
	}

}
