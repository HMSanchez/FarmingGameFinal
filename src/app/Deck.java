package app;

import java.util.Random;

public class Deck {


	private Card[] otb;
	private Card[] ff;
	private Card[] oe;
	private Card[] Board;
	private Random rand;
	
	
	public Deck(){
		otb = new Card[10];
		otb[0] = new Card("Equipment sale: Harvester Total: $10,000", Card.action.OTB, 1); //10000
		otb[1] = new Card("Neighbor sells out: 10 acres hay as $2,000 per acre Total: $20,000", Card.action.OTB, 2); //20,000
		otb[2] = new Card("Lease Toppenish Ridge for lifetime at $25,000 and buy 50 cows at $500 each Total: $50,000", Card.action.OTB,3); //50,000
		otb[3] = new Card("Lease Rattlesnake Ridge for lifetime at $15,000 and buy 30 cows at $500 each Total: $30,000", Card.action.OTB, 4);//30,000
		otb[4] = new Card("Neighbor goes broke: 5 acres hay as $5,000 per acre Total: $25,000", Card.action.OTB, 5); //25,000
		otb[5] = new Card("Lease Ahtanum Ridge for life time at $10,000  and buy 20 cows at $500 each Total: $20,000", Card.action.OTB,6);//20,000
		otb[6] = new Card("Lease Cascade Ranch for lifetime at $20,000 and buy 40 cows at $500 each Total: 40,000", Card.action.OTB, 7); //40,000
		otb[7] = new Card("Equipment sale: Tractor Total: $10,000", Card.action.OTB, 8); //10,000
		otb[8] = new Card("Neighbor sells out: 15 acres hay as $2,000 per acre Total: 30,000", Card.action.OTB, 9); //30,000
		otb[9] = new Card("Livestock auction: 10 cows at $500 each Total: $5,000", Card.action.OTB, 10); //500
		
		
		ff = new Card[10];
		ff[0] = new Card("Custom hire bill due. If you have no Tractor pay $3,000", Card.action.FF, 1);//3,000
		ff[1] = new Card("Income taxes due pay $7,000", Card.action.FF, 2);//7,000
		ff[2] = new Card("Custom hire bill due. If you have no Tractor pay $3,000", Card.action.FF, 3);//3,000
		ff[3] = new Card("Held some of your calves and the market jumped. Collect $2,000 if you have cows", Card.action.FF, 4);//2,000
		ff[4] = new Card("Marketing co-op holds out for higher price. Processer gives in. Collect $1,000", Card.action.FF, 5);//1,000
		ff[5] = new Card("Custom hire out with your harvester. If you have a harvester collect $2,000", Card.action.FF, 6);//2,000
		ff[6] = new Card("Russian sale boosts hay prices. Collect $2,000", Card.action.FF, 7);//2,000
		ff[7] = new Card("Bank raise prime rate. Pay 10% of outstanding loan balance as additional interest.", Card.action.FF, 8);//10%
		ff[8] = new Card("Drought year. Go to second week of January. Do not Collect $5,000", Card.action.FF, 0);//0
		ff[9] = new Card("Drought year. Go to second week of January. Do not Collect $5,000", Card.action.FF, 0);//0

		
		oe = new Card[10];
		oe[0] = new Card("Gas bill due. Pay $1,000", Card.action.OE, 1);//1,000
		oe[1] = new Card("Parts bill due. Pay $500", Card.action.OE, 2);//500
		oe[2] = new Card("Seed bill due, Pay $3,000", Card.action.OE, 3);//3,000
		oe[3] = new Card("Equipment breakdown. Pay $500", Card.action.OE, 4);//500
		oe[4] = new Card("Monthly electric bill due  for irrigation pumping. Pay $500", Card.action.OE, 5);//500
		oe[5] = new Card("Farmowners insurance due. Pay $1,500", Card.action.OE, 6);//1500
		oe[6] = new Card("Custom hire bill due. Pay $2,000 if you do not own a Harvester", Card.action.OE, 7);//2,000
		oe[7] = new Card("Equipment in shop. Delay costs $1,000", Card.action.OE, 8);//1,000
		oe[8] = new Card("Equipment in shop. Delay costs $1,000", Card.action.OE, 9);//1,000
		oe[9] = new Card("Custom hire bill due. Pay $2,000 if you do not own a Tractor", Card.action.OE, 10);//2,000

		Board = new Card[27];
		Board[1] = new Card("Hibernate Draw OTB", Card.action.BOARD,1);
		Board[2] = new Card("Bitter cold spell, Pay $500 if you own cows", Card.action.BOARD,500);
		Board[3] = new Card("Warm snap your in the field 2 weeks early. Collect $1000", Card.action.BOARD,1000);
		Board[4] = new Card("Stuck in a muddy corral. Collect Farmer's Fate", Card.action.BOARD,4);
		Board[5] = new Card("Rainy Day. Draw OTB", Card.action.BOARD,5);
		Board[6] = new Card("Start plowing late. Pay $500", Card.action.BOARD,500);
		Board[7] = new Card("Hurt your back. Go back to second week of January", Card.action.BOARD,7); //[2]
		Board[8] = new Card("Done plowing take a day off. Draw OTB", Card.action.BOARD,8);
		Board[9] = new Card("More rain. Fieldwork shutdown. Pay $500", Card.action.BOARD,500);
		Board[10] = new Card("Equipment breakdown. Pay $1000", Card.action.BOARD,1000);
		Board[11] = new Card("The whole valley is green. Collect $500", Card.action.BOARD,500);
		Board[12] = new Card("Windstorm makes you replant corn. Pay $500", Card.action.BOARD,500);
		
		Board[13] = new Card("Cut your hay just right. Collect $1,000", Card.action.BOARD,1000);
		Board[14] = new Card("Memorial Day Weekend. Draw OTB", Card.action.BOARD,14);
		Board[15] = new Card("Good growing weather. Collect $500", Card.action.BOARD,15);
		Board[16] = new Card("Dust Storm. Draw Farmer's Fate", Card.action.BOARD,16);//
		Board[17] = new Card("Finish Hay Harvest with no breakdowns. Collect $500", Card.action.BOARD,17);
		Board[18] = new Card("Hot! Wish you were in the mountains. Draw OTB", Card.action.BOARD,18);
		Board[19] = new Card("Sunny Skies at the County Fair. Draw OTB", Card.action.BOARD,19); //pos change harvest
		Board[20] = new Card("Tractor owners: bale hay, then go to third week of November. Collect your $1,000 from there ", Card.action.BOARD,20); //pos change 
		Board[21] = new Card("Market collapes, cut Livestock check in half", Card.action.BOARD,21);//COW
		Board[22] = new Card("Indian Summer. Collect $500", Card.action.BOARD,22);//COW
		Board[23] = new Card("Good Pheasant hunting. Draw Farmer's Fate", Card.action.BOARD,23);
		Board[24] = new Card("Park your baler for the winter. Draw OTB", Card.action.BOARD,24);
		Board[25] = new Card("Good weather harvest winding up. Collect $500", Card.action.BOARD,25);//
		Board[26] = new Card("Christmas Vacation. Collect $1,000 bonus", Card.action.BOARD,25);
		
		
		
		
		rand = new Random();
	}
	
	public Card getCard(float a) {
		Card card = null;
		if(a ==1){
		int index = rand.nextInt(this.otb.length);
 card =  otb[index];}
		else if(a==2){
			int index = rand.nextInt(this.otb.length);
			 card =  ff[index];
		}else if(a==3){
			int index = rand.nextInt(this.otb.length);
			card =  oe[index];
		}
		return card;
	}
	
	public Card getCard(int position){
		int index = position;
Card card =  Board[index];		
		return card;
	}
	public void dislpayC(int a){
		System.out.println(Board[a]);
	}
	
}
