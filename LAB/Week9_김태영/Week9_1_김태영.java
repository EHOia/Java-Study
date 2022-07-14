import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
import java.util.Scanner;

public class Week9_1_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공\n1971067\n김태영\n");
		Scanner k=new Scanner(System.in);//Scanner객체 생성
		System.out.println("File name for input:");
		String fileNameIN=k.nextLine();//불러올 파일 이름
		System.out.println("File name for output:");
		String fileNameOUT=k.nextLine();//새로 만들 파일이름
		
		try
		{
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileNameIN));//있는 파일을 불러오는 스트림 생성
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(fileNameOUT));//새로운 파일을 만들 스트림 생성
			System.out.println("The numbers in File, "+fileNameIN);
			try
			{
				while(true)
				{
					int anInteger=inputStream.readInt();//불러온 파일의 정수값을 읽는 인스턴스 변수
					System.out.println(anInteger);//출력
					outputStream.writeInt(anInteger*2);//정수값*2의 값을 새로운 파일에 입력
				}
			}
			catch(EOFException e) {//파일의 내용이 끝난경우
				System.out.println("End of reading from File, "+fileNameIN);
				System.out.println(fileNameOUT+" is generated");
			}
			inputStream.close();//불러올 스트림 닫기
			outputStream.close();//output 스트림 닫기
		}
		catch(FileNotFoundException e) {//파일을 불러올때 해당 이름의 파일이 없는경우
			System.out.println("Cannot find file "+fileNameIN);
		}
		catch(IOException e) {//파일의 입력 또는 출력에 문제가 있는경우
			System.out.println("Problem with input from file "+fileNameIN);
			System.out.println("Or problem with output to file "+fileNameOUT);
		}
		catch(Exception e) {//그 외의 예외가 발생한 경우
			System.out.println("Exception");
		}
		try
		{
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileNameOUT));//새로 작성한 파일을 읽기 위해 스트림 생성
			System.out.println("\nThe numbers in new File, "+fileNameOUT);
			try {
				while(true) {
					int anInteger=inputStream.readInt();
					System.out.println(anInteger);//불러온 파일의 정수를 읽어서 출력
				}
			}
			catch(EOFException e) {//파일의 내용이 모두 끝난경우
				System.out.println("End of reading from 2nd File, "+fileNameOUT);
			}
			inputStream.close();//스트림 종료
		}
		catch(FileNotFoundException e) {//입력한 이름의 파일이 없는경우
			System.out.println("Cannot find file "+fileNameOUT);
		}
		catch(IOException e) {//파일의 내용을 읽어올 수 없는경우
			System.out.println("Problem with input from file "+fileNameOUT);
		}
		catch(Exception e) {//그 외의 예외가 발생한 경우
			System.out.println("Exception");
		}

	}

}
