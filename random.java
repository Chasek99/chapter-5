/**
 * 
 */
package randomguessmatch;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 * @author CK121642
 *
 */
public class random {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Random r = new Random();
		final int LOW = 0;
		final int HIGH = 9;
		String msg;
		int result1 = r.nextInt(9) + LOW;
		int result2 = r.nextInt(9);
		int result3 = r.nextInt(9);
		
		int userGuess1;
		int userGuess2;
		int userGuess3;
		
		userGuess1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between " + LOW + " and " + HIGH));
		userGuess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between " + LOW + " and " + HIGH));
		userGuess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between " + LOW + " and " + HIGH));
		
		if(userGuess1 == result1 && userGuess2 == result2 && userGuess3 == result3)
		{
			msg = "\n You win a million damn dollars!!!";
		}
		if(userGuess1 == result1 && userGuess2 != result2 && userGuess3 != result3)//first number
		{
			msg = "\n You got the first guess right";
		}
		if(userGuess1 != result1 && userGuess2 != result2 && userGuess3 != result3)
		{
			msg ="\n You got the second guess right";
		}
		if(userGuess1 != result1 && userGuess2 != result2 && userGuess3 != result3)
		{
			msg ="\n You got the third number right";
		}
		else
			msg = "\n You're a loser get out of here";
		
		
		JOptionPane.showMessageDialog(null, "The numbers are " + result1+ ", " + result2 + ", and " + result3 + msg);

	}

}
