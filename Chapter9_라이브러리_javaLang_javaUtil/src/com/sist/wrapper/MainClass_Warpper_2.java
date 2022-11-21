/*

*/

package com.sist.wrapper;

import java.util.Scanner;

public class MainClass_Warpper_2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		//2개의 정수를 문자열로 받기 --> 정수형으로 변환 --> +
		System.out.println("정수 2개를 입력하시오(ex 10 29) : ");
		String num1=scan.next();
		String num2=scan.next();
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		
		
		
	}

}
