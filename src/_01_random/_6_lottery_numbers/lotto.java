package _01_random._6_lottery_numbers;
import java.util.Random;
public class lotto {

	public static void main(String[] args) {


		Random ran = new Random();
//		list = newArrayList();
		String numbers = "";
		for (int i = 0; i<6; i++) {
			int number = ran.nextInt(100);
	
					numbers += (number + " ,");
		
			}
		}
		
	}
	






