/*

단어별로 구분할 때 쓰는 메소드 : split(), StringTokenizer, Regex


*/
package com.sist.util;

import java.util.StringTokenizer;

public class MainClass_StringTokenizer_2 {

	public static void main(String[] args) {
		//채팅방
		String[] data= {
			"100|hong|남자|대기실",
			"200|자바방|5|공개",
			"210|자바방|hong",
			"300|hong|shim|Hi~",
			"400|hong"
		};
		
		for(String msg:data)
		{
			StringTokenizer st=new StringTokenizer(msg,"\\|");
			int protocol=Integer.parseInt(st.nextToken()); 
			switch(protocol)
			{
			case 100:
				{
					System.out.println("문자열:"+st.countTokens());
					String id=st.nextToken();
					String sex=st.nextToken();
					String loc=st.nextToken();
					System.out.println(id+"님이 "+loc+"에 입장하셨습니다!");
				}
				break;
			case 200:
				{
					System.out.println("문자열:"+st.countTokens());
					String rName=st.nextToken();
					String rInwon=st.nextToken();
					String rState=st.nextToken();
					System.out.println("방이름 : "+rName+" / 인원 : "+rInwon+" / "+rState+"입니다.");
				}
				break;
			case 300:
				{
					System.out.println("문자열:"+st.countTokens());
					String myId=st.nextToken();
					String youId=st.nextToken();
					String m=st.nextToken();
					System.out.println(myId+"님이 "+youId+"님께 쪽지를 전송했습니다 : "+m);
				}
				break;
			case 400:
				{
					System.out.println("문자열:"+st.countTokens());
					String id=st.nextToken();
					System.out.println(id+"님이 퇴장하셨습니다...");
				}
			}
		}
	}

}
