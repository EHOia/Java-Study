//1971067 사이버보안전공 김태영
public class Emergency {
	public Car embList[]=new Car[10];//크기가 10인 배열 생성
	int j=0;//사용자로부터 응급호출을 받은 횟수를 세는 변수
	public void EM_Call(Car c) {
		if(c instanceof FireEngine) {//Fire를 선택했을때
			c.Car("Fire",119,"FireEngine","FireFighter");//해당하는 내용들을 클래스에 넣기 위해 car의 생성자로 보냄
		}
		else if(c instanceof Ambulance) {//Patient를 선택했을때
			c.Car("Patient",119,"Ambulance","Doctor");//해당하는 내용들을 클래스에 넣기 위해 car의 생성자로 보냄
		}
		else {//Thief를 선택했을때
			c.Car("Thief",112,"PoliceCar","PoliceOfficer");//해당하는 내용들을 클래스에 넣기 위해 car의 생성자로 보냄
		}
		embList[j]=c;//배열에 클래스의 주소를 넣음
		j++;
		System.out.println("Call "+c.getNumber());//상황에 맞는 번호를 출력
	}
	public void EM_record() {//그동안 콜을 받은 내용을 출력
		System.out.println("Emergency\tNumber\t\tCar_Type\tRequired");
		for (int i=0;i<j;i++) {
			System.out.println(embList[i].getStr());
		}
	}
}
