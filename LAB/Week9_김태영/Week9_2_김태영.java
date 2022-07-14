import java.io.Serializable;
import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;
public class Week9_2_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�\n");
		Dog[] myDog=new Dog[10];//10���� Dog ��ü�迭 ����
		myDog[0]=new Dog("Merry",3,2.5,"Bulldog",false);//������ �迭�� �������� ������ �Է�
		myDog[1]=new Dog("JJong",5,5.5,"Mix",false);
		myDog[2]=new Dog("Kong",4,3,"Poodle",true);
		myDog[3]=new Dog("Apple",2,2.5,"Collie",true);
		myDog[4]=new Dog("Candy",5,5.5,"Coca",false);
		myDog[5]=new Dog("Cutie",7,2.5,"Chiwawa",true);
		myDog[6]=new Dog("Peace",3,2.5,"Huskey",false);
		myDog[7]=new Dog("Lion",9,1.5,"Shepard",true);
		myDog[8]=new Dog("Windy",2,9,"Jindo",true);
		myDog[9]=new Dog("Sweetie",1,2.5,"Maltiz",false);
		Scanner k=new Scanner(System.in);//Scanner ��ü ����
		System.out.println("Input File name to write Dog data");
		String fileName=k.nextLine();//����ڰ� �Է��� ������ ���ϸ����� ���
		try {
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(fileName));//����ڰ� �Է��� ���ϸ��� ���� ������ ������ �� �������ִ� ��Ʈ�� ����
			outputStream.writeObject(myDog);//��ü�迭�� �������� �ѹ��� ���Ͽ� �Է��� �� �ֵ��� ����
			outputStream.close();//���� �ݱ�, close�ϴ� ���� buffer�� �ִ� �����Ͱ� ���Ϸ� �̵�
		}
		catch(IOException e) {//���Ͽ� ������ �Է��� �� ���� ���
			System.out.println("Error writing to file "+fileName+".");
			System.exit(0);
		}
		Dog[] anotherDog=null;//��ü�迭 ����
		int[] satisDog=new int[10];//���ǿ� �����ϴ� �������� index��ȣ�� ������ ���� �迭 ����(�ִ� 10)
		int j=0;//���ǿ� �����ϴ� �������� ���� ���� ���� ���� ���� ����
		try {
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileName));//����ڰ� �Է��� ���ϸ��� ���� ������ �ҷ����� ��Ʈ�� ����
			anotherDog=(Dog[])inputStream.readObject();//downcasting�� ������ ��ü�迭�� ������ ����
			System.out.println("Name\tAge\tWeight\tBreed\t\tBoosterShot");
			for(int i=0;i<10;i++) {
				System.out.println(anotherDog[i]);//������ ���� ���
				if(anotherDog[i].getAge()>2&&!anotherDog[i].getBoosterShot()) {
					satisDog[j]=i;//���ǿ� �´� �������� �ε��� ��ȣ�� ���� �迭�� ����
					j++;
				}
			}
			inputStream.close();//���� �ݱ�
		}
		catch(EOFException e) {//���ϳ����� �������
			System.out.println("End of File Exception.");
		}
		catch(FileNotFoundException e) {//������ �������� �������
			System.out.println("File not found Exception.");
		}
		catch(IOException e) {//������ �о���µ��� ������ �߻��Ѱ��
			System.out.println("IO Exception.");
		}
		catch(Exception e) {//�� ���� ���ܰ� �߻��Ѱ��
			System.out.println("Exception.");
		}
		System.out.println("\nDogs older than 2 years and did not get the boosterShot");
		for(int i=0;i<j;i++) {//���ǿ� �´� �������� �̸��� ���� ���
			System.out.println(anotherDog[satisDog[i]].getName()+"\t\t"+anotherDog[satisDog[i]].getBreed());
		}
		System.out.println("\nProgram finished");
	}

}

class Pet implements Serializable{//Object�� �а� ���� ���ؼ� Serializable �������̽��� ����
	private String name;
	private int age;
	private double weight;
	Pet(String newName, int newAge, double newWieght){//������ ����
		setPet(newName,newAge,newWieght);
	}
	public void setPet(String newName, int newAge, double newWeight) {//�̸�, ����, ���Ը� �Է�
		setName(newName);
		setAge(newAge);
		setWeight(newWeight);
	}
	public void setName(String newName) {//�̸��Է�
		name=newName;
	}
	public void setAge(int newAge) {//�����Է�
		age=newAge;
	}
	public void setWeight(double newWeight) {//�����Է�
		weight=newWeight;
	}
	public String getName() {//�̸���ȯ
		return name;
	}
	public int getAge() {//���̹�ȯ
		return age;
	}
	public double getWeight() {//���Թ�ȯ
		return weight;
	}
}

class Dog extends Pet implements Serializable{//���� Ŭ������ ���� Object�� �а� ���� ���ؼ� Serializable �������̽��� ����
	private String breed;
	private boolean boosterShot;
	Dog(String newName, int newAge, double newWeight, String breed, boolean boosterShot){//������ ����
		super(newName,newAge,newWeight);//����Ŭ������ �����ڸ� �״�� ����
		setBreed(breed);
		setBoosterShot(boosterShot);
	}
	
	public void setBreed(String breed) {//���� �Է�
		this.breed=breed;
	}
	public void setBoosterShot(boolean boosterShot) {//�������� �Է�
		this.boosterShot=boosterShot;
	}
	public String getBreed() {//�� ��ȯ
		return breed;
	}
	public boolean getBoosterShot() {//�������� ��ȯ
		return boosterShot;
	}
	public String toString() {
		if(getBoosterShot()) {//�������ΰ� ���ΰ��
			return getName()+"\t"+getAge()+"\t"+getWeight()+"\t"+getBreed()+"\t\tO";
		}
		else return getName()+"\t"+getAge()+"\t"+getWeight()+"\t"+getBreed()+"\t\tX";//������ ���� �������
	}
}