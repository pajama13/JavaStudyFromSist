/*

패턴 : 형태를 만들어서 찾기
ex   IP 전체를 가져온다 --> [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\[0-9]{1,3}
(0~9 사이 숫자가 1~3개 . 이 반복적으로 나옴)

패턴사용기호(자바, 자바스크립트, 파이썬, 오라클 모두 동일)
*한글 : [가-힣]
*영문 : [A-Za-z]
-대문자 [A-Z]
-소문자 [a-z]
*숫자 : [0-9]

[] : 
{} : 개수
ex   [A-Z]{3} A~Z 사이 알파벳 3글자
     [가-힣]{3,5} 한글전체에서 한글 3~5글자
^ : 시작, 제외 - startsWith와 비슷
ex ^[가-힣]{3} 한글로 시작하는 3글자
   [^가-힣]{3} 한글 제외한 3글자
$ : 끝 - endsWith와 비슷
\\w : 숫자나 알파벳


*/
package com.sist.regex;
import java.util.regex.*;
public class MainClass_Regex_1 {
	
	
	
	public static void main(String[] args) {
		String[] data= 
			{
				"bat","baby","bonus","c","cA",
				"ca","co","c.","c#","combat","count","date","disc","car",
				"홍길동","맛있다OK","시작12345"
			};
		
		// c[a-z]* --> 찾을 수 있는 문자 c,ca,co,car,combat,count
		// c[a-z] --> ca, co
		// c[a-zA-Z0-9] --> (==c\\w) cA, ca,co,c0
		// .* --> 전체 읽기 : 한글자 포함
		//.+ --> 2개
		// [bc].* : b나 c로 시작하는 것 모두
		// ^[가-힣]* : 한글로 시작하는 것 모두 
		
		//Pattern p=Pattern.compile("c[a-z]*" ); //c로 시작하고 영어소문자인 것 모두
		//Pattern p=Pattern.complie("c[a-z]+");
		//Pattern p=Pattern.compile("\\W+");
		//Pattern p=Pattern.compile("[가-힣]{2,3}\\w+"); 한글이 2~3글자에 알파벳이나 숫자 붙은 것
		//Pattern p=Pattern.compile("d[a-z]+");
		//Pattern p=Pattern.compile("");
		//Pattern p=Pattern.compile("[bcd]"); //b나 c나 d
		Pattern p=Pattern.compile("[b|c|d].{2}"); // b/c/d뒤에 임의의 글자 {N}개가 붙음
		for(String s:data)
		{
			Matcher m=p.matcher(s);
			if(m.matches())
			{
				System.out.println(m.group());
			}
		}
				
	}
}