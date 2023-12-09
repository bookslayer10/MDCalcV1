import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserInput {

    private String input = "0";
    private JTextField output;
    private double firstNum = 0;
    private double secondNum = 0;
    private String operator = "";
    private boolean isFirstInput = true;

    UserInput(JTextField output) {
        this.output = output;
    }

    double performCalc(double numOne, double numTwo, String op) {
        switch (op) {
            case "+":
                return numOne + numTwo;
            case "-":
                return numOne - numTwo;
            case "*":
                return numOne * numTwo;
            case "/":
                return numOne / numTwo;
            case "=":  // Handle the "=" case
                return numTwo;  // Return the second number as the result
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }

    public void setInput(String input) {
        this.input = input;
        output.setText(input);
    }

    public String getInput() {
        return input;
    }

    

    public void setOperator(String operator) {
        System.out.println("the operator: " + operator);
        this.operator = operator;
        this.firstNum = Double.parseDouble(input);
        isFirstInput = false;
    }

    public boolean isFirstInput() {
        return isFirstInput;
    }

    public void calculateResult() {
        if (!isFirstInput) {
            secondNum = Double.parseDouble(input);
            System.out.println("First Num: " + firstNum);
            System.out.println("Operator: " + operator);
            System.out.println("Second Num: " + secondNum);
            double result = performCalc(firstNum, secondNum, operator);
            System.out.println("Result: " + result);
            firstNum = result;
            setInput(String.valueOf(result));

            System.out.println("Updated First Num: " + firstNum);
            isFirstInput = true;
        }
        }

    public static void main(String[] args) {
        Font titleFont = new Font(Font.DIALOG, Font.BOLD, 24);
        Font outputFont = new Font(Font.DIALOG, Font.BOLD, 13);

        JFrame frame = new JFrame();
        JLabel title = new JLabel("Mount Douglas Calculator");
        title.setBounds(40, 25, 300, 50);
        title.setFont(titleFont);

        JTextField output = new JTextField("Check console for output :)");
        output.setBounds(10, 100, 365, 50);
        output.setFont(outputFont);
        output.setBackground(new Color(200, 200, 200));
        output.setEditable(false);

        UserInput userInput = new UserInput(output);

        JButton[] numPad = new JButton[10];
        for (int i = 0; i < numPad.length; i++) {
            numPad[i] = new JButton(i + "");
            numPad[i].addActionListener(new ButtonConcat(userInput, numPad[i].getText()));
        }

        for (int i = 1; i < numPad.length; i++) {
            numPad[i].setBounds(50 + ((i - 1) % 3 * 75), 200 + ((i - 1) / 3 * 75), 50, 50);
        }

        numPad[0].setBounds(50, 425, 50, 50);

        JButton decimal = new JButton(".");
        decimal.setBounds(125, 425, 50, 50);
        decimal.addActionListener(new ButtonConcat(userInput, decimal.getText()));

        JButton equals = new JButton("=");
        equals.setBounds(200, 425, 50, 50);
        equals.addActionListener(new ButtonConcat(userInput, equals.getText()));

        JButton addition = new JButton("+");
        addition.setBounds(275, 200, 50, 50);
        addition.addActionListener(new ButtonConcat(userInput, addition.getText()));


        JButton subtraction = new JButton("-");
        subtraction.setBounds(275, 275, 50, 50);
        subtraction.addActionListener(new ButtonConcat(userInput, subtraction.getText()));


        JButton division = new JButton("/");
        division.setBounds(275, 350, 50, 50);
        division.addActionListener(new ButtonConcat(userInput, division.getText()));


        JButton multiplication = new JButton("*");
        multiplication.setBounds(275, 425, 50, 50);
        multiplication.addActionListener(new ButtonConcat(userInput, multiplication.getText()));


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

        frame.setSize(400, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
