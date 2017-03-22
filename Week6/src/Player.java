
/**
 * 
 * Class        : Player
 * Project 6    : Chutes and Ladders
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-03-08
 * Last Mod.    : 2017-03-08 
 *
 */

public class Player {

    private String name;
    public int currentSquareNumber;
  
    public static final int DEFAULT_NUMBER_OF_SIDES = 6;
    
    public static final int CURRENT_SQUARE_LADDER_01 = 1;
    public static final int CURRENT_SQUARE_LADDER_04 = 4;
    public static final int CURRENT_SQUARE_LADDER_09 = 9;
    public static final int CURRENT_SQUARE_LADDER_21 = 21;
    public static final int CURRENT_SQUARE_LADDER_28 = 28;
    public static final int CURRENT_SQUARE_LADDER_36 = 36;
    public static final int CURRENT_SQUARE_LADDER_51 = 51;
    public static final int CURRENT_SQUARE_LADDER_71 = 71;
    public static final int CURRENT_SQUARE_LADDER_80 = 80;

    public static final int CURRENT_SQUARE_CHUTE_16 = 16;
    public static final int CURRENT_SQUARE_CHUTE_47 = 47;
    public static final int CURRENT_SQUARE_CHUTE_49 = 49;
    public static final int CURRENT_SQUARE_CHUTE_56 = 56;
    public static final int CURRENT_SQUARE_CHUTE_62 = 62;
    public static final int CURRENT_SQUARE_CHUTE_64 = 64;
    public static final int CURRENT_SQUARE_CHUTE_87 = 87;
    public static final int CURRENT_SQUARE_CHUTE_93 = 93;
    public static final int CURRENT_SQUARE_CHUTE_95 = 95;
    public static final int CURRENT_SQUARE_CHUTE_98 = 98;
                             
    public static final int NEW_SQUARE_LADDER_38 = 38;
    public static final int NEW_SQUARE_LADDER_14 = 14;
    public static final int NEW_SQUARE_LADDER_31 = 31;
    public static final int NEW_SQUARE_LADDER_42 = 42;
    public static final int NEW_SQUARE_LADDER_84 = 84;
    public static final int NEW_SQUARE_LADDER_44 = 44;
    public static final int NEW_SQUARE_LADDER_67 = 67;
    public static final int NEW_SQUARE_LADDER_91 = 91;
    public static final int NEW_SQUARE_LADDER_100 = 100;
    
    public static final int NEW_SQUARE_CHUTE_06 = 6;
    public static final int NEW_SQUARE_CHUTE_11 = 11;    
    public static final int NEW_SQUARE_CHUTE_26 = 26;
    public static final int NEW_SQUARE_CHUTE_17 = 17;
    public static final int NEW_SQUARE_CHUTE_53 = 53;
    public static final int NEW_SQUARE_CHUTE_19 = 19;    
    public static final int NEW_SQUARE_CHUTE_60 = 60;
    public static final int NEW_SQUARE_CHUTE_24 = 24;
    public static final int NEW_SQUARE_CHUTE_73 = 73;
    public static final int NEW_SQUARE_CHUTE_75 = 75;   
    public static final int NEW_SQUARE_CHUTE_78 = 78;     

    // Player Method
    public Player(String playerName){
        setName(playerName);
        
    }   // Ending player Method
    
    // getCurrentSquareNumber Method
    public int getCurrentSquareNumber(){
        return currentSquareNumber;
        
    }   // Ending getCurrentSquareNumber Method

    // updateCurrentSquareNumber Method
    public void updateCurrentSquareNumber(int currentSpinValue){
        if(currentSpinValue + currentSquareNumber <= 100){
            currentSquareNumber += currentSpinValue;
        
        }   // Ending if Statement
        
    }   // Ending getCurrentSquareNumber Method

    public void verifyChuteOrLadder(int playerSquare)
    {
        
        switch(playerSquare)
        {
            case CURRENT_SQUARE_LADDER_01:
                System.out.println("You've been rewarded for planting flowers. Move ahead to square 38.");
                currentSquareNumber = NEW_SQUARE_LADDER_38;
                break;
            
            case CURRENT_SQUARE_LADDER_04:
                System.out.println("You've been rewarded for baking a cake. Move ahead to square 14.");
                currentSquareNumber = NEW_SQUARE_LADDER_14;
                break;
            
            case CURRENT_SQUARE_LADDER_09:
                System.out.println("You've been rewarded for mowing the lawn. Move ahead to square 31.");
                currentSquareNumber = NEW_SQUARE_LADDER_31;
                break;
            
            case CURRENT_SQUARE_CHUTE_16:
                System.out.println("Reading a comic book instead of your homework brings you back to square 6.");
                currentSquareNumber = NEW_SQUARE_CHUTE_06;
                break;
            
            case CURRENT_SQUARE_LADDER_21:
                System.out.println("You've been rewarded for playing with your dog. Move ahead to square 42.");
                currentSquareNumber = NEW_SQUARE_LADDER_42;
                break;
            
            case CURRENT_SQUARE_LADDER_28:
                System.out.println("You've been rewarded for rescuing a cat. Move ahead to square 84.");
                currentSquareNumber = NEW_SQUARE_LADDER_84;
                break;
            
            case CURRENT_SQUARE_LADDER_36:
                System.out.println("You've been rewarded for eating healthy. Move ahead to square 44.");
                currentSquareNumber = NEW_SQUARE_LADDER_44;
                break;
            
            case CURRENT_SQUARE_CHUTE_47:
                System.out.println("Skating on thin ice got you wet and brings you back to square 26.");
                currentSquareNumber = NEW_SQUARE_CHUTE_26;
                break;
            
            case CURRENT_SQUARE_CHUTE_49:
                System.out.println("Eating too much candy got you sick and brings you back to square 11.");
                currentSquareNumber = NEW_SQUARE_CHUTE_11;
                break;
            
            case CURRENT_SQUARE_LADDER_51:
                System.out.println("You've been rewarded for doing your chores. Move ahead to square 67.");
                currentSquareNumber = NEW_SQUARE_LADDER_67;
                break;
            
            case CURRENT_SQUARE_CHUTE_56:
                System.out.println("Playing in the rain got you sick and brings you back to square 53.");
                currentSquareNumber = NEW_SQUARE_CHUTE_53;
                break;
            
            case CURRENT_SQUARE_CHUTE_62:
                System.out.println("Dropping and broking the dishes brings you back to square 19.");
                currentSquareNumber = 19;
                break;
            
            case CURRENT_SQUARE_CHUTE_64:
                System.out.println("Doing tricks on your bike and broking your arm brings you back to square 60");
                currentSquareNumber = NEW_SQUARE_CHUTE_60;
                break;
            
            case CURRENT_SQUARE_LADDER_71:
                System.out.println("You've been rewarded ice cream for finding a lady's purse. Move ahead to square 91.");
                currentSquareNumber = NEW_SQUARE_LADDER_91;
                break;
            
            case CURRENT_SQUARE_LADDER_80:
                System.out.println("You been rewarded the first prize for taking your dog to the pet show. Move ahead to square 100.");
                currentSquareNumber = NEW_SQUARE_LADDER_100;
                break;
            
            case CURRENT_SQUARE_CHUTE_87:
                System.out.println("Snucking cookies and broking the cookie jar brings you back to square 24.");
                currentSquareNumber = NEW_SQUARE_CHUTE_24;
                break;
            
            case CURRENT_SQUARE_CHUTE_93:
                System.out.println("Writing on the wall with crayons brings you back to square 73.");
                currentSquareNumber = NEW_SQUARE_CHUTE_73;
                break;
            
            case CURRENT_SQUARE_CHUTE_95:
                System.out.println("Breaking a window playing baseball brings you back to square 75.");
                currentSquareNumber = NEW_SQUARE_CHUTE_75;
                break;
            
            case CURRENT_SQUARE_CHUTE_98:
                System.out.println("Grabbing the cat's tail made the cat scratching you. Move back to square 78.");
                currentSquareNumber = NEW_SQUARE_CHUTE_78;
                break;
        
        }   // Ending of bracket switch
        
    }   // Ending of bracket VerifyChuteOrLadder Method

    
 
    
    /**
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @param name the player to set
     */
    public void setName(String playerName) {
        this.name = playerName;
    }

}   // Ending bracket Player Class
