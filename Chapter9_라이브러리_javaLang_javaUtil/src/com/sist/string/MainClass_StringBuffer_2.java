/*

StringBuffer sb=new StringBuffer(); //문자열 저장하는 메모리 임시공간(Buffer) 생성
Buffer --> 임시공간을 만들어 처리속도를 높임

sb.append


*/
package com.sist.string;
import java.io.*;
public class MainClass_StringBuffer_2 {

	public static void main(String[] args) {
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\공유자료\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) //끝까지 읽어오기
			{
				sb.append(String.valueOf((char)i)); //append 무조건 암기
			}
			System.out.println(sb.toString());


		}catch(Exception ex) {}
		finally
		{
			try 
			{
				fr.close();
			} catch (Exception e){}

		}
	}

}
