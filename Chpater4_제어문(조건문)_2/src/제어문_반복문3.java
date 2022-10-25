/*

 */


//updown게임

import java.util.Scanner;

public class 제어문_반복문3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		
		// ;; 맞힐 때까지 무한 반복
		for(;;) {
			System.out.println("[업다운게임시작] 1~100까지 정수를 입력:");
			int user=scan.nextInt();
			if(user<1 || user> 100) {
				System.out.println("잘못된 입력입니다."); //처음부터 다시 실행하라
				continue;
			}
			
			if(com>user){
				System.out.println("입력값보다 큰 수를 입력하세요.");
			}else if(com<user) {
				System.out.println("입력값보다 작은 수를 입력하세요.");
			}else {
				System.out.println(com+"! 정답~!");
			}
		}
		

		
		
	}
}
