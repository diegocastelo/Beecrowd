/*
Pomekons Battle

After capturing many Pomekons, Dabriel and Guarte resolved to make a battle. The way of the duel is simple, each Master puts a Pomekon in battle and wins who has the Pomekon with the bigger value, which is defined as follows:

The Bonus will be given to the Master Pomekon that are on a level of a value even.

This issue will be given to you the value of the applied bonuses, attack and defense values of Pomekon of Dabriel and Guarte and their levels, you have to inform the winner of the battle.

Input
The entrance is composed of several instances. The first line of input contains an integer T indicating the number of instances. Each instance starts with a integer B (0 ≤ B ≤ 100), which indicates the value of the applied bonus. In the following two lines will have three integers Ai, Di and Li (1 ≤ Ai, Di ≤ 100, 1 ≤ Li ≤ 50), represented the attack value of Pokemon, the defense value and the level of the Master Pomekon. The first line is the Dabriel Pomekon and the second the Guarte.

Output
For each instance in the input you should print the Master's name that will win the battle, in the event of a tie print: "Empate" without quotes.
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		int T = dado.nextInt();
		
		for(int i = 0; i<T; i++) {
			Batalha a = new Batalha();
		
			int bonus =  dado.nextInt();
			a.setBonus(bonus);
			
			int dAi=  dado.nextInt();
			a.setdAi(dAi);
			int dDi=  dado.nextInt();
			a.setdDi(dDi);
			int dLi=  dado.nextInt();
			a.setdLi(dLi);
			
			int gAi=  dado.nextInt();
			a.setgAi(gAi);
			int gDi=  dado.nextInt();
			a.setgDi(gDi);
			int gLi=  dado.nextInt();
			a.setgLi(gLi);
			
			System.out.println(a.defineVencedor());
		}
		
	}

}
class Batalha {
	
	private int bonus;
	private int dAi;
	private int dDi;
	private int dLi;
	private int gAi;
	private int gDi;
	private int gLi;
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getdAi() {
		return dAi;
	}
	public void setdAi(int dAi) {
		this.dAi = dAi;
	}
	public int getdDi() {
		return dDi;
	}
	public void setdDi(int dDi) {
		this.dDi = dDi;
	}
	public int getdLi() {
		return dLi;
	}
	public void setdLi(int dLi) {
		this.dLi = dLi;
	}
	public int getgAi() {
		return gAi;
	}
	public void setgAi(int gAi) {
		this.gAi = gAi;
	}
	public int getgDi() {
		return gDi;
	}
	public void setgDi(int gDi) {
		this.gDi = gDi;
	}
	public int getgLi() {
		return gLi;
	}
	public void setgLi(int gLi) {
		this.gLi = gLi;
	}
	
	private double ataqueDabriel(){
		double ataqueD;
		if(dLi%2==0) {
			ataqueD = ((dAi + dDi)/2) + bonus; 
		}else {
			ataqueD = ((dAi + dDi)/2);
		}
		return ataqueD;

		
	}
	private double ataqueGuarte(){
		double ataqueG;
		if(gLi%2==0) {
			ataqueG = ((gAi + gDi)/2) + bonus; 
		}else {
			ataqueG = ((gAi + gDi)/2);
		}
		return ataqueG;

		
	}
	
	public String defineVencedor() {
		String vencedor;
		if(this.ataqueDabriel() > this.ataqueGuarte()) {
			vencedor = "Dabriel";
		}
		else if(this.ataqueDabriel() < this.ataqueGuarte()) {
			vencedor = "Guarte";
		}else {
			vencedor = "Empate";
		}
		return vencedor;
		
	}
}
