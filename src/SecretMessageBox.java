import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String password="eric";
		String secretMessage=JOptionPane.showInputDialog("Type in a secret message below");
		String userPassword=JOptionPane.showInputDialog("You can get the secret message if you type in the password below");
		if(userPassword.equalsIgnoreCase(password)){
			JOptionPane.showMessageDialog(null, secretMessage);
		}
		else{
			JOptionPane.showMessageDialog(null, "INTRUDER!!");
		}
	}
	
	
}
