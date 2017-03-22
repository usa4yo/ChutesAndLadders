
public class Dice {

    private Die die1;
    private Die die2;
    
    public Dice(){
        this(Die.DEFAULT_NUMBER_OF_SIDES);
    }   // Ending bracket of default constructor
        
    
    public Dice (int newNumberOfSides){
        this.die1 = new Die(newNumberOfSides);
        this.die2 = new Die(newNumberOfSides);
        
    }   // Ending bracket of constructor
    
    public void roll(){
        this.die1.roll();
        this.die2.roll();
    
    }   // Ending bracket of roll method
    
    public int getCurrentValue(){
        return (this.die1.getCurrentValue() + this.die2.getCurrentValue());
    
    }   // Ending of getCurrentValue Method
    
    
}   // Ending bracket of class Dice
