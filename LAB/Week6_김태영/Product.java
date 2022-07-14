//1971067 사이버보안전공 김태영
class Product {
	int price;//제품의 가격을 입력받을 변수
	int bonusPoint;//포인트 값을 입력받을 변수
	Product(int price){//제품을 선택했을 때 제품의 가격을 받아 인스턴스 변수에 가격과 보너스포인트를 넣어줌
		this.price=price;
		bonusPoint=(int)(price/10.0);//보너스포인트는 가격의 10%이다
	}
}
class Tv extends Product {//제품으로 tv를 선택한경우
	Tv(){
		super(100);//가격 100을 전달
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product {//제품으로 컴퓨터를 선택한경우
	Computer(){
		super(200);//가격 200을 전달
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product{//제품으로 오디오를 선택한경우
	Audio(){
		super(50);//가격 50을 전달
	}
	public String toString() {
		return "Audio";
	}
}
class Video extends Product{//제품으로 비디오를 선택한경우
	Video(){
		super(110);//가격 110을 전달
	}
	public String toString() {
		return "Video";
	}
}
class NoteBook extends Product{//제품으로 노트북을 선택한경우
	NoteBook(){
		super(300);//가격 300을 전달
	}
	public String toString() {
		return "NoteBook";
	}
}