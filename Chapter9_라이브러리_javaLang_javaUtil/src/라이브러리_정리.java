/*

라이브러리 내 메소드 원형(메소드명, 기능, 리턴형, 매개변수)은 암기해야 함

java.lang
*Object
  Object : 최상위 클래스 (모든 클래스에 상속 내리는 클래스), 최상위 데이터형
  -Object[] obj={};
  -소멸자 (메모리 해제) : finalize() : 가비지컬렉터가 호출
    원형) protected void finalize()
  -복제 : 값 그대로 새로운 메모리 생성 : clone() : prototype
    원형) protected Object clone()
  -객체비교 : equals() : 주소값 비교 (기본형은 ==으로 비교, 참조형은 equals로 비교)
    원형) public boolean equals(Object obj)
  -문자열 변환
    A a=new A(); --> System.out.println(a) --> a.toString()
    원형) public String toString()
*String : 문자열 저장
  문자열 저장 방식
  -String s="";  //문자열 주소 얻는 방식
  -String s=new String(""); //새로운 메모리에 문자열 저장하는 방식
  -참조변수인데 기본형식 취급받는다는 단점이 있음
*StringBuffer
*Wrapper
*System
*Math

java.util
*StringTokenizer
*Scanner

java.util.regex
*Pattern
*Matcher



*/
public class 라이브러리_정리 {

	public static void main(String[] args) {

	}

}
