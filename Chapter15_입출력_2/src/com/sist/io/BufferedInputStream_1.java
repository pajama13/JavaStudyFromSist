/*

보조스트림 (Buffered~)

883p

*/

package com.sist.io;
import java.io.*;
import java.io.FileInputStream;
public class BufferedInputStream_1 {

	public static void main(String[] args) {
		try
		{
			File dir=new File("c:\\java_data");
			if(!dir.exists()) //존재여부 확인 : 폴더가 존재하지 않으면
			{
				dir.mkdir(); //저장 폴더를 만든다
				System.out.println("데이터 저장 폴더가 만들어졌습니다.");
			}
			else
			{
				System.out.println("이미 존재하는 폴더입니다!");
			}
			//파일을 바로 연결하는 게 아니고,
			//임시로 사용자가 보내준 데이터를 메모리에 저장했다가 close가 되면 파일과 연결시킴
			BufferedOutputStream bos=
					new BufferedOutputStream(new FileOutputStream("c:\\java_data\\student.txt")); //create
			/*
			new FileOutputStream("") --> Create : 파일을 생성
			new FileOutputStream("",true) --> Append : 기존 파일에 데이터 추가
			 */
			String std="1|홍길동|90|80|70\n"
					+"2|홍삼|60|90|70\n"
					+"3|홍합|90|98|80\n"
					+"4|홍당무|80|80|70\n"
					+"5|홍학|70|87|99\n";
			bos.write(std.getBytes()); //메모리에 저장
			bos.close(); //파일 전송
			System.out.println("데이터 저장 완료!!");
		}catch(Exception ex){}
	}

}
