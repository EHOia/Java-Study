import java.util.Scanner;
public class Week3_3_���¿� {
	public static void main(String[] args) {
		System.out.println("============\n����: ���̹�����\n�й�: 1971067\n����: ���¿�\n========");
		Scanner kbd=new Scanner(System.in);
		MyFile fOld=new MyFile();//MyFile class�� ������ fOld ������ ����
		MyFile fNew=new MyFile();//MyFile class�� ������ fNew ������ ����
		System.out.println("--File�����Է�(����, ��������)--");
		fOld.setTitle(kbd.nextLine());//fOld�� ����Ű�� MyFile class�� title�� ������ �ֱ� ���� setTitle�� ���
		fOld.setPage(kbd.nextInt());//fOld�� ����Ű�� MyFile class�� page�� ���ڸ� �ֱ� ���� setPage�� ���
		fOld.fileCopy(fNew);//fOld������ fNew�� ����
		System.out.println("<���� File>");
		fOld.fileInfo();//fOld�� ������ ���
		System.out.println("<����� File>");
		fNew.fileInfo();//fNew�� ������ ���
}}