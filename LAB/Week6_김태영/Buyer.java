//1971067 사이버보안전공 김태영
public class Buyer {
	int money,i;//money: 사용자가 가진 돈을 입력받은 변수
	int bonusPoint=0;//포인트를 입력받을 변수
	Product item[]=new Product[10];//물건의 정보를 입력받을 배열
	
	void buy(Product pd) {
		if(pd.price>money) {//구매하려는 제품의 가격이 가지고있는 돈의 액수보다 클때
			System.out.println("Money is not enough.\n");//돈이 부족하다 출력하고 끝냄
			summary();//구매한 물건의 종류와 남은 돈, 포인트를 출력
			System.exit(0);
		}
		System.out.println("You bought "+pd+"("+pd.price+")");//구매한 물건과 가격을 출력
		money=money-pd.price;
		bonusPoint=bonusPoint+pd.bonusPoint;
		item[i++]=pd;//배열에 구매한 물건에 대한 정보를 저장
	}
	void summary() {
		System.out.println();
		System.out.print("Shopping list: ");
		for(int j=0;j<i;j++)
			System.out.print(item[j]+" ");//물건의 종류 출력
		System.out.println("\nMoney left: "+money);//남은 금액을 출력
		System.out.println("Current bonus point: "+bonusPoint);//얻은 포인트를 출력
	}
}
