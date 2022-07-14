import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//���̹��������� 1971067 ���¿�
public class HW2_3_���¿� {

	public static void main(String[] args) {
		MyFrame_1 f=new MyFrame_1();//MyFrame_1 ����
	}
}

class MyFrame_1 extends JFrame implements ActionListener{
	JButton[] n;//���� ��ư
	JButton re=new JButton("New");//�ʱ�ȭ ��ư
	JButton eq=new JButton("=");//�� �� ��꿡 ���Ǵ� ��ư
	JButton di=new JButton("/");
	JButton mu=new JButton("*");
	JButton mi=new JButton("-");
	JButton pl=new JButton("+");
	JTextField field = new JTextField();//text field ����
	
	boolean hasNumber=false;//���� �Է��� �ִ��� Ȯ���ϴ� ����
	int result;//��� ������� �����ϴ� ����
	double result_double;//�������� ��� �Ҽ��� �Ʒ��ڸ����� ��µǵ��� �ϴ� ����
	int a = 0;//ù��° �Է� ����
	int b = 0;//�ι�° �Է� ����
	int operatorNumber=0;//������ �������� ������ ��ȣ�� ǥ��
	
	public MyFrame_1() {
		JPanel panel_s = new JPanel();//panel ����
		
		setSize(300,200);//ũ�⼳��
		setTitle("Calculator_1971067");//���� ���� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���� �ڽ� ������ ���α׷��� ��������
		
		field.setHorizontalAlignment(JTextField.RIGHT);//������ ����
		add(field,BorderLayout.NORTH);//text field�� ��(����)�� �ִ´�
		
		add(panel_s,BorderLayout.CENTER);//panel_s�� �Ʒ�(����)�� �ִ´�
		panel_s.setLayout(new GridLayout(0,4));//panel_s�� ����� panel���� Grid layout�� �ø�
		n=new JButton[10];
		for(int i=0;i<10l;i++) {
			n[i]=new JButton(Integer.toString(i));
			n[i].addActionListener(this);//��ư���� Ŭ���� ���� ����Ǵ� listener ����
		}
		re.addActionListener(this);
		eq.addActionListener(this);
		di.addActionListener(this);
		mu.addActionListener(this);
		mi.addActionListener(this);
		pl.addActionListener(this);
		
		panel_s.add(n[7]);//��ư �гο� ��ư ����
		panel_s.add(n[8]);
		panel_s.add(n[9]);
		panel_s.add(di);
		panel_s.add(n[4]);
		panel_s.add(n[5]);
		panel_s.add(n[6]);
		panel_s.add(mu);
		panel_s.add(n[1]);
		panel_s.add(n[2]);
		panel_s.add(n[3]);
		panel_s.add(mi);
		panel_s.add(re);
		panel_s.add(n[0]);
		panel_s.add(eq);
		panel_s.add(pl);
		setVisible(true);//������ ȭ�鿡 ���̵���
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==re) {//new��ư Ŭ���� ���
			field.setText("0");
			hasNumber=false;//�ʱ�ȭ�� ���� �Էµ� ���ڰ� ���ٴ� ���� ����
		}
		for(int i=0;i<10;i++) {
			if(e.getSource()==n[i]) {//���� ��ư�� Ŭ���ϴ°��
					if(hasNumber) {//ù��° ���ڰ� �Էµ� ���
						field.setText(field.getText()+Integer.toString(i));//ȭ�鿡 ��µ� ���ڿ� ���Ҿ� �Է��� ���ڸ� ���
						b=i;//�ι�° ���ڸ� ���ϴ� ������ �Է¹��� ���ڸ� ����
					}
					else {//������ ���ڸ� �Է��� ���� ���°��
						field.setText(Integer.toString(i));//������ ���ڸ� ���
						a=i;//ù��° ���ڸ� ���ϴ� ������ ���� ����
						hasNumber=true;//���ڸ� �޾Ҵٴ� ���� ����
					}
			}
		}
		if(e.getSource()==eq) {//=��ư�� Ŭ���Ѱ�� ����� �ؼ� ����� ���
			switch(operatorNumber) {//������ �Էµ� �������� ������ ���� ����Ǵ� ����� �ٸ���
			case 1://������
				result_double=(double)a/b;
				break;
			case 2://���ϱ�
				result=a*b;
				break;
			case 3://����
				result=a-b;
				break;
			case 4://���ϱ�
				result=a+b;
				break;
			}
			if(operatorNumber==1) {//�����⸦ �Ѱ�� �������� ����� ������ �ʱ� ������ ���� ó��
				field.setText(Double.toString(result_double));
			}
			else {//�����⸦ ������ ����� �� ���
				field.setText(Integer.toString(result));
			}
		}
		if(e.getSource()==di) {//������ ������ ��ư�� ���� ���ڸ� �ο��ϰ� ȭ�鿡 ��µǾ��ִ� ���뿡 �̾ �����ڸ� ���
			operatorNumber=1;
			field.setText(field.getText()+"/");
		}
		if(e.getSource()==mu) {
			operatorNumber=2;
			field.setText(field.getText()+"*");
		}
		if(e.getSource()==mi) {
			operatorNumber=3;
			field.setText(field.getText()+"-");
		}
		if(e.getSource()==pl) {
			operatorNumber=4;
			field.setText(field.getText()+"+");
		}
	}
}
