// Karinderya
// Created by Christiane A. Bacani
import java.util.Scanner;
public class Karinderya {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {50,55,60,65,70,75,80,85};
        boolean sell = true;
        int total = 0;
        
        System.out.print("Welcome to Karen`s Karinderya!\n");
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        while(sell){
        System.out.print("        AVAILABLE FOODS\n");
        System.out.print("FOOD\t\t\tPRICE\n");
        System.out.print("1.) Regadilyo\t\tP 50\n");
        System.out.print("2.) Menudo\t\tP 55\n");
        System.out.print("3.) Sisig\t\tP 60\n");
        System.out.print("4.) Laing\t\tP 65\n");
        System.out.print("5.) Sinigang\t\tP 70\n");
        
        System.out.print("6.) Bopis\t\tP 75\n");
        System.out.print("7.) Afritada\t\tP 80\n");
        System.out.print("8.) Giniling\t\tP 85\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        if(choice >= 1 && choice <=8){
            System.out.print("Enter quantity : ");
            int quantity = input.nextInt();
            
            total += price[choice -  1] * quantity;
            
            System.out.print("Do you want to buy more ? (y/n) : ");
            input.nextLine();
            String buyMore = input.nextLine();
            
            if(buyMore.equalsIgnoreCase("n")){
                sell = false;
                System.out.print("The total price is : P " + total + "\n");
                
                System.out.print("Please enter your payment : P ");
                int payment = input.nextInt();
                
                int change = payment - total;
                System.out.print("Change : P " + change);
                
                System.out.print("\n\nTHANK YOU, PLEASE COME AGAIN!\n");
                
            }
            
        }
        else{
            System.out.print("\n\nINVALID CHOICE!");
        }
        
        }
    }
}
