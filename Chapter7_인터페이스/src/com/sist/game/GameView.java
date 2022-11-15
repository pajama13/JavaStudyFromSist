package com.sist.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

//상속 받기
public class GameView extends JPanel{
	private Image back;
	private Image avata;
	int x=150; //private 이므로 직접 접근 어려우므로 게터세터 이용하기(캡슐화)
	int y=50;
	


	//초기화 - 생성자 이용
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("C:\\공유자료\\javaDev\\back.gif");
		avata=Toolkit.getDefaultToolkit().getImage("C:\\공유자료\\javaDev\\my_00.png");
	}
	public void setImage(String name) // 메소드 통해 image 접근
	{
		avata=Toolkit.getDefaultToolkit().getImage("C:\\공유자료\\javaDev\\"+name+".png");
	}

	//윈도우에 그림 그리기
	@Override
	public void paint(Graphics g)
	{
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this); //크기 그대로
		g.drawImage(avata, x, y, this); //지정된 크기로
	}
	

}
