package com.sist.time;

import java.time.LocalDate;
import java.time.Period;

public class Time_3 {

	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2022,11,23);
		
		Period p=Period.between(date1, date2);
		System.out.println(p.getDays());
		// 음수 
		
	}

}
