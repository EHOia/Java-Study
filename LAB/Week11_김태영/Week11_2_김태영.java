import javax.swing.*;
import java.awt.*;
//사이버보안전공 1971067 김태영
public class Week11_2_김태영 {

	public static void main(String[] args) {
		MyFrame_2 f=new MyFrame_2();//MyFrame_2 실행

	}

}
class MyFrame_2 extends JFrame{//JFrame 상속
	public MyFrame_2() {
		JPanel panel_c=new JPanel(new GridLayout(0,2));//패널 c를 grid layout으로 설정
		JPanel panel_s=new JPanel();//panel s를 기본 layout(Flow layout)으로 설정
		
		setSize(350,200);//사이즈 설정
		setTitle("Student Information_1971067");//제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//엑스박스 누르면 프로그램이 꺼지도록
		
		JLabel label=new JLabel("STUDENT INFORMATION");//label에 설정한 글씨를 출력
		label.setHorizontalAlignment(JLabel.CENTER);//가운데정렬
		add(label,BorderLayout.NORTH);//위의 label을 맨 위 영역에 위치
		add(panel_c,BorderLayout.CENTER);//panel c를 가운데 영역에 위치
		add(panel_s,BorderLayout.SOUTH);//panel s를 맨 아래 영역에 위치
		
		JPanel panel_rb=new JPanel();//라디오 버튼을 넣을 패널 생성
		JRadioButton RB1=new JRadioButton("Male");//라디오 버튼을 생성
		JRadioButton RB2=new JRadioButton("Female");
		panel_rb.add(RB1);//생성된 라디오 버튼을 패널에 추가
		panel_rb.add(RB2);
		ButtonGroup bg = new ButtonGroup();//버튼을 그룹으로 묶어 하나만 선택될 수 있도록 함
		bg.add(RB1);
		bg.add(RB2);
		RB2.setSelected(true);//실행 되는 순간 rb2버튼이 처음부터 눌려있도록
		
		panel_c.add(new JLabel("NAME"));//패널에 들어있는 grid layout에 label 삽입
		panel_c.add(new JTextField());//text field 삽입
		panel_c.add(new JLabel("GENDER"));
		panel_c.add(panel_rb);//위에서 생성한 radio button이 들어간 패널 삽입
		panel_c.add(new JLabel("ID"));
		panel_c.add(new JTextField());
		panel_c.add(new JLabel("DEPARTMENT"));
		panel_c.add(new JTextField());
		
		panel_s.add(new Button("Save"));//panel s에 버튼 삽입
		panel_s.add(new Button("Cancel"));
		
		setVisible(true);//위의 내용이 화면에 보이도록
	}
}
