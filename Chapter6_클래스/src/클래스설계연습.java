/*

클래스 종류
*데이터형 클래스 (관련된 데이터를 모아서 관리)
*액션 클래스 (관련된 기능을 모아서 관리)

*/

class Movie{
	String title;
	String startDay;
	String genre;
	String nation;
	String grade;
	int time;
	double score;
	int audienceNum;
	int rank;
	String summary;
}

class Food{
	String[] img;
	String name;
	double score;
	String addr;
	String tel;
	String type;
	String price;
	String time;
	String[] menu;
}

class Recipe{
	String img;
	String title;
	String user_name;
	String user_intro;
	String amount;
	String time;
	String group;
	String 기본재료;
	String 양념재료;
	String[] 조리순서;
}

class Member{
	String id;
	String pwd;
	String pwdCheck;
	String name;
	String nickname;
	String 주민번호;
	int birth;
	String sex;
	String mail;
	int 우편번호;
	String addr;
	int tel;
	int cel;
	String[] job;
	String[] hobby;
	String 소개;
}

class Goods{
	String img;
	String title;
	String subtitle;
	int discount;
	int price;
	int disc_price;
	String star;
	double score;
	int review;
}

class News{
	String pressIcon;
	String pressName;
	int time;
	String pressSite;
	String title;
	String newsCont;
	String newsImg;
}

class Shop{
	String img;
	String tel;
	String site;
	String lang;
	String time;
	String holiday;
	String notice;
	String addr;
	String location;
}

class Board{
	String pageName; //자유게시판, 글작성페이지
	int postNum;
	String title;
	String id;
	int	day;
	int view;
	int pageNow;
	int allpages;
	
	String name;
	String content;
	String cont_pwd;
}

public class 클래스설계연습 {

	public static void main(String[] args) {
		System.out.println("[Movie]");
		Movie m=new Movie();
		m.title="동감";
		m.genre="로맨스/멜로";
		m.nation="한국";
		m.grade="12세이상관람가";
		m.time=114;
		m.score=8.7;
		m.audienceNum=247;
		m.rank=2;
		m.summary="1999년, '용'은 첫눈에 반하게 된 '한솔'을 사로잡기 위해 친구에게 HAM무전기를 빌린다.";
		System.out.println(m.title);
		System.out.println("장르 "+m.genre);
		System.out.println("국가 "+m.nation);
		System.out.println("등급 "+m.grade);
		System.out.println("러닝타임 "+m.time);
		System.out.println("평점 "+m.score);
		System.out.println("누적관객 "+m.audienceNum);
		System.out.println("박스오피스 "+m.rank);
		System.out.println(m.summary);
		
	}

}
