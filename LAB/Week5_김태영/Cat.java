//1971067 사이버보안전공 김태영
public class Cat extends Pet{//펫클래스의 자손
	private String color;
	public void writeOutput() {//오버라이딩 사용
		super.writeOutput();
		System.out.println("Color: "+color);
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void move() {
		System.out.println(getName()+" creeps and jumps");
	}
}
