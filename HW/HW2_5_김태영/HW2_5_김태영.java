import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HW2_5_���¿� {

	public static void main(String[] args) {
		MyFrame_5 t=new MyFrame_5();

	}

}

class MyFrame_5 extends JFrame implements ActionListener{
	JPanel panelc=new JPanel();//�׷����� ������ �г�
	JPanel panels=new JPanel();//���� �Է� �г�
	JTextField Kim=new JTextField(3);//�л� ���ڸ� �Է��ϴ� �ʵ� ����
	JTextField Lee=new JTextField(3);
	JTextField Park=new JTextField(3);
	JTextField Etc=new JTextField(3);
	JButton button=new JButton("Graph");//�׷��� �׸��� ��ư ����
	int kim=0;//�л� ���ڸ� ���� ����
	int lee=0;
	int park=0;
	int etc=0;
	String errorMessage=null;//�߸� �Է��� ��� ����� �����޽���
	
	public MyFrame_5(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);//ȭ�� ��� ��ġ
		this.setTitle("Pie Chart of Student names - ���¿�");
		this.add(panelc,"Center");//����� �׷��� �г� �߰�
		this.add(panels,"South");//�Ʒ��� ���� �Է� �г� �߰�
		button.addActionListener(this);//��ư�� �̺�Ʈ �ڵ鸵 �ż��� ����
		panels.add(new JLabel("Kim"));//��ư �Է� �гο� ������� ��ҵ� ����ֱ�
		panels.add(Kim);
		panels.add(new JLabel("Lee"));
		panels.add(Lee);
		panels.add(new JLabel("Park"));
		panels.add(Park);
		panels.add(new JLabel("Etc"));
		panels.add(Etc);
		panels.add(button);
		add(new Graph());//�׷��� �׸��� �̳�Ŭ���� ����ֱ�
		this.setVisible(true);
	}
	class Graph extends JComponent{
		public void paint(Graphics g) {
			Color[] colors=new Color[4];//�׷����� �׸��µ� �ʿ��� ������ �迭�� ����
			colors[0]=new Color(255,255,0);
			colors[1]=new Color(255,0,0);
			colors[2]=new Color(0,0,255);
			colors[3]=new Color(0,255,0);
			if(errorMessage!=null) {//�̺�Ʈ �ڵ鸵 �ż��忡�� �����޽����� �� ���
				g.drawString(errorMessage,200,300);//�����޽��� ���
			}
			else if(kim>0&&lee>0&&park>0) {//�����޽����� ���� ����� �ԷµȰ��
				int lastAng=0;//ȣ�� �׸��� �����ϴ� ����
				g.setColor(colors[0]);//�����
				g.fillArc(50,10,300,300,lastAng,(int)(kim*3.6));//�Է��� ���ڿ� �����ϴ� ũ���� ȣ ����
				lastAng+=(int)(kim*3.6);//���� ȣ�� �׸��� ������ ������ �־���
				g.drawString("YELLOW: KIMs",370,160);//���򺰷� ��Ʈ���� ��ο�
				g.setColor(colors[1]);//������
				g.fillArc(50,10,300,300,lastAng,(int)(lee*3.6));
				lastAng+=(int)(lee*3.6);
				g.drawString("RED: LEEs",370,180);
				g.setColor(colors[2]);//�Ķ���
				g.fillArc(50,10,300,300,lastAng,(int)(park*3.6));
				lastAng+=(int)(park*3.6);
				g.drawString("BLUE: PARKs",370,200);
				g.setColor(colors[3]);//�ʷϻ�
				g.fillArc(50,10,300,300,lastAng,360-lastAng);
				g.drawString("GREEN: ETC",370,220);
			}
			
		}
	}
	public void actionPerformed(ActionEvent e) {
		try {
			kim=Integer.parseInt(Kim.getText());//����ڰ� text field�� �Է��� ���ڸ� int�������� �ٲ� �޾ƿ�
			lee=Integer.parseInt(Lee.getText());
			park=Integer.parseInt(Park.getText());
			if(kim+lee+park>100) {//���� 100�� �Ѵ°��
				throw new Exception("Number of students is 100");//�� �޽����� ���� ���� ó��
			}
			else if(kim<0||lee<0||park<0) {//�����ΰ��
				throw new Exception("Input numbers of student names");
			}
			else {//����� �Է��� ���
				etc=100-(kim+lee+park);
				Etc.setText(Integer.toString(etc));//etc�� ����� �ؽ�Ʈ �ʵ忡 ���
				errorMessage=null;//���� �޽��� ���ٴ� ���� �˷���
			}
		}
		catch(Exception e1) {
			errorMessage=e1.getMessage();//����ó���� ���� ���� �޽����� ������ ����
			if(!errorMessage.equalsIgnoreCase("Number of students is 100")) {//������ ���� ���ڰ� �ƴѰ�쿡 ����ó���� �Ѿ���� �ٸ� ���� �޽����� ����
				errorMessage="Input numbers of student names";//�׶��� ���� �޽����� �̰����� ����
			}
			Kim.setText("0");//�ʵ��� ���ڸ� ��� 0���� �ٲ�
			Lee.setText("0");
			Park.setText("0");
			Etc.setText("0");
		}
		
		this.repaint();//�ٽ� �׸���
	}
}