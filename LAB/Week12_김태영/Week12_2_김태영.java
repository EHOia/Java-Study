import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Week12_2_���¿� {

	public static void main(String[] args) {
		drawFrame f=new drawFrame();
	}
}

class drawFrame extends JFrame implements ActionListener{
		private JRadioButton red;//������ ���� ������ư ����
		private JRadioButton green;
		private JRadioButton blue;
		private JButton button;//paint��ư ����
		Color c=new Color(255,0,0);//�ʱ� ����(����)�� ���� ��ü c ����
		Color light_gray=new Color(192,192,192);//���׷��� ���� ���� color ��ü ����
		Color black=new Color(0,0,0);//�������� ���� color ��ü ����
		public drawFrame() {
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame ����
			this.setSize(500,350);//ũ�� ����
			this.setLocationRelativeTo(null);//ȭ���� ���߾ӿ� ��ġ�ϵ��� ��
			this.setTitle("MyCar-���¿�");//Ÿ��Ʋ ����
			JPanel panel_button=new JPanel();//��ư���� �� �г� ����
			JPanel panel_draw=new JPanel();//�׸��� �� �г� ����
			
			add(panel_draw,"Center");//������ �г��� �����ӿ� ����
			add(panel_button,"South");
			
			red=new JRadioButton("RED");//������ ������ư�� ����
			blue=new JRadioButton("BLUE");
			green=new JRadioButton("GREEN");
			panel_button.add(red);//����� ���� ��ư�� ��ư �гο� ����
			panel_button.add(green);
			panel_button.add(blue);
			ButtonGroup bg=new ButtonGroup();//������ư�� �׷� ����
			bg.add(red);//�׷쿡 ������ ������ư�� ����
			bg.add(green);
			bg.add(blue);
			red.setSelected(true);//ó���� ���õǾ��ִ� ��ư�� red�� ����
			
			button=new JButton("Paint");//paint��ư ����
			button.addActionListener(this);//��ư�� event listener ���
			panel_button.add(button);//paint��ư�� ��ư �гο� ����
			
			setVisible(true);//ȭ�鿡 ���
		}
		
		public void paint(Graphics g) {
			g.setColor(c);//���õ� �������� ������ ĥ��(ó������ ����)
			g.fillRect(180, 65, 140, 60);//�簢�� �ΰ��� �ڵ��� ��� �����
			g.fillRect(110, 125, 280, 100);
			g.setColor(light_gray);//���׷��� ������ ������ ĥ��
			g.fillOval(145,190,70,70);//�ΰ��� ���� �����
			g.fillOval(285,190,70,70);
			g.setColor(black);//���������� ������ �׸�
			g.drawArc(290, 90, 30, 70, 20, 140);//���� ��� �����
		}
		
		public void actionPerformed(ActionEvent e) {
			if(red.isSelected()) {//������ư���� red�� ���õ� ���
				c=new Color(255,0,0);//c�� �������� ����
			}
			else if(green.isSelected()) {//green�� ���õ� ���
				c=new Color(0,255,0);//c�� �ʷϻ��� ����
			}
			else if(blue.isSelected()) {//blue�� ���õ� ���
				c=new Color(0,0,255);//c�� �Ķ����� ����
			}
			repaint();//�ڵ��� �κп� �ٽ� ĥ��
		}
}
