//1971067 ���̹��������� ���¿�
class Film extends Production {//production Ŭ������ �ڼ�
	private int boxOfficeGross;
	public int getBoxOfficeGross() {//�ν��Ͻ� ������ ������ ��ȯ
		return boxOfficeGross;
	}
	public void setBoxOfficeGross(int boxOfficeGross) {//���� ���� �ν��Ͻ� ������ �־���
		this.boxOfficeGross=boxOfficeGross;
	}
	public void display() {//���, �������̵� ���
		super.display();//���� Ŭ������ �ִ� ����Լ� ���� �����ϰ�
		System.out.println("boxOfficeGross:"+getBoxOfficeGross());//���Ŀ� �߰��� ������ ���
	}
}
