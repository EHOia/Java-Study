//1971067 ���̹��������� ���¿�
public class Time {
	private int hour;
	private int minute;
	
	private boolean isValid(int hour, int minute) {
		boolean hflag=false, mflag=false, fflag=false;//�ð��� ���� �������� Ȯ���� �� ���������� �Ѵ� ���ΰ�츦 �з����ִ� ����
		if(hour>=0&&hour<=23) hflag=true;//�ð��� ����� �Էµ� ���
		if(minute>=0&&minute<=59) mflag=true;//���� ����� �Էµ� ���
		if(hflag&&mflag) fflag=true;//�ð��� ���� ��� ����� �ԷµȰ��
		return fflag;
	}
	public void setTime(int hour, int minute) {
		if (isValid(hour, minute)) {//isValid �޼��忡�� �ð��� ���� ��� �����ϴ� ��ȯ�� ���
			this.hour=hour;//�ð���
			this.minute=minute;//���� �Է�
		}
		else {//�ð� �Ǵ� ���� �߸� �Էµ� ���
			this.hour=0;//���� 0���� ����
			this.minute=0;
		}
	}
	public int getTime(char ch) {
		if(ch=='H'||ch=='h') return hour;//H �Ǵ� h�� �Ű������� ���� ��� �ð��� ��ȯ
		else return minute;//�� ���� ���ڸ� �Ű������� ���� ��� ���� ��ȯ
	}
}
