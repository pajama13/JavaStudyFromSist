/*

*/
package com.sist.io;
import java.util.*;
import java.io.*;

public class MainClass_BufferedInputStream {

	public static void main(String[] args) {
		try
		{
			BufferedInputStream bis=
					new BufferedInputStream(new FileInputStream("c:\\java_data\\student.txt"));
			int i=0;
			while((i=bis.read())!=-1)
			{
				System.out.println((char)i);
			}
			bis.close(); //한글은 깨질 수 있음
		}catch(Exception ex){}
	}

}
