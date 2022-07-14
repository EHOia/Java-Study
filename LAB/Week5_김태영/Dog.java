//1971067 사이버보안전공 김태영
public class Dog extends Pet{//펫 클래스의 자손
	private boolean boosterShot;
	public void writeOutput() {//오버라이딩 사용
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
