/*
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
	
	탐색기 역슬래쉬 2개 211.63.89.99
 */
import java.io.FileReader;
import java.util.Scanner;

public class MovieSystem {
	
	Movie[] movie=new Movie[1938]; //배열이 채워졌다는 가정하에 진행 (하나씩 채우기 번거로워서)
	{
		try
		{
			int k=0;
			FileReader fr=new FileReader("c:\\공유자료\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			} //파일 다 읽음
			String data=sb.toString();
			String[] temp=data.split("\n");
			
			for(String s:temp)
			{
				String[] m=s.split("\\|");
				movie[k]=new Movie(); //중요. new로 메모리 할당해주기
				movie[k].mno=Integer.parseInt(m[0]);
				movie[k].title=m[1];
				movie[k].genre=m[2];
				movie[k].poster=m[3];
				movie[k].actor=m[4];
				movie[k].regdate=m[5];
				movie[k].grade=m[6];
				movie[k].director=m[7];
				k++;
			}
			
		}catch(Exception ex) {ex.printStackTrace();}
			
	//
	}
	
	public static void main(String[] args) {
		MovieSystem ms=new MovieSystem();
		//1. 출력 - 영화제목
		for(Movie m:ms.movie) 
		{
			System.out.println(m.mno+". "+m.title);
		}
		System.out.println("------------------");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("장르 입력:");
		String genre=scan.next();
		for(Movie m:ms.movie) // movie -> 객체배열(영화의 모든 정보) -> Movie (1개의 영화 정보)
		{
			if(m.genre.contains(genre))
			{
				System.out.println(m.title+"("+m.genre+")");
			}
		}
	}
}
