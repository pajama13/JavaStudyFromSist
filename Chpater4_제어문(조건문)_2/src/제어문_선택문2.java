/*

12월, 1월, 2월 -> "겨울"
3월, 4월, 5월 -> "봄"
6월, 7월, 8월 -> "여름"
9월, 10월, 11월 -> "가을"

 */
import java.util.Scanner;


public class 제어문_선택문2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("월을 입력하세요(1~12):");
		
		int month=scan.nextInt();
		
		switch(month) {
		
		case 12: case 1: case 2:
			System.out.println(month+"월은 겨울입니다.");
			break;
			
		case 3: case 4: case 5:
			System.out.println(month+"월은 봄입니다.");
			break;
			
		case 6: case 7: case 8:
			System.out.println(month+"월은 여름입니다.");
			break;
		
		case 9: case 10: case 11:
			System.out.println(month+"월은 가을입니다.");
			break;
		
		default:
			System.out.println("1~12 사이의 값을 입력하세요.");
		}
	}

}
