package 연습문제;

import java.util.Scanner;

public class 연습문제1026_이중for문 {

	public static void main(String[] args) {

/*---------------------------------
	5.  두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
    출력하는 프로그램을 작성하시오
 */
		
//		Scanner scan=new Scanner(System.in);
//		
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=6; j++) {
//				
//				if(i+j==6)
//					System.out.printf("[%d , %d]",i,j);
//			}
//			System.out.println();
//				
//		}
	
		

/*---------------------------------
 13. 다음 결과를 출력하는 프로그램
 
**********
**********
**********
**********
**********
 */
	
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=10; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
/*---------------------------------
	14. 다음 결과를 출력하는 프로그램
11111
22222
33333
44444
55555
 */
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++)
//			{
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
		
/*---------------------------------
	16.

12345
12345
12345
12345
12345
 */

//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
/*---------------------------------	
    ★
   ★★
  ★★★
 ★★★★
★★★★★

i j
1 5
2 4,5
3 3,4,5
 */

		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
/*---------------------------------
★★★★
 ★★★
  ★★
   ★

i  j(공백) 별
1  0      4
2  1      3
3  2      2
4  3      1

 */
		
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=i-1; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=5-i; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
/*---------------------------------		

   *
  ***
 *****
*******

 */
//		System.out.println();
//		
//		
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=4-i; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i*2-1; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 뒤에 것부터 가져오기. 거꾸로 가져오기
		
		String msg="Hello Java";
		System.out.println(msg);
		for(int i=msg.length()-1; i>=0; i--)
		{
			System.out.print(msg.charAt(i));
		}
		System.out.println();
		
	//
	}

}
