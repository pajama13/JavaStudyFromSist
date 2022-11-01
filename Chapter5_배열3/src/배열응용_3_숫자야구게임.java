/*

숫자야구게임

3자리 숫자를 입력, 정답과 다른 자리면 볼, 같은 자리 스트라이크 ...
3S 나오면 종료

ex 765 -> 167입력 1S-1B


1. 중복없는 난수(정수) 3개 만들기 - 배열 이용
2. 사용자 입력 받기
3. 비교
4. 힌트 주기(전광판 효과)
	S:●
	B:○○
5. 종료 여부 확인

 */

import java.util.Arrays;
import java.util.Scanner;

public class 배열응용_3_숫자야구게임 {
	
	
	public static void main(String[] args) {

		int[] com=new int[3]; //컴퓨터값
		int[] user=new int[3]; //사용자 입력값
		
		//컴퓨터 랜덤값 지정하기
		for(int i=0; i<com.length; i++)
		{
			com[i]=(int)(Math.random()*9)+1; //1~9 입력
			//중복값 제외하기
			for(int j=0; j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		
		System.out.println("컴퓨터값 : "+Arrays.toString(com)+"\n");
		
		//사용자 입력값 받기
		Scanner scan=new Scanner(System.in);
		
		//몇 번만에 맞췄는지 확인하기
		int count=0;
		
		while(true) //계속 반복할 것(지정된 횟수X)이므로 while 사용
		{
			System.out.println("세자리 정수를 입력해주세요 : ");
			int input=scan.nextInt();
			
			//오류 처리 : 세자리 정수 맞는지 확인
			if(input<100 || input>999)
			{
				System.out.println("[알림] 잘못된 입력입니다!");
				continue; //조건식으로 올라가, 처음부터 다시 실행
			}
			//배열에 저장
			//중요 : 숫자 자르기
			user[0]=input/100; //첫번째 자리에 넣기
			user[1]=(input%100)/10; //두번째 자리에 넣기
			user[2]=input%10; //3번째 자리에 넣기
			
			//오류 처리 : 같은 수를 입력하면 안 됨, 0을 입력하면 안 됨
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0])
			{
				System.out.println("[알림] 같은 수는 사용할 수 없습니다!");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("[알림] 0은 사용할 수 없습니다!");
				continue;
			}
			
			count++; //게임횟수 증가			
			
			//비교하기
			int s=0, b=0; //s : 같은 자리, b : 다른 자리
			
			for(int i=0; i<3; i++) //com
			{
				for(int j=0; j<3; j++) //user
				{
					if(com[i]==user[j]) //서로 같은 숫자가 있다면
					{
						if(i==j) //자리까지 같으면
							s++;
						else
							b++;
					}
						
				}
			}
			
			//힌트주기
			System.out.printf(">> 입력 숫자 : %d, 게임결과 : %dS-%dB\n",input,s,b);
			System.out.println("\n===== 힌 트 =====");
			System.out.print("S:");
			for(int i=0; i<s; i++)
			{
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i=0; i<b; i++)
			{	
				System.out.print("○");
			}
			System.out.println("\n================\n");
				
			
			if(s==3)
			{
				System.out.println("★ 게 임 종 료 ★");
				System.out.println(count+"번 만에 맞췄습니다!");
				break;
			}
			
			
			//종료여부 확인
			
		}
		

	//
	}

}
