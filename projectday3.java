/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author dodoq
 */
public class projectday3 {
    
     public static void main(String[] args)
     {
         
         HashMap<Integer, String> inventory = new HashMap<>();

         Scanner input = new Scanner(System.in);
         
         int choice = 0;

do 
{
    

    
    
                        
    System.out.println("1. Add Product");
    System.out.println("2. Remove Product");
    System.out.println("3. Search Product");
    System.out.println("4. List Products");
    System.out.println("5. Exit");

    System.out.print("Choose: ");
    choice = input.nextInt();
    if (choice == 1) {

    System.out.print("Enter product code: ");
    int code = input.nextInt();

    System.out.print("Enter product name: ");
    String name = input.next();

    inventory.put(code, name);

    System.out.println("Product added successfully");

}
    else if (choice == 2) {

                System.out.print("Enter product code to remove: ");
                int code = input.nextInt();

                if (inventory.containsKey(code)) {

                    inventory.remove(code);
                    System.out.println("Product removed successfully");

                } else {

                    System.out.println("Product not found");

                }
    }
                else if (choice == 3) {

                System.out.print("Enter product code to search: ");
                int code = input.nextInt();

                if (inventory.containsKey(code)) {

                    System.out.println("Product: " 
                            + inventory.get(code));

                } else {

                    System.out.println("Product not found");

                }
                }
                        
                         else if (choice == 4) {

                System.out.println("Inventory:");

                if (inventory.isEmpty()) {

                    System.out.println("No products available");

                } else {

                    for (Integer code : inventory.keySet()) {

                        System.out.println(
                            code + " -> " + inventory.get(code)
                        );

                    }}

                }
                         else if (choice == 5) {

                System.out.println("Goodbye!");

            }


            else {

                System.out.println("Invalid choice");

            }
                        


}          
               while(choice != 5);
     
     }
     
    
}
