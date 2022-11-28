/*

스트림 (Stream) : 데이터 이동 통로
*Queue (FIFO 구조)
*송수신
-1바이트 : ~Input/~OutputStream
-2바이트(한글) : ~Read/~Writer



*/

package com.sist.io;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
public class IO {

	public static void main(String[] args) {
		try
		{
			//File 관련
			//1. 파일 목록 읽기 : File[] listFiles()
			//2. 파일/디렉토리 만들기 : createNewFile(), mkdir()
			//3. 파일 속성
			//4. 파일명/경로명/파일+경로명/수정날짜/디렉토리/파일여부확인 - 숨김, 쓰기, 읽기
			
			
//			File dir=new File("c:\\공유자료\\javaDev");
//			File[] files=dir.listFiles();
//			for(File f:files)
//			{
//				if(f.isDirectory())
//					System.out.println("<DIR>"+f.getName());
//				else
//					System.out.println(f.getName());
//				System.out.println(f.getName());
//			}
			
			
			//폴더 만들기 : mkdir()
//			File dir=new File("c:\\download");
//			if(!dir.exists()) //폴더가 없다면 --> 존재여부 확인
//			{
//				dir.mkdir(); //폴더 생성
//			}
				
			//파일 만들기 :createNewFile
			File file=new File("c:\\download\\sawon.txt");
//			if(!file.exists()) //파일이 없다면 --> 존재여부 확인
//			{
//				file.createNewFile(); //파일 생성
//			}

			//파일에 대한 정보 확인
			System.out.println("파일명 : "+file.getName());
			System.out.println("경로명 : "+file.getParent());
			System.out.println("파일+경로 : "+file.getPath());
			System.out.println("파일크기 : "+file.length());
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
			System.out.println("파일수정일 : "+sdf.format(new Date(file.lastModified())));
			System.out.println("숨김파일 : "+file.isHidden());
			System.out.println("읽기전용 : "+file.canRead());
			System.out.println("쓰기전용 : "+file.canWrite());
			
			
		}catch(Exception ex) {}
	}

}
