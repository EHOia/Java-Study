import java.util.Scanner;
public class Week3_3_김태영 {
	public static void main(String[] args) {
		System.out.println("============\n전공: 사이버보안\n학번: 1971067\n성명: 김태영\n========");
		Scanner kbd=new Scanner(System.in);
		MyFile fOld=new MyFile();//MyFile class를 가지는 fOld 변수를 선언
		MyFile fNew=new MyFile();//MyFile class를 가지는 fNew 변수를 선언
		System.out.println("--File정보입력(제목, 페이지수)--");
		fOld.setTitle(kbd.nextLine());//fOld가 가리키는 MyFile class의 title에 내용을 넣기 위해 setTitle을 사용
		fOld.setPage(kbd.nextInt());//fOld가 가리키는 MyFile class의 page에 숫자를 넣기 위해 setPage를 사용
		fOld.fileCopy(fNew);//fOld내용을 fNew에 복사
		System.out.println("<원래 File>");
		fOld.fileInfo();//fOld의 내용을 출력
		System.out.println("<복사된 File>");
		fNew.fileInfo();//fNew의 내용을 출력
}}