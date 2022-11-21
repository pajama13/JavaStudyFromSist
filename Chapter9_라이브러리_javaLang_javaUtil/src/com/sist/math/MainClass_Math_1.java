/*

Math : 기본적인 수학 계산에 필요한 라이브러리
*웹은 수학 계싼이 거의 없다 (오라클)
*주요 메소드(웹 관련) - 주로 static 메소드여서 객체생성 불요
-public static double random() : 0.0~0.99 사이 임의의 숫자 추출
-ceil() : 올림 --> 페이지 나누기에 사용
-round() : 반올림 --> 평균(소수점 올리기)
--참고 : 자동 반올림 : printf("%.2f",)
 
*/

package com.sist.math;
import static java.lang.Math.round;
import static java.lang.Math.ceil;
import static java.lang.Math.random;
public class MainClass_Math_1 {

	public static void main(String[] args) {
		System.out.printf("%.2f\n",87.555);
		System.out.println(round(87.555));
		System.out.println(ceil(87.01));
		System.out.println((int)(random()*100));
//		System.out.println(Math.round(87.555)); //import 따로 안 했으면 Math.메소드()로 써주기
//		System.out.println(Math.ceil(87.01));
//		System.out.println((int)(Math.random()*100));
	}

}
