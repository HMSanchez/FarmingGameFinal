package app;

public class Card {

	public static enum action{OTB,FF,OE,BOARD}
	private int value;
	private String text;
	private action action;
	
	public Card(String a, action b, int c){
		this.value = c;
		this.action = b;
		this.text = a;
	}
	
	
	public int getValue() {
		return value;
	}


	public action getAction() {
		return action;
	}
	
	
	  @Override
	    public String toString() {
	      
	        return  this.action + ": " + this.text;
	    }
	
	
}
