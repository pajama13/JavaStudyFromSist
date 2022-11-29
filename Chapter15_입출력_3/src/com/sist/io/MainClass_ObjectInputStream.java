/*

IO (InputStream, OutputStream)
입출력
 *메모리 입출력
  System.in / System.out
  BufferedReader
 *파일 입출력 - 웹에서 많이 사용
  FileInputStream / FileOutputStream
  FileReader / FileWriter - 한글
  ObjectInputStream / ObjectOutputStream
  
  -보조스트림
   BufferedInputStream / BufferedOutputStream
   BufferedReader / BufferedWriter
   
   Input/OutputStream --> 바이트스트림 : 1바이트 단위로 읽기/쓰기 (한글 깨짐)
   Reader/Writer --> 문자스트림 : 2바이트 단위로 읽기/쓰기 (한글 포함)
 *네트워크 입출력
  단점 : 전송 시 1바이트씩 전송 (OutputStream), 받아서 읽을 때 2바이트씩 읽음(Reader 이용)
  
  객체단위 데이터 입출력
  입력 : ObjectInputStream
  출력 : ObjectOutputStream
  직렬화 / 역직렬화 **


*/

package com.sist.io;
import java.util.*;
import java.io.*;
class Sawon implements Serializable // Serializable 직렬화 (배열화)
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private String job;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Sawon(int sabun, String name, String dept, String loc, String job) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.job = job;
	}
	public Sawon() {} //디폴트 생성자
}
public class MainClass_ObjectInputStream {

	public static void main(String[] args) {
//		ArrayList<Sawon> list=new ArrayList<Sawon>();
//		list.add(new Sawon(1,"홍삼","개발부","서울","대리"));
//		list.add(new Sawon(2,"홍건적","개발부","인천","부장"));
//		list.add(new Sawon(3,"홍합","총무부","함양","대리"));
//		list.add(new Sawon(4,"홍길동","기획부","전주","사원"));
//		list.add(new Sawon(5,"홍수","재무부","부산","과장"));
//		
//		try
//		{
//			//데이터 저장 : 파일 저장은 FileOutputStream으로
//			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:\\java_data\\sawon.txt"));
//			oos.writeObject(list);
//			oos.close();
//			System.out.println("파일 저장 완료!");
//		}catch(Exception ex){}
		
		//데이터 읽기 (어레이리스트로 값 저장 후 어레이리스트로 값 읽기)
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		try
		{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("c:\\java_data\\sawon.txt"));
			list=(ArrayList<Sawon>)ois.readObject();
			ois.close();
			
			//출력
			for(Sawon s:list)
			{
				System.out.println(s.getSabun()+" "
						+s.getName()+" "
						+s.getDept()+" "
						+s.getLoc()+" "
						+s.getJob());
			}
		}catch(Exception ex) {}
	}

}
