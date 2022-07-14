//1971067 ���̹��������� ���¿�
public class Buyer {
	int money,i;//money: ����ڰ� ���� ���� �Է¹��� ����
	int bonusPoint=0;//����Ʈ�� �Է¹��� ����
	Product item[]=new Product[10];//������ ������ �Է¹��� �迭
	
	void buy(Product pd) {
		if(pd.price>money) {//�����Ϸ��� ��ǰ�� ������ �������ִ� ���� �׼����� Ŭ��
			System.out.println("Money is not enough.\n");//���� �����ϴ� ����ϰ� ����
			summary();//������ ������ ������ ���� ��, ����Ʈ�� ���
			System.exit(0);
		}
		System.out.println("You bought "+pd+"("+pd.price+")");//������ ���ǰ� ������ ���
		money=money-pd.price;
		bonusPoint=bonusPoint+pd.bonusPoint;
		item[i++]=pd;//�迭�� ������ ���ǿ� ���� ������ ����
	}
	void summary() {
		System.out.println();
		System.out.print("Shopping list: ");
		for(int j=0;j<i;j++)
			System.out.print(item[j]+" ");//������ ���� ���
		System.out.println("\nMoney left: "+money);//���� �ݾ��� ���
		System.out.println("Current bonus point: "+bonusPoint);//���� ����Ʈ�� ���
	}
}
