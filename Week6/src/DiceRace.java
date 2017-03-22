import java.util.Scanner;

public class DiceRace {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter p1 name: ");
        DicePlayer p1 = new DicePlayer(kb.next());
        System.out.print("Enter p2 name: ");
        DicePlayer p2 = new DicePlayer(kb.next());
        Dice dice = new Dice();

        do{
            dice.roll();
            p1.updateScore(dice.getCurrentValue());
        
            dice.roll();
            p2.updateScore(dice.getCurrentValue());

            
            System.out.print("S");
            
            for(int i = 0; i < 25; ++i){
                System.out.print("-");
            }
            System.out.println("F");

            System.out.print(p1.getName() + ": ");

            for(int i = 0; i <= p1.getScore(); ++i){
                if (i % 4 == 0){
                    System.out.print("*");
                }
            }
            
            System.out.println();
            
            System.out.print(p2.getName() + ": ");

            for(int i = 0; i <= p2.getScore(); ++i){
                if (i % 4 == 0){
                    System.out.print("*");
                }
            }
            
            System.out.println();
            
        } while (p1.getScore() < 100 && (p2.getScore() < 100));
        
        
        kb.close();
    }   // End of main Method

}   // End of DiceRace class
