//1971067 ���̹��������� ���¿�
public class Production {
	private String title;//����
	private String director;//����
	private String writer;//�ۼ���
	
	public String getTitle() {//�ν��Ͻ� ������ ������ ������ ��ȯ
		return title;
	}
	public String getDirector() {//�ν��Ͻ� ������ ������ ������ ��ȯ
		return director;
	}
	public String getWriter() {//�ν��Ͻ� ������ �ۼ����� ������ ��ȯ
		return writer;
	}
	public void setTitle(String title) {//���� ������ �ν��Ͻ� ������ �־���
		this.title=title;
	}
	public void setDirector(String director) {//���� ������ ������ �ν��Ͻ� ������ �־���
		this.director=director;
	}
	public void setWriter(String writer) {//���� �ۼ��ڸ� �ν��Ͻ� ������ �־���
		this.writer=writer;
	}
	public void display() {//���
		System.out.println("Title:"+getTitle()+"\nDirector:"+getDirector()+"\nWriter:"+getWriter());
	}
}
