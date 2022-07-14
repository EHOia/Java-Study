import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
import java.util.Scanner;

public class Week9_1_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹���������\n1971067\n���¿�\n");
		Scanner k=new Scanner(System.in);//Scanner��ü ����
		System.out.println("File name for input:");
		String fileNameIN=k.nextLine();//�ҷ��� ���� �̸�
		System.out.println("File name for output:");
		String fileNameOUT=k.nextLine();//���� ���� �����̸�
		
		try
		{
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileNameIN));//�ִ� ������ �ҷ����� ��Ʈ�� ����
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(fileNameOUT));//���ο� ������ ���� ��Ʈ�� ����
			System.out.println("The numbers in File, "+fileNameIN);
			try
			{
				while(true)
				{
					int anInteger=inputStream.readInt();//�ҷ��� ������ �������� �д� �ν��Ͻ� ����
					System.out.println(anInteger);//���
					outputStream.writeInt(anInteger*2);//������*2�� ���� ���ο� ���Ͽ� �Է�
				}
			}
			catch(EOFException e) {//������ ������ �������
				System.out.println("End of reading from File, "+fileNameIN);
				System.out.println(fileNameOUT+" is generated");
			}
			inputStream.close();//�ҷ��� ��Ʈ�� �ݱ�
			outputStream.close();//output ��Ʈ�� �ݱ�
		}
		catch(FileNotFoundException e) {//������ �ҷ��ö� �ش� �̸��� ������ ���°��
			System.out.println("Cannot find file "+fileNameIN);
		}
		catch(IOException e) {//������ �Է� �Ǵ� ��¿� ������ �ִ°��
			System.out.println("Problem with input from file "+fileNameIN);
			System.out.println("Or problem with output to file "+fileNameOUT);
		}
		catch(Exception e) {//�� ���� ���ܰ� �߻��� ���
			System.out.println("Exception");
		}
		try
		{
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileNameOUT));//���� �ۼ��� ������ �б� ���� ��Ʈ�� ����
			System.out.println("\nThe numbers in new File, "+fileNameOUT);
			try {
				while(true) {
					int anInteger=inputStream.readInt();
					System.out.println(anInteger);//�ҷ��� ������ ������ �о ���
				}
			}
			catch(EOFException e) {//������ ������ ��� �������
				System.out.println("End of reading from 2nd File, "+fileNameOUT);
			}
			inputStream.close();//��Ʈ�� ����
		}
		catch(FileNotFoundException e) {//�Է��� �̸��� ������ ���°��
			System.out.println("Cannot find file "+fileNameOUT);
		}
		catch(IOException e) {//������ ������ �о�� �� ���°��
			System.out.println("Problem with input from file "+fileNameOUT);
		}
		catch(Exception e) {//�� ���� ���ܰ� �߻��� ���
			System.out.println("Exception");
		}

	}

}
