/*

Wrapper
*기본형 데이터를 참조형으로 바꿔 사용이 편리하게 만들어주는 클래스의 집합
-int --> Integer
-byte --> Byte
-short --> short
-long --> long
-char --> Character
-float --> Float
-double --> Double
-boolean --> Boolean
*Wrapper 클래스 사용이유
-기본형 데이터 Object형으로 변경(클래스 객체 처리) --> java.util
-Collection : 데이터를 모아서 관리 (배열을 대체)
... 구글문서 참고

*/
package com.sist.wrapper;

public class MainClass_Wrapper_1 {

	public static void main(String[] args) {
		Integer ii=10; //박싱 (클래스 데이터형에 실제 값을 대입)
		int i=ii; //언박싱 (클래스 데이터를 기본형에 대입)
		System.out.println("ii="+ii+" , i="+i);
		
		//위에서 i는 안 되는데 ii는 되는 것
		System.out.println(ii.toString()); //문자열 반환
		System.out.println(ii.MAX_VALUE); //int형의 최대값
		System.out.println(ii.MIN_VALUE); //int형의 최소값
		System.out.println(Integer.toBinaryString(ii)); //2진법 변환
		System.out.println(Integer.toOctalString(ii)); //8진법
		System.out.println(Integer.toHexString(ii)); //16진법
		// 기본형+기능 첨부
		
		String s="100";
		//문자열("숫자")을 정수형으로 변경 : parseInt() --> 웹에서 필수
		int k=Integer.parseInt(s);
		System.out.println(k);
	}

}
