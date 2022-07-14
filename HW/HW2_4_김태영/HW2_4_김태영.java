import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HW2_4_김태영 {
	public static void main(String args[]) {
		MyFrame_4 t=new MyFrame_4();//실행
		}
}
class MyFrame_4 extends JFrame implements ActionListener{
	JPanel drawingPanel=new JPanel();//표가 나오는 패널
	JPanel mainPanel=new JPanel();//숫자를 입력하는 패널
	JTextField Kor=new JTextField(3);//국어성적 입력하는 칸
	JTextField Eng=new JTextField(3);//영어성적 입력 칸
	JTextField Mat=new JTextField(3);//수학성적 입력 칸
	JButton button=new JButton("Show Graph");//버튼 생성
	int kor=0;//국어성적
	int eng=0;//영어
	int mat=0;//수학
	
	public MyFrame_4() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x버튼 누르면 프로그램 종료
		this.setSize(560,400);//크기설정
		this.setLocationRelativeTo(null);//화면의 정중앙에 위치하도록 함
		this.setTitle("Score Graph_1971067");//제목 설정
		this.add(drawingPanel,"Center");//각 패널을 프레임에 넣음
		this.add(mainPanel,"South");
		button.addActionListener(this);//버튼에 이벤트 핸들링 추가
		mainPanel.add(new JLabel("Kor"));//순서대로 숫자 입력 패널에 추가
		mainPanel.add(Kor);
		mainPanel.add(new JLabel("Eng"));
		mainPanel.add(Eng);
		mainPanel.add(new JLabel("Math"));
		mainPanel.add(Mat);
		mainPanel.add(button);

		add(new Lines());//그림 그리는 inner 클래스 추가
		
		this.setVisible(true);//화면에 보임
	}
	class Lines extends JComponent{
		public void paint(Graphics g) {
			Color red=new Color(255,0,0);
			g.clearRect(0,0,getWidth(),getHeight());//흰색 배경이 되도록 설정
			g.drawLine(100,70,100,280);//y축 그림
			int y=80;
			for(int i=0;i<11;i++) {//가로선을 그림
				g.drawLine(100,y,460,y);
				y+=20;
			}
			y=80;
			for(int i=10;i>0;i--) {//가로선에 맞는 숫자를 써줌
				g.drawString(Integer.toString(i*10),75,y);
				y+=20;
			}
			g.drawString("KOR",180,300);//x축 아래에 과목명 써줌
			g.drawString("ENG",280,300);
			g.drawString("MATH",380,300);
			if(kor<=100&&kor>=0&&eng<=100&&eng>=0&&mat<=100&&mat>=0) {//숫자가 범위내에 있는지 확인
				g.setColor(red);//빨간색으로 설정
				g.fillRect(190,(280-kor*2),20,kor*2);//입력된 성적에 맞는 그래프를 그림
				g.fillRect(290,(280-eng*2),20,eng*2);
				g.fillRect(390,(280-mat*2),20,mat*2);
			}
			else {//숫자가 범위를 벗어난 경우
				g.setColor(new Color(0,0,0));
				g.drawString("Wrong Input",230,50);//글씨 출력
			}
			
		}
	}
	
	public void actionPerformed(ActionEvent e) {//버튼을 클릭하는 이벤트 발생 시
		kor=Integer.parseInt(Kor.getText());//각 과목의 점수에 입력받은 숫자를 넣음
		eng=Integer.parseInt(Eng.getText());
		mat=Integer.parseInt(Mat.getText());	
		repaint();//그래프 그림

	}
}
