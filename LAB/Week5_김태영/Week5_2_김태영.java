import java.util.Scanner;
public class Week5_2_김태영 {

	public static void main(String[] args) {
		System.out.println("1971067\n사이버보안전공\n김태영");
		Dog[] d=new Dog[3];//크기 3 배열 생성
		Scanner k=new Scanner(System.in);
		for(int i=0;i<3;i++) {//입력을 3번 받을수 있도록 반복
			System.out.println("<<Dog "+(i+1)+">>");
			d[i]=new Dog();
			System.out.print("Name: ");
			d[i].setName(k.nextLine());//이름입력
			System.out.print("Age: ");
			d[i].setAge(k.nextInt());//나이입력
			System.out.print("Weight: ");
			d[i].setWeight(k.nextDouble());//무게입력
			System.out.print("BoosterShot(y/n): ");
			k.nextLine();
			d[i].setBoosterShot(k.nextLine().equalsIgnoreCase("y"));//접종여부 입력
			System.out.println();
		}
		Cat[] c=new Cat[3];//크기 3 배열 생성
		for(int i=0;i<3;i++) {//3번반복
			System.out.println("<<Cat "+(i+1)+">>");
			c[i]=new Cat();
			System.out.print("Name: ");//이름입력
			c[i].setName(k.nextLine());
			System.out.print("Age: ");//나이입력
			c[i].setAge(k.nextInt());
			System.out.print("Weight: ");//무게입력
			c[i].setWeight(k.nextDouble());
			System.out.print("Color: ");//색상입력
			k.nextLine();
			c[i].setColor(k.nextLine());
			System.out.println();
		}
		System.out.println("<<Dog List>>");//강아지 리스트 출력
		for(int i=0;i<3;i++) {//3번 반복
			d[i].writeOutput();
			d[i].move();
			System.out.println();
		}
		System.out.println("<<Cat List>>");//고양이 리스트 출력
		for (int i=0;i<3;i++) {//3번반복
			c[i].writeOutput();
			c[i].move();
			System.out.println();
		}
		System.out.println("* Dogs older than 2 years and no boostershot are...");
		for (int i=0;i<3;i++) {
			if(d[i].getAge()<=2||d[i].getBoosterShot());
			else System.out.print(d[i].getName());//해당하는 강아지 이름 출력
		}
		System.out.println();
		System.out.println("* Black cats weights more than 3Kg are...");
		for (int i=0;i<3;i++) {
			if(c[i].getColor().equalsIgnoreCase("black")&&c[i].getWeight()>=3) System.out.print(c[i].getName());//해당하는 고양이 이름 출력
		}

	}

}
