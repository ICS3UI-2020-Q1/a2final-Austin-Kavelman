import java.util.Scanner;

/**
 * this program calculates the price of the size of pizza 
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //asks the user the size of their pizza order
    System.out.println("What is the size of the pizza (in cm):" );
    
    //user enters pizza size in cm's here
    int pizzaSize = input.nextInt();

    //integer for pizza 1cm to 20cm
    final int SMALL = 1;
    final int SMALL2 = 20;

    //integer for pizza 21cm to 40cm
    final int MEDIUM = 21;
    final int MEDIUM2 = 40;

    //integer for pizza 41cm and above
    final int LARGE = 41;

    //add labour fee
    final double LABOUR_FEE = 0.75;

    //add power bill fee 
    final double POWER_FEE = 0.99;

    //add ingredients fee
    final double INGREDIENTS_FEE = 0.50;

    //add additional fee (Labour, Power, and Ingredients)
    double additionalFees = (pizzaSize * INGREDIENTS_FEE + LABOUR_FEE + POWER_FEE);
    

    //Calculates the total price depending on the size of the pizza
    if(pizzaSize >= SMALL && pizzaSize <= SMALL2) {
    //Calculates the subtotal of the size of the pizza
    System.out.println("Subtotal: $" + (pizzaSize * INGREDIENTS_FEE + LABOUR_FEE + POWER_FEE));
    //calculates the taxes
    System.out.println("Taxes: $" + additionalFees * 0.13);
    //add the taxes to the subtotal, amking it the final total
    System.out.println("Total: $" + additionalFees * 1.13);
    System.out.println("We are going to make you a cute little pizza!");
    }else if(pizzaSize >= MEDIUM && pizzaSize <= MEDIUM2){
    //Calculates the subtotal of the size of the pizza
    System.out.println("Subtotal: $" + (pizzaSize * INGREDIENTS_FEE + LABOUR_FEE + POWER_FEE));
    //calculates the taxes
    System.out.println("Taxes: $" + additionalFees * 0.13);
    //add the taxes to the subtotal, amking it the final total
    System.out.println("Total: $" + additionalFees * 1.13);
    System.out.println("This will be delicious!");
    }else if(pizzaSize >= LARGE){
    //Calculates the subtotal of the size of the pizza
    System.out.println("Subtotal: $" + (pizzaSize * INGREDIENTS_FEE + LABOUR_FEE + POWER_FEE));
    //calculates the taxes
    System.out.println("Taxes: $" + additionalFees * 0.13);
    //add the taxes to the subtotal, amking it the final total
    System.out.println("Total: $" + additionalFees * 1.13);
    System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }




  }
}
