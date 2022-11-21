package com.sist.util;
import java.util.*;
public class MainClass_StringTokenizer {

	public static void main(String[] args) {
		String date="2022-11-21";
		StringTokenizer st=new StringTokenizer(date,"-");
		//StringTokenizer(date) --> " "은 구분문자에서 생략이 가능
//		String year=st.nextToken(); //자르기
//		String month=st.nextToken();
//		String day=st.nextToken(); 
		System.out.println(st.countTokens()); //자른 개수 구하기
		while(st.hasMoreTokens()) //자른 개수만큼 돌리기
		{
			System.out.println(st.nextToken());
		}
	}

}
