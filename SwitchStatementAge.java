/**
 * 
 */
package switches;
import java.util.Scanner;
/**
 * @author CK121642
 *
 */
public class SwitchStatementAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int user;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How old are you? >>>> ");
		user = input.nextInt();
		switch(user)
		{
		case 18:
			System.out.print("you're 18");
			break;
		case 19:
		case 20:
		case 21:
			System.out.print("you're between 19 and 21.");
			break;
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
			System.out.print("you're between 22 and 30.");
			break;
		case 31:
		case 32:
		case 33:
		case 34:
		case 35:
		case 36:
			System.out.print("you're between 31 and 36.");
			break;
		case 37:
		case 38:
		case 39:
		case 40:
			System.out.print("you're between 37 and 40.");
			break;
		default:
			System.out.print("There's no way you're that old.");
		}

	}

}
