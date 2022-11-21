/*

[223.130.195.200]

[211.249.220.24]

[142.251.42.132]

 */
package com.sist.regex;
import java.util.regex.*;
public class MainClass_Regex_2 {

	public static void main(String[] args) {
//		String data="HP:010-1111-1111,OFFICE:02-2222-2222";
//		String pattern="(0\\d{1,2})-(\\d{4})-(\\d{4})";
//		//System.out.println(pattern);
//		Pattern p=Pattern.compile(pattern);
//		Matcher m=p.matcher(data);
//		while(m.find()) //존재여부 확인 - 이런 패턴 가진 게 있는지
//		{
//			System.out.println(m.group());
//		}
		String ip="211.89.63.1,211.89.63.131,127.0.0.1,169.123.174.2"+"142.250.196.99,12345.123.11111.5555,67676767.567";
		//211.89.63은 sist 학원 아이피 번호
		
		String pattern="(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(ip); //ip를 찾기
		while(m.find()) //이 형식을 가진 문자열이 있다면 출력해라
		{
			if((m.group(1)+"."+m.group(2)+"."+m.group(3)).equals("211.89.63"))
			{
				System.out.println(m.group()+" --> IP 접근을 거부(403)");
			}
		}
	}

}
