/*

if문 조건에는 true/false만 들어감



 */

import java.util.Scanner;

public class 제어문_조건문4 {

	public static void main(String[] args) {

		System.out.println("======== Menu ========");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 영화목록");
		System.out.println("4. 영화 상세보기");
		System.out.println("5. 영화 예매");
		System.out.println("6. 종료");
		System.out.println("======================");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("메뉴 선택(1~6):");
		int menu=scan.nextInt();
		if(menu==1)
			System.out.println("로그인을 요청하셨습니다.");
		if(menu==2)
			System.out.println("회원가입을 요청하셨습니다.");
		if(menu==3)
			System.out.println("영화목록을 요청하셨습니다.");
		if(menu==4)
			System.out.println("영화 상세보기를 요청하셨습니다.");
		
		if(menu==5)
			System.out.println("영화 예매를 요청하셨습니다.");
		
		if(menu==6)
			System.exit(0); // 프로그램 종료 (반복문에서도쓰임)
		
		scan.close();
	}
}
