//���̹��������� 1971067 ���¿�
public class MyFile {
	private String title;//file�̸�
	private int page;//��������
	public void setTitle(String title) {//title�� private�� ����Ǿ��� ������ title�� ���� �ֱ� ���� �ż���
		this.title=title;//this.title�� fOld�� title�� ����
	}
	public String getTitle() {//title�� private�̱� ������ title ������ ����ϱ� ����
		return title;
	}
	public void setPage(int page) {//title�� ���������� page�� ���� �ֱ� ���� method
		this.page=page;//this.page�� fOld�� page��
	}
	public int getPage() {//page ������ ����ϱ� ����
		return page;
	}
	public void fileCopy(MyFile fNew) {//fNew�� MyFile class�� ����Ű�� ���ο� ����
		fNew.title=this.title;//fNew�� ���� this.title �� fOld�� ������ ����
		fNew.page=this.page;//fNew�� ���������� this.page �� fOld�� ������ ����
	}
	public void fileInfo() {//fOld�� fNew�� ����, ���������� ����ϱ� ���� ���
		System.out.println("��������:"+title);
		System.out.println("������:"+page);
	}
}