import java.io.Console;
import java.util.Scanner;

public class UserInput {

        static double PerformCalc(double numOne, double numTwo, String op)
    {
        switch (op)
        {
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

        double firstNum;
        String symbol;
        double secondNum;
        double SimpleAns = 0;

        
        Scanner scanner = new Scanner(System.in);

        //Change the "enter number thing" to the buttons when we have that
        System.out.println("Welcome to the Calculator Program!");
        System.out.print("Enter the first number: ");
        firstNum = scanner.nextDouble();

        System.out.print("Operator (+, -, *, /): ");
        symbol = scanner.next();

        System.out.print("Enter the second number: ");
        secondNum = scanner.nextDouble();

        if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/"))
        {
            SimpleAns = PerformCalc(firstNum, secondNum, symbol);
            System.out.println("Answer: " + SimpleAns);
        }
        else
        {
            System.out.println("There is an error.");
        }

        // Repeat similar steps for the next number and next operation input, maybe while loop but idk 
    }
}
