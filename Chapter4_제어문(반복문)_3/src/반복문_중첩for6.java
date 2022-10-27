import java.util.Scanner;

/*------------------------------------------------------------

aBCDE
AbCDE
ABcDE
ABCdE
ABCDe

*/

public class 반복문_중첩for6 {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++)
		{
			char c='A';
			for(int j=1; j<=5; j++)
			{
				if(i==j)
				{
					System.out.print((char)(c+32));
				}
				else
				{
					System.out.print(c);
				}
				c++;
			}
			System.out.println();
		}
		
		
/*------------------------------------------------------------

 */		
		// 사용자에게 2~12사이 입력값을 받은 후, 2개의 주사위를 던져 나온 합이 입력값과 같도록 출력하기 
//		Scanner scan=new Scanner(System.in);
//		System.out.println("2~12 사이 정수를 입력해주세요 :");
//		int sum=scan.nextInt();
//		
//		for(int i=1; i<=6; i++) // 첫번째 주사위
//		{
//			for(int j=1; j<=6; j++) // 두번째 주사위
//			{
//				if(i+j==sum)
//				{
//					System.out.printf("[%d , %d]\n",i,j);
//				}
//			}
//		}

		
/*------------------------------------------------------------

 */
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=5; j++)
//			{	if(i==j)
//					System.out.print(i);
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
		
	//
	}

}
