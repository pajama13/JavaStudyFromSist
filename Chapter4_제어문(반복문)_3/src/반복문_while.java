import java.util.Scanner;

public class 반복문_while {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("금액을 입력해주세요(56789):");
		
		int won=scan.nextInt();
		int a=won/10000;
		int b=(won%10000)/1000;
		int c=(won%1000)/100;
		int d=(won%100)/10;
		int e=won%10;
		
		System.out.println("만원:"+a);
		System.out.println("천원:"+b);
		System.out.println("백원:"+c);
		System.out.println("십원:"+d);
		System.out.println("일원:"+e);
	
	//
	}
}
