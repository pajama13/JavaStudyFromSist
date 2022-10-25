/*

[반복문]
-같은 형태가 반복되는 경우 사용하는 제어문
-종류 : for / while / do~while
  -for문 : 보통 반복 횟수가 지정되어 있을 때 사용
  	
  	사용예시 : 웹사이트 화면 출력할 때 많이 씀(ex  영화소개 사이트에 1~10순위 영화 정보 가져오기)
  	
  	*일반 for문 형식
  	for(초기값; 조건식; 증감식){
  	반복 수행 문장
  	}
  	
  	*for each 형식
  	for(int 변수:배열이름) -> 배열에 있는 원소 하나씩 변수에 담을 때까지 반복
 
  -while : 보통 반복횟수가 없는 경우
  	형식 : 
  	while(조건식){
  	수행문장
  	증감식
  	}
  -do~while : 
  	반복 수행 문장 먼저 나오고 조건이 나중에 나옴,
  	1번 이상 반드시 수행할 때 사용(for문, while문은 1번도 수행 안 할 수 있음)
  	
	형식 :
	do{
	실행문장
	증가식
	}while(조건식)


A~Z까지 반복하는 for문 : for(char c='A'; char c<='Z'; c++){}


**무한루프 for(;;)


반복문 증감식은 다양하게 쓸 수 있음 : i++, i+=2 등


반복문에 나오는 변수 종류
1. 루프변수 : i, j
2. 누적변수 : sum -> 0으로 초기화 후 sum+=i (조회수 표현 등에 사용)
3. flag변수 : 1111

 */


public class 제어문_반복문1 {

	public static void main(String[] args) {

		//구구단
//		int dan=(int)(Math.random()*8)+2; //0.0~7.9+2 -> 2~9
//		
//		System.out.println(dan+"단");
//		
//		for(int i=1; i<=9; i++) {
//			System.out.printf("%2d*%2d=%2d\n",dan,i,dan*1);
//			System.out.println(dan+"*"+i+"="+dan+i);
//		}
		
		
//		for(int i=1; i<=10; i++) {
//			if(i%2==0) {
//				System.out.println(i+" ");
//			}
//		}
		
//		System.out.println();
//		for(int i=2; i<=10; i+=2) {
//			System.out.println(i+"");
//		}
		
		
	}
}
