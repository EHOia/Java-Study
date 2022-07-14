//1971067 사이버보안전공 김태영
class Play extends Production {//production 클래스의 자손
	private int performanceCost;
	public int getPerformanceCost() {//인스턴스 변수인 performance cost를 반환
		return performanceCost;
	}
	public void setPerformanceCost(int performanceCost) {//받은 내용을 인스턴스변수에 넣음
		this.performanceCost=performanceCost;
	}
	public void display() {//출력, 오버라이딩 사용
		super.display();//조상 클래스의 출력 내용을 먼저 출력하고
		System.out.println("performance cost:"+getPerformanceCost());//추가로 출력
	}
}
