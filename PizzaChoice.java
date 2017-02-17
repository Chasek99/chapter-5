/**
 * 
 */
package pizzaChoice;
import java.util.Scanner;
/**
 * @author CK121642
 *
 */
public class PizzaChoice {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String choiceYes; //user is selecting that they have made a choice
		String size;
		String pizzaKind = null;
		double SmallCost = 7.99;
		double MediumCost = 10.99;
		double LargeCost = 13.99;
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Would you like a pizza? Yes or No>>>>>>");
	choiceYes = input.nextLine();
	//saying if you want pizza or not
	if("Yes".equals(choiceYes) || "yes".equals(choiceYes) || "Y".equals(choiceYes))
	{
		System.out.print("You said " + choiceYes + " to have a pizza.");
		System.out.print("Please choose a size, small, medium, or large>>>>");
		size = input.nextLine();// the user is determining the size of the pizza
		if("small".equals(size) || "medium".equals(size) || "large".equals(size))
		{
			System.out.print("You said " + size + " pizza size.");
			System.out.print("What kind of pizza do you want? Pepperoni, Sausage, and ot Cheese?>>>>");
			pizzaKind = input.nextLine();
			if("Pepperoni".equals(pizzaKind) || "Sausage".equals(pizzaKind) || "Cheese".equals(pizzaKind))
			{
					System.out.print("You said " + pizzaKind + " that sounds delicious!! ");
					System.out.print("Your order consists of " + size + " pizza, with the toppings of " + pizzaKind);
					if ("small".equals(size))
					{
						System.out.println("The cost of your pizza is $" + SmallCost);
					}
					if("medium".equals(size))
					{
						System.out.println("The cost of your pizza is $" + MediumCost);
					}
					if("large".equals(size))
					{
						System.out.println("The cost of your pizza is $" + LargeCost);
					} 
					else
					{
						System.out.println("NO PIZZA FOR YOU");
					}
			}
			
			}
		
		}
	
	
	}	

	
}

