//사이버보안전공 1971067 김태영
class Cat extends Pet{
	Cat(){
		super.species="Cat";//기본생성자로 부모클래스의 인스턴스 변수인 종을 저장
	}
	public void move() {
		System.out.println("jump");//Pet클래스의 move()를 오버라이딩
	}
}