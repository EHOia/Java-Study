import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HW2_5_김태영 {

	public static void main(String[] args) {
		MyFrame_5 t=new MyFrame_5();

	}

}

class MyFrame_5 extends JFrame implements ActionListener{
	JPanel panelc=new JPanel();//그래프가 나오는 패널
	JPanel panels=new JPanel();//숫자 입력 패널
	JTextField Kim=new JTextField(3);//학생 숫자를 입력하는 필드 생성
	JTextField Lee=new JTextField(3);
	JTextField Park=new JTextField(3);
	JTextField Etc=new JTextField(3);
	JButton button=new JButton("Graph");//그래프 그리는 버튼 생성
	int kim=0;//학생 숫자를 담을 변수
	int lee=0;
	int park=0;
	int etc=0;
	String errorMessage=null;//잘못 입력한 경우 출력할 에러메시지
	
	public MyFrame_5(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);//화면 가운데 배치
		this.setTitle("Pie Chart of Student names - 김태영");
		this.add(panelc,"Center");//가운데에 그래프 패널 추가
		this.add(panels,"South");//아래에 숫자 입력 패널 추가
		button.addActionListener(this);//버튼에 이벤트 핸들링 매서드 연결
		panels.add(new JLabel("Kim"));//버튼 입력 패널에 순서대로 요소들 집어넣기
		panels.add(Kim);
		panels.add(new JLabel("Lee"));
		panels.add(Lee);
		panels.add(new JLabel("Park"));
		panels.add(Park);
		panels.add(new JLabel("Etc"));
		panels.add(Etc);
		panels.add(button);
		add(new Graph());//그래프 그리는 이너클래스 집어넣기
		this.setVisible(true);
	}
	class Graph extends JComponent{
		public void paint(Graphics g) {
			Color[] colors=new Color[4];//그래프를 그리는데 필요한 색상을 배열로 선언
			colors[0]=new Color(255,255,0);
			colors[1]=new Color(255,0,0);
			colors[2]=new Color(0,0,255);
			colors[3]=new Color(0,255,0);
			if(errorMessage!=null) {//이벤트 핸들링 매서드에서 에러메시지를 준 경우
				g.drawString(errorMessage,200,300);//에러메시지 출력
			}
			else if(kim>0&&lee>0&&park>0) {//에러메시지가 없이 제대로 입력된경우
				int lastAng=0;//호를 그리기 시작하는 각도
				g.setColor(colors[0]);//노란색
				g.fillArc(50,10,300,300,lastAng,(int)(kim*3.6));//입력한 숫자에 대응하는 크기의 호 생성
				lastAng+=(int)(kim*3.6);//다음 호를 그리기 시작할 각도를 넣어줌
				g.drawString("YELLOW: KIMs",370,160);//색깔별로 스트링을 드로우
				g.setColor(colors[1]);//빨간색
				g.fillArc(50,10,300,300,lastAng,(int)(lee*3.6));
				lastAng+=(int)(lee*3.6);
				g.drawString("RED: LEEs",370,180);
				g.setColor(colors[2]);//파란색
				g.fillArc(50,10,300,300,lastAng,(int)(park*3.6));
				lastAng+=(int)(park*3.6);
				g.drawString("BLUE: PARKs",370,200);
				g.setColor(colors[3]);//초록색
				g.fillArc(50,10,300,300,lastAng,360-lastAng);
				g.drawString("GREEN: ETC",370,220);
			}
			
		}
	}
	public void actionPerformed(ActionEvent e) {
		try {
			kim=Integer.parseInt(Kim.getText());//사용자가 text field에 입력한 숫자를 int형식으로 바꿔 받아옴
			lee=Integer.parseInt(Lee.getText());
			park=Integer.parseInt(Park.getText());
			if(kim+lee+park>100) {//합이 100이 넘는경우
				throw new Exception("Number of students is 100");//이 메시지를 가진 예외 처리
			}
			else if(kim<0||lee<0||park<0) {//음수인경우
				throw new Exception("Input numbers of student names");
			}
			else {//제대로 입력한 경우
				etc=100-(kim+lee+park);
				Etc.setText(Integer.toString(etc));//etc를 계산해 텍스트 필드에 출력
				errorMessage=null;//예외 메시지 없다는 것을 알려줌
			}
		}
		catch(Exception e1) {
			errorMessage=e1.getMessage();//예외처리시 보낸 에러 메시지를 변수에 저장
			if(!errorMessage.equalsIgnoreCase("Number of students is 100")) {//음수인 경우와 숫자가 아닌경우에 예외처리로 넘어오면 다른 에러 메시지가 들어옴
				errorMessage="Input numbers of student names";//그때의 에러 메시지는 이것으로 통일
			}
			Kim.setText("0");//필드의 숫자를 모두 0으로 바꿈
			Lee.setText("0");
			Park.setText("0");
			Etc.setText("0");
		}
		
		this.repaint();//다시 그리기
	}
}