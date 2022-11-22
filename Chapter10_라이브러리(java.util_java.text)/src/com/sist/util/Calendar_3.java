/*

 */

package com.sist.util;
import java.util.*;
public class Calendar_3 {

	public static void main(String[] args) {
		
		//calendar --> date 변환 : 오라클에 저장
		Calendar cal=Calendar.getInstance();
		Date date=new Date(cal.getTimeInMillis());
		System.out.println(date);
		
		//date --> calendar 변환 : 오라클에서 날짜를 읽어서 제어
		Calendar cal2=Calendar.getInstance();
		Date date2=new Date();
		cal2.setTime(date2);
		System.out.println("연도 : "+cal2.get(Calendar.YEAR));
		System.out.println("월 : "+(cal2.get(Calendar.MONTH)+1)); //get 할 때는 month에 +1 (0번부터 시작하므로)
		System.out.println("일 : "+cal2.get(Calendar.DATE));
		
	}

}
