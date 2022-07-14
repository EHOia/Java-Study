import java.io.*;
import java.net.*;
import java.util.*;

public class Week14_server_���¿� {
	public static void main(String[] args) {
		System.out.println("���̹��������� 1971067 ���¿�");

		ServerSocket serverSocket=null;//server socket ����
		Socket socket=null;//socket ����
		
		try {
			serverSocket=new ServerSocket(9000);//server socket�� ��Ʈ���� 9000�� �־� server socket ����
			socket=serverSocket.accept();//client�� ������ socket�� ����� server�� client�� ���� ����
			
			Scanner in=new Scanner(socket.getInputStream());//client�κ��� �޽����� �޾ƿ�
			PrintWriter out=new PrintWriter(socket.getOutputStream());//client���� �޽����� ����
			
			System.out.println(in.nextLine());//server�� hello ���
			out.println("How many numbers?");//client�� ������ �޽��� �Է�
			out.flush();//����
			int serverN=in.nextInt();//client�κ��� ���޹��� ���ڸ� serverN�� �Է�
			System.out.println(serverN);
			out.println("Input "+serverN+" numbers");
			out.flush();
			int sum=0;
			for(int i=0;i<serverN;i++) {//client�κ��� �Է¹��� ������ŭ �ݺ��� ����
				sum+=in.nextInt();//client�κ��� ���޹��� ���ڸ� sum�� ���� 
			}
			out.println("Sum: "+sum+"\nAvg: "+(double)sum/serverN);//����� ��� ������ client���� ����
			out.flush();
		}
		catch(Exception e) {//����ó��
			System.out.println(e.getMessage());
		}
		finally {
			try {//����� socket close
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
