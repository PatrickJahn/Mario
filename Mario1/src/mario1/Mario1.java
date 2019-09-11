/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario1;
import java.util.Scanner;

/**
 *
 * @author Patrick
 */
public class Mario1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello, choose pizza: ");
        System.out.println("pizza1: 1 ");
        System.out.println("pizza1: 2 ");
        System.out.println("pizza1: 3 ");
        
       Scanner scan = new Scanner(System.in);
        
       int choise = scan.nextInt();
       
       switch (choise)  {
           
           case 1: 
               System.out.println("You chose 1");
               Toppings();
            break;
           case 2: 
               System.err.println("You choose 2");
                    Toppings();
               break;
           case 3: 
               System.out.println("You choose 3");
                    Toppings();
               break;
           default: 
               System.out.println("HELLOOO");
       }
       int x = 2;
        // TODO code application logic here
    }
    
    
    public static void Toppings() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose extra Toppings: ");
          System.out.println("Cheese:1");
                System.out.println("Salad:2");
              System.out.println("Ham:3");
              int topping = scan.nextInt();
              switch (topping)  {
           
           case 1: 
               System.out.println("Extra Cheese added");
            break;
           case 2: 
               System.err.println("Extra Salad Added");
               break;
           case 3: 
               System.out.println("Extra Ham Added");
               break;
           default: 
               break;
       }
              
    }
}
