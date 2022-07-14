import javax.swing.*;
import java.awt.*;
//���̹��������� 1971067 ���¿�
public class Week11_2_���¿� {

	public static void main(String[] args) {
		MyFrame_2 f=new MyFrame_2();//MyFrame_2 ����

	}

}
class MyFrame_2 extends JFrame{//JFrame ���
	public MyFrame_2() {
		JPanel panel_c=new JPanel(new GridLayout(0,2));//�г� c�� grid layout���� ����
		JPanel panel_s=new JPanel();//panel s�� �⺻ layout(Flow layout)���� ����
		
		setSize(350,200);//������ ����
		setTitle("Student Information_1971067");//���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�����ڽ� ������ ���α׷��� ��������
		
		JLabel label=new JLabel("STUDENT INFORMATION");//label�� ������ �۾��� ���
		label.setHorizontalAlignment(JLabel.CENTER);//�������
		add(label,BorderLayout.NORTH);//���� label�� �� �� ������ ��ġ
		add(panel_c,BorderLayout.CENTER);//panel c�� ��� ������ ��ġ
		add(panel_s,BorderLayout.SOUTH);//panel s�� �� �Ʒ� ������ ��ġ
		
		JPanel panel_rb=new JPanel();//���� ��ư�� ���� �г� ����
		JRadioButton RB1=new JRadioButton("Male");//���� ��ư�� ����
		JRadioButton RB2=new JRadioButton("Female");
		panel_rb.add(RB1);//������ ���� ��ư�� �гο� �߰�
		panel_rb.add(RB2);
		ButtonGroup bg = new ButtonGroup();//��ư�� �׷����� ���� �ϳ��� ���õ� �� �ֵ��� ��
		bg.add(RB1);
		bg.add(RB2);
		RB2.setSelected(true);//���� �Ǵ� ���� rb2��ư�� ó������ �����ֵ���
		
		panel_c.add(new JLabel("NAME"));//�гο� ����ִ� grid layout�� label ����
		panel_c.add(new JTextField());//text field ����
		panel_c.add(new JLabel("GENDER"));
		panel_c.add(panel_rb);//������ ������ radio button�� �� �г� ����
		panel_c.add(new JLabel("ID"));
		panel_c.add(new JTextField());
		panel_c.add(new JLabel("DEPARTMENT"));
		panel_c.add(new JTextField());
		
		panel_s.add(new Button("Save"));//panel s�� ��ư ����
		panel_s.add(new Button("Cancel"));
		
		setVisible(true);//���� ������ ȭ�鿡 ���̵���
	}
}
