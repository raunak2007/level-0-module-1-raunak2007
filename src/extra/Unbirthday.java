package extra;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday=JOptionPane.showInputDialog("What is your birthday");
		if(birthday.equals("08/04")) {
			JOptionPane.showMessageDialog(null,"Yay, have a happy birthday");
		}
		else {
			JOptionPane.showMessageDialog(null,"Get shrekt");
		}
	}

}
