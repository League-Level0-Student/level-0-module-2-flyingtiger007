package _01_random._6_lottery_numbers;
import java.util.Random;
import javax.swing.JOptionPane;
public class lotto {

	public static void main(String[] args) {


		Random ran = new Random();
//		list = newArrayList();
		String numbers = "";
		for (int i = 0; i<6; i++) {
			int number = ran.nextInt(100);
			if (i != 5) {
				numbers += (number + " ,");
			}
			else {
				numbers += (number);
			
			}
			}

					
		JOptionPane.showMessageDialog(null, numbers, "Lottery Ticket", JOptionPane.PLAIN_MESSAGE);
		
			}
		}

	
	






