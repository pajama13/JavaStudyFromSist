/*

[중첩조건문] -이중if문
-형식 : if(조건문){ if(조건문){} }
-사용예시 : 컴퓨터와 가위바위보(컴퓨터 '가위' - 사용자 '가위/바위/보' 등)



 */

// 컴퓨터와 가위바위보 ( 가위 0번, 바위 1번, 보 2번)
import java.util.Scanner;

public class 제어문_중첩조건문 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0)/바위(1)/보(2)를 내시오:");
		
		//사용자 입력값
		int user=scan.nextInt();
		
		//컴퓨터 랜덤값
		int com=(int)(Math.random()*3); //0~2.9999를 정수화 -> 0,1,2
		
		//확인
		if(com==0)
			System.out.println("컴퓨터:가위✌");
		else if(com==1)
			System.out.println("컴퓨터:바위✊");
		else if(com==2)
			System.out.println("컴퓨터:보🖐");
		
		if(user==0)
			System.out.println("사용자:가위✌");
		else if(user==1)
			System.out.println("사용자:바위✊");
		else if(user==2)
			System.out.println("사용자:보🖐");
		
		//결과값
		System.out.println();
		int res=com-user;
		if(res==-2 || res==1)
			System.out.println("[결과]컴퓨터가 이김~");
		else if(res==-1 || res==2)
			System.out.println("[결과]사용자가 이김~");
		else
			System.out.println("[결과]비김~");
		
		



//  노가다 방법
//
//		if(com==0) {
//			if(user==0)
//				System.out.println("비겼습니다.");
//			else if(user==1)
//				System.out.println("사용자가 이겼습니다.");
//			else if(user==2)
//				System.out.println("컴퓨터가 이겼습니다.");
//		}
//		
//		else if(com==1) {
//			if(user==0)
//				System.out.println("컴퓨터가 이겼습니다.");
//			else if(user==1)
//				System.out.println("비겼습니다.");
//			else if(user==2)
//				System.out.println("사용자가 이겼습니다.");
//		}
//		
//		else if(com==2){
//			if(user==0)
//				System.out.println("사용자가 이겼습니다.");
//			else if(user==1)
//				System.out.println("컴퓨터가 이겼습니다.");
//			else if(user==2)
//				System.out.println("비겼습니다.");
//		}
		
		scan.close();
	}
}
