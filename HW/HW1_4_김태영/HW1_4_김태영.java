import java.util.Scanner;
public class HW1_4_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영");
		Scanner k=new Scanner(System.in);
		System.out.println("How many students are there?");
		int num=k.nextInt();
		StudentScore ss[]=new StudentScore[num];
		System.out.println("Input the information.");
		for(int i=0;i<ss.length;i++) {
			ss[i]=new StudentScore();
			k.nextLine();
			System.out.print("\nID:");
			ss[i].setId(k.nextLine());
			System.out.print("Name:");
			ss[i].setName(k.nextLine());
			System.out.print("Korean:");
			ss[i].setKor(k.nextInt());
			System.out.print("Math:");
			ss[i].setMat(k.nextInt());
			System.out.print("English:");
			ss[i].setEng(k.nextInt());
		}
		System.out.println("\nNAME\t\tID\tKOREAN\tMATH\tENGLISH\tSUM\tAVG");
		int sumArr[]= {0,0,0};
		double avgArr[]= {0,0,0};
		for(int i=0;i<ss.length;i++) {
			ss[i].display();
			int sum=ss[i].getKor()+ss[i].getMat()+ss[i].getEng();
			double avg=(double)(sum)/3;
			System.out.printf("\t%d\t%.2f",sum,avg);
			System.out.println();
			sumArr[0]+=ss[i].getKor();
			sumArr[1]+=ss[i].getMat();
			sumArr[2]+=ss[i].getEng();
		}
		System.out.print("Subject Avg\t\t");
		for(int i=0;i<3;i++) {
			avgArr[i]=(double)(sumArr[i])/ss.length;
			System.out.printf("%.2f\t",avgArr[i]);
		}
		System.out.println();
		System.out.println("\n<Students over the average>\n");
		System.out.println("Korean:");
		for(int i=0;i<ss.length;i++) {
			if(avgArr[0]<=ss[i].getKor()) System.out.print(ss[i].getName()+"\t");
		}
		System.out.println("\nMath:");
		for(int i=0;i<ss.length;i++) {
			if(avgArr[0]<=ss[i].getMat()) System.out.print(ss[i].getName()+"\t");
		}
		System.out.println("\nEnglish:");
		for(int i=0;i<ss.length;i++) {
			if(avgArr[0]<=ss[i].getEng()) System.out.print(ss[i].getName()+"\t");
		}
	}

}
