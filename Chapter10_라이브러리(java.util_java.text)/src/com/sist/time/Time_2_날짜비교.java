/*

compareTo() : 같으면 0, 이전 -1, 이후 1
isAfter(), isBefore(), isEqual() --> boolean
기간 (시간-시간)

*/

package com.sist.time;

import java.time.LocalDate;
import java.util.*;
public class Time_2_날짜비교 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("연월일을 입력해주세요 : (ex 2022 12 25)");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		LocalDate date1=LocalDate.now(); //현재
		LocalDate date2=LocalDate.of(year, month, day); //기준일자

		//방법1 - 입력값을 오늘과 비교
//		int result=date1.compareTo(date1); //현재와 기준일 비교
//		System.out.println("result="+result);
//		
//		if(result==0)
//			System.out.println("마감일입니다.");
//		else if(result<0)
//			System.out.println("아직 이벤트 기간입니다.");
//		else if(result>0)
//			System.out.println("이벤트 기간이 지났습니다.");
		
		//방법2 - 입력값을 오늘과 비교
		if(date2.isAfter(date1)) //기간이 지났는지
			System.out.println("기간이 지났습니다.");
//		else
//			System.out.println("false 기간 안 지남");
		else if(date2.isBefore(date1))
			System.out.println("아직 이벤트 기간입니다.");
		else if(date2.isEqual(date1))
			System.out.println("마감일입니다.");
		
	}

}
