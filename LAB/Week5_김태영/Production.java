//1971067 사이버보안전공 김태영
public class Production {
	private String title;//제목
	private String director;//감독
	private String writer;//작성자
	
	public String getTitle() {//인스턴스 변수인 제목의 내용을 반환
		return title;
	}
	public String getDirector() {//인스턴스 변수인 감독의 내용을 반환
		return director;
	}
	public String getWriter() {//인스턴스 변수인 작성자의 내용을 반환
		return writer;
	}
	public void setTitle(String title) {//받은 제목을 인스턴스 변수에 넣어줌
		this.title=title;
	}
	public void setDirector(String director) {//받은 감독의 내용을 인스턴스 변수에 넣어줌
		this.director=director;
	}
	public void setWriter(String writer) {//받은 작성자를 인스턴스 변수에 넣어줌
		this.writer=writer;
	}
	public void display() {//출력
		System.out.println("Title:"+getTitle()+"\nDirector:"+getDirector()+"\nWriter:"+getWriter());
	}
}
