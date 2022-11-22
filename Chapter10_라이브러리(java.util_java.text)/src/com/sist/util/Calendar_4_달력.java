package com.sist.util;
import java.util.*;
public class Calendar_4_달력 {

	public static void main(String[] args) {
		//사용자로부터 연월 입력 받기 (달력 출력이므로 일자는 입력 받지 않음)
		Scanner scan=new Scanner(System.in);
		System.out.println("연도와 월을 입력하세요 : (ex 2022 11)");
		int year=scan.nextInt();
		int month=scan.nextInt();
		
		//요청달 1일자의 요일 확인, 요청달의 마지막 날짜
		Calendar cal=Calendar.getInstance(); //객체 생성 - 추상클래스이므로 getinstance 이용
		//캘린더의 year, month 값을 사용자가 요청한 날짜로 변경
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1); //요청날짜의 1일 (달력을 1일자부터 출력하니까)
		
		int week=cal.get(Calendar.DAY_OF_WEEK)-1; //-1해서 0값 갖도록 함 : 요일배열 0번이 일요일이기 때문
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		String[] strWeek={"일","월","화","수","목","금","토"};
		System.out.println("요청달의 1일자 요일 : "+strWeek[week]);
		
		//"0000년 00월 일 월 화 수 목 금 토" 출력 - 2022년 11월 기준으로 
		System.out.println(year+"년 "+month+"월");
		System.out.println("\n");
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println();
		//요일별 숫자 넣기
		for(int i=1; i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++) //요일 전까지 공백 주기
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
//			if(week>6) //일요일이면 (2022년 11월 6일부터 2째주임)
//			{
//				week=0;
//				System.out.println();
//			}
		}
		
		
		
	}

}
