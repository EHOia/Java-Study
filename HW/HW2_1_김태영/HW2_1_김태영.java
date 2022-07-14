import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class HW2_1_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공 1971067 김태영");
		Scanner k=new Scanner(System.in);//Scanner 객체 생성
		//내용을 읽어올 input file과의 stream 생성 과정
		System.out.println("Input the filename to read.");
		String inputFileName=k.next();//읽을 파일의 이름 입력
		Scanner inputStream=null;//input Stream 선언
		try {
			inputStream=new Scanner(new File(inputFileName));//입력받은 파일명과 연결되는 input stream 생성
		}
		catch(FileNotFoundException e) {//해당하는 이름의 파일이 없을 경우 에러 체크
			System.out.println("Error opening the file "+inputFileName);
			System.exit(0);
		}
		//파일의 내용을 받아 작성할 output file 생성과정
		System.out.println("Input the filename to write.");
		String outputFileName=k.next();//생성할 파일이름 입력받음
		PrintWriter outputStream=null;//output stream 선언
		try {
			outputStream=new PrintWriter(new FileOutputStream(outputFileName,true));//파일명과 연결되는 output stream 생성
		}
		catch(IOException e) {//파일을 생성할 수 없을경우 예외처리
			System.out.println("Exception occurs.");
			System.exit(1);
		}
		//input file의 내용을 읽어와 output file에 내용을 작성하는 과정
		while(inputStream.hasNextLine()) {//읽어오는 파일에 남은 줄이 있을 경우 실행
			String line=inputStream.nextLine();//해당하는 줄을 line으로 받음
			StringTokenizer token=new StringTokenizer(line," \n,");//line을 설정한 분리자 세가지를 기준으로 token으로 나눔
			while(token.hasMoreTokens()) {//분리자로 나눈 token이 남아있는 경우
				String word=token.nextToken();//token을 word로 받음
				if(word.length()>4) {//word의 길이가 4보다 큰 경우
				outputStream.println(word);//파일에 작성
				}
			}
		}
		System.out.println(outputFileName+" is generated.");
		inputStream.close();//input stream 닫기
		outputStream.close();//output stream 닫기
	}

}
