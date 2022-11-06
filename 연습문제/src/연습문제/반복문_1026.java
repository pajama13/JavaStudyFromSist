package 연습문제;

import java.util.Scanner;

public class 반복문_1026 {

	
	
	public static void main(String[] args) {

/*---------------------------------------------------
	1.  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)

 */
//		int x;
//		
//		if(x>10 && x<20)

/*---------------------------------------------------
	2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성

 */
//		char ch;
//		
//		if(ch==' ' && ???)
		
/*---------------------------------------------------
	3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성

*/		
		
//		char ch;
//		
//		if(ch=='x' || ch=='X')

/*---------------------------------------------------			
	4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성

*/

//		char ch;
//		
//		if(ch>=0 && ch<=9)
			

/*---------------------------------------------------			
	5.  두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
    출력하는 프로그램을 작성하시오

*/
		
//		for(int i=1; i<=5; i++) {
//			
//			int dice1=i;
//			int dice2=6-dice1;
//			
//			System.out.println("dice1:"+dice1+" / dice2:"+dice2);
//		}

		
/*---------------------------------------------------			
	6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
	   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
*/
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 a와 a보다 큰 정수 b를 입력해주세요^-^:");
//		
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		
//		int x=1;
//		
//		for(int i=a; i<=b; i++) {
//			x*=i;
//		}
//		System.out.println(x);
		
		//while 사용
		
//		Scanner scan=new Scanner(System.in);
//		int start=0, end=0;
//		int gop=1;
//		
//		while(true)
//		{
//			System.out.println("시작 입력:");
//			start=scan.nextInt();
//			System.out.println("끝 입력:");
//			end=scan.nextInt();
//			
//			if(start<end)
//				break;
//		}

/*---------------------------------------------------			
	7.  5~16까지의 합을 구하시오
*/
//		int sum=0;
//		
//		for(int i=5; i<=16; i++) {
//			sum+=i;
//		}
//		System.out.println("5~16까지의 합:"+sum);
		

/*---------------------------------------------------			
	8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
*/
//		int sum=0;
//		
//		for(int i=3; i<=4462; i++) {
//		
//			if(i%2==0)
//				sum+=i;
//		}
//		System.out.println("3이상 4462 이하에서 짝수인 정수의 합:"+sum);
		
/*---------------------------------------------------			
	9. 0~12까지 2의 배수, 3의 배수의 합을 각각 구하여라.
*/
//		int sum1=0;
//		int sum2=0;
//		
//		for(int i=0; i<=12; i++) {
//			
//			if(i%2==0)
//				sum1+=i;
//			
//			if(i%3==0)    //겹치는 6의 배수를 빼려면 else if로 바꿔주면 됨
//				sum2+=i;
//			
//			
//		}
//		
//		System.out.println("0~12까지 2의 배수, 3의 배수의 합:"+(sum1+sum2));
		
/*---------------------------------------------------			
	10. 1~100까지의 정수 중 4의 배수의 합계를 구하라
*/
//		int sum=0;
//		
//		for(int i=1; i<=100; i++) {
//			if(i%4==0)
//				sum+=i;
//		}
//		System.out.println("1~100까지의 정수 중 4의 배수의 합계:"+sum);
	
		
/*---------------------------------------------------			
	11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지
		출력하는 프로그램 작성
	

*/		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("10개의 정수 입력:");
//
//		int count=0;
//		
//		for(int i=1; i<=10; i++) {
//			int a=scan.nextInt();
//			
//			if(a%2==0)
//			{
//				System.out.println(i+"번째 정수:"+a);
//				a=1;
//				count+=a;
//			}
//		}
//		System.out.println("10개의 정수 중 짝수들의 합:"+count);
		
		
/*-----------------------------------------------------
	12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를
		각각 출력하는 프로그램
*/
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("10개의 정수 입력:");
//		
//		int count3=0, count5=0;
//		
//		for(int i=1; i<=10; i++) 
//		{
//			int num=scan.nextInt();
//			
//					
//			if(num%3==0)
//			{
//				System.out.println(i+"번째 입력값 "+num+" : 3의 배수");
//				count3++
//			}
//			
//			if(num%5==0)
//			{
//				System.out.println(i+"번째 입력값 "+num+" : 5의 배수");
//				count5++
//			}
//			
//		}
//		System.out.println("----------------------");
//		System.out.println("3의 배수 개수:"+count3+" / 5의 배수 개수:"+count5);
		
		
		
	//
	}
}