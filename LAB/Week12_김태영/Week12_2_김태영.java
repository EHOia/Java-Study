import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Week12_2_김태영 {

	public static void main(String[] args) {
		drawFrame f=new drawFrame();
	}
}

class drawFrame extends JFrame implements ActionListener{
		private JRadioButton red;//세가지 색의 라디오버튼 선언
		private JRadioButton green;
		private JRadioButton blue;
		private JButton button;//paint버튼 선언
		Color c=new Color(255,0,0);//초기 색상(빨강)을 가진 객체 c 선언
		Color light_gray=new Color(192,192,192);//연그레이 색을 가진 color 객체 선언
		Color black=new Color(0,0,0);//검정색을 가진 color 객체 선언
		public drawFrame() {
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame 종료
			this.setSize(500,350);//크기 설정
			this.setLocationRelativeTo(null);//화면의 정중앙에 위치하도록 함
			this.setTitle("MyCar-김태영");//타이틀 설정
			JPanel panel_button=new JPanel();//버튼들이 들어갈 패널 선언
			JPanel panel_draw=new JPanel();//그림이 들어갈 패널 선언
			
			add(panel_draw,"Center");//각각의 패널을 프레임에 넣음
			add(panel_button,"South");
			
			red=new JRadioButton("RED");//세개의 라디오버튼을 생성
			blue=new JRadioButton("BLUE");
			green=new JRadioButton("GREEN");
			panel_button.add(red);//선언된 라디오 버튼을 버튼 패널에 넣음
			panel_button.add(green);
			panel_button.add(blue);
			ButtonGroup bg=new ButtonGroup();//라디오버튼의 그룹 생성
			bg.add(red);//그룹에 각각의 라디오버튼을 넣음
			bg.add(green);
			bg.add(blue);
			red.setSelected(true);//처음에 선택되어있는 버튼을 red로 설정
			
			button=new JButton("Paint");//paint버튼 생성
			button.addActionListener(this);//버튼에 event listener 등록
			panel_button.add(button);//paint버튼을 버튼 패널에 넣음
			
			setVisible(true);//화면에 출력
		}
		
		public void paint(Graphics g) {
			g.setColor(c);//선택된 색상으로 도형을 칠함(처음에는 빨강)
			g.fillRect(180, 65, 140, 60);//사각형 두개로 자동차 모양 만들기
			g.fillRect(110, 125, 280, 100);
			g.setColor(light_gray);//연그레이 색으로 도형을 칠함
			g.fillOval(145,190,70,70);//두개의 바퀴 만들기
			g.fillOval(285,190,70,70);
			g.setColor(black);//검정색으로 도형을 그림
			g.drawArc(290, 90, 30, 70, 20, 140);//웃는 모양 만들기
		}
		
		public void actionPerformed(ActionEvent e) {
			if(red.isSelected()) {//라디오버튼에서 red가 선택된 경우
				c=new Color(255,0,0);//c에 빨간색을 담음
			}
			else if(green.isSelected()) {//green이 선택된 경우
				c=new Color(0,255,0);//c에 초록색을 담음
			}
			else if(blue.isSelected()) {//blue가 선택된 경우
				c=new Color(0,0,255);//c에 파란색을 담음
			}
			repaint();//자동차 부분에 다시 칠함
		}
}
