//1971067 ���̹��������� ���¿�
public class Cat extends Pet{//��Ŭ������ �ڼ�
	private String color;
	public void writeOutput() {//�������̵� ���
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
