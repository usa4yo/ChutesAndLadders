import java.util.Random;

/**
 * \
 * @author ar25
 *
 *      Week 6
 *
 *      Class Name: Die
 *      
 *      Data    
 *          # of sides  (min: 4, max: 20)
 *          Current Value
 *      
 *      Method
 *          roll
 *
 */

public class Die {

    // Declare variables
    private int currentValue;
    private int numberOfSides;
    private Random randomizer;
    
    public static final int DEFAULT_NUMBER_OF_SIDES = 6;
    
    // Die constructor
    public Die(){
        this(DEFAULT_NUMBER_OF_SIDES);
        
    }   // Ending Bracket of default constructor
    
    // Die constructor
    public Die(int newNumberOfSides){
        this.setNumberOfSides(newNumberOfSides);
        this.setCurrentValue(0);
        this.randomizer = new Random();
        
    }   // Ending bracket of constructor
    
    // setCurrentValue Method
    private void setCurrentValue(int newCurrentValue){
        this.currentValue = newCurrentValue;
        
    }   // Ending bracket of Method setCurrentValue
    
    // Method getCurrentValue
    public int getCurrentValue() {
        
        return this.currentValue;
        
    }   // Ending bracket of Method getCurrentValue
    
    // setNumberOfSides Method
    private void setNumberOfSides(int newNumberOfSides){
        if((newNumberOfSides >= 4) && (newNumberOfSides <= 20)){
            this.numberOfSides = newNumberOfSides;            
        } else {
            this.numberOfSides = DEFAULT_NUMBER_OF_SIDES;
        }   // Ending if statement
        
    }   // Ending bracket of method newNumberOfSides
    
    // getNumberOfSides Method
    public int getNumberOfSides(){
        return this.numberOfSides;
        
    }   // Ending bracket of Method getNumberOfSides

    // roll Method
    public int roll() {
        this.setCurrentValue(this.randomizer.nextInt(this.getNumberOfSides()) +1);
        return this.getCurrentValue();
        
    }   // Ending bracket of Method roll
    
}   // Ending bracket of class Die
