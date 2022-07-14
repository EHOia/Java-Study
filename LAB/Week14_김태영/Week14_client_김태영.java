import java.io.*;
import java.net.*;
import java.util.*;

public class Week14_client_���¿� {

	public static void main(String[] args) {
		System.out.println("���̹��������� 1971067 ���¿�");
		
		Socket socket=null;//socket ����
		
		try {
			socket=new Socket("222.114.231.77",9000);//server�� �����ϱ� ���� ip, port��ȣ�� �־� socket ����
			
			Scanner in=new Scanner(socket.getInputStream());//�������� ������ �޾ƿ��� Scanner
			Scanner k=new Scanner(System.in);//����ڷκ��� �Է��� �޴� ��ĳ��
			PrintWriter out=new PrintWriter(socket.getOutputStream());//�������� ������ �����ϴ� ��ü
			
			out.println("Hello?");//server�� ������ �޽��� �Է�
			out.flush();//������ ����
			System.out.println(in.nextLine());//�������� ���� �޽����� ȭ�鿡 ���
			int clientN=k.nextInt();//����ڷκ��� ������ ���� �Է¹���
			out.println(clientN);//������ ����
			out.flush();
			System.out.println(in.nextLine());
			for(int i=0;i<clientN;i++) {//����ڰ� �Է��� ������ŭ �ݺ��� ����
				out.println(k.nextInt());//���ڸ� �Է¹޾� ������ ����
				out.flush();
			}
			System.out.println(in.nextLine());//������ ���� ���� �޽��� ���(Sum)
			System.out.println(in.nextLine());//(Average)
		}
		catch(Exception e) {//����ó��
			System.out.println(e.getMessage());
		}
		finally {
			try {//����� ���� close
				socket.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
