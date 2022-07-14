
class StudentInformation {
	private String name;
	private String id;
	public void display() {
		System.out.print(getName()+"\t"+getId());
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
}


class StudentScore extends StudentInformation{
	private int korean;
	private int math;
	private int english;
	public void display() {//override
		super.display();
		System.out.print("\t"+getKor()+"\t"+getMat()+"\t"+getEng());
	}
	public void setKor(int korean) {
		this.korean=korean;
	}
	public void setMat(int math) {
		this.math=math;
	}
	public void setEng(int english) {
		this.english=english;
	}
	public int getKor() {
		return korean;
	}
	public int getMat() {
		return math;
	}
	public int getEng() {
		return english;
	}
}
