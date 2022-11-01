import java.util.Arrays;
import java.util.Scanner;

/*

O, X 둘 중 하나를 10개 저장, O와 X개수 구하기

 */

public class 배열_4_OX게임 {
	public static void main(String[] args) {
	
		char[] ox=new char[10];
		char[] user=new char[10];
		
		for(int i=0; i<ox.length; i++)
		{
			int a=(int)(Math.random()*2); //0,1
			if(a==0)
				ox[i]='O';
			else
				ox[i]='X';
		}
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<user.length; i++)
		{
			System.out.print((i+1)+"번째) O 또는 X를 입력하세요:");
			char dap=scan.next().charAt(0);
			if(!((dap=='O')||(dap=='X')))
			{
				System.out.println("잘못된 입력입니다! O 또는 X를 입력하세요:");
				i--; //중요
				continue; // 이전 i로 돌아가기
			}
			user[i]=dap;
		}
		
		System.out.println("ox="+Arrays.toString(ox));
		System.out.println("user="+Arrays.toString(user));
		
		int count=0;
		for(int i=0; i<user.length; i++)
		{
			if(ox[i]==user[i])
				count++;
		}
		
		System.out.println("user 정답:"+count);
		
	//
	}
}
