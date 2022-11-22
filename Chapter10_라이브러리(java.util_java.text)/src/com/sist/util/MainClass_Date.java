/*

Date클래스
*시스템의 현재 날짜/시간 읽기 & 저장(오라클 데이터형(DATE)과 연결(매칭)되므로 중요)
*Date클래스의 빈약한 기능을 보완하기 위해 Calendar클래스가 나옴



*/

//Date
package com.sist.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass_Date {

	public static void main(String[] args) {
		//생성과정
		//Date date=new Date(); //SimpleDateFormat 날짜 변환 기능을 항상 같이 사용함
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //형식은 자유롭게 변경 가능
		
		// 실시간으로 초당 시간 출력 --> 경매 프로그램에 자주 사용
		while(true)
		{
			Date date=new Date();
			String today=sdf.format(date);
			System.out.println(today);
			try 
			{
				Thread.sleep(1000); //1초
			} catch (Exception e) {	}
		}
		
	}

}
