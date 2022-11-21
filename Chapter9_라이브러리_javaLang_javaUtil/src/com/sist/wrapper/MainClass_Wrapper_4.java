/*



*/


package com.sist.wrapper;

public class MainClass_Wrapper_4 {

	public static void main(String[] args) {
		Double d=10.5; //박싱 (클래스에 주소값이 아닌 기본형 데이터값을 대입)
		double d2=d; //언박싱 (기본형에 클래스형을 대입)
		//메소드가 필요할 때 Double double 혼합해서 사용 가능
		System.out.println("d="+d);
		System.out.println("d2="+d2);
		String s="100.05";
		double d3=Double.parseDouble(s);
		System.out.println("d3="+d3);
		String s1="true";
		boolean b=Boolean.parseBoolean(s1);
		System.out.println(s1);
		//데이터는 오라클에 저장(영구저장) - 데이터 공유 역할
		
	}

}
