/*

1|쇼생크 탈출|드라마|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|2016 .02.24 재개봉, 1995 .01.28 개봉|15세 관람가|프랭크 다라본트



*/

package com.sist.text;
import java.io.*;
import java.util.*;
import java.text.*;

class Movie
{
	private int rank;
	private String title;
	private String genre;
	private String poster;
	private String actor;
	private String regdate;
	private String grade;
	private String director;
	
	//private변수를 메소드 통해 접근가능하도록 게터세터 만들기 : 변수의 기능을 메소드화
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
}
public class Format_3 {

	public static void main(String[] args) {

		try
		{
			//파일 읽기
			FileReader fr=new FileReader("c:\\공유자료\\javaDev\\movie.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			}
			//System.out.println(sb.toString());
			
			String data=sb.toString();
			String[] movie=data.split("\n");
			for(String m:movie)
			{
				Object[] obj=m.split("\\|");
				String msg="순위:{0}\n영화명:{1}\n장르:{2}\n출연:{4}\n개봉일:{5}\n등급:{6}\n감독:{7}\n";
				System.out.println(MessageFormat.format(msg, obj));
			}
			
		}catch(Exception ex){}
	}

}
