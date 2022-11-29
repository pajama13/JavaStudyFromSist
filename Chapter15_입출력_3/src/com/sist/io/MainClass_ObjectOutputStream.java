package com.sist.io;
import java.io.*;
import java.rmi.StubNotFoundException;
import java.util.*;

//Object~Stream는 빅데이터 저장/분석/마이닝-아파치로그-할 때 많이 사용  
class Student implements Serializable
{
	private int hakbun;
	private String name;
	transient private String subject; //transient 제외하기 (--> 여기서는 직렬화 제외)
	private int kor,math,eng;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public Student(int hakbun, String name, String subject, int kor, int math, int eng) {
		// super(); -->안 써서 지우기?
		this.hakbun = hakbun;
		this.name = name;
		this.subject = subject;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	public Student() {} //디폴트 생성자
}
class School
{
	private static ArrayList<Student> list=new ArrayList<Student>();

//	static
//	{
//		list.add(new Student(1,"홍길동","컴공과",80,90,70));
//		list.add(new Student(2,"홍삼","경영과",90,97,70));
//		list.add(new Student(3,"홍합","컴공과",99,97,70));
//		try
//		{
//			ObjectOutputStream oos=
//					new ObjectOutputStream(new FileOutputStream("c:\\java_data\\student.txt"));
//			oos.writeObject(list);
//			oos.close();
//		}catch(Exception ex){}
//	}
	//메뉴 기능
	public int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("----- 학생관리 메뉴 -----");
		System.out.println("1. 목록보기");
		System.out.println("2. 상세보기");
		System.out.println("3. 검색");
		System.out.println("4. 학생 등록");
		System.out.println("5. 종료");
		System.out.println("----------------------");
		System.out.println("메뉴 선택(1~5) : ");
		return scan.nextInt();
	}
	//학생 저장 기능
	public void studentSave(Student s)
	{
		list.add(s);
		try
		{
			ObjectOutputStream oos=
					new ObjectOutputStream(new FileOutputStream("c:\\java_data\\student.txt"));
			oos.writeObject(list);
			oos.close();
		}catch(Exception ex){}
	}
	//학생 목록 기능
	public ArrayList<Student> studentListData()
	{
		try
		{
			ObjectInputStream ois=
					new ObjectInputStream(new FileInputStream("c:\\java_data\\student.txt"));
			list=(ArrayList<Student>)ois.readObject();
			//컬렉션의 형변환 : 제네릭스까지 포함
			ois.close();
		}catch(Exception ex){}
		return list; //잠시 넣음
	}
	
	//학생상세보기 기능
	public Student studentDetailData(int hakbun)
	{
		Student s=new Student();
		for(Student ss: list)
		{
			if(ss.getHakbun()==hakbun)
			{
				s=ss;
				break;
			}
		}
		return s;
	}
	
	//학생 찾기 기능
	public ArrayList<Student> studentFindData(String name)
	{
		ArrayList<Student> sList=new ArrayList<Student>();
		for(Student ss:list)
		{
			if(ss.getName().contains(name))
			{
				sList.add(ss); //여기는 break 걸면 안 됨 : 여러 명 있을 수 있으니까
			}
		}
		return sList;
	}
	//종료
	public void exit()
	{
		try
		{
			ObjectOutputStream oos=
					new ObjectOutputStream(new FileOutputStream("c:\\java_data\\student.txt"));
			oos.writeObject(list);
			oos.close();  
			System.out.println("저장 완료!");
			
		}catch(Exception ex) {}
	}
	//항상 제어는 파일이 아닌 ArrayList에서 제어하기 --> 종료 시 저장
	public void process()
	{

		while(true)
		{	
			int m=menu();
			switch(m)
			{
				case 1: //목록보기
				{
					ArrayList<Student> sList=studentListData();
					for(Student s:list)
					{
						System.out.println(s.getHakbun()+" "
								+s.getName()+" "
								+s.getKor()+" "
								+s.getEng()+" "
								+s.getMath()+" "
								+(s.getKor()+s.getEng()+s.getMath())+" "
								+String.format("%.2f",(s.getKor()+s.getEng()+s.getMath())/3.0 ));
					}
				}
				break;
				case 2: //상세보기
				{
					Scanner scan=new Scanner(System.in);
					String hak="";
					for(Student s:list)
					{
						hak+=s.getHakbun()+", ";
						
					}
					hak=hak.substring(0,hak.lastIndexOf(","));
					System.out.println(hak+"중에 1개를 선택하세요 : ");
					int i=scan.nextInt();
					Student ss=studentDetailData(i);
					System.out.println("\n--- 상세 보기 ---");
					System.out.println("학번 : "+ss.getHakbun());
					System.out.println("이름 : "+ss.getName());
					System.out.println("국어 : "+ss.getKor());
					System.out.println("영어 : "+ss.getEng());
					System.out.println("수학 : "+ss.getMath());
				}
				break;
				case 3: //검색
				{
					Scanner scan=new Scanner(System.in);
					System.out.println("검색어 입력 : ");
					String name=scan.next();
					ArrayList<Student> sList=studentFindData(name);
					System.out.println("\n--- 검색결과 ---");
					for(Student s:sList)
					{
						System.out.println(s.getHakbun()+" "
								+s.getName()+" "
								+s.getKor()+" "
								+s.getEng()+" "
								+s.getMath()+" "
								+(s.getKor()+s.getEng()+s.getMath())+" "
								+String.format("%.2f",(s.getKor()+s.getEng()+s.getMath())/3.0 ));
					}
				}
				break;
				case 4: //학생등록
				{
					Scanner scan=new Scanner(System.in);
					int max=0;
					// Sequence : 자동 증가번호
					for(Student s:list)
					{
						if(s.getHakbun()>max)
							max=s.getHakbun();
					}
					Student s=new Student();
					s.setHakbun(max+1);
					System.out.print("이름 입력 : ");
					s.setName(scan.next());
					System.out.println("국어 점수 입력 : ");
					s.setKor(scan.nextInt());
					System.out.println("영어 점수 입력 : ");
					s.setEng(scan.nextInt());
					System.out.println("수학 점수 입력 : ");
					s.setMath(scan.nextInt());
					
					studentSave(s);
					
				}
				break;
				case 5:
				{
					exit();
					System.out.println("프로그램 종료");
					System.exit(0);
					
				}
				default:
				{
					System.out.println("해당되는 메뉴가 없습니다.");
				}
			}
		}
	}
}

public class MainClass_ObjectOutputStream {

	public static void main(String[] args) {
		School s=new School();
		s.process();
	}

}
