package com.sist.io2;
import java.io.*;
import java.util.*;
public class MainClass_FileReader {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		try
		{
			//파일읽기 --> 구분
			FileReader fr=new FileReader("c:\\java_data\\student.txt");
			//소스에서 수정이 가능하면 예외, 불가능하면 에러라고 함
			int i=0; //글자번호 'A' --> 65
			String data="";
			while((i=fr.read())!=-1)
			{
				data+=String.valueOf((char)i); // valueOf : char를 문자열로 변환
			}
			fr.close();
			//System.out.println(data);
			String[] str=data.split("\n"); //String[] split(String regex) --> 정규식
			/*
			
			정규식에서 사용하는 기호 : 기호자체를 출력 : \\기호
			| --> 선택
			+ --> 1개 이상의 데이터
			* --> 0개 이상의 데이터
			^ --> 시작, 제외 ^[^범위]
			$ --> 끝 
			. --> 임의의 1글자
			[] --> 범위
			{} --> 글자수
			
			 */
			for(String s:str)
			{
				String[] std=s.split("\\|");
				//s=1|홍길동|90|80|90
				Student ss=new Student();
				ss.setHakbun(Integer.parseInt(std[0])); //Integer.parseInt : 문자열 숫자를 정수형 숫자로 변환
				ss.setName(std[1]);
				ss.setKor(Integer.parseInt(std[2]));
				ss.setEng(Integer.parseInt(std[3]));
				ss.setMath(Integer.parseInt(std[4]));
				list.add(ss);
			}
			//출력
			for(Student ss:list)
			{
				System.out.println(ss.getHakbun()+" "
						+ss.getName()+" "
						+ss.getKor()+" "
						+ss.getEng()+" "
						+ss.getMath()+" "
						+(ss.getKor()+ss.getEng()+ss.getMath())+" "
						+String.format("%.2f", (ss.getKor()+ss.getEng()+ss.getMath())/3.0));
				
			}
		}catch(Exception ex){ex.printStackTrace();} //오류메시지 확인
	}

}
