package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{
	
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10]; //creates an array of buttons to select the numbers from 0-9
	JButton[] functionButtons = new JButton[8]; //creates an array of buttons to select the operations and functions of the calculator respectively
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton;
	JPanel panel;
	
	Font myFont = new Font("Ink Free", Font.BOLD, 36);
	
	double num1=0, num2=0, result=0;
	char operator;
	
	Calculator(){
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 690);
		frame.setLayout(null);
		
		
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {

		Calculator calc = new Calculator();	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
