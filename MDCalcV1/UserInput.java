import java.io.Console;
import java.util.Scanner;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInput {

	static String input = "0";
	
	static double PerformCalc(double numOne, double numTwo, String op) {
		switch (op) {
		case "+":
			return numOne + numTwo;
		case "-":
			return numOne - numTwo;
		case "*":
			return numOne * numTwo;
		case "/":
			return numOne / numTwo;
		default:
			System.out.println("Invalid operator");
			return 0;
		}
	}

	public static void main(String[] args) {

		Font titleFont = new Font(Font.DIALOG, Font.BOLD, 24);
		Font outputFont = new Font(Font.DIALOG, Font.BOLD, 13);

		JFrame frame = new JFrame(); // creating instance of JFrame

		JLabel title = new JLabel("Mount Douglas Calculator");

		title.setBounds(40, 25, 300, 50); // x axis, y axis, width, height
		title.setFont(titleFont);

		JTextField output = new JTextField("Check console for output :)");

		output.setBounds(10, 100, 365, 50); // x axis, y axis, width, height
		output.setFont(outputFont);
		output.setBackground(new Color(200, 200, 200));
		output.setEditable(false);

		JButton[] numPad = new JButton[10];

		for (int i = 0; i < numPad.length; i++) {
			numPad[i] = new JButton(i + "");
			numPad[i].addActionListener(new ButtonConcat(numPad[i].getText()));
		}

		for (int i = 1; i < numPad.length; i++) {
			numPad[i].setBounds(50 + ((i - 1) % 3 * 75), 200 + ((i - 1) / 3 * 75), 50, 50); // x axis, y axis, width,
																							// height
		}

		numPad[0].setBounds(50, 425, 50, 50); // x axis, y axis, width, height

		JButton decimal = new JButton(".");
		decimal.setBounds(125, 425, 50, 50); // x axis, y axis, width, height
		decimal.addActionListener(new ButtonConcat(decimal.getText()));

		JButton equals = new JButton("=");
		equals.setBounds(200, 425, 50, 50); // x axis, y axis, width, height

		JButton addition = new JButton("+");
		addition.setBounds(275, 200, 50, 50); // x axis, y axis, width, height

		JButton subtraction = new JButton("-");
		subtraction.setBounds(275, 275, 50, 50); // x axis, y axis, width, height

		JButton division = new JButton("/");
		division.setBounds(275, 350, 50, 50); // x axis, y axis, width, height

		JButton multiplication = new JButton("*");
		multiplication.setBounds(275, 425, 50, 50); // x axis, y axis, width, height

		// adding graphics parts to JFrame
		frame.add(title);
		frame.add(output);
		for (JButton num : numPad) {
			frame.add(num);
		}
		frame.add(decimal);
		frame.add(equals);
		frame.add(addition);
		frame.add(subtraction);
		frame.add(division);
		frame.add(multiplication);

		frame.setSize(400, 600); // 300 width and 500 height
		frame.setLayout(null); // using no layout managers
		frame.setVisible(true); // making the frame visible
		frame.setResizable(false); // make sure the user can't mess up my perfect sizing
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		double firstNum = 0;
		String symbol = "";
		double secondNum = 0;
		double SimpleAns = 0;

		
		/*
		Scanner scanner = new Scanner(System.in);

		// Change the "enter number thing" to the buttons when we have that
		System.out.println("Welcome to the Calculator Program!");
		System.out.print("Enter the first number: ");
		firstNum = scanner.nextDouble();

		System.out.print("Operator (+, -, *, /): ");
		symbol = scanner.next();

		System.out.print("Enter the second number: ");
		secondNum = scanner.nextDouble();
		
		if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
			SimpleAns = PerformCalc(firstNum, secondNum, symbol);
			System.out.println("Answer: " + SimpleAns);
		} else {
			System.out.println("There is an error.");
		}
		*/

		// Repeat similar steps for the next number and next operation input, maybe
		// while loop but idk
	}
	
	public static void setInput(String input) {
		UserInput.input = input;
		
	}
}
