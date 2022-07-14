import java.io.*;
import java.net.*;
import java.util.*;

public class Week14_client_김태영 {

	public static void main(String[] args) {
		System.out.println("사이버보안전공 1971067 김태영");
		
		Socket socket=null;//socket 선언
		
		try {
			socket=new Socket("222.114.231.77",9000);//server에 접속하기 위한 ip, port번호를 넣어 socket 생성
			
			Scanner in=new Scanner(socket.getInputStream());//서버에게 내용을 받아오는 Scanner
			Scanner k=new Scanner(System.in);//사용자로부터 입력을 받는 스캐너
			PrintWriter out=new PrintWriter(socket.getOutputStream());//서버에게 내용을 전달하는 객체
			
			out.println("Hello?");//server에 전달할 메시지 입력
			out.flush();//서버로 전송
			System.out.println(in.nextLine());//서버에서 받은 메시지를 화면에 출력
			int clientN=k.nextInt();//사용자로부터 숫자의 개수 입력받음
			out.println(clientN);//서버에 전달
			out.flush();
			System.out.println(in.nextLine());
			for(int i=0;i<clientN;i++) {//사용자가 입력한 개수만큼 반복문 진행
				out.println(k.nextInt());//숫자를 입력받아 서버에 전달
				out.flush();
			}
			System.out.println(in.nextLine());//서버로 부터 받은 메시지 출력(Sum)
			System.out.println(in.nextLine());//(Average)
		}
		catch(Exception e) {//예외처리
			System.out.println(e.getMessage());
		}
		finally {
			try {//사용후 소켓 close
				socket.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
