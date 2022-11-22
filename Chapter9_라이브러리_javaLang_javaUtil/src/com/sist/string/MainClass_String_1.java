/*

StringBuffer : append() 문자열 결합
Math : random(), ceil() 올림 / round() 반올림
Wrapper : 
 -parseInt(), parseDouble(), parseBoolean() : 문자열을 해당데이터형으로 변경
 -박싱
 -언박싱
StringTokenizer : nextToken(), counterToken(), hasMoreTokens : 문자를 자르는 것
Pattern / Matcher : find(), group(), complie()



*/


package com.sist.string;

import java.util.Arrays;
import java.util.StringJoiner;

public class MainClass_String_1 {

	public static void main(String[] args) {
//		String color="red,blue,black,yellow,green,white";
//		//색상별로 분리(잘라서 쓰기)
//		String[] colors=color.split(",");
//		for(String c:colors)
//		{
//			System.out.println(c);
//		}
//		System.out.println("--- 출력형식(join) ---");
//		String ss=String.join("-",colors);
//		System.out.println(ss);
//		System.out.println("--- 출력형식 ---");
//		ss=color.replace(",","-");
//		System.out.println(ss);
//		//이미지 여러 개를 동시에 묶어서 저장 시, 구분자를 사용하여 저장 --> 데이터를 나눠서 출력
//		StringJoiner sj=new StringJoiner(",","{","}");
//		for(String s:colors)
//		{
//			sj.add(ss);
//		}
//		System.out.println(sj.toString());
		
		String color="red,blue,green,yellow";
		String[] colors=color.split(",");
		System.out.println(Arrays.toString(colors));
		String ss=String.join(" & ", colors);
		System.out.println(ss);
		
		StringJoiner sn=new StringJoiner(" - ","< "," >");
		for(String s:colors)
		{
			sn.add(s);
		}
		System.out.println(sn);
		
	}

}
