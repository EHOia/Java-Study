//1971067 ���̹��������� ���¿�
class Car {
	private String emgType;//��Ȳ�� ����
	private int number;//��ȭ��ȣ
	private String carType;//�⵿�ϴ� ������ ����
	private String reqPerson;//�ʿ��� ����� ����
	public void Car() {//���� �ʱ�ȭ
		emgType=null;
		number=0;
		carType=null;
		reqPerson=null;
	}
	public void Car(String emgType, int number, String carType, String reqPerson){//��Ȳ�� ����, ��ȣ, ���� ����, �ʿ��� ����� ��Ȳ�� �°� �Է�
		this.emgType=emgType;
		this.number=number;
		this.carType=carType;
		this.reqPerson=reqPerson;
	}
	public String getEmgType() {//��Ȳ�� ������ ��ȯ���ִ� �ż���
		return emgType;
	}
	public int getNumber() {//��ȣ�� ��ȯ���ִ� �żҵ�
		return number;
	}
	public String getCarType() {//���� ������ ��ȯ���ִ� �޼ҵ�
		return carType;
	}
	public String getReqPerson() {//�ʿ��� ����� ��ȯ���ִ� �޼ҵ�
		return reqPerson;
	}
	public String getStr() {//��Ȳ�� ���� ������ ��ȯ���ִ� �޼ҵ�
		return getEmgType()+"\t\t"+getNumber()+"\t\t"+getCarType()+"\t"+getReqPerson();
	}
}
class FireEngine extends Car{//��Ȳ�� Fire�ΰ��
	FireEngine(){
		super();//�ڼ� ��ü�� �����ҋ� �� ������ �⺻������ �ʱ�ȭ
	}
	public String toString() {
		return getStr();
	}
}
class Ambulance extends Car{//��Ȳ�� Patient�ΰ��
	Ambulance(){
		super();//�ڼ� ��ü�� �����ҋ� �� ������ �⺻������ �ʱ�ȭ
	}
	public String toString() {
		return getStr();
	}
}
class PoliceCar extends Car{//��Ȳ�� Thief�ΰ��
	PoliceCar(){
		super();//�ڼ� ��ü�� �����ҋ� �� ������ �⺻������ �ʱ�ȭ
	}
	public String toString() {
		return getStr();
	}
}