
public class DicePlayer {
    private String name;
    private int score;
    
    public DicePlayer(String newName){
        this.setName(newName);
        this.setScore(0);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    private void setScore(int score) {
        this.score = score;
    }
    
    public void updateScore(int update){
        this.setScore(this.getScore() + update);
    }
    
    

}
