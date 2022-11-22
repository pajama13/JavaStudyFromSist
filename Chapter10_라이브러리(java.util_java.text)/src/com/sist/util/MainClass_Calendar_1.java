/*




*/

//캘린더로 연도/월/일/요일/시간 읽기
package com.sist.util;
import java.util.*;

import javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction;

public class MainClass_Calendar_1 {

	public static void main(String[] args) {
		
		Calendar today=Calendar.getInstance();
		System.out.println("연도 : "+today.get(Calendar.YEAR));
		System.out.println("월 : "+today.get(Calendar.MONTH)+1); //month가 0번부터 시작하므로 +1 필수
		System.out.println("일 : "+today.get(Calendar.DATE));
		
		String[] week={"","일","월","화","수","목","금","토"}; //week는 1부터 시작하므로 배열 0번에 공백 넣기
		System.out.println("요일 : "+week[today.get(Calendar.DAY_OF_WEEK)]);
		
		System.out.println("시간 : "+today.get(Calendar.HOUR));
		System.out.println("분 : "+today.get(Calendar.MINUTE));
		System.out.println("초 : "+today.get(Calendar.SECOND));
		System.out.println("마지막날 : "+today.getActualMaximum(Calendar.DATE));
	}

}
