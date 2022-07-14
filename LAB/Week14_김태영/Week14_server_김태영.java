import java.io.*;
import java.net.*;
import java.util.*;

public class Week14_server_김태영 {
	public static void main(String[] args) {
		System.out.println("사이버보안전공 1971067 김태영");

		ServerSocket serverSocket=null;//server socket 선언
		Socket socket=null;//socket 선언
		
		try {
			serverSocket=new ServerSocket(9000);//server socket에 포트번소 9000을 넣어 server socket 생성
			socket=serverSocket.accept();//client가 들어오면 socket을 만들고 server와 client의 소켓 연결
			
			Scanner in=new Scanner(socket.getInputStream());//client로부터 메시지를 받아옴
			PrintWriter out=new PrintWriter(socket.getOutputStream());//client에게 메시지를 전달
			
			System.out.println(in.nextLine());//server에 hello 출력
			out.println("How many numbers?");//client에 전달할 메시지 입력
			out.flush();//전송
			int serverN=in.nextInt();//client로부터 전달받은 숫자를 serverN에 입력
			System.out.println(serverN);
			out.println("Input "+serverN+" numbers");
			out.flush();
			int sum=0;
			for(int i=0;i<serverN;i++) {//client로부터 입력받은 개수만큼 반복문 실행
				sum+=in.nextInt();//client로부터 전달받은 숫자를 sum에 더함 
			}
			out.println("Sum: "+sum+"\nAvg: "+(double)sum/serverN);//계산한 결과 두줄을 client에게 전달
			out.flush();
		}
		catch(Exception e) {//예외처리
			System.out.println(e.getMessage());
		}
		finally {
			try {//사용후 socket close
				socket.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			try {//server socket close
				serverSocket.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Service finished.");
		}

	}

}
