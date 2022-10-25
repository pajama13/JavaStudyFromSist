/*

[다중조건문] 141p
-여러 조건문 중 해당되는 1개만 수행 후 빠져나감
-형식 :
 if(조건){조건 true면 수행 후 종료} else if(조건){조건 true면 수행 후 종료}else(){}
 (마지막 else는 생략 가능)


여러 개 동시 출력 -> 단일 조건문 사용 : ex  1~100까지의 정수 중 3, 5, 7의 배수를 출력하기
1개만 출력 -> 다중 조건문 사용 : ex 키보드 입력에 따른 출력


 */

public class 제어문_다중조건문1 {

	public static void main(String[] args) {

		//0~100 사이의 정수 랜덤 출력
		int kor=(int)(Math.random()*51)+50; //50점 기본점수 주기
		int eng=(int)(Math.random()*51)+50;
		int math=(int)(Math.random()*51)+50;
		
		int avg=(kor+eng+math)/3; //출력할 땐 double로 해야 함
		
		char hakjum='A';
		
		if(avg>=90)
			hakjum='A';
		else if(avg>=80)
			hakjum='B';
		else if(avg>=70)
			hakjum='C';
		else if(avg>=60)
			hakjum='D';
		else
			hakjum='F';
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("학점:"+hakjum);
		
		
		
	}
}
