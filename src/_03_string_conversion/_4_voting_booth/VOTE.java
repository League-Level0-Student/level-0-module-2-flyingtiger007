package _03_string_conversion._4_voting_booth;
import javax.swing.JOptionPane;
public class VOTE {

	public static void main(String[] args) {
	
	String age = JOptionPane.showInputDialog("how old are you");
	int ageInt = Integer.parseInt(age);
	if (ageInt <18) {
		System.out.println("get lost kid");
	}
	if (ageInt>=18){
		System.out.println("who do you want to be president");
	}	
}
}