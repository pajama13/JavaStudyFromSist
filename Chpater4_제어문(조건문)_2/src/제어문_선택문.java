/*

A 90~100
B 80~89
C 70~79
D 60~69
F 0~59

 */

import java.util.Scanner;

public class 제어문_선택문 {

	public static void main(String[] args) {

	//3개의 정수
	Scanner scan=new Scanner(System.in);
	System.out.println("국어/영어/수학 점수 입력(띄어쓰기로 구분하여 입력):");
	
	//과목별 점수 입력 받기
	int kor=scan.nextInt();
	int eng=scan.nextInt();
	int math=scan.nextInt();
	
	//총점과 평균
	int total=kor+eng+math;
	double avg=total/3.0;
	
	//학점 초기화(char는 초기화 시 ' '와 같이 공백줘야함)
	char grade=' ';
	switch((int)avg/10) { // switch에는 문자/문자열/정수만 들어갈 수 있어서 int로 바꿔주기
	
		// if(avg==10 || avg==9)
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';
		
	}
	
	System.out.println("국어:"+kor);
	System.out.println("영어:"+eng);
	System.out.println("수학:"+math);
	System.out.println("총점:"+total);
	System.out.printf("평균:%.2f\n",avg);
	System.out.println("학점:"+grade);

	
	}
}
