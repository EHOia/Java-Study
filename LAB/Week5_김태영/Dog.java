//1971067 ���̹��������� ���¿�
public class Dog extends Pet{//�� Ŭ������ �ڼ�
	private boolean boosterShot;
	public void writeOutput() {//�������̵� ���
		super.writeOutput();
		if (getBoosterShot()) 
		System.out.println("BoosterShot: O");
		else System.out.println("BoosterShot: X");
	}
	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot=boosterShot;
	}
	public boolean getBoosterShot() {
		return boosterShot;
	}
	public void move() {
		System.out.println(getName()+" walks and runs");
	}
}
