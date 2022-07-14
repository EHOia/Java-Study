//1971067 사이버보안전공 김태영
class Film extends Production {//production 클래스의 자손
	private int boxOfficeGross;
	public int getBoxOfficeGross() {//인스턴스 변수의 내용을 반환
		return boxOfficeGross;
	}
	public void setBoxOfficeGross(int boxOfficeGross) {//받은 값을 인스턴스 변수에 넣어줌
		this.boxOfficeGross=boxOfficeGross;
	}
	public void display() {//출력, 오버라이딩 사용
		super.display();//조상 클래스에 있는 출력함수 먼저 시행하고
		System.out.println("boxOfficeGross:"+getBoxOfficeGross());//이후에 추가로 내용을 출력
	}
}
