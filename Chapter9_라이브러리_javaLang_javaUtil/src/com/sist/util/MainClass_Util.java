/*

util 
*자바에서 자주 사용되는 클래스
*암기 필요
-Random
-Scanner
-StringTokenizer
-Date
-Calendar
-List --> ArrayList **, Vector, LinkedList, Queue **, Stack **
-Set --> HashSet ** / TreeSet
-Map --> Hashtable / HashMap


java.io : 파일 관련, Buffered~
java.net : URL 관련, URLEncoder
java.sql : Connection, Statement, ResultSet
java.text : SimpleDateFormat, MessageFormat, ChoiceFormat
기타 : 열거형 (Enum), 어노테이션 (@~), 제네릭스(<ClassName>), 람다식 (함수 포인터)

java.lang.regex.*
*pattern
*Matcher


*/

package com.sist.util;
import java.util.*;
public class MainClass_Util {

	public static void main(String[] args) {
		
		//먼저 Random클래스 객체 생성 필요
		Random r=new Random();
//		int i=r.nextInt(31)+1; //1~31 랜덤값 발생
//		System.out.println(i);
		//예약가능한 날짜 조정
		int[] reserve=new int[r.nextInt(10)+11]; //11~20
		for(int i=0; i<reserve.length; i++)
		{
			reserve[i]=r.nextInt(31)+1;
			
			//Set클래스를 이용해서 중복 제거
		}
		Arrays.sort(reserve);
		System.out.println("--- 예약가능한 날짜 ---");
		for(int i:reserve)
		{
			if(i>=21)
			{
				System.out.print(i+" ");
			}
		}
	}

}
