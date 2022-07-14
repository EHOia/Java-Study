//1971067 사이버보안전공 김태영
public class Time {
	private int hour;
	private int minute;
	
	private boolean isValid(int hour, int minute) {
		boolean hflag=false, mflag=false, fflag=false;//시간과 분이 적절한지 확인한 후 최종적으로 둘다 참인경우를 분류해주는 변수
		if(hour>=0&&hour<=23) hflag=true;//시간이 제대로 입력된 경우
		if(minute>=0&&minute<=59) mflag=true;//분이 제대로 입력된 경우
		if(hflag&&mflag) fflag=true;//시간과 분이 모두 제대로 입력된경우
		return fflag;
	}
	public void setTime(int hour, int minute) {
		if (isValid(hour, minute)) {//isValid 메서드에서 시간과 분이 모두 적절하다 반환한 경우
			this.hour=hour;//시간과
			this.minute=minute;//분을 입력
		}
		else {//시간 또는 분이 잘못 입력된 경우
			this.hour=0;//값을 0으로 변경
			this.minute=0;
		}
	}
	public int getTime(char ch) {
		if(ch=='H'||ch=='h') return hour;//H 또는 h를 매개변수로 받은 경우 시간을 반환
		else return minute;//그 외의 문자를 매개변수로 받은 경우 분을 반환
	}
}
