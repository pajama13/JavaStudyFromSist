/* 

클래스 구성요소
-변수 : 인스턴스 변수(개별) | 클래스 변수(공통)
-메소드 : 기능 수행하는 명령문의 집합 - 로그인, 회원가입, 게시판 목록, 예매, 결제 등
-생성자

상속과 포함의 차이 : 변경해서 사용하는지(상속), 있는 그대로 사용하는지(포함)

메소드 종류
-인스턴스 메소드** : 다른 메모리에 저장 (각자 다르게 동작)
-클래스 메소드(키워드 static) : 메모리에 저장 (공유) -> 한글변환 
-추상 메소드(키워드 abstract) : 선언부만 있음 -> 이벤트 처리, 데이터베이스 처리

메소드 사용 이유
-반복 제거 (코드 간소화)
-가독성 (구조화된 프로그래밍)
-재사용 (수정, 추가) - 오버로딩, 오버라이딩

메소드의 형식


메소드 호출
class ClassName
{
	void aaa(){
	//호출가능한 메소드
	aaa()
	bbb()
	ccc()
	eee()
	} 
	static bbb(){
	ccc()
	} 
	static void ccc(){
	bbb()
	} 
	void eee(){
	}
}

인스턴스메소드 스태틱메소드
객체명 메소드(


 */

import java.util.Scanner;

public class 메소드_1 {

	void aaa()
	{
		eee();
		ccc();
	}
	static void bbb()
	{
		ccc();
		//eee();   클래스메소드에서는 eee()같은 인스턴스메소드 바로 호출 불가, static메소드만 바로 호출 가능
	}
	static void ccc()
	{
		
	}
	void eee()
	{
		
	}
	
	public static void main(String[] args) {


	}

}
