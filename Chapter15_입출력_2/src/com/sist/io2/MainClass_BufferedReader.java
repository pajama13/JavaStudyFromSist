package com.sist.io2;
import java.util.*;
import java.io.*;
public class MainClass_BufferedReader {

	public static void main(String[] args) {
		try
		{
			BufferedReader in=
				new BufferedReader(new InputStreamReader(new FileInputStream("c:\\공유자료\\javaDev\\movie.txt")));
			//InputStream(1바이트) --> Reader(2바이트)로 변경
			while(true)
			{
				String movie=in.readLine(); //한 줄씩 읽기
				if(movie==null)
					break;
				System.out.println(movie);
			}
			in.close();
			
		}catch(Exception ex){}
	}

}
