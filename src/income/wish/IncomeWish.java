/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package income.wish;
import java.util.Scanner;
/**
 *
 * @author class
 */
public class IncomeWish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int age;
        double annualpay;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("what is your name?  ");
        name=keyboard.nextLine();
        System.out.print("what is you age?   ");
        age=keyboard.nextInt();
        System.out.print("How much do you hope to earn?   ");
        annualpay=keyboard.nextDouble();
        System.out.println("MY name is "+ name+", my age is "+ age+" and I hope to earn $"+annualpay+" per year");
        
        
        
    }
    
}
