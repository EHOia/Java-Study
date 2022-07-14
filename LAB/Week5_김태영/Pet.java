//1971067 사이버보안전공 김태영
public class Pet {
	private String name;
	private int age;
	private double weight;
	public void writeOutput() {
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Weight: "+getWeight());
	}
	public void setPet(String name, int age, double weight) {
		setName(name);
		setAge(age);
		setWeight(weight);
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public void move() {
		System.out.println(getName()+" moves");
	}
	
}
