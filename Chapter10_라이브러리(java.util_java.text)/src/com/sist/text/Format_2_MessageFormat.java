package com.sist.text;

import java.text.MessageFormat;

public class Format_2_MessageFormat {

	public static void main(String[] args) {
		//예제1
//		//메세지 형식 만들기
//		String msg="이름:{0}\n성별:{1}\n나이:{2}\n";
//		//형식 안에 여러 데이터형이 섞여있어서 Object[] 배열 이용
//		Object[] obj={"홍길동","남자",25};
//		System.out.println(MessageFormat.format(msg, obj));
		
		//예제2
		String name="이순신";
		String sex="남자";
		String addr="서울";
		String tel="010-1111-1111";
		int age=26;
		String post="100-222";
		String email="lee@co.kr";
		
		String sql="INSERT INTO member VALUES('"+name+"','"+sex+"','"+addr+"'+'"+tel+"','"+age+"'+'"+post+"'+'"+email+"')";
		System.out.println(sql);
		
		String msg2="INSERT INTO member VALUES(''{0}'',''{1}'',''{2}'',''{3}'',''{4}'',''{5}'',''{6}'')";
		Object[] obj={name,sex,addr,tel,age,post,email};
		System.out.println(MessageFormat.format(msg2, obj));
		
		name="이순신";
		sex="남자";
		addr="서울";
		tel="010-1111-1111";
		age=26;
		post="100-222";
		email="lee@co.kr";
		Object[] obj2={name,sex,addr,tel,age,post,email};
		String msg3="INSERT INTO member VALUES({0},{1},{2},{3},{4},{5},{6})";
		System.out.println(MessageFormat.format(msg3, obj2)); 
	}

}
