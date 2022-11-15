/*
클래스 종류
*일반 클래스
  [접근지정어] class 클래스명
  {
    멤버변수
    메소드
    생성자
  }
*추상클래스
  [접근지정어] abstract class 클래스명
  {
    멤버변수
    추상메소드(구현부 없는 미완성 메소드) --> 공통 적용 (구현 내용을 다르게 작성)
    메소드(구현부 있는 메소드) --> 선택 적용 (필요하면 가져다쓰기)
  }
*인터페이스**
  *추상클래스의 단점을 보완 : 다중 상속 가능**
  *기타
    *용도 : 스프링 (인터페이스 기반), 마이바티스, JPA
    *JDK1.5 이상부터 구현된 메소드가 등장 - 필요한 클래스에서만 오버라이딩
  *형식 
    public interface 인터페이스명
    {
      -상수형 변수**(인스턴스변수는 메모리 할당 불가하므로 X)
      -추상메소드
       void display();
       public abstract void display();
      -구현된 메소드(default)
       default void display()
       {}
       public default void display)
       {}
      -구현된 메소드(static) - 원래 앞에 public 있음
       static void display()
       {}
    }
  *인터페이스 단점 : 미완성 상태로 메모리 할당 불가(저장 불가) --> 상속 받아서 구현 처ㅣ
   interface --> class
          implements
   interface --> interface
           extends
*내부클래스
*종단클래스


*/

package com.sist.main;

public class MainClass_인터페이스 {

	public static void main(String[] args) {

	}

}
