import java.util.Scanner;

public class 반복문정리_업다운게임 {
	
	//업다운게임 복습
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int num=(int)(Math.random()*100)+1;
		
	//	System.out.println("[시스템] 랜덤값:"+num);

		System.out.println("[업다운게임] 시작~! 1~100 사이 랜덤으로 나온 숫자를 맞춰보세요! :");
		
		for(;;) {

			
			int user=scan.nextInt();
			
			if(!(user>=1 && user<=100))
			{
				System.out.println("[알림] 잘못된 입력입니다! 1~100 중에서 입력해주세요!");
				continue;
			}
			
			if(user>num)
			{
				System.out.println("랜덤값은 입력값보다 작습니다! 더 작은 수를 입력해주세요!");
			}
			else if(user<num)
			{
				System.out.println("랜덤값은 입력값보다 큽니다! 더 큰 수를 입력해주세요!");
			}
			else
			{
				System.out.printf("정답~! 랜덤값은 %d입니다~",num);
			}
			
		}

			
	//		
	}
}
