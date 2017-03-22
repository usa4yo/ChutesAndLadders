import java.util.Scanner;

/**
 * 
 * Main Class   : ChuteAndLadders (Driver)
 * Project 6    : Chutes and Ladders
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-03-08
 * Last Mod.    : 2017-03-08 
 *
 */

public class ChutesAndLadders {

    public static void main(String[] args) {
        String playerName;
        
        System.out.println("Chutes and Ladders Game");
        System.out.println();
        
        Scanner keyboard = new Scanner(System.in);
   
        System.out.println("Please enter the name of the first player: ");
        playerName = keyboard.next();
        Player player1 = new Player(playerName);
        
        System.out.println("Please enter the name of the second player: ");
        playerName = keyboard.next();
        Player player2 = new Player(playerName);        
        
        Spinner spinner = new Spinner();
        
        do
        {                                                       //start DO WHILE loop
            // System.out.print("");
            player1.updateCurrentSquareNumber(spinner.spin());
            System.out.println(player1.getName() + ", you spun a " + spinner.getValue());
            player1.verifyChuteOrLadder(player1.getCurrentSquareNumber());
            System.out.println(player1.getName() + ", you are now at square : " + player1.getCurrentSquareNumber());

            
            player2.updateCurrentSquareNumber(spinner.spin());
            System.out.println(player2.getName() + ", you spun a " + spinner.getValue());
            player2.verifyChuteOrLadder(player2.getCurrentSquareNumber());
            System.out.println(player2.getName() + ", you are now at square : " + player2.getCurrentSquareNumber());

            
            if (player1.getCurrentSquareNumber() == 100){
                System.out.println(player1.getName() + " WINS!!!");
            }
            else if (player2.getCurrentSquareNumber() == 100){
                    System.out.println(player2.getName() + " WINS!!!");
                }
            else{   
                System.out.print("Press ENTER to continue...");
                keyboard.nextLine();
            }   
        } while ((player1.getCurrentSquareNumber() != 100) && (player2.getCurrentSquareNumber() != 100));   

        
        keyboard.close();


    }   // Ending bracket of main class

}   // Ending bracket of ChutesAndLadder class
