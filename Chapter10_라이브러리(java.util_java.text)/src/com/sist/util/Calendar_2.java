
package com.sist.util;
import java.util.*;

//캘린더로 달력 출력
public class Calendar_2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("연/월/일 입력 (ex 2022 11 22) : ");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		//요일 출력
		Calendar cal=Calendar.getInstance(); //캘린더는 추상클래스이므로 new가 아닌 getInstance 통해 객체생성
		cal.set(Calendar.YEAR,year); //연도 설정 - 설정 없는 경우 오늘 날짜 기준
		cal.set(Calendar.MONTH,month-1); //set할 때 month 0번이 1이어서 -1해줘야 함(get할 때는 +1)
		cal.set(Calendar.DATE,day);
		
		int set_year=cal.get(Calendar.YEAR);
		int set_month=cal.get(Calendar.MONTH)+1;
		int set_day=cal.get(Calendar.DATE);
		int set_week=cal.get(Calendar.DAY_OF_WEEK);
		String[] week={"","일","월","화","수","목","금","토"};
		//설정된 날짜 출력
		System.out.printf("%d년 %d월 %d일 %s요일\n",set_year,set_month,set_day,week[set_week]);
		
		
	}

}
