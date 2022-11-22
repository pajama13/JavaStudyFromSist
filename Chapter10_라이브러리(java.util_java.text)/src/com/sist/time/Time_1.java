/*

date, calendar의 기능 보완하는 역할

오라클에서 날짜 저장 시 date를 사용
MySQL에서 날짜 저장 시 LocalDateTime 사용

*/
package com.sist.time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Time_1 {

	public static void main(String[] args) {
		//현재 날짜
		LocalDate date=LocalDate.now(); //초기화할 때 .now() 사용
		System.out.println(date);

		//현재 시간 : now()
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		//현재 날짜와 시간
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		//날짜 설정 : of()
		date=LocalDate.of(2022,12,1);
		System.out.println(date);
		time=LocalTime.of(13,30,45);
		System.out.println(time);
	}

}
