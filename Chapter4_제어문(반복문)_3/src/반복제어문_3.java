
//컴퓨터 가위바위보 게임
import java.util.Scanner;

public class 반복제어문_3 {

	public static void main(String[] args) {
		
		int win=0, lose=0, same=0; // 이긴, 진, 비긴 횟수
		int count=0; //게임횟수
		
		Scanner scan=new Scanner(System.in);
		
		int i=0;
		while(true)
		{
			int com=(int)(Math.random()*3); //0~2
			System.out.println("[게임시작] 가위(0), 바위(1), 보(2) 중 숫자 1개를 입력하세요! :");
			int user=scan.nextInt();
			
			if(user<0 || user>2) //잘못된 입력
			{
				System.out.println("[알림] 가위(0), 바위(1), 보(2) 중 숫자 1개를 입력하세요! ");
				continue; //처음부터 다시 실행 (while의 조건문으로 이동)
			}
			
			count++; // 게임횟수
			
			//결과값
			if(com==0)
				System.out.println("컴퓨터 : 가위");
			else if(com==1)
				System.out.println("컴퓨터 : 바위");
			else if(com==2)
				System.out.println("컴퓨터 : 보");
			
			if(user==0)
				System.out.println("사용자 : 가위");
			else if(user==1)
				System.out.println("사용자 : 바위");
			else if(user==2)
				System.out.println("사용자 : 보");
			
			//승패확인
			
			System.out.println();
			switch(com-user)
			{
			case -1: case 2:
				System.out.println("[결과] 사용자 승리~!");
				win++; //이긴 횟수
				break;
			case -2: case 1:
				System.out.println("[결과] 컴퓨터 승리~!");
				lose++; //진 횟수
				break;
			case 0:
				System.out.println("[결과] 비김~!");
				same++; //비긴 횟수
			}
			
			System.out.println("[알림] 게임을 종료하고 싶으면 Y를 입력해주세요! ");
			char c=scan.next().charAt(0); //Scanner로 문자 1개 받기
			if(c=='y' || c=='Y')
			{
				System.out.println("---- 게 임 종 료 ----");
			}
			
			//게임 종료 후 결과 안내
			System.out.printf("\n  %d전 %d승 %d무 %d패\n",count,win,same,lose);
			System.out.printf("\n------------------\n");
			System.out.println();
		}
	
		
		
	//	
	}
}
