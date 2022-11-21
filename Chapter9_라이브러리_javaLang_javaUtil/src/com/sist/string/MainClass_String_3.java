package com.sist.string;
//format --> printf()

public class MainClass_String_3 {

	public static void main(String[] args) {
		//시간 처리 --> 원하는 형식으로 변경 (웹 : System.out.printf()가 존재하지 않아 대신 사용)
		int a=10;
		int b=20;
		String temp=String.format("%d + %d = %d", a,b,a+b);
		System.out.println(temp);
		
		//문자열을 +로 결합 시 메모리 누수가 계속 생겨 처리속도가 느려짐(결합전 메모리가 남고 결합후 메모리가 생김) -->StringBuffer로 해결(문자를 결합하는데 메모리는 계속 1개)
		
	}

}
