/*

 */

import java.util.Scanner;

//중첩switch
public class 제어문_선택문3 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0)/바위(1)/보(2)를 선택하세요:");
		
		int user=scan.nextInt();
		
		int com=(int)(Math.random()*3); //0.0~2.999를 정수화 -> 0,1,2
		
		switch(com){
			case 0:
				System.out.println("컴퓨터:가위");
				break;
			case 1:
				System.out.println("컴퓨터:바위");
				break;
			case 2:
				System.out.println("컴퓨터:보");
				break;
		}
		
		switch(user){
			case 0:
				System.out.println("사용자:가위");
				break;
			case 1:
				System.out.println("사용자:바위");
				break;
			case 2:
				System.out.println("사용자:보");
				break;
			default:
				System.out.println("0, 1, 2 중 하나를 입력해주세요~");
		}
		
		
		//결과값 출력
		switch(com) {
		case 0: //가위
			switch(user) {
			case 0:
				System.out.println("비김~");
				break;
			case 1:
				System.out.println("내가 이김~");
				break;
			case 2:
				System.out.println("컴퓨터가 이김~");
				break;
			}
			break;
			
		case 1:
			switch(user) {
			case 0:
				System.out.println("컴퓨터가 이김~");
				break;
			case 1:
				System.out.println("비김~");
				break;
			case 2:
				System.out.println("내가 이김~");
				break;
			}
			break;
			
		case 2:
			switch(user) {
			case 0:
				System.out.println("컴퓨터가 이김~");
				break;
			case 1:
				System.out.println("내가 이김~");
				break;
			case 2:
				System.out.println("비김~");
				break;
			}
			break;
		
			
		}
		
		
		
		
	}
}
