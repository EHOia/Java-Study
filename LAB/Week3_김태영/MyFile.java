//사이버보안전공 1971067 김태영
public class MyFile {
	private String title;//file이름
	private int page;//페이지수
	public void setTitle(String title) {//title이 private로 선언되었기 때문에 title에 값을 넣기 위한 매서드
		this.title=title;//this.title은 fOld의 title을 뜻함
	}
	public String getTitle() {//title이 private이기 때문에 title 내용을 출력하기 위함
		return title;
	}
	public void setPage(int page) {//title과 마찬가지로 page에 값을 넣기 위한 method
		this.page=page;//this.page는 fOld의 page임
	}
	public int getPage() {//page 내용을 출력하기 위함
		return page;
	}
	public void fileCopy(MyFile fNew) {//fNew는 MyFile class를 가리키는 새로운 변수
		fNew.title=this.title;//fNew의 제목에 this.title 즉 fOld의 제목을 넣음
		fNew.page=this.page;//fNew의 페이지수에 this.page 즉 fOld의 제목을 넣음
	}
	public void fileInfo() {//fOld와 fNew의 저목, 페이지수를 출력하기 위해 사용
		System.out.println("파일제목:"+title);
		System.out.println("페이지:"+page);
	}
}