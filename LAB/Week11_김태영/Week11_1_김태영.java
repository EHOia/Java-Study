import javax.swing.*;
import java.awt.*;
//사이버보안전공 1971067 김태영
public class Week11_1_김태영 {

	public static void main(String[] args) {
		MyFrame_1 f=new MyFrame_1();//MyFrame_1 실행
	}
}

class MyFrame_1 extends JFrame{
	public MyFrame_1() {
		JPanel panel_s = new JPanel();//panel 선언
		
		setSize(300,200);//크기설정
		setTitle("Calculator_1971067");//위에 나올 제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//엑스 박스 누르면 프로그램이 꺼지도록
		JTextField field = new JTextField();//text field 선언
		field.setHorizontalAlignment(JTextField.RIGHT);//오른쪽 정렬
		add(field,BorderLayout.NORTH);//text field를 위(북쪽)에 넣는다
		
		add(panel_s,BorderLayout.SOUTH);//panel_s를 아래(남쪽)에 넣는다
		panel_s.setLayout(new GridLayout(0,4));//panel_s로 선언된 panel위에 Grid layout을 올림
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
		setVisible(true);//내용이 화면에 보이도록
	}
}
