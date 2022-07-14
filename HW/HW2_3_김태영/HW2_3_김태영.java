import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//사이버보안전공 1971067 김태영
public class HW2_3_김태영 {

	public static void main(String[] args) {
		MyFrame_1 f=new MyFrame_1();//MyFrame_1 실행
	}
}

class MyFrame_1 extends JFrame implements ActionListener{
	JButton[] n;//숫자 버튼
	JButton re=new JButton("New");//초기화 버튼
	JButton eq=new JButton("=");//그 외 계산에 사용되는 버튼
	JButton di=new JButton("/");
	JButton mu=new JButton("*");
	JButton mi=new JButton("-");
	JButton pl=new JButton("+");
	JTextField field = new JTextField();//text field 선언
	
	boolean hasNumber=false;//이전 입력이 있는지 확인하는 변수
	int result;//계산 결과값을 저장하는 변수
	double result_double;//나누기의 경우 소수점 아래자리까지 출력되도록 하는 변수
	int a = 0;//첫번째 입력 숫자
	int b = 0;//두번째 입력 숫자
	int operatorNumber=0;//선택한 연산자의 종류를 번호로 표현
	
	public MyFrame_1() {
		JPanel panel_s = new JPanel();//panel 선언
		
		setSize(300,200);//크기설정
		setTitle("Calculator_1971067");//위에 나올 제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//엑스 박스 누르면 프로그램이 꺼지도록
		
		field.setHorizontalAlignment(JTextField.RIGHT);//오른쪽 정렬
		add(field,BorderLayout.NORTH);//text field를 위(북쪽)에 넣는다
		
		add(panel_s,BorderLayout.CENTER);//panel_s를 아래(남쪽)에 넣는다
		panel_s.setLayout(new GridLayout(0,4));//panel_s로 선언된 panel위에 Grid layout을 올림
		n=new JButton[10];
		for(int i=0;i<10l;i++) {
			n[i]=new JButton(Integer.toString(i));
			n[i].addActionListener(this);//버튼마다 클릭에 따라 실행되는 listener 설정
		}
		re.addActionListener(this);
		eq.addActionListener(this);
		di.addActionListener(this);
		mu.addActionListener(this);
		mi.addActionListener(this);
		pl.addActionListener(this);
		
		panel_s.add(n[7]);//버튼 패널에 버튼 삽입
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
		setVisible(true);//내용이 화면에 보이도록
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==re) {//new버튼 클릭한 경우
			field.setText("0");
			hasNumber=false;//초기화에 따라 입력된 숫자가 없다는 뜻을 전달
		}
		for(int i=0;i<10;i++) {
			if(e.getSource()==n[i]) {//숫자 버튼을 클릭하는경우
					if(hasNumber) {//첫번째 숫자가 입력된 경우
						field.setText(field.getText()+Integer.toString(i));//화면에 출력된 숫자에 더불어 입력한 숫자를 출력
						b=i;//두번째 숫자를 뜻하는 변수에 입력받은 숫자를 삽입
					}
					else {//이전에 숫자를 입력한 적이 없는경우
						field.setText(Integer.toString(i));//선택한 숫자를 출력
						a=i;//첫번째 숫자를 뜻하는 변수에 숫자 삽입
						hasNumber=true;//숫자를 받았다는 뜻을 전달
					}
			}
		}
		if(e.getSource()==eq) {//=버튼을 클릭한경우 계산을 해서 결과를 출력
			switch(operatorNumber) {//이전에 입력된 연산자의 종류에 따라 실행되는 계산이 다르다
			case 1://나누기
				result_double=(double)a/b;
				break;
			case 2://곱하기
				result=a*b;
				break;
			case 3://빼기
				result=a-b;
				break;
			case 4://더하기
				result=a+b;
				break;
			}
			if(operatorNumber==1) {//나누기를 한경우 정수형의 결과가 나오지 않기 때문에 따로 처리
				field.setText(Double.toString(result_double));
			}
			else {//나누기를 제외한 계산을 한 경우
				field.setText(Integer.toString(result));
			}
		}
		if(e.getSource()==di) {//선택한 연산자 버튼에 따라 숫자를 부여하고 화면에 출력되어있던 내용에 이어서 연산자를 출력
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
