/*


 */


//4칙연산, 학점 구하기

import java.util.Scanner;

public class 조건문정리 {

	public static void main(String[] args) {

	//+,-,*,/ 가 아니면 디폴트값 보여주기
	Scanner scan=new Scanner(System.in);
	System.out.println("첫번재 정수 입력:");
	int a=scan.nextInt();
	
	System.out.println("두번째 정수 입력:");
	int b=scan.nextInt();
	
	System.out.println("연산자 입력");	
	switch(scan.next()) {
		case "+":
			System.out.printf("%d+%d=%d",a,b,a+b);
			break;
		case "-":
			System.out.printf("%d-%d=%d",a,b,a-b);
			break;
		case "*":
			System.out.printf("%dx%d=%d",a,b,a*b);
			break;
		case "/":
			if(b==0) //나누기 예외처리
				System.out.println("0으로 나눌 수 없습니다.");
			else 
				System.out.printf("%d/%d=%.1f\n",a,b,a/(double)b);
			break;
		default:
			System.out.println("+,-,*,/ 중 하나를 입력하세요.");
	}
	
	
	
	
	}
}
