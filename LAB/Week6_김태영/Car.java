//1971067 사이버보안전공 김태영
class Car {
	private String emgType;//상황의 종류
	private int number;//전화번호
	private String carType;//출동하는 차량의 종류
	private String reqPerson;//필요한 사람의 직업
	public void Car() {//값을 초기화
		emgType=null;
		number=0;
		carType=null;
		reqPerson=null;
	}
	public void Car(String emgType, int number, String carType, String reqPerson){//상황의 종류, 번호, 차의 종류, 필요한 사람을 상황에 맞게 입력
		this.emgType=emgType;
		this.number=number;
		this.carType=carType;
		this.reqPerson=reqPerson;
	}
	public String getEmgType() {//상황의 종류를 반환해주는 매서드
		return emgType;
	}
	public int getNumber() {//번호를 반환해주는 매소드
		return number;
	}
	public String getCarType() {//차의 종류를 반환해주는 메소드
		return carType;
	}
	public String getReqPerson() {//필요한 사람을 반환해주는 메소드
		return reqPerson;
	}
	public String getStr() {//상황에 대한 정보를 반환해주는 메소드
		return getEmgType()+"\t\t"+getNumber()+"\t\t"+getCarType()+"\t"+getReqPerson();
	}
}
class FireEngine extends Car{//상황이 Fire인경우
	FireEngine(){
		super();//자손 객체를 생성할떄 각 변수를 기본값으로 초기화
	}
	public String toString() {
		return getStr();
	}
}
class Ambulance extends Car{//상황이 Patient인경우
	Ambulance(){
		super();//자손 객체를 생성할떄 각 변수를 기본값으로 초기화
	}
	public String toString() {
		return getStr();
	}
}
class PoliceCar extends Car{//상황이 Thief인경우
	PoliceCar(){
		super();//자손 객체를 생성할떄 각 변수를 기본값으로 초기화
	}
	public String toString() {
		return getStr();
	}
}