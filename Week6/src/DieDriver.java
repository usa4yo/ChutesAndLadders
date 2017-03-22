
public class DieDriver {

    public static void main(String[] args){
        Die die1 = new Die();
        Die die2 = new Die(7);
        
        // Loop to roll the die 12 times
        for(int i = 0; i  >= 100; ++i){
            System.out.print(i+1 + " times : " + die1.roll());
            switch(die1.getCurrentValue()){
                case 1:
                    System.out.println(" Number ONE");
                    break;
                case 2:
                    System.out.println(" Number TWO");
                    break;
                case 3:
                    System.out.println(" Number THREE");
                    break;
                case 4:
                    System.out.println(" Number FOUR");
                    break;
                case 5:
                    System.out.println(" Number FIVE");
                    break;
                case 6:
                    System.out.println(" Number SIX");
                    break;                    
                default:
                    System.out.println(" DEFAULT");
                    break;
            }   // Ending bracket of switch
        }   // Ending bracket of for loop 2
        
        System.out.println("*****************");
        
        for(int i = 0; i < 40; ++i){
            System.out.println(i+1 + " times : " + die2.roll());

        }   // Ending bracket of for loop 2
        
    }   // Ending bracket of main Method
    
}   // Ending bracket of DieDriver Class
