package com.sist.wrapper;
import javax.management.monitor.MonitorSettingException;
import javax.swing.*;
import java.awt.event.*;
public class MainClass_Wrapper_3 extends JFrame implements ActionListener{
	JTextField tf1, tf2;
	JButton b;
	public MainClass_Wrapper_3()
	{
		tf1=new JTextField(10); //HTML은 입력값을 받을 때 모두 String(input type=text)으로 받음 
		tf2=new JTextField(10);
		b=new JButton("결과");
		JPanel p=new JPanel();
		p.add(tf1);
		p.add(tf2);
		p.add(b);
		add("Center",p);
		
		setSize(300,200);
		setVisible(true);
		
		//tf1=setText("100"); //tf1에 문자열 숫자 넣기(입력 받지 않고 값 지정해줌)
		
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		new MainClass_Wrapper_3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			String num1=tf1.getText();
			String num2=tf2.getText();
			JOptionPane.showMessageDialog(this,"계산결과 : "+(Integer.parseInt(num1)+Integer.parseInt(num2)));
		}
	}

}
