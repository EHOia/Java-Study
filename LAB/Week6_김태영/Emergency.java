//1971067 ���̹��������� ���¿�
public class Emergency {
	public Car embList[]=new Car[10];//ũ�Ⱑ 10�� �迭 ����
	int j=0;//����ڷκ��� ����ȣ���� ���� Ƚ���� ���� ����
	public void EM_Call(Car c) {
		if(c instanceof FireEngine) {//Fire�� ����������
			c.Car("Fire",119,"FireEngine","FireFighter");//�ش��ϴ� ������� Ŭ������ �ֱ� ���� car�� �����ڷ� ����
		}
		else if(c instanceof Ambulance) {//Patient�� ����������
			c.Car("Patient",119,"Ambulance","Doctor");//�ش��ϴ� ������� Ŭ������ �ֱ� ���� car�� �����ڷ� ����
		}
		else {//Thief�� ����������
			c.Car("Thief",112,"PoliceCar","PoliceOfficer");//�ش��ϴ� ������� Ŭ������ �ֱ� ���� car�� �����ڷ� ����
		}
		embList[j]=c;//�迭�� Ŭ������ �ּҸ� ����
		j++;
		System.out.println("Call "+c.getNumber());//��Ȳ�� �´� ��ȣ�� ���
	}
	public void EM_record() {//�׵��� ���� ���� ������ ���
		System.out.println("Emergency\tNumber\t\tCar_Type\tRequired");
		for (int i=0;i<j;i++) {
			System.out.println(embList[i].getStr());
		}
	}
}
