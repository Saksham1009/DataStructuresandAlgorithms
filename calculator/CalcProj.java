package calculator;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;

public class CalcProj {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	JButton but1 = new JButton();
	JButton but2 = new JButton();
	JButton but3 = new JButton();
	JButton but4 = new JButton();
	JButton but5 = new JButton();
	JButton but6 = new JButton();
	JButton but7 = new JButton();
	JButton but8 = new JButton();
	JButton but9 = new JButton();
	JButton but0 = new JButton();
	
	JButton butadd = new JButton();
	JButton butmul = new JButton();
	JButton butdiv = new JButton();
	JButton butsub = new JButton();
	JButton butclear = new JButton();
	JButton butdot = new JButton();
	JButton butequal = new JButton();
	
	
	double num1,num2,res;
	int addc=0,subc=0,divc=0,mulc=0;
	
	public CalcProj(){
		frame.setSize(340,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator for me");
		//frame.setResizable(false);
		frame.add(panel);
		frame.setBackground(Color.BLUE);
		Border bor = BorderFactory.createLineBorder(Color.red,4);
		
		panel.add(textarea);
		
		textarea.setBackground(Color.green);
		Border tborder = BorderFactory.createLineBorder(Color.orange,3);
		 
		textarea.setBorder(tborder);
		
	}
}
