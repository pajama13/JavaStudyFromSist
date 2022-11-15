package com.sist.game;
interface 동물{
	void eat(); //public abstract 가 생략돼있음
	void run();
	default void aaa() // 구현된 메소드를 필요한 곳에 가져다쓰기
	{
		
	}
}
class 말 implements 동물
{
	public void eat()
	{
		
	}
	public void run()
	{
		
	}
	public void aaa()
	{
		
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
