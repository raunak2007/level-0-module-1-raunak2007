import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("What is your name?");
		if(name.equalsIgnoreCase("Jack")) {
			JOptionPane.showMessageDialog(null, "You have a good shirt");
		}
		if(name.equalsIgnoreCase("Jill")) {
			JOptionPane.showMessageDialog(null,"You speak softly");
		}
		if(name.equalsIgnoreCase("Pravan")) {
			JOptionPane.showMessageDialog(null, "You like studying");
		}
	}
}
