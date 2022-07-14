import javax.swing.*;
import java.awt.event.*;

public class Week12_1_김태영 {
	public static void main(String[] args) {
		MyFrame t=new MyFrame();//MyFrame클래스 선언
	}
}

class MyFrame extends JFrame{
	private JButton button;//버튼 선언
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);//frame 크기 설정
		this.setResizable(false);//크기 고정
		this.setTitle("나 잡아봐~라!-김태영");//title설정
		JPanel panel = new JPanel();//panel 생성

		button=new JButton("Click!");//버튼 생성 및 버튼에 출력할 내용 설정
		addButton();//버튼을 랜덤한 위치에 출력
		button.addMouseListener(new MyListener());//버튼에 event listener 등록
		panel.add(button);//panel에 버튼 붙임
		add(panel);//frame에 panel을 붙임
		setVisible(true);//화면에 출력
	}
	
	public void addButton() {//랜덤한 위치에 버튼을 생성해주는 매서드
		int x=(int)(Math.random()*160)+70;//랜덤한 버튼의 위치를 설정
		int y=(int)(Math.random()*200)+30;
		button.setLocation(x,y);//설정된 위치에 버튼을 생성
		System.out.println("x="+x+",\t"+"y="+y);//버튼의 좌표를 콘솔창에 출력
	}
	
	private class MyListener extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {//버튼안에 마우스가 들어간 경우
			addButton();//새로운 위치에 버튼을 만듦
		}
		public void mouseClicked(MouseEvent e) {//버튼을 클릭한 경우
			System.out.println("윽,,,잡혔다ㅠㅠ");//내용을 콘솔창에 출력
		}
	}
}
