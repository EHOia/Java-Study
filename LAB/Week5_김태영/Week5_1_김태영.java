import java.util.Scanner;
public class Week5_1_���¿� {

	public static void main(String[] args) {
		System.out.println("1971067\n���̹���������\n���¿�");
		System.out.println("Input Title for Play");
		Play play=new Play();//�÷��� Ŭ���� �ҷ���
		Scanner k=new Scanner(System.in);
		play.setTitle(k.nextLine());//�Է¹��� ������ Ŭ������ Ÿ��Ʋ �׸� �־��ִ� �Լ��� ����
		System.out.println("Input Director for Play");
		play.setDirector(k.nextLine());//�Է¹��� ���͸� Ŭ������ ���� �׸� �־��ִ� �Լ��� ����
		System.out.println("Input Writer for Play");
		play.setWriter(k.nextLine());//�Է¹��� writer�� Ŭ������ writer�׸� �־��ִ� �Լ��� ����
		System.out.println("Input Title for Film");
		Film film=new Film();//�ʸ� Ŭ���� �ҷ���
		film.setTitle(k.nextLine());//�Է¹��� ������ Ŭ������ Ÿ��Ʋ �׸� �־��ִ� �Լ��� ����
		System.out.println("Input Director for Film");
		film.setDirector(k.nextLine());//�Է¹��� ���͸� Ŭ������ ���� �׸� �־��ִ� �Լ��� ����
		System.out.println("Input Writer for Film");
		film.setWriter(k.nextLine());//�Է¹��� writer�� Ŭ������ writer�׸� �־��ִ� �Լ��� ����
		System.out.println("Input Performance Cost for Play");
		play.setPerformanceCost(k.nextInt());//�Է¹��� ������ Ŭ������ �����׸� �־��ִ� �Լ��� ����
		System.out.println("Input boxOfficeGross for Film");
		film.setBoxOfficeGross(k.nextInt());//�Է¹��� ������ Ŭ������ �ش� �׸� �־��ִ� �Լ��� ����
		play.display();//�÷��� Ŭ������ ������ �ҷ���
		System.out.println();
		film.display();//�ʸ� Ŭ������ ������ �ҷ���
	}

}
