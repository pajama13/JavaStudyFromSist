/*

클래스를 메모리에 저장하는 방법
저장된 데이터를 읽는 방법
 
 */

//학생 관련 데이터 모으기
class Student{
	int hakbun;
	String name;
	String sex;
	int age;
	int kor, eng, math;
}

public class 객체지향프로그램_2 {

	public static void main(String[] args) {
		//1. 저장
		Student hong=new Student(); //new 1개 - 새 메모리 1개 생성
		System.out.println("hong="+hong); // 메모리주소 출력
		hong.hakbun=1; //초기값 저장
		hong.name="홍합";
		hong.sex="남자";
		hong.age=25;
		hong.kor=90;
		hong.eng=80;
		hong.math=70;
		
		Student lee=new Student();
		System.out.println("lee="+lee);
		lee.hakbun=2; //초기값 저장
		lee.name="이삭";
		lee.sex="남자";
		lee.age=25;
		lee.kor=95;
		lee.eng=99;
		lee.math=55;
		
		Student kim=new Student();
		System.out.println("kim="+kim);
		kim.hakbun=3; //초기값 저장
		kim.name="김밥";
		kim.sex="여자";
		kim.age=26;
		kim.kor=85;
		kim.eng=99;
		kim.math=100;
		
		//출력 (클래스 내 변수 읽어오기)
		System.out.println("이름 : "+hong.name);
		System.out.println("이름 : "+lee.name);
		System.out.println("이름 : "+kim.name);
	}

}
