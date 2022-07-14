//사이버보안전공 1971067 김태영
public class Song {
	public String title;//노래 제목
	public String singer;//가수명
	public int price;//가격
	public void play() {//main 매서드에서 switch문에 따라 선택한 곡의 정보를 제공
		System.out.println("노래들어요: \""+title+"\" by "+singer);
	}
	public void price() {//선택한 곡의 가격을 출력
		System.out.println(price+"원 입니다.");
	}

}