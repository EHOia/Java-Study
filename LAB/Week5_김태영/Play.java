//1971067 ���̹��������� ���¿�
class Play extends Production {//production Ŭ������ �ڼ�
	private int performanceCost;
	public int getPerformanceCost() {//�ν��Ͻ� ������ performance cost�� ��ȯ
		return performanceCost;
	}
	public void setPerformanceCost(int performanceCost) {//���� ������ �ν��Ͻ������� ����
		this.performanceCost=performanceCost;
	}
	public void display() {//���, �������̵� ���
		super.display();//���� Ŭ������ ��� ������ ���� ����ϰ�
		System.out.println("performance cost:"+getPerformanceCost());//�߰��� ���
	}
}
