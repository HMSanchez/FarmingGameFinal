package app;

public class Account {

	private float balance = 1000;
	private float debt = 0;
	private int cows;
	private int hay = 20;


	private final float DEBT_MAX = 50000;
	private String harvester = "No Harvester owned";
	private String tractor = " No Tractor owned";
	private String p1 = "No property owned";
	private String p2 = "No property owned";
	private String p3 = "No property owned";
	private String p4 = "No property owned";
	
	
	public Account(){
		
	}
	public String getP1() {
		return p1;
	}
	public void setP1(String p1) {
		this.p1 = p1;
	}
	public String getP2() {
		return p2;
	}
	public void setP2(String p2) {
		this.p2 = p2;
	}
	public String getP3() {
		return p3;
	}
	public void setP3(String p3) {
		this.p3 = p3;
	}
	public String getP4() {
		return p4;
	}
	public void setP4(String p4) {
		this.p4 = p4;
	}
	public String getHarvester() {
		return harvester;
	}
	public void setHarvester(String harvester) {
		this.harvester = harvester;
	}
	public String getTractor() {
		return tractor;
	}
	public void setTractor(String tractor) {
		this.tractor = tractor;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public float getDebt() {
		return debt;
	}
	public void setDebt(float debt) {
		this.debt = debt;
	}
	public int getCows() {
		return cows;
	}
	public void setCows(int cows) {
		this.cows = cows;
	}
	public int getHay() {
		return hay;
	}
	public void setHay(int hay) {
		this.hay = hay;
}
	public float getDEBT_MAX() {
		return DEBT_MAX;
	}
	
	
	  @Override
	    public String toString() {
	      
	        return  "BALANCE: " +this.balance + "\n " + "DEBT:" + this.debt + "\n" + "1) LIVESTOCK:" + this.cows + "\n" + "2) ACRES of HAY:" + this.hay + "\n" + "Equipment: \n" + "3)" +this.harvester + "\n" + "4)"+ this.tractor +
	        		"\n" + "Property: \n" + "5)" + this.p1 + "\n" + "6)" + this.p2+ "\n" + "7)" + this.p3 + "\n" + "4)" + this.p4 + "\n" ;
	    }
}