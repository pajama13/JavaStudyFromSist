/*
 

 */


// 2개 정수, 1개 연산자 받아 4칙연산 처리

import java.util.Scanner;

public class 제어문_조건문3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.println("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/):");
		char op=scan.next().charAt(0);
		
		if(op=='+')
			System.out.printf("%d+%d=%d",num1,num2,num1+num2);
		if(op=='-')
			System.out.printf("%d-%d=%d",num1,num2,num1-num2);
		if(op=='*')
			System.out.printf("%dx%d=%d",num1,num2,num1*num2);
		//중첩조건문 (if 안에 if)
		if(op=='/') {
			if(num2==0) //나누기 예외처리 필수!
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.printf("결과:%d/%d=%.2f\n",num1,num2,num1/(double)num2);
			
		}
		scan.close();
	}

}
