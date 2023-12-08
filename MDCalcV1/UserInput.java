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
            case "^":
                return Math.pow(numOne, numTwo);
            case "%":
                return (numOne/100) * numTwo;

            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }
    public static void main(String[] args) {

        double firstNum = 0;
        String symbol = " ";
        double secondNum = 0;
        double SimpleAns = 0;

        
        Scanner scanner = new Scanner(System.in);

        //Change the "enter number thing" to the buttons when we have that
        System.out.println("Welcome to the Calculator Program!");

        do {
            System.out.print("Enter the first number: ");
            try {
                firstNum = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Oops, thats not a valid number! Please try again.");
                scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
                continue;
            }

            break; // Break out of the loop if a valid number is entered
        } while (true);


        System.out.print("Operator (+, -, *, /): ");
        symbol = scanner.nextLine();

        while (!isValidOperator(symbol))
        {

            System.out.println("Please enter a valid operator");

            System.out.println("Enter symbol(+, -, *, /, ^, %): ");
            symbol = scanner.nextLine();
        }
                // Continue with the rest of your program using the valid operator
        System.out.println("You entered a valid operator: " + symbol);


 


                do {
            System.out.print("Enter the second number: ");
            try {
                secondNum = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Oops, thats not a valid number! Please try again.");
                scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
                continue;
            }

            break; // Break out of the loop if a valid number is entered
        } while (true);



        if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("^") || symbol.equals("/") || symbol.equals("%"))
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
    private static boolean isValidOperator(String symbol) {
        return symbol.equals("+") || symbol.equals("-") || symbol.equals("*") ||
               symbol.equals("/") || symbol.equals("^") || symbol.equals("%");
    }
}
