//사이버보안전공 1971067 김태영
public class MenuOrder {
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	private int changeMoney;//거스름돈을 계산한 값
	public void setPrice(String select, int price) {//coke, lemonade, coffee의 값을 종류에 따라 입력
		if(select.equals("coke")) cokePrice=price;//main에서 입력받은 가격의 음료종류가 coke인경우
		else if(select.contentEquals("lemonade")) lemonadePrice=price;//lemonade인경우
		else coffeePrice=price;//그외(coffee)인경우
	}
	public void showMenu(){//입력받은 가격을 사용해 메뉴와 가격을 출력
		System.out.println("1. Coke: "+cokePrice);
		System.out.println("2. Lemonade: "+lemonadePrice);
		System.out.println("3. Coffee: "+coffeePrice);
	}
	public void setMoney(int money) {//main에서 돈을 입력 받으면 그걸 class의 인스턴스 변수에 넣어주는 역할
		inputMoney=money;
	}
	public void setDrinkSelected(int select) {//user가 선택한 음료의 종류에 따라 drinkSelected에 음료 이름을 넣고 거스름돈을 계산함
		switch (select) {
		case 1:
			drinkSelected="Coke";//1번을 선택하면 콜라
			changeMoney=inputMoney-cokePrice;//앞에 입력되어있던 음료의 가격을 이용해 거스름돈 계산해서 changeMoney에 저장해놓음
			break;
		case 2:
			drinkSelected="Lemonade";//2번을 선택하면 레모네이드
			changeMoney=inputMoney-lemonadePrice;
			break;
		case 3:
			drinkSelected="Coffee";//3번을 선택하면 커피라고 drinkSelected에 이름을 입력
			changeMoney=inputMoney-coffeePrice;
			break;
		}
	}
	public void showResult(int select) {
		if(select==1||select==2||select==3) {//user가 선택한 번호가 1-3인경우에만 drinkSelected에 음료 이름을 넣고 거스름돈 계산을 하도록
			setDrinkSelected(select);//setDrinkSelected를 거쳐서 인스턴스 변수인 drinkSelected에 음료명을 넣고, changeMoney에 거스름돈 값을 넣어옴
			System.out.println(drinkSelected+"를 선택하셨습니다.");//선택한 음료명 출력
			if (changeMoney>=0) System.out.println("잔돈은 "+changeMoney+"원 입니다.");//잔돈이 0이상이면 잔돈은 얼마인지 알려줌
			else System.out.println((-changeMoney)+"원 더 넣어주세요.");//changeMoney의 값이 음수이면 돈이 부족한것이므로 부족한 만큼의 값을 더 넣어달라 출력
		}
		else System.out.println("없는 메뉴를 선택하셨습니다.");//user가 선택한 번호가 없을 경우 출력
	}
}