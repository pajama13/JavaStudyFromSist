
package com.sist.game;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

//다중 상속 - interface는 원하는 만큼 갖다 쓸 수 있음
public class GameMain extends JFrame implements KeyListener,MouseListener,MouseMotionListener,Runnable{
	private GameView gv=new GameView(); //포함클래스
	public GameMain() //생성자
	{
		add("Center",gv);
		setSize(1024,900);
		setVisible(true);
		addKeyListener(this);
		gv.setFocusable(true);
		gv.addMouseListener(this);
		gv.addMouseMotionListener(this);
	}
	public static void main(String[] args) {
		new GameMain();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	public void change()
	{
		for(int i=0; i<8;i++)
		{
			try
			{
				gv.setImage("my_0"+i);
				Thread.sleep(5);
				
			}catch(Exception ex) {}
		}

				
	}
	@Override //키 눌렀을 때
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==this)
		{
			switch(e.getKeyCode())
			{
				case KeyEvent.VK_RIGHT:
				{
					new Thread(this).start();
					gv.x+=5;
					if(gv.x>1024)
						gv.x=0;
					repaint();
				}
				break;
				case KeyEvent.VK_LEFT:
				{
					new Thread(this).start();
					gv.x-=5;
					if(gv.x<0)
						gv.x=1024;
					repaint();
				}
				break;
				case KeyEvent.VK_UP:
				{
					new Thread(this).start();
					gv.y-=5;
					if(gv.y<0)
						gv.y=900;
					repaint();
				}
				break;
				case KeyEvent.VK_DOWN:
				{
					new Thread(this).start();
					gv.y+=5;					
					if(gv.y>900)
						gv.y=0;
					repaint();
				}
				break;
			
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==gv) //게임뷰에서 마우스 클릭했다면
		{
			gv.x=e.getX(); //위치를 마우스 클릭한 곳으로 이동시키기
			gv.y=e.getY();
			repaint(); //클릭한 위치로 그림 다시 그리기
		}
	}
	@Override //마우스 누르기
	public void mousePressed(MouseEvent e) {
		
	}
	@Override //마우스 놓기
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override //마우스 갖다대기
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override //마우스 치우기
	public void mouseExited(MouseEvent e) {
		
	}
	@Override //마우스 드래그
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()==gv)
		{
			gv.x=e.getX();
			gv.y=e.getY();
			repaint();
		}
				
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	@Override
	public void run() {
		for(int i=0; i<9; i++)
		{
			gv.setImage("my_0"+i);
			try
			{
				Thread.sleep(100);
			}catch(Exception ex) {}
			repaint();
		}
		gv.setImage("my_00");
	}

}
