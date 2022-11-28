package com.sist.io;
import java.io.*;
import java.util.*;
public class MainClass_FileInputStream {

	public static void main(String[] args) {
		try
		{
			FileInputStream fis=new FileInputStream("c:\\download\\sawon.txt");
			//파일 읽기 쓰기 전용이 아닌, 파일 복사 
			int i=0; //한 글자씩 읽기 (글자마다 번호를 추력
			while((i=fis.read())!=-1) //-1이면 끝날 때까지
			{
				System.out.println((char)i);
			}
			fis.close();
			
		}catch(Exception ex){}
	}

}
