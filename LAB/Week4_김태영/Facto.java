//���̹��������� 1971067 ���¿�
public class Facto {
	static int result;
	static int factoVal(int x) {
		result=1;//Ŭ���������� ù��° ����ϰ� ���� ����� �����Ҷ� ���� ���� �����ֱ� ������ �ż��� ����ø��� 1�� �ʱ�ȭ
		for (int i=x;i>0;i--) {//���丮�� ���
			result=result*i;
		}
		return result;//���丮�� ��� ���� main���� return
	}
}
