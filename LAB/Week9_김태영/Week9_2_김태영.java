import java.io.Serializable;
import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;
public class Week9_2_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영\n");
		Dog[] myDog=new Dog[10];//10개의 Dog 객체배열 생성
		myDog[0]=new Dog("Merry",3,2.5,"Bulldog",false);//각자의 배열에 강아지의 정보를 입력
		myDog[1]=new Dog("JJong",5,5.5,"Mix",false);
		myDog[2]=new Dog("Kong",4,3,"Poodle",true);
		myDog[3]=new Dog("Apple",2,2.5,"Collie",true);
		myDog[4]=new Dog("Candy",5,5.5,"Coca",false);
		myDog[5]=new Dog("Cutie",7,2.5,"Chiwawa",true);
		myDog[6]=new Dog("Peace",3,2.5,"Huskey",false);
		myDog[7]=new Dog("Lion",9,1.5,"Shepard",true);
		myDog[8]=new Dog("Windy",2,9,"Jindo",true);
		myDog[9]=new Dog("Sweetie",1,2.5,"Maltiz",false);
		Scanner k=new Scanner(System.in);//Scanner 객체 생성
		System.out.println("Input File name to write Dog data");
		String fileName=k.nextLine();//사용자가 입력한 문장을 파일명으로 사용
		try {
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(fileName));//사용자가 입력한 파일명을 가진 파일을 생성한 뒤 연결해주는 스트림 생성
			outputStream.writeObject(myDog);//객체배열의 변수들을 한번에 파일에 입력할 수 있도록 해줌
			outputStream.close();//파일 닫기, close하는 순간 buffer에 있던 데이터가 파일로 이동
		}
		catch(IOException e) {//파일에 내용을 입력할 수 없는 경우
			System.out.println("Error writing to file "+fileName+".");
			System.exit(0);
		}
		Dog[] anotherDog=null;//객체배열 선언
		int[] satisDog=new int[10];//조건에 만족하는 강아지의 index번호를 저장할 정수 배열 생성(최대 10)
		int j=0;//조건에 만족하는 강아지의 수를 세기 위한 정수 변수 선언
		try {
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileName));//사용자가 입력한 파일명을 가진 파일을 불러오는 스트림 생성
			anotherDog=(Dog[])inputStream.readObject();//downcasting한 정보를 객체배열이 갖도록 해줌
			System.out.println("Name\tAge\tWeight\tBreed\t\tBoosterShot");
			for(int i=0;i<10;i++) {
				System.out.println(anotherDog[i]);//강아지 정보 출력
				if(anotherDog[i].getAge()>2&&!anotherDog[i].getBoosterShot()) {
					satisDog[j]=i;//조건에 맞는 강아지의 인덱스 번호를 정수 배열에 대입
					j++;
				}
			}
			inputStream.close();//파일 닫기
		}
		catch(EOFException e) {//파일내용이 끝난경우
			System.out.println("End of File Exception.");
		}
		catch(FileNotFoundException e) {//파일이 존재하지 않을경우
			System.out.println("File not found Exception.");
		}
		catch(IOException e) {//파일을 읽어오는데에 문제가 발생한경우
			System.out.println("IO Exception.");
		}
		catch(Exception e) {//그 외의 예외가 발생한경우
			System.out.println("Exception.");
		}
		System.out.println("\nDogs older than 2 years and did not get the boosterShot");
		for(int i=0;i<j;i++) {//조건에 맞는 강아지의 이름과 종을 출력
			System.out.println(anotherDog[satisDog[i]].getName()+"\t\t"+anotherDog[satisDog[i]].getBreed());
		}
		System.out.println("\nProgram finished");
	}

}

class Pet implements Serializable{//Object를 읽고 쓰기 위해서 Serializable 인터페이스를 구현
	private String name;
	private int age;
	private double weight;
	Pet(String newName, int newAge, double newWieght){//생성자 정의
		setPet(newName,newAge,newWieght);
	}
	public void setPet(String newName, int newAge, double newWeight) {//이름, 나이, 무게를 입력
		setName(newName);
		setAge(newAge);
		setWeight(newWeight);
	}
	public void setName(String newName) {//이름입력
		name=newName;
	}
	public void setAge(int newAge) {//나이입력
		age=newAge;
	}
	public void setWeight(double newWeight) {//무게입력
		weight=newWeight;
	}
	public String getName() {//이름반환
		return name;
	}
	public int getAge() {//나이반환
		return age;
	}
	public double getWeight() {//무게반환
		return weight;
	}
}

class Dog extends Pet implements Serializable{//조상 클래스에 따라 Object를 읽고 쓰기 위해서 Serializable 인터페이스를 구현
	private String breed;
	private boolean boosterShot;
	Dog(String newName, int newAge, double newWeight, String breed, boolean boosterShot){//생성자 정의
		super(newName,newAge,newWeight);//조상클래스의 생성자를 그대로 실행
		setBreed(breed);
		setBoosterShot(boosterShot);
	}
	
	public void setBreed(String breed) {//종을 입력
		this.breed=breed;
	}
	public void setBoosterShot(boolean boosterShot) {//접종여부 입력
		this.boosterShot=boosterShot;
	}
	public String getBreed() {//종 반환
		return breed;
	}
	public boolean getBoosterShot() {//접종여부 반환
		return boosterShot;
	}
	public String toString() {
		if(getBoosterShot()) {//접종여부가 참인경우
			return getName()+"\t"+getAge()+"\t"+getWeight()+"\t"+getBreed()+"\t\tO";
		}
		else return getName()+"\t"+getAge()+"\t"+getWeight()+"\t"+getBreed()+"\t\tX";//접종을 하지 않은경우
	}
}