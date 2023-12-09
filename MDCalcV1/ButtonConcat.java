import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonConcat implements ActionListener {

    private final UserInput userInput;
    private final String buttonValue;

    public ButtonConcat(UserInput userInput, String buttonValue) {
        this.userInput = userInput;
        this.buttonValue = buttonValue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(buttonValue);
        if (buttonValue.equals("=")) {
            System.out.println("Performing calculation");
            userInput.setInput(userInput.getInput());  // Set the input before calculation
            userInput.setOperator("=");
            userInput.calculateResult();
        } else {
            if (userInput.getInput().equals("0") || userInput.isFirstInput()) {
                userInput.setInput(buttonValue);
            } else {
                userInput.setInput(userInput.getInput().concat(buttonValue));
            }
        }
    }
}