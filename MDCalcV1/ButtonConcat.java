import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonConcat implements ActionListener{

	String buttonValue = "";
	
	ButtonConcat(String buttonValue){
		this.buttonValue = buttonValue;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(UserInput.input.equals("0")) {
			UserInput.setInput(buttonValue);
		} else {
			UserInput.input = UserInput.input.concat(buttonValue);
		}
		
		System.out.println(UserInput.input);
	}

}
