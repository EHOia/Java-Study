import javax.swing.*;
import java.awt.event.*;

public class Week12_1_���¿� {
	public static void main(String[] args) {
		MyFrame t=new MyFrame();//MyFrameŬ���� ����
	}
}

class MyFrame extends JFrame{
	private JButton button;//��ư ����
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);//frame ũ�� ����
		this.setResizable(false);//ũ�� ����
		this.setTitle("�� ��ƺ�~��!-���¿�");//title����
		JPanel panel = new JPanel();//panel ����

		button=new JButton("Click!");//��ư ���� �� ��ư�� ����� ���� ����
		addButton();//��ư�� ������ ��ġ�� ���
		button.addMouseListener(new MyListener());//��ư�� event listener ���
		panel.add(button);//panel�� ��ư ����
		add(panel);//frame�� panel�� ����
		setVisible(true);//ȭ�鿡 ���
	}
	
	public void addButton() {//������ ��ġ�� ��ư�� �������ִ� �ż���
		int x=(int)(Math.random()*160)+70;//������ ��ư�� ��ġ�� ����
		int y=(int)(Math.random()*200)+30;
		button.setLocation(x,y);//������ ��ġ�� ��ư�� ����
		System.out.println("x="+x+",\t"+"y="+y);//��ư�� ��ǥ�� �ܼ�â�� ���
	}
	
	private class MyListener extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {//��ư�ȿ� ���콺�� �� ���
			addButton();//���ο� ��ġ�� ��ư�� ����
		}
		public void mouseClicked(MouseEvent e) {//��ư�� Ŭ���� ���
			System.out.println("��,,,�����٤Ф�");//������ �ܼ�â�� ���
		}
	}
}
