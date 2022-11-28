package com.sist.io;
import java.io.*;
//파일 복사
public class MainClass_BufferedCopy {

	public static void main(String[] args) {
		try
		{
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("c:\\공유자료\\javaDev\\apache-tomcat-9.0.68.zip"));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("c:\\java_data\\tomcat.zip"));
			byte[] buffer=new byte[1024];
			int i=0;
			while((i=bis.read())!=-1)
			{
				bos.write(buffer,0,i);
			}
			bis.close();
			bos.close();
			System.out.println("파일 복사 완료!");
		}catch(Exception ex) {}
	}

}
