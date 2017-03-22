import java.util.Random;

/**
 * 
 * Class        : Spinner
 * Project 6    : Chutes and Ladders
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-03-08
 * Last Mod.    : 2017-03-08 
 *
 */

public class Spinner {
    private int value;
    private Random randomizer;
    public static final int DIE_MAX_VALUE = 6;
    
    public Spinner(){
        value = 0;
        randomizer = new Random();
    }

    // Value Method
    public int getValue(){
        return value;
        
    }   // Ending Bracket of default constructor
    

    // Spin Method
    public int spin(){
        value = (randomizer.nextInt(DIE_MAX_VALUE) +1);
        return value;
    }   // Ending bracket of constructor
    
}   // Ending bracket Spinner Class
