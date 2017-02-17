/**
 * 
 */
package switches;
import javax.swing.JOptionPane;
/**
 * @author CK121642
 *
 */
public class studentScannerSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int studentNumber;
		
			String studentString;
			
			//Scanner input =Scanner(System.in);
			
			//System.out.print("Please scan the student ID >>>>> ");
			//user = input.nextInt();
			studentString = (String)JOptionPane.showInputDialog(null, "Please scan the student ID >>>>>>", "Enter User ID #",
		JOptionPane.QUESTION_MESSAGE, null, null,"");
			studentNumber = Integer.parseInt(studentString);
			
		if (studentNumber >= 100000 || studentNumber <= 4000000)
		{
			switch(studentNumber)
					{
					case 274896:
						JOptionPane.showMessageDialog(null, "Andrew McKenzie's java book, he is in 10th grade");
					break;
					case 274885:
						JOptionPane.showMessageDialog(null, "Charles Carlstrom java book, he is in 10th grade");
					break;
					case 316282:
						JOptionPane.showMessageDialog(null, "Ress Alzahrani's ID, she is in 10th grade");
					break;
					case 274884:
						JOptionPane.showMessageDialog(null, "Tatyana Vaughn's java book, she is in 12th grade");
					break;
					case 133778:
						JOptionPane.showMessageDialog(null, "Nick Hasson's java book, he is in 10th grade");
					break;
					case 131457:
						JOptionPane.showMessageDialog(null, "Kassie Remley's ID, she is in 11th grade");
					break;
					case 137412:
						JOptionPane.showMessageDialog(null, "Sebastion Frick's ID, he is in 10th grade");
					break;
					case 131147:
						JOptionPane.showMessageDialog(null, "Zach Dorris' ID, he is in 10th grade");
					break;
					case 274887:
						JOptionPane.showMessageDialog(null, "Chase Kress' java book, he is in 12th grade");
					break;
					case 133225:
						JOptionPane.showMessageDialog(null, "Isaiah Ponciano's ID, he is in 10th grade");
					break;
					case 137428:
						JOptionPane.showMessageDialog(null, "Mason Handcock's ID, he is in 10th grade");
					break;
					
					default:
						System.out.print("ERROR");
					}
		}
		

	}

}
