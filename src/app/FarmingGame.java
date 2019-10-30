package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FarmingGame {
	Dice d1 = new Dice();
	Player j = new Player();
	Account k = new Account();
	Deck jk = new Deck();
	int tractorct = 0;
	int harvesterct = 0;
	int otbct = 0;
	private FarmingGame g;

	public static void main(String[] args) throws IOException {
		FarmingGame g = new FarmingGame();
		g.run();

	}

	public FarmingGame() {

	}

	public void run() throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int position = 0;
		boolean valid = false;

		System.out.println("The Farming Game");
		System.out.println();
		do {
			System.out.println("Main Menu");
			System.out.println("1) Roll Dice(Move)");
			System.out.println("2) Display Account");
			System.out.println("3) Start a new Game");
			System.out.println("4) Sell Assets/Pay off Debt");
			System.out.println("5) Exit");
			System.out.print("Make a selection: ");
			int opt = Integer.parseInt(read.readLine());
System.out.println();
			if (opt > 5 || opt < 0) {
				System.out.println("Invalid");
				valid = false;
			}
			switch (opt) {
			case 1:
				d1.roll();
				position += d1.getDie1();
				System.out.println();
				System.out.println("You rolled a " + d1.getDie1());
				j.setPosition(position);
				if (j.getPosition() == 7) {
					position = 2;

				}
				System.out.println("Position is space: " + j.getPosition());

				Card b = jk.getCard(j.getPosition());
				System.out.println(b);
				if (j.getPosition() == 1 || j.getPosition() == 5 || j.getPosition() == 8 || j.getPosition() == 14
						|| j.getPosition() == 18 || j.getPosition() == 19 || j.getPosition() == 24) {
					switch (j.getPosition()) {
					case 1:
					case 5:
					case 8:
					case 14:
					case 18:
					case 19:
					case 24:
						Card card = jk.getCard(1F);
						System.out.println(card);
						if (k.getBalance() < 10000) {
							System.out.println("Not even $ to purchase");
							System.out.println("Would you like to Take out a Bank Note(Loan)? 1-YES 2-NO");
							int opts = Integer.parseInt(read.readLine());
							if (opts == 1) {
								if (card.getValue() == 10) {
									k.setDebt(k.getDebt() + 5000);
									k.setCows(k.getCows() + 10);
									otbct++;
								} else if (card.getValue() == 3) {
									k.setDebt(k.getDebt() + 50000);
									k.setCows(k.getCows() + 50);
									k.setP1("Toppenish Ridge");
									otbct++;
								} else if (card.getValue() == 5) {
									k.setDebt(k.getDebt() + 25000);
									k.setHay(k.getHay() + 5);
									otbct++;
								} else if (card.getValue() == 1) {
									k.setDebt(k.getDebt() + 10000);
									k.setHarvester("Harvester owned");
									harvesterct++;
									otbct++;
								} else if (card.getValue() == 2) {
									k.setDebt(k.getDebt() + 20000);
									k.setHay(k.getHay() + 10);
									otbct++;
								} else if (card.getValue() == 4) {
									k.setDebt(k.getDebt() + 30000);
									k.setCows(k.getCows() + 30);
									k.setP2("Rattlesnake Ridge");
									otbct++;
								} else if (card.getValue() == 6) {
									k.setDebt(k.getDebt() + 20000);
									k.setCows(k.getCows() + 20);
									k.setP3("Ahtanum Ridge");
									otbct++;
								} else if (card.getValue() == 7) {
									k.setDebt(k.getDebt() + 40000);
									k.setCows(k.getCows() + 40);
									k.setP4("Cascade Ranch");
									otbct++;
								} else if (card.getValue() == 8) {
									k.setDebt(k.getDebt() + 10000);
									k.setTractor("Tractor owned");
									tractorct++;
									otbct++;
								} else if (card.getValue() == 9) {
									k.setDebt(k.getDebt() + 30000);
									k.setHay(k.getHay() + 15);
									otbct++;
								} else {
									System.out.println();
								}

							} else {
								System.out.println("Moving on");
							}
				

						}
						if (k.getDebt() > k.getDEBT_MAX()) {
							System.out.println("Bankrupt. Debt over $50,000");
							
						}
					}

					if (j.getPosition() < 12) {
						System.out.println("Unable to receive check for Hay or Livestock yet");
					} else if (j.getPosition() == 14 || j.getPosition() == 13 || j.getPosition() == 22
							|| j.getPosition() == 16 || j.getPosition() == 24 || j.getPosition() == 23
							|| j.getPosition() == 26 || j.getPosition() == 25 || j.getPosition() == 17
							|| j.getPosition() == 19 || j.getPosition() == 18 || j.getPosition() == 20
							|| j.getPosition() == 21) {
						System.out.println("Able to Harvest/Livetock Check");

						d1.roll();
						int cow = d1.getDie1();
						switch (j.getPosition()){

						case 21:
						case 22:
							if (cow == 1 && k.getCows() == 10) {
								System.out.println("Livestock check for $1,400");
								k.setBalance(k.getBalance() + 1400);
							} else if (cow == 1 && k.getCows() == 20) {
								System.out.println("Livestock check for $2,800");
								k.setBalance(k.getCows() + 2800);
							} else if (cow == 1 && k.getCows() == 30) {
								System.out.println("Livestock check for $4,200");
								k.setBalance(k.getBalance() + 4200);
							} else if (cow == 1 && k.getCows() == 40) {
								System.out.println("Livestock check for $5,600");
								k.setBalance(k.getBalance() + 5600);
							} else if (cow == 1 && k.getCows() == 50) {
								System.out.println("Livestock check for $7,000");
								k.setBalance(k.getBalance() + 7000);
							} else if (cow == 1 && k.getCows() == 60) {
								k.setBalance(k.getBalance() + 8400);
								System.out.println("Livestock check for $8,400");
							}

							else if (cow == 2 && k.getCows() == 10) {
								k.setBalance(k.getBalance() + 2000);
								System.out.println("Livestock check for $2,000");
							} else if (cow == 2 && k.getCows() == 20) {
								k.setBalance(k.getBalance() + 4000);
								System.out.println("Livestock check for $4,000");
							} else if (cow == 2 && k.getCows() == 30) {
								k.setBalance(k.getBalance() + 6000);
								System.out.println("Livestock check for $6,000");
							} else if (cow == 2 && k.getCows() == 40) {
								k.setBalance(k.getBalance() + 8000);
								System.out.println("Livestock check for $8,000");
							} else if (cow == 2 && k.getCows() == 50) {
								k.setBalance(k.getBalance() + 10000);
								System.out.println("Livestock check for $10,000");
							} else if (cow == 2 && k.getCows() == 60) {
								k.setBalance(k.getBalance() + 12000);
								System.out.println("Livestock check for $12,000");
							}

							else if (cow == 3 && k.getCows() == 10) {
								k.setBalance(k.getBalance() + 2800);
								System.out.println("Livestock check for $2,800");
							} else if (cow == 3 && k.getCows() == 20) {
								k.setBalance(k.getBalance() + 5600);
								System.out.println("Livestock check for $5,600");
							} else if (cow == 3 && k.getCows() == 30) {
								k.setBalance(k.getBalance() + 8400);
								System.out.println("Livestock check for $8,400");
							} else if (cow == 3 && k.getCows() == 40) {
								k.setBalance(k.getBalance() + 11200);
								System.out.println("Livestock check for $11,200");
							} else if (cow == 3 && k.getCows() == 50) {
								k.setBalance(k.getBalance() + 14000);
								System.out.println("Livestock check for $14,000");
							} else if (cow == 3 && k.getCows() == 60) {
								k.setBalance(k.getBalance() + 16800);
								System.out.println("Livestock check for $16,800");
							}

							else if (cow == 4 && k.getCows() == 10) {
								k.setBalance(k.getBalance() + 3800);
								System.out.println("Livestock check for $3,800");
							} else if (cow == 4 && k.getCows() == 20) {
								k.setBalance(k.getBalance() + 7600);
								System.out.println("Livestock check for $7,600");
							} else if (cow == 4 && k.getCows() == 30) {
								k.setBalance(k.getBalance() + 11400);
								System.out.println("Livestock check for $11,400");
							} else if (cow == 4 && k.getCows() == 40) {
								k.setBalance(k.getBalance() + 15200);
								System.out.println("Livestock check for $15,200");
							} else if (cow == 4 && k.getCows() == 50) {
								k.setBalance(k.getBalance() + 19000);
								System.out.println("Livestock check for $19,000");
							} else if (cow == 4 && k.getCows() == 60) {
								k.setBalance(k.getBalance() + 22800);
								System.out.println("Livestock check for $22,800");
							}

							else if (cow == 5 && k.getCows() == 10) {
								k.setBalance(k.getBalance() + 5000);
								System.out.println("Livestock check for $5,000");
							} else if (cow == 5 && k.getCows() == 20) {
								k.setBalance(k.getBalance() + 10000);
								System.out.println("Livestock check for $10,000");
							} else if (cow == 5 && k.getCows() == 30) {
								k.setBalance(k.getBalance() + 15000);
								System.out.println("Livestock check for $15,000");
							} else if (cow == 5 && k.getCows() == 40) {
								k.setBalance(k.getBalance() + 20000);
								System.out.println("Livestock check for $20,000");
							} else if (cow == 5 && k.getCows() == 50) {
								k.setBalance(k.getBalance() + 25000);
								System.out.println("Livestock check for $25,000");
							} else if (cow == 5 && k.getCows() == 60) {
								k.setBalance(k.getBalance() + 30000);
								System.out.println("Livestock check for $30,000");
							}

							else if (cow == 6 && k.getCows() == 10) {
								k.setBalance(k.getBalance() + 7500);
								System.out.println("Livestock check for $7,500");
							} else if (cow == 6 && k.getCows() == 20) {
								k.setBalance(k.getBalance() + 15000);
								System.out.println("Livestock check for $15,000");
							} else if (cow == 6 && k.getCows() == 30) {
								k.setBalance(k.getBalance() + 22500);
								System.out.println("Livestock check for $22,500");
							} else if (cow == 6 && k.getCows() == 40) {
								k.setBalance(k.getBalance() + 30000);
								System.out.println("Livestock check for $30,000");
							} else if (cow == 6 && k.getCows() == 50) {
								k.setBalance(k.getBalance() + 37500);
								System.out.println("Livestock check for $37,500");
							} else if (cow == 6 && k.getCows() == 60) {
								k.setBalance(k.getBalance() + 45000);
								System.out.println("Livestock check for $44,500");
							}

							break;

						case 13:
						case 14:
						case 16:
						case 17:
						case 18:
						case 19:
						case 20:
						case 23:
						case 24:
						case 26:
					
							if (cow == 1 && k.getHay() == 10 || k.getHay() == 5) {
								System.out.println("Harvested 10 acres of hay for $400");
								k.setBalance(k.getBalance() + 400);
							} else if (cow == 1 && k.getHay() == 20 || k.getHay() == 15) {
								System.out.println("Harvested 20 acres of hay for $800");
								k.setBalance(k.getBalance() + 800);
							} else if (cow == 1 && k.getHay() == 30 || k.getHay() == 25) {
								System.out.println("Harvested 30 acres of hay for $1,200");
								k.setBalance(k.getBalance() + 1200);
							} else if (cow == 1 && k.getHay() == 40 || k.getHay() == 35) {
								System.out.println("Harvested 40 acres of hay for $1,600");
								k.setBalance(k.getBalance() + 1600);
							} else if (cow == 1 && k.getHay() == 50 || k.getHay() == 45) {
								System.out.println("Harvested 50 acres of hay for $2,000");
								k.setBalance(k.getBalance() + 2000);
							} else if (cow == 1 && k.getHay() == 60 || k.getHay() == 55) {
								k.setBalance(k.getBalance() + 2400);
								System.out.println("Harvested 60 acres of hay for $2,400");
							}

							else if (cow == 2 && k.getHay() == 10 || k.getHay() == 5) {
								k.setBalance(k.getBalance() + 600);
								System.out.println("Harvested 10 acres of hay for $600");
							} else if (cow == 2 && k.getHay() == 20 || k.getHay() == 15) {
								k.setBalance(k.getBalance() + 1200);
								System.out.println("Harvested 20 acres of hay for $1,200");
							} else if (cow == 2 && k.getHay() == 30 || k.getHay() == 25) {
								k.setBalance(k.getBalance() + 1800);
								System.out.println("Harvested 30 acres of hay for $1,800");
							} else if (cow == 2 && k.getHay() == 40 || k.getHay() == 35) {
								k.setBalance(k.getBalance() + 2400);
								System.out.println("Harvested 40 acres of hay for $2,400");
							} else if (cow == 2 && k.getHay() == 50 || k.getHay() == 45) {
								k.setBalance(k.getBalance() + 3000);
								System.out.println("Harvested 50 acres of hay for $3,000");
							} else if (cow == 2 && k.getHay() == 60 || k.getHay() == 55) {
								k.setBalance(k.getBalance() + 3600);
								System.out.println("Harvested 60 acres of hay for $3,600");
							}

							else if (cow == 3 && k.getHay() == 10 || k.getHay() == 5) {
								k.setBalance(k.getBalance() + 1000);
								System.out.println("Harvested 10 acres of hay for $1,000");
							} else if (cow == 3 && k.getHay() == 20 || k.getHay() == 15) {
								k.setBalance(k.getBalance() + 2000);
								System.out.println("Harvested 20 acres of hay for $2,000");
							} else if (cow == 3 && k.getHay() == 30 || k.getHay() == 25) {
								k.setBalance(k.getBalance() + 3000);
								System.out.println("Harvested 30 acres of hay for $3,000");
							} else if (cow == 3 && k.getHay() == 40 || k.getHay() == 35) {
								k.setBalance(k.getBalance() + 4000);
								System.out.println("Harvested 40 acres of hay for $4,000");
							} else if (cow == 3 && k.getHay() == 50 || k.getHay() == 45) {
								k.setBalance(k.getBalance() + 5000);
								System.out.println("Harvested 50 acres of hay for $5,000");
							} else if (cow == 3 && k.getHay() == 60 || k.getHay() == 55) {
								k.setBalance(k.getBalance() + 6000);
								System.out.println("Harvested 60 acres of hay for $6,000");
							}

							else if (cow == 4 && k.getHay() == 10 || k.getHay() == 5) {
								k.setBalance(k.getBalance() + 1500);
								System.out.println("Harvested 10 acres of hay for $1,500");
							} else if (cow == 4 && k.getHay() == 20 || k.getHay() == 15) {
								k.setBalance(k.getBalance() + 3000);
								System.out.println("Harvested 20 acres of hay for $3,000");
							} else if (cow == 4 && k.getHay() == 30 || k.getHay() == 25) {
								k.setBalance(k.getBalance() + 4500);
								System.out.println("Harvested 30 acres of hay for $4,500");
							} else if (cow == 4 && k.getHay() == 40 || k.getHay() == 35) {
								k.setBalance(k.getBalance() + 6000);
								System.out.println("Harvested 40 acres of hay for $6,000");
							} else if (cow == 4 && k.getHay() == 50 || k.getHay() == 45) {
								k.setBalance(k.getBalance() + 7500);
								System.out.println("Harvested 50 acres of hay for $7,500");
							} else if (cow == 4 && k.getHay() == 60 || k.getHay() == 55) {
								k.setBalance(k.getBalance() + 9500);
								System.out.println("Harvested 60 acres of hay for $9,500");
							}

							else if (cow == 5 && k.getHay() == 10 || k.getHay() == 5) {
								k.setBalance(k.getBalance() + 2200);
								System.out.println("Harvested 10 acres of hay for $2,200");
							} else if (cow == 5 && k.getHay() == 20 || k.getHay() == 15) {
								k.setBalance(k.getBalance() + 4400);
								System.out.println("Harvested 20 acres of hay for $4,400");
							} else if (cow == 5 && k.getHay() == 30 || k.getHay() == 25) {
								k.setBalance(k.getBalance() + 6600);
								System.out.println("Harvested 30 acres of hay for $6,600");
							} else if (cow == 5 && k.getHay() == 40 || k.getHay() == 35) {
								k.setBalance(k.getBalance() + 8800);
								System.out.println("Harvested 40 acres of hay for $8,800");
							} else if (cow == 5 && k.getHay() == 50 || k.getHay() == 45) {
								k.setBalance(k.getBalance() + 11000);
								System.out.println("Harvested 50 acres of hay for $11,000");
							} else if (cow == 5 && k.getHay() == 60 || k.getHay() == 55) {
								k.setBalance(k.getBalance() + 13200);
								System.out.println("Harvested 60 acres of hay for $13,200");
							}

							else if (cow == 6 && k.getHay() == 10 || k.getHay() == 5) {
								k.setBalance(k.getBalance() + 3000);
								System.out.println("Harvested 10 acres of hay for $3,000");
							} else if (cow == 6 && k.getHay() == 20 || k.getHay() == 15) {
								k.setBalance(k.getBalance() + 6000);
								System.out.println("Harvested 20 acres of hay for $6,000");
							} else if (cow == 6 && k.getHay() == 30 || k.getHay() == 25) {
								k.setBalance(k.getBalance() + 9000);
								System.out.println("Harvested 30 acres of hay for $9,000");
							} else if (cow == 6 && k.getHay() == 40 || k.getHay() == 35) {
								k.setBalance(k.getBalance() + 12000);
								System.out.println("Harvested 40 acres of hay for $12,000");
							} else if (cow == 6 && k.getHay() == 50 || k.getHay() == 45) {
								k.setBalance(k.getBalance() + 15000);
								System.out.println("Harvested 50 acres of hay for $15,000");
							} else if (cow == 6 && k.getHay() == 60 || k.getHay() == 55) {
								k.setBalance(k.getBalance() + 18000);
								System.out.println("Harvested 60 acres of hay for $18,000");
							}
							break;
						}
						Card oe = jk.getCard(3F);
						System.out.println(oe);
						if (oe.getValue() == 1) {
							if(k.getBalance() >1000){
							k.setBalance(k.getBalance() - 1000);
							}else{
								k.setDebt(k.getBalance()+1000);
								k.setBalance(0);
							}
						} else if (oe.getValue() == 2) {
							if(k.getBalance() >500){
							k.setBalance(k.getBalance() - 500);
							}else{
								k.setDebt(k.getBalance()+500);
								k.setBalance(0);
							}
						} else if (oe.getValue() == 3) {
							if(k.getBalance() >3000){
							k.setBalance(k.getBalance() - 3000);
							}else{
								k.setDebt(k.getBalance()+3000);
								k.setBalance(0);
							}

						} else if (oe.getValue() == 4) {
							if(k.getBalance() >500){
							k.setBalance(k.getBalance() - 500);
							}else{
								k.setDebt(k.getBalance()+500);
								k.setBalance(0);
							}

						} else if (oe.getValue() == 5) {
							if(k.getBalance() >500){
							k.setBalance(k.getBalance() - 500);
							}else{
								k.setDebt(k.getBalance()+500);
								k.setBalance(0);
							}

						} else if (oe.getValue() == 6) {
							if(k.getBalance() >1500){
							k.setBalance(k.getBalance() - 1500);
							}else{
								k.setDebt(k.getBalance()+1500);
								k.setBalance(0);
							}

						} else if (oe.getValue() == 7) {
							if (harvesterct == 0) {
								if (k.getBalance() > 2000) {
									k.setBalance(k.getBalance() - 2000);
								} else {
									k.setDebt(k.getDebt() + 2000);
									k.setBalance(0);
								}
							} else {
								System.out.println("You own a Harvester");
							}

						} else if (oe.getValue() == 8) {
							if(k.getBalance() >1000){
							k.setBalance(k.getBalance() - 1000);
							}else{
								k.setDebt(k.getBalance()+1000);
								k.setBalance(0);
							}

						} else if (oe.getValue() == 9) {
							if(k.getBalance() >1000){
							k.setBalance(k.getBalance() - 1000);
							}else{
								k.setDebt(k.getBalance()+1000);
								k.setBalance(0);
							}

						} else if (oe.getValue() == 10) {
							if (tractorct == 0) {
								if (k.getBalance() > 2000) {
									k.setBalance(k.getBalance() - 2000);
								} else {
									k.setDebt(k.getDebt() + 2000);
									k.setBalance(0);
								}
							} else {
								System.out.println("You own a tractor");
							}

						} else {
							System.out.println();
						}

					}

				} else if (j.getPosition() == 2 || j.getPosition() == 3 || j.getPosition() == 4 || j.getPosition() == 6
						|| j.getPosition() == 7 || j.getPosition() == 9 || j.getPosition() == 10
						|| j.getPosition() == 11 || j.getPosition() == 12 || j.getPosition() == 13
						|| j.getPosition() == 15 || j.getPosition() == 16 || j.getPosition() == 22
						|| j.getPosition() == 23 || j.getPosition() == 26 || j.getPosition() == 25
						|| j.getPosition() == 17 || j.getPosition() == 19) {
					switch (j.getPosition()) {
					case 2:
						if (k.getCows() > 0) {
							if (k.getBalance() > 500) {
								k.setBalance(k.getBalance() - 500);
							} else {
								k.setDebt(k.getDebt() + 500);
								k.setBalance(0);
							}
						} else {
							System.out.println("no cows owned");
						}
						break;
					case 3:
					case 13:
					case 26:
						k.setBalance(k.getBalance() + 1000);

						break;
					case 4:
					case 16:
					case 23:
						Card ff = jk.getCard(2F);
						System.out.println(ff);
						if (ff.getValue() == 0) {
							
							position = 2;
						} else if (ff.getValue() == 3) {
							if (tractorct == 0) {
								if (k.getBalance() < 3000) {
									k.setDebt(k.getDebt() + 3000);
									k.setBalance(0);
								} else {

									k.setBalance(k.getBalance() - 3000);
								}
							} else {
								System.out.println("Tractor owned");
							}
						} else if (ff.getValue() == 5) {
							k.setBalance(k.getBalance() + 1000);

						} else if (ff.getValue() == 1) {

							if (tractorct == 0) {
								if (k.getBalance() < 3000) {
									k.setDebt(k.getDebt() + 3000);
									k.setBalance(0);
								} else {

									k.setBalance(k.getBalance() - 3000);
								}
							} else {
								System.out.println("Tractor owned");
							}

						} else if (ff.getValue() == 2) {
							if (k.getBalance() < 7000) {
								k.setDebt(k.getDebt() + 7000);
							} else {
								k.setBalance(k.getBalance() - 7000);
							}

						} else if (ff.getValue() == 4) {
							if (k.getCows() > 0) {
								k.setBalance(k.getBalance() + 2000);
							} else {
								System.out.println("No cows owned");
							}

						} else if (ff.getValue() == 6) {
							if (harvesterct == 1) {
								k.setBalance(k.getBalance() + 2000);
							} else {
								System.out.println("No Harvester owned");
							}

						} else if (ff.getValue() == 7) {
							k.setBalance(k.getBalance() + 2000);

						} else if (ff.getValue() == 8) {
							k.setDebt(k.getDebt() + k.getDebt() / 10);

						} else {
							System.out.println();
						}
						break;
					case 7:
						j.setPosition(2);
						break;
					case 6:
					case 9:
					case 12:
						if (k.getBalance() > 500) {
							k.setBalance(k.getBalance() - 500);
						} else {
							k.setBalance(0);
							k.setDebt(k.getDebt() + 500);
						}

						break;
					case 15:
					case 22:
					case 25:

						k.setBalance((k.getBalance() + 500));

						break;

					case 10:
						if (k.getBalance() < 1000) {
							k.setDebt(k.getDebt() + 1000);
							k.setBalance(0);
						} else {
							k.setBalance(k.getBalance() - 1000);
						}
						break;
					case 11:
					case 17:
						k.setBalance(k.getBalance() + 500);

						break;

					case 20:
						position = 20;
						k.setBalance(k.getBalance()+1000);
						break;

					default:
						System.out.println("what");
						break;

					}
				} else

					break;
				break;
			case 2:

				System.out.println(k);
				valid = false;
				break;
			case 3:

				System.out.println("Start a new Game");
				position = 0;
				k.setBalance(1000);
				k.setDebt(0);
				k.setCows(0);
				k.setHay(20);
				k.setHarvester("No Harvester");
				k.setTractor("No Tractor");
				k.setP1("No property owned");
				k.setP2("No property owned");
				k.setP3("No property owned");
				k.setP4("No property owned");
				tractorct = 0;
				harvesterct = 0;
				otbct = 0;
				valid = false;

				break;
			case 4:
				String message = "No property owned";
				boolean isValid = false;
				do{
				System.out.println("Would you like to sell any assets? 1-YES 2-NO");
				int in = Integer.parseInt(read.readLine());
				if(in ==1){
				switch (in) {
				case 1:
					System.out.println(k);
					System.out.println("What would you like to sell? 1-8 to select");
					int num = Integer.parseInt(read.readLine());
					if (num < 1 || num > 8) {
						System.out.println("Inavlid input");
						isValid = false;
					}
					switch (num) {
					case 1:
						if (k.getCows() == 0) {
							System.out.println("No cows to sell");
						} else {
							System.out.println(
									"How many cows would you like to sell at $500 each? MAY ONLY SELL BY TENS 10,20, etc..");
							int sell = Integer.parseInt(read.readLine());
							if((k.getCows() -sell) <0){
								System.out.println("Selling unowned amount. Please re-enter");
								isValid=false;
							}
							if (sell % 10 != 0) {
								isValid = false;
							} else {
								System.out.println(
										"Would you like to add funds to Balance or Pay off Debt? 1- BAL  2-DEBT");
								int num2 = Integer.parseInt(read.readLine());
								if (num2 == 1) {
									System.out.println(sell + " Cows sold ");
									k.setCows(k.getCows() - sell);
									k.setBalance(k.getBalance() + sell * 500);
								} else if (num2 == 2) {
									System.out.println(sell + " Cows sold ");
									k.setCows(k.getCows() - sell);
									k.setDebt(k.getDebt() - sell * 500);

								}
							}
						}
						break;
					case 2:
						if (k.getHay() == 0) {
							System.out.println("No Hay to sell");
						} else {
							System.out.println(
									"How many acres of hay would you like to sell at $2,000 an acre? MAY ONLY SELL BY TENS 10,20, etc..");
							int sell = Integer.parseInt(read.readLine());
							if((k.getHay() -sell)<0 ){
								System.out.println("Selling amount of hay that you don't have. Please re-enter");
								isValid=false;
							}
							if (sell % 10 != 0 ) {
								isValid = false;
							} else {
								System.out.println(
										"Would you like to add funds to Balance or Pay off Debt? 1- BAL  2-DEBT");
								int num2 = Integer.parseInt(read.readLine());
								if (num2 == 1) {
									System.out.println( sell + " Acres of hay sold ");
					k.setHay(k.getHay()-sell);
					k.setBalance(k.getBalance()+sell*2000);
								
								} else if (num2 == 2) {
									System.out.println(sell +" Acres of hay sold ");
									k.setHay(k.getHay()-sell);
									k.setDebt(k.getDebt() - sell*2000);

								}
							}
						}
						break;
					case 3:
						if (tractorct == 0) {
							System.out.println("No Tractor to sell");
						} else {
							System.out.println(
									"Tractor to be sold for $10,000");
							int sell = 100000;
								System.out.println(
										"Would you like to add funds to Balance or Pay off Debt? 1- BAL  2-DEBT");
								int num2 = Integer.parseInt(read.readLine());
								if (num2 == 1) {
									System.out.println( sell + " Tractor sold ");
					k.setTractor("No Tractor owned");
					tractorct=0;
					k.setBalance(k.getBalance()+sell);
								
								} else if (num2 == 2) {
									System.out.println(sell +"Tractor sold ");
									k.setTractor("No Tractor owned");
									tractorct=0;
									k.setDebt(k.getDebt() - sell);

								}
							}
						
						break;
				case 4:
					if (harvesterct == 0) {
						System.out.println("No Harvester to sell");
					} else {
						System.out.println(
								"Harvester to be sold for $10,000");
						int sell = 100000;
							System.out.println(
									"Would you like to add funds to Balance or Pay off Debt? 1- BAL  2-DEBT");
							int num2 = Integer.parseInt(read.readLine());
							if (num2 == 1) {
								System.out.println( sell + " Harvester sold ");
				k.setHarvester("No Harvester owned");
				harvesterct=0;
				k.setBalance(k.getBalance()+sell);
							
							} else if (num2 == 2) {
								System.out.println(sell +"Harvester sold ");
								k.setHarvester("No Harvester owned");
								harvesterct=0;
								k.setDebt(k.getDebt() - sell);

							}
						}
					
					break;
					case 5:
						if (k.getP1().equals(message)) {
							System.out.println("Property not owned");

						} else {

							System.out
									.println("Would you like to add funds to Balance or Pay off Debt? 1- BAL  2-DEBT");
							int num2 = Integer.parseInt(read.readLine());
							if (num2 == 1) {
								System.out.println("Property sold ");
								k.setP1("Property not owned");
								k.setBalance(k.getBalance() + 25000);
							} else if (num2 == 2) {
								System.out.println("Property sold ");
								k.setP1("Property not owned");
								k.setDebt(k.getDebt() - 25000);

							}
						}
						break;
					case 6:
						if (k.getP2().equals(message)) {
							System.out.println("Property not owned");

						} else {

							System.out
									.println("Would you like to add funds to Balance or Pay off Debt? 1- BAL  2-DEBT");
							int num2 = Integer.parseInt(read.readLine());
							if (num2 == 1) {
								System.out.println("Property sold ");
								k.setP1("Property not owned");
								k.setBalance(k.getBalance() + 15000);
							} else if (num2 == 2) {
								System.out.println("Property sold ");
								k.setP1("Property not owned");
								k.setDebt(k.getDebt() - 15000);

							}
						}
						break;
					case 7:
						if (k.getP3().equals(message)) {
							System.out.println("Property not owned");

						} else {

							System.out
									.println("Would you like to add funds to Balance or Pay off Debt? 1- BAL  2-DEBT");
							int num2 = Integer.parseInt(read.readLine());
							if (num2 == 1) {
								System.out.println("Property sold ");
								k.setP1("Property not owned");
								k.setBalance(k.getBalance() + 10000);
							} else if (num2 == 2) {
								System.out.println("Property sold ");
								k.setP1("Property not owned");
								k.setDebt(k.getDebt() - 10000);

							}
						}
						break;
					case 8:
						if (k.getP4().equals(message)) {
							System.out.println("Property not owned");

						} else {

							System.out
									.println("Would you like to add funds to Balance or Pay off Debt? 1- BAL  2-DEBT");
							int num2 = Integer.parseInt(read.readLine());
							if (num2 == 1) {
								System.out.println("Property sold ");
								k.setP1("Property not owned");
								k.setBalance(k.getBalance() + 20000);
							} else if (num2 == 2) {
								System.out.println("Property sold ");
								k.setP1("Property not owned");
								k.setDebt(k.getDebt() - 20000);

							}
						}
						break;
					}

		System.out.println("Would you like to sell more? 1-YES 2-NO");
		int redraw = Integer.parseInt(read.readLine());
		if(redraw ==1){
			isValid=false;
		}else{
isValid=true;			
		}
				}
				}else{
				System.out.println("How much would you like pay?");
				float pay = Integer.parseInt(read.readLine());

				k.setDebt(k.getDebt() - pay);
				k.setBalance(k.getBalance() - pay);
				isValid=true;
				}
				}while(!isValid);
				break;
			case 5:
				System.out.println("Quitting. Thanks for playing");
				j.setPosition(26);
				valid = true;
				break;
			}
		}while(j.getPosition()<26);

	}



	}

