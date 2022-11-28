/*

문자 스트림 : 2바이트로 읽기/쓰기
File, FileInputStream(BufferedInpuStream)
FileOutputStream(BufferedWriter) --> 바이트 스트림 (한글 외에 다른 파일 제어 : zip, png 등)
FileReader(BufferedReader)
FileWriter(BufferedWriter) --> 문자 스트림 (문자 자체를 제어), 크롤링 후 파일 저장, 파일에 입력


*/

package com.sist.io2;
import java.io.*;
import java.util.ArrayList;
class Student
{
	private int hakbun;
	private String name;
	private int eng,math,kor;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
}
public class MainClass_FileWriter {

	public static void main(String[] args) {
		//학생목록
		ArrayList<Student> list=new ArrayList<Student>();
		//파일 읽기
		try
		{
			String data="1|홍길동|90|80|95\n"
					+"2|홍준표|70|80|95\n"
					+"3|홍삼|90|80|75\n"
					+"4|홍학|90|87|95\n"
					+"5|홍건적|97|80|95";
			//저장
			//true없으면 create 모드(계속 새로 저장), true 있으면 append 모드(기존 파일에 이어서 저장)
			//FileWriter를 써야 한글이 안 깨짐 (파일인풋스트림 쓰면 한글 못 읽어서 깨짐)
			FileWriter fw=new FileWriter("c:\\java_data\\student.txt");
			
			//파일저장
			fw.write(data); //바로 String을 넣을 수 있음(바이트 변환 없이)
			//파일 닫기
			fw.close();
/*
			FileWriter : write(), close()
			FileReader : read(), close()
			-1 : EOF(End of File)
*/
			System.out.println("데이터 저장 완료!");
		}catch(Exception ex){}
		
	}

}
