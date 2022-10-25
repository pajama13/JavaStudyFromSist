/*

[선택조건문]
-true/false 나눠서 처리
  ex 짝수/홀수, 대문자/소문자, 로그인여부, ID중복
 
-형식 :
 if(조건){조건이 true면 처리}else{조건이 false면 처리}


System.exit(0) : 프로그램 종료 시 사용

 */

import java.util.Scanner;
// 스캐너 단점 : 문자 입력 불가(문자열만 가능) -> 해결방법 : charAt(0) 써서 문자 하나만 가져오기

public class 제어문_선택조건문 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("알파벳 문자 입력:");
		char alpha=scan.next().charAt(0);
		//              문자열에서/첫번째0번째
		
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"는 대문자입니다.");
		else
			System.out.println(alpha+"는 소문자입니다.");
		
		scan.close();
	}
}
