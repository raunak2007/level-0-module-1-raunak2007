import javax.swing.JOptionPane;

public class TheRiddler {
	 public static void main(String[] args) {
	int score=0;
	String firstAnswer=JOptionPane.showInputDialog("What is greater than God,\n" + 
			"more evil than the devil,\n" + 
			"the poor have it,\n" + 
			"the rich need it,\n" + 
			"and if you eat it, you'll die?");
	if(firstAnswer.equalsIgnoreCase("nothing")) {
		score+=1;
		JOptionPane.showMessageDialog(null, "Correct");
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong. The correct answer is nothing.");
	}
	String secondAnswer=JOptionPane.showInputDialog("Who makes it, has no need of it.\n" + 
			"Who buys it, has no use for it. \n" + 
			"Who uses it can neither see nor feel it. \n" + 
			"What is it?");
	if(secondAnswer.equalsIgnoreCase("nothing")) {
		score+=1;
		JOptionPane.showMessageDialog(null, "Correct");
	}
	else {
		JOptionPane.showMessageDialog(null,"Wrong. The correct answer is again, nothing");
	}
	String thirdAnswer=JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
	if(thirdAnswer.equalsIgnoreCase("a stamp")) {
		score+=1;
		JOptionPane.showMessageDialog(null, "Correct");
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong. The correct answer is a stamp");
	}
	}
	 
}
