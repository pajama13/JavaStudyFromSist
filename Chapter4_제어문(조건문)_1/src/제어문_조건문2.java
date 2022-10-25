/*

조건식 작성 예시
 1) 90 이상 ~ 100이하
    num>=90 && num<=100
 2) 0보다 작고 100보다 큼
    num<0 || num>100
 3) y인지 Y인지
 	num=='y' || num=='Y' (비교연산자 : 정수, 실수, 논리, 문자)
	문자열 (equals) -> id, pwd(로그인 처리)
	
단일조건문은 중복적으로 처리할 때 자주 사용
if문 많이 사용하면 속도가 느려짐(빠져나가게 해줘야 함)

 */

import java.util.Scanner;

// 국어, 영어, 수학 점수 3개 정수를 받아 평균, 총점, 학점 구하는 프로그램
// 90 이상 A, 80 이상 B, 70 이상 C, 60 이상 D, 그 이하는 F

public class 제어문_조건문2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("국어,영어,수학 입력(각각 입력 후 스페이스):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		// 총점
		int total=kor+eng+math;
		// 평균
		double avg=total/3.0;
		
		// 결과 출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		
		
		// 학점 출력
		char c='A';
		if(avg>=90 && avg<=100) 
			c='A';
		if(avg>=80 && avg<90) 
			c='B';
		
		if(avg>=70 && avg<80) 
			c='C';
		
		if(avg>=60 && avg<70) 
			c='D';
		
		if(avg<60) 
			c='F';
		
		
		System.out.println("학점:"+c);
		
		scan.close();
	}

}
