import javax.swing.*;
import java.awt.*;
//���̹��������� 1971067 ���¿�
public class Week11_1_���¿� {

	public static void main(String[] args) {
		MyFrame_1 f=new MyFrame_1();//MyFrame_1 ����
	}
}

class MyFrame_1 extends JFrame{
	public MyFrame_1() {
		JPanel panel_s = new JPanel();//panel ����
		
		setSize(300,200);//ũ�⼳��
		setTitle("Calculator_1971067");//���� ���� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���� �ڽ� ������ ���α׷��� ��������
		JTextField field = new JTextField();//text field ����
		field.setHorizontalAlignment(JTextField.RIGHT);//������ ����
		add(field,BorderLayout.NORTH);//text field�� ��(����)�� �ִ´�
		
		add(panel_s,BorderLayout.SOUTH);//panel_s�� �Ʒ�(����)�� �ִ´�
		panel_s.setLayout(new GridLayout(0,4));//panel_s�� ����� panel���� Grid layout�� �ø�
		panel_s.add(new JButton("ON"));
		panel_s.add(new JButton("AC"));
		panel_s.add(new JButton("C"));
		panel_s.add(new JButton("OFF"));
		panel_s.add(new JButton("7"));
		panel_s.add(new JButton("8"));
		panel_s.add(new JButton("9"));
		panel_s.add(new JButton("/"));
		panel_s.add(new JButton("4"));
		panel_s.add(new JButton("5"));
		panel_s.add(new JButton("6"));
		panel_s.add(new JButton("X"));
		panel_s.add(new JButton("1"));
		panel_s.add(new JButton("2"));
		panel_s.add(new JButton("3"));
		panel_s.add(new JButton("-"));
		panel_s.add(new JButton("0"));
		panel_s.add(new JButton("."));
		panel_s.add(new JButton("="));
		panel_s.add(new JButton("+"));
		setVisible(true);//������ ȭ�鿡 ���̵���
	}
}
