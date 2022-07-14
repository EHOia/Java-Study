//���̹��������� 1971067 ���¿�
public class MenuOrder {
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	private int changeMoney;//�Ž������� ����� ��
	public void setPrice(String select, int price) {//coke, lemonade, coffee�� ���� ������ ���� �Է�
		if(select.equals("coke")) cokePrice=price;//main���� �Է¹��� ������ ���������� coke�ΰ��
		else if(select.contentEquals("lemonade")) lemonadePrice=price;//lemonade�ΰ��
		else coffeePrice=price;//�׿�(coffee)�ΰ��
	}
	public void showMenu(){//�Է¹��� ������ ����� �޴��� ������ ���
		System.out.println("1. Coke: "+cokePrice);
		System.out.println("2. Lemonade: "+lemonadePrice);
		System.out.println("3. Coffee: "+coffeePrice);
	}
	public void setMoney(int money) {//main���� ���� �Է� ������ �װ� class�� �ν��Ͻ� ������ �־��ִ� ����
		inputMoney=money;
	}
	public void setDrinkSelected(int select) {//user�� ������ ������ ������ ���� drinkSelected�� ���� �̸��� �ְ� �Ž������� �����
		switch (select) {
		case 1:
			drinkSelected="Coke";//1���� �����ϸ� �ݶ�
			changeMoney=inputMoney-cokePrice;//�տ� �ԷµǾ��ִ� ������ ������ �̿��� �Ž����� ����ؼ� changeMoney�� �����س���
			break;
		case 2:
			drinkSelected="Lemonade";//2���� �����ϸ� ������̵�
			changeMoney=inputMoney-lemonadePrice;
			break;
		case 3:
			drinkSelected="Coffee";//3���� �����ϸ� Ŀ�Ƕ�� drinkSelected�� �̸��� �Է�
			changeMoney=inputMoney-coffeePrice;
			break;
		}
	}
	public void showResult(int select) {
		if(select==1||select==2||select==3) {//user�� ������ ��ȣ�� 1-3�ΰ�쿡�� drinkSelected�� ���� �̸��� �ְ� �Ž����� ����� �ϵ���
			setDrinkSelected(select);//setDrinkSelected�� ���ļ� �ν��Ͻ� ������ drinkSelected�� ������� �ְ�, changeMoney�� �Ž����� ���� �־��
			System.out.println(drinkSelected+"�� �����ϼ̽��ϴ�.");//������ ����� ���
			if (changeMoney>=0) System.out.println("�ܵ��� "+changeMoney+"�� �Դϴ�.");//�ܵ��� 0�̻��̸� �ܵ��� ������ �˷���
			else System.out.println((-changeMoney)+"�� �� �־��ּ���.");//changeMoney�� ���� �����̸� ���� �����Ѱ��̹Ƿ� ������ ��ŭ�� ���� �� �־�޶� ���
		}
		else System.out.println("���� �޴��� �����ϼ̽��ϴ�.");//user�� ������ ��ȣ�� ���� ��� ���
	}
}