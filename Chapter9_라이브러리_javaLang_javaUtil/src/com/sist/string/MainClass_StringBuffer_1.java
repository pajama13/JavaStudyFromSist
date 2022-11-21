


package com.sist.string;
// IO : 파일 읽기 - CheckedException(예외처리 필수)
import java.io.FileReader;
public class MainClass_StringBuffer_1 {

	public static void main(String[] args) {
		FileReader fr=null;
		try
		{
			long start=System.currentTimeMillis();
			fr=new FileReader("c:\\공유자료\\javaDev\\movie.txt");
			int i=0; // 한 글자씩 읽어옴, 문자 번호를 읽어옴 --> A=65
			String movie="";
			while((i=fr.read())!=-1) //파일이 끝날 때까지 파일 읽어오기
			{
				movie+=String.valueOf((char)i);
			}
			long end=System.currentTimeMillis();
			System.out.println(movie);
			System.out.println("읽은 시간:"+(end-start));
			//읽은 데이터 출력
			
			
		}catch(Exception ex) {}
		finally
		{
			try
			{
				fr.close(); // finally에서 쓰는 close() 용도 : 파일 닫기, 서버 닫기, 오라클 닫기
			}catch(Exception ex) {}
		}
	}

}
