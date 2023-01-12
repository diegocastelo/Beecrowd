/*
Tourists in the Huacachina Park

The municipal tourism agency of the city of Ica in Peru has set up a checkpoint for adventure jeeps that ascend to the dunes of Hucachina Park. As during the day, there are several off-roads that go up and down the national park, and tourists do not always use the same transportation for the round trip, the city hall needed to have better control and security over the flow of visitors in the park. Develop a program that receives as input if a jeep is entering or returning from the park and the amount of tourists this vehicle is transporting. At the end of the shift, the program must indicate how many vehicles and tourists are still missing from the adventure.

Input
The program must receive successive input pairs. Each pair should indicate the jeep's movement and the amount of tourists it is carrying. The first entry should be "SALIDA" or "VUELTA". "SALIDA" should indicate that the jeep is leaving the center and entering the park; and "VUELTA" that the Jeep is returning from the ride. Immediately following, the program receives an integer T (where, 0 <= T <=20) indicating the amount of tourists being transported by the jeep. The string "ABEND" should be the end-of-processing indicator.

Output
As a goal the program must present two exits, one in each line: the amount of tourists and the amount of jeeps that still need to return from the park.
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		PostoDeControle a = new PostoDeControle();
		          Jipes j = new Jipes();
		
		//System.out.println("Digite o sentido");
		String sentido = dado.next();
		j.setSentido(sentido);
		
		while(! j.getSentido().equals("ABEND")) {
			
			//System.out.println("Digite o quantos turistas");
			int qtdTuristas = Integer.parseInt(dado.next());
			j.setQtdTuristas(qtdTuristas);
			
			if(sentido.equals("SALIDA")) {
				a.incrementaTuristas(j.getQtdTuristas());
				a.incrementaJipes();
			}
			else if(sentido.equals("VUELTA")) {
				a.decrementaTuristas(j.getQtdTuristas());
				a.decrementaJipes();
			}
			//System.out.println("Digite o sentido");
			sentido = dado.next();
			j.setSentido(sentido);
			
			
		}
		
		if(j.getSentido().equals("ABEND")) {
			System.out.println(a.getContador());
			System.out.println(a.getQtdJipes());
			
		}
		
	}
}
class PostoDeControle {
	Scanner dado = new Scanner(System.in);
	private int qtdJipes = 0;
	private int contador = 0;
	
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getQtdJipes() {
		return qtdJipes;
	}

	public void setQtdJipes(int qtdJipes) {
		this.qtdJipes = qtdJipes;
	}
	
	public int incrementaJipes() {
		qtdJipes++;
		return qtdJipes;
	}
	public int decrementaJipes() {
		qtdJipes--;
		return qtdJipes;
	}
	public int incrementaTuristas(int qtdTuristas){
		contador = contador + qtdTuristas;
		return(contador);
	}
	public int decrementaTuristas(int qtdTuristas){
		contador = contador - qtdTuristas;
		return(contador);
	}	
	
}
class Jipes {
	private int qtdTuristas = 0;
	private String sentido;
	int contador = 0;
	
	
	public int getQtdTuristas() {
		return qtdTuristas;
	}
	public void setQtdTuristas(int qtdTuristas) {
		this.qtdTuristas = qtdTuristas;
	}
	public String getSentido() {
		return sentido;
	}
	public void setSentido(String sentido) {
		this.sentido = sentido;
	}
	
	
	public int incrementaTuristas(){
		contador = contador + qtdTuristas;
		return(contador);
	}
	public int decrementaTuristas(){
		contador = contador - qtdTuristas;
		return(contador);
	}	






}
