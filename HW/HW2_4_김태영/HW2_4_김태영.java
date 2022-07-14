import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HW2_4_���¿� {
	public static void main(String args[]) {
		MyFrame_4 t=new MyFrame_4();//����
		}
}
class MyFrame_4 extends JFrame implements ActionListener{
	JPanel drawingPanel=new JPanel();//ǥ�� ������ �г�
	JPanel mainPanel=new JPanel();//���ڸ� �Է��ϴ� �г�
	JTextField Kor=new JTextField(3);//����� �Է��ϴ� ĭ
	JTextField Eng=new JTextField(3);//����� �Է� ĭ
	JTextField Mat=new JTextField(3);//���м��� �Է� ĭ
	JButton button=new JButton("Show Graph");//��ư ����
	int kor=0;//�����
	int eng=0;//����
	int mat=0;//����
	
	public MyFrame_4() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x��ư ������ ���α׷� ����
		this.setSize(560,400);//ũ�⼳��
		this.setLocationRelativeTo(null);//ȭ���� ���߾ӿ� ��ġ�ϵ��� ��
		this.setTitle("Score Graph_1971067");//���� ����
		this.add(drawingPanel,"Center");//�� �г��� �����ӿ� ����
		this.add(mainPanel,"South");
		button.addActionListener(this);//��ư�� �̺�Ʈ �ڵ鸵 �߰�
		mainPanel.add(new JLabel("Kor"));//������� ���� �Է� �гο� �߰�
		mainPanel.add(Kor);
		mainPanel.add(new JLabel("Eng"));
		mainPanel.add(Eng);
		mainPanel.add(new JLabel("Math"));
		mainPanel.add(Mat);
		mainPanel.add(button);

		add(new Lines());//�׸� �׸��� inner Ŭ���� �߰�
		
		this.setVisible(true);//ȭ�鿡 ����
	}
	class Lines extends JComponent{
		public void paint(Graphics g) {
			Color red=new Color(255,0,0);
			g.clearRect(0,0,getWidth(),getHeight());//��� ����� �ǵ��� ����
			g.drawLine(100,70,100,280);//y�� �׸�
			int y=80;
			for(int i=0;i<11;i++) {//���μ��� �׸�
				g.drawLine(100,y,460,y);
				y+=20;
			}
			y=80;
			for(int i=10;i>0;i--) {//���μ��� �´� ���ڸ� ����
				g.drawString(Integer.toString(i*10),75,y);
				y+=20;
			}
			g.drawString("KOR",180,300);//x�� �Ʒ��� ����� ����
			g.drawString("ENG",280,300);
			g.drawString("MATH",380,300);
			if(kor<=100&&kor>=0&&eng<=100&&eng>=0&&mat<=100&&mat>=0) {//���ڰ� �������� �ִ��� Ȯ��
				g.setColor(red);//���������� ����
				g.fillRect(190,(280-kor*2),20,kor*2);//�Էµ� ������ �´� �׷����� �׸�
				g.fillRect(290,(280-eng*2),20,eng*2);
				g.fillRect(390,(280-mat*2),20,mat*2);
			}
			else {//���ڰ� ������ ��� ���
				g.setColor(new Color(0,0,0));
				g.drawString("Wrong Input",230,50);//�۾� ���
			}
			
		}
	}
	
	public void actionPerformed(ActionEvent e) {//��ư�� Ŭ���ϴ� �̺�Ʈ �߻� ��
		kor=Integer.parseInt(Kor.getText());//�� ������ ������ �Է¹��� ���ڸ� ����
		eng=Integer.parseInt(Eng.getText());
		mat=Integer.parseInt(Mat.getText());	
		repaint();//�׷��� �׸�

	}
}
