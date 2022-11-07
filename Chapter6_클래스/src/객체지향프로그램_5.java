/*

234p   
   

 */

class Sawon{
	int sabun;
	String name;
	String dept;
	String job;
	long pay;
}

public class 객체지향프로그램_5 {
	
	public static void main(String[] args) {
		
		//사원 3명 필요
		Sawon s1=new Sawon(); //s1에 sabun~pay를 저장할 메모리가 생성됨
		s1.sabun=1;
		s1.name="홍합";
		s1.dept="개발부";
		s1.job="대리";
		s1.pay=3800;
		
		Sawon s2=new Sawon();
		s2.sabun=2;
		s2.name="이삭";
		s2.dept="개발부";
		s2.job="대리";
		s2.pay=3800;
		
		Sawon s3=new Sawon();
		s3.sabun=3;
		s3.name="김밥";
		s3.dept="개발부";
		s3.job="대리";
		s3.pay=3800;
		
	}
}
