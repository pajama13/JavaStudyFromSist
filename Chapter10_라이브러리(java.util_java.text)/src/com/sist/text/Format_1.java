/*

Format 변환
*숫자 변환
*날짜 변환
*선택 변환
*메세지 변환(출력 형식 만듬)


*/

package com.sist.text;
import java.text.*;
public class Format_1 {

	public static void main(String[] args) {
		//숫자 변환 (자바 패턴 : #,###,### / 오라클 패턴 : 9,999,999)
		DecimalFormat df=new DecimalFormat("###,###,###");
		int value=123456789;
		System.out.println("￦"+df.format(value));
		
		//초이스포맷으로 점수별 학점 출력 - 초이스포맷 거의 안 
		System.out.println("--- ChoiceFormat ---");
		double[] limit={59,60,70,80,90};
		//0~59, 60~69, 70~79, 80~89, 90 이상 
		String[] grade={"F","D","C","B","A"};
		int[] score={100,90,85,90,45,67,78};
		ChoiceFormat cf=new ChoiceFormat(limit,grade);
		for(int i=0; i<score.length;i++)
		{
			System.out.println(score[i]+" : "+cf.format(score[i]));
		}
	}

}
