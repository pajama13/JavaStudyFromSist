package 연습문제복습;

import java.util.Scanner;

public class 제어문연습문제_1025 {

	public static void main(String[] args) {

/*------------------------------------------------------
	5) 100점 만점으로 성적을 입력 받아 90~100이면 A,
		80~89이면 B,70~79이면 C, 60~69이면 D,
    	60점 이하면 F를 출력하라 (다중 if 사용)

 */
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("성적을 입력하세요:");
//		int score=scan.nextInt();
//		char grade=' ';
//		
//		if(score>=0 && score<=100) {
//			if(score>=90 && score<=100) {
//				grade='A';
//				System.out.printf("성적 : %d / 학점 : %c\n",score, grade);
//			}else if(score>=80 && score<=89) {
//				grade='B';
//				System.out.printf("성적 : %d / 학점 : %c\n",score, grade);
//			}else if(score>=70 && score<=79) {
//				grade='C';
//				System.out.printf("성적 : %d / 학점 : %c\n",score, grade);
//			}else if(score>=60 && score<=69) {
//				grade='D';
//				System.out.printf("성적 : %d / 학점 : %c\n",score, grade);
//			}else {
//				grade='F';
//				System.out.printf("성적 : %d / 학점 : %c\n",score, grade);
//			}
//		}else {
//			System.out.println("[알림] 잘못된 입력입니다. 1~100 사이 값을 입력해주세요.");
//		}
		
		
/*------------------------------------------------------
		6)100점 만점으로 성적을 입력 받아 90~100이면 A,
		  80~89이면 B,70~79이면 C, 60~69이면 D,
   		  60점 이하면 F를 출력하라 (switch~case 사용)

 */
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("성적을 입력하세요(성적범위:1~100):");
//		
//		int score=scan.nextInt();
//		char grade=' ';
//		
//		if(score>=0 && score<=100) {
//			switch(score/10) {
//				case 9: case 10:
//					grade='A';
//					System.out.printf("성적:%d / 학점:%c",score,grade);
//					break;
//				case 8:
//					grade='B';
//					System.out.printf("성적:%d / 학점:%c",score,grade);
//					break;
//				case 7:
//					grade='C';
//					System.out.printf("성적:%d / 학점:%c",score,grade);
//					break;
//				case 6:
//					grade='D';
//					System.out.printf("성적:%d / 학점:%c",score,grade);
//					break;
//				default:
//					grade='F';
//					System.out.printf("성적:%d / 학점:%c",score,grade);
//					break;
//			}
//		}else {
//			System.out.println("[알림] 잘못된 입력입니다. 1~100 사이 값을 입력해주세요.");
//		}

/*------------------------------------------------------
		7)정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 
   		  (switch~case 사용) 

 */
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 2개를 입력하세요(띄어쓰기로 구분, 입력가능범위 1~100):");
//		
//		int num1=scan.nextInt();
//		int num2=scan.nextInt();
//		
//		System.out.println("사칙연산자 +,-,*,/ 중 1개를 입력하세요:");
//		
//		if( (num1>=1 && num1<=100)&&(num2>=1 && num2<=100)  ) {
//		switch(scan.next()) {
//			case "+":
//				System.out.printf("%d+%d=%d",num1,num2,num1+num2);
//				break;
//			case "-":
//				System.out.printf("%d-%d=%d",num1,num2,num1-num2);
//				break;
//			case "*":
//				System.out.printf("%d*%d=%d",num1,num2,num1*num2);
//				break;
//			case "/":
//				System.out.printf("%d/%d=%.2fd",num1,num2,num1/num2);
//				break;
//		}
//		}else {
//			System.out.println("[알림] 1~100 사이 정수를 입력해주세요!");
//		}
		
		
/*------------------------------------------------------
		8) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
*/
//		int sum=0;
//		
//		for(int i=2; i<=100; i+=2) {
//			sum+=i;
//		}
//		System.out.println("2+4+6+....100까지의 정수의 합:"+sum);
		
/*------------------------------------------------------
		9) 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)
*/

//		for(int i=5; i<=50; i+=5) {
//			System.out.print(i+" ");
//		}
		
/*------------------------------------------------------
		10) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
*/
		
//		for(char c='B'; c<='N'; c+=2) {
//				System.out.print(c+" ");
//		}		
		
/*------------------------------------------------------
		11) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
*/

//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 1개를 입력하세요.(입력가능범위 1~100):");
//		
//		int num=scan.nextInt();
//		
//		int sum=0;
//		
//		for(int i=0; i<=num; i++) {
//			sum+=i;
//		}
//		System.out.println("1부터 입력 받은 정수까지의 합:"+sum);
		
/*------------------------------------------------------
		12) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
*/
//		for(int i=1; i<=30; i++){
//			if(i%2==0) {
//				System.out.printf("%-5d ",i);
//				if(i%6==0)
//					System.out.println();
//			}
//		}
		
/*------------------------------------------------------
		13) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라
*/
//		int sum=0;
//		
//		for(int i=1; i<=10; i++){
//			if(i%2==0)
//				sum-=i;
//			else
//				sum+=i;
//		}
//		System.out.println("1-2+3-4+5-6+7-8+9-10 계산 값:"+sum);
		
		
/*------------------------------------------------------
		14) 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
		
		**continue : 조건이 맞는 현재를 중단하는 것. 조건이 맞는 것 빼고 진행. (break는 전체를 중단하는 것)
*/
		
//		for(int i=1; i<=10; i++) {
//			if(i%3!=0)
//				System.out.print(i+" ");
//				continue;
//		}

		
/*------------------------------------------------------
		15)	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
			십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

*/
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("10~99 사이 두 자리의 정수를 입력하시오:");
//		
//		int num=scan.nextInt();
//		
//		int a=num/10;
//		int b=num%10;
//		
//		if(a==b)
//			System.out.println(num+": 10의 자리 수와 1의 자리 수는 서로 같은 숫자입니다.");
//		else
//			System.out.println(num+": 10의 자리 수와 1의 자리 수는 서로 다른 숫자입니다.");
	

/*
		16)숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을,
		   12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라.
		   if-else 문과 switch 둘 다 이용해 볼 것.
*/	
		
		//switch는 pass함(다른 예제에 있음)
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("계절을 확인하고 싶은 월을 입력해주세요:");
//		
//		int month=scan.nextInt();
//		
//		if(month>=1 && month<=12) {
//		if(month>=3 && month<=5)
//			System.out.println(month+"월의 계절은 봄입니다.");
//		else if(month>=6 && month<=8)
//			System.out.println(month+"월의 계절은 여름입니다.");
//		else if(month>=9 && month<=11)
//			System.out.println(month+"월의 계절은 가을입니다.");
//		else
//			System.out.println(month+"월의 계절은 겨울입니다.");
//		}else{
//			System.out.println("[알림] 잘못된 입력입니다. 1~12 사이 값을 입력해주세요!");
//		}
		
		
	}
}
