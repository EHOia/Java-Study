import java.util.Scanner;
public class Week3_4_김태영 {

	public static void main(String[] args) {
		System.out.println("============\n전공: 사이버보안\n학번: 1971067\n성명: 김태영\n========");
		Scanner kbd=new Scanner(System.in);
		MenuOrder user=new MenuOrder();
		System.out.println("--- 음료가격 설정 ---");
		System.out.print("Coke가격:");
		user.setPrice("coke",kbd.nextInt());//setPrice에 coke의 가격임을 알려주고 coke가격을 입력받음
		System.out.print("Lemonade가격:");
		user.setPrice("lemonade", kbd.nextInt());//setPrice에 lemonade의 가격임을 알려주고 입력
		System.out.print("Coffee가격:");
		user.setPrice("coffee", kbd.nextInt());//setPrice에 coffee의 가격임을 알려주고 입력
		String toggle="Y";//while문이 처음에 시작되어야 하기떄문에 y로 초기값 설정
		while(toggle.equalsIgnoreCase("Y")) {//toggle의 값이 y가 아닌경우 while문 중단
			System.out.println("\n--- 돈을 넣으세요 ---");
			user.setMoney(kbd.nextInt());//money를 입력받아 MenuOrder 클래스의 inputMoney에 집어넣기
			System.out.println("--- 음료를 선택하세요 ---");
			user.showMenu();//앞서 입력한 가격을 포함한 메뉴를 보여줌
			user.showResult(kbd.nextInt());//선택한 음료 번호를 showResult에 보내줌
			kbd.nextLine();//nextInt다음에 nextLine을 사용하기 때문에 \n을 없애기위한 장치
			System.out.println("계속하시겠습니까? (y/n)");
			toggle=kbd.nextLine();//계속 진행할것인지 물어봄
		}
	}
}