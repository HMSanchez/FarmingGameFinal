package app;

public class Dice {

    private Die die1;  
    private Die die2;   
    
    public Dice() {
  die1 = new Die();
  die2 = new Die();
        
    }
    
    public void roll() {
die1.roll();
die2.roll();
      
    }
             
    public int getDie1() {
          
       return die1.getFaceValue();
    }
    
    public int getDie2() {
          
       return die2.getFaceValue();
    }
    
    public int sum() {
          int sum = die1.getFaceValue() + die2.getFaceValue();
       return sum;
    }
}
