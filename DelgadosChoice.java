/**
 * 
 */
package delgadosTacos;
import java.util.Scanner;
/**
 * @author CK121642
 *
 */
public class DelgadosChoice {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
	    tacoTruck();
	    menu();
	    orderingMenu();
	}
	    
	public static void orderingMenu()
	{
	    String taco, burritos, chimichanga, enchiladas, tamales, tacoSalads, fajita, tachidos, pop, churros;
		double tacoPrice = 0.99;
		double tacoOrdered;
		double burritosPrice = 0.99;
		double burritosOrdered;
		double chimichangaPrice = 1.99;
		double chimichangaOrdered;
		double enchiladasPrice = 3.99;
		double enchiladasOrdered;
		double tamalesPrice = 2.49;
		double tamalesOrdered;
		double tacoSaladsPrice = 3.99;
		double tacoSaladsOrdered;
		double fajitaPrice = 1.49;
		double fajitaOrdered;
		double tachidosPrice = 2.99;
		double tachidosOrdered;
		double popPrice = .99;
		double popOrdered;
		double churrosPrice = .75;
		double churrosOrdered;
		double totalPrice;
		double totalPriceWithTax;
		
		int OrderNumber;
		
		
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Hello welcome to the Delgados Tacos food truck");
		System.out.println("From our menu above what would you like to order?");
		System.out.println("Please select a menu number");
		OrderNumber = inputDevice.nextInt();
		inputDevice.nextLine();
		
		if(OrderNumber ==1)
		{
			System.out.println("I see you like tacos, how many would you like>>>>>");
			tacoOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (tacoPrice * tacoOrdered);
			System.out.println("How you ordered " + tacoOrdered + " Tacos,your total is $" + totalPrice);
		}
		if(OrderNumber ==2)
		{
			System.out.println("I see you like burritos, how many would you like>>>>>");
			burritosOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (burritosPrice * burritosOrdered);
			System.out.println("How you ordered " + burritosOrdered + " Burritos,your total is $" + totalPrice);
		}
		if(OrderNumber ==3)
		{
			System.out.println("I see you like chimichangas, how many would you like>>>>>");
			chimichangaOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (chimichangaPrice * chimichangaOrdered);
			System.out.println("How you ordered " + chimichangaOrdered + " chimichanga,your total is $" + totalPrice);
		}
		if(OrderNumber ==4)
		{
			System.out.println("I see you like enchiladas, how many would you like>>>>>");
			enchiladasOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (enchiladasPrice * enchiladasOrdered);
			System.out.println("How you ordered " + enchiladasOrdered + " enchiladas,your total is $" + totalPrice);
		}
		if(OrderNumber ==5)
		{
			System.out.println("I see you like tamales, how many would you like>>>>>");
			tamalesOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (tamalesPrice * tamalesOrdered);
			System.out.println("How you ordered " + tamalesOrdered + " tamales,your total is $" + totalPrice);
		}
		if(OrderNumber ==6)
		{
			System.out.println("I see you like tacoSalads, how many would you like>>>>>");
			tacoSaladsOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (tacoSaladsPrice * tacoSaladsOrdered);
			System.out.println("How you ordered " + tacoSaladsOrdered + " tacoSalads,your total is $" + totalPrice);
		}
		if(OrderNumber ==7)
		{
			System.out.println("I see you like fajitas, how many would you like>>>>>");
			fajitaOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (fajitaPrice * fajitaOrdered);
			System.out.println("How you ordered " + fajitaOrdered + " fajita,your total is $" + totalPrice);
		}
		if(OrderNumber ==8)
		{
			System.out.println("I see you like tachidos, how many would you like>>>>>");
			tachidosOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (tachidosPrice * tachidosOrdered);
			System.out.println("How you ordered " + tachidosOrdered + " tachidos, your total is $" + totalPrice);
		}
		if(OrderNumber ==9)
		{
			System.out.println("I see you like pop, how many would you like>>>>>");
			popOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (popPrice * popOrdered);
			System.out.println("How you ordered " + popOrdered + " pop, your total is $" + totalPrice);
		}
		if(OrderNumber ==10)
		{
			System.out.println("I see you like churros, how many would you like>>>>>");
			churrosOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			totalPrice = (churrosPrice * churrosOrdered);
			System.out.println("How you ordered " + churrosOrdered + " churros, your total is $" + totalPrice);
		}
	
			
			
		
		
	

	}
	
	
	
	
	
	public static void menu()
	
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*************************************");
		System.out.println("*               MENU                *");
		System.out.println("*     #1  Tacos        Price 0.99   *");
		System.out.println("*     #2  Burrito      Price 0.99   *");
		System.out.println("*     #3  Enchiladas   Price 3.99   *");
		System.out.println("*     #4  Chimichanga  Price 1.99   *");
		System.out.println("*     #5  Tamales      Price 2.49   *");
		System.out.println("*     #6  TacoSalads   Price 2.99   *");
		System.out.println("*     #7  Fajita       Price 1.79   *");
		System.out.println("*     #8  Tachidos     Price 1.49   *");
		System.out.println("*     #9  Pop          Price 0.99   *");
		System.out.println("*     #10 Churros      Price 0.49   *");
		System.out.println("*************************************");
	}
	
	
	
	
	
	
	

	
	
	public static void tacoTruck()
	{
		System.out.println("**********************************************************************");
		System.out.println("*                                                                    *");
		System.out.println("*                    TACOS FOR SALE $$$$$                            *");
		System.out.println("*                                                                    *");
		System.out.println("*                                                                    *");
		System.out.println("*             --------------------------------                       *");
		System.out.println("*             *                              *                         *");
		System.out.println("*             *                              *                         **************");
		System.out.println("*             *                              *                          *           *");
		System.out.println("*             --------------------------------                        *           *");
		System.out.println("*                                                                     *             *");
		System.out.println("*                                                                     *            *");
		System.out.println("*                                                                   *             *");
		System.out.println("*                                                                   *************");
		System.out.println("*000000000*************************************************000000000***");
		System.out.println("*0       0                                                    0       0");
		System.out.println(" 0       0                                                    0       0");
		System.out.println(" 0       0                                                    0       0");
		System.out.println(" 000000000                                                    000000000");
		
	}
}
