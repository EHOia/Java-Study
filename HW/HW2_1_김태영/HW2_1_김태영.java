import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class HW2_1_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹��������� 1971067 ���¿�");
		Scanner k=new Scanner(System.in);//Scanner ��ü ����
		//������ �о�� input file���� stream ���� ����
		System.out.println("Input the filename to read.");
		String inputFileName=k.next();//���� ������ �̸� �Է�
		Scanner inputStream=null;//input Stream ����
		try {
			inputStream=new Scanner(new File(inputFileName));//�Է¹��� ���ϸ�� ����Ǵ� input stream ����
		}
		catch(FileNotFoundException e) {//�ش��ϴ� �̸��� ������ ���� ��� ���� üũ
			System.out.println("Error opening the file "+inputFileName);
			System.exit(0);
		}
		//������ ������ �޾� �ۼ��� output file ��������
		System.out.println("Input the filename to write.");
		String outputFileName=k.next();//������ �����̸� �Է¹���
		PrintWriter outputStream=null;//output stream ����
		try {
			outputStream=new PrintWriter(new FileOutputStream(outputFileName,true));//���ϸ�� ����Ǵ� output stream ����
		}
		catch(IOException e) {//������ ������ �� ������� ����ó��
			System.out.println("Exception occurs.");
			System.exit(1);
		}
		//input file�� ������ �о�� output file�� ������ �ۼ��ϴ� ����
		while(inputStream.hasNextLine()) {//�о���� ���Ͽ� ���� ���� ���� ��� ����
			String line=inputStream.nextLine();//�ش��ϴ� ���� line���� ����
			StringTokenizer token=new StringTokenizer(line," \n,");//line�� ������ �и��� �������� �������� token���� ����
			while(token.hasMoreTokens()) {//�и��ڷ� ���� token�� �����ִ� ���
				String word=token.nextToken();//token�� word�� ����
				if(word.length()>4) {//word�� ���̰� 4���� ū ���
				outputStream.println(word);//���Ͽ� �ۼ�
				}
			}
		}
		System.out.println(outputFileName+" is generated.");
		inputStream.close();//input stream �ݱ�
		outputStream.close();//output stream �ݱ�
	}

}
