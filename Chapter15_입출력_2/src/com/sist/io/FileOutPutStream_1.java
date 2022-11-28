package com.sist.io;
import java.io.FileOutputStream;
import java.util.*;
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
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
	
}
public class FileOutPutStream_1 {

	public static void main(String[] args) {
		try
		{
			// w모드 : 파일을 새롭게 생성(파일 갱신, 덮어쓰기)
			// a모드 : 기존의 파일에 추가
			//저장위치 잡기
			FileOutputStream fos=new FileOutputStream("c:\\download\\sawon.txt",true);
			//FileOutputStream fos=new FileOutputStream("c:\\download\\sawon.txt");
			Scanner scan=new Scanner(System.in);
			System.out.println("사번 입력 : ");
			Sawon sa=new Sawon();
			sa.setSabun(scan.nextInt());
			System.out.println("이름 입력 : ");
			sa.setName(scan.next());
			System.out.println("부서 입력 : ");
			sa.setDept(scan.next());
			System.out.println("근무지 입력 : ");
			sa.setLoc(scan.next());
			String save=sa.getSabun()+"|"+sa.getName()+"|"+sa.getDept()+"|"+sa.getLoc()+"\n";
			//저장하기
			//fos.write(save.getBytes()); //문자열을 byte[]로 변환 : getBytes()
			//fos.close();
			System.out.println(Arrays.toString(save.getBytes()));
			System.out.println("사원 저장 완료!!");				
					
			
		}catch(Exception ex){}
	}

}
