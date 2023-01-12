/*
Volleyball
A volleyball coach would like to keep statistics about his team. In every game he keeps track of the number of services, blocks and attacks of each player, as well as how many of these services, blocks and attacks were successful (scored points). Your program must show, with two decimal points what is the total percentage of services, blocks and attacks by the whole team that were successful.

Input
Input starts with the number of players N (1 ≤ N ≤ 100), followed by the names of each of these players. Below the name of each player, two rows of integers are presented. In the first row, the numbers represent the service, blocks and attack attempts (0 ≤ S,B,A ≤ 10000) by the specific player. In the second row there is the number of these services, blocks and attacks (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) that were successful.

Output
The output must contain the total percentage of successful services, blocks and attacks by the whole team, with two digits after the decimal point, as shown in the example.
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Equipe e = new Equipe();

        int N = e.dado.nextInt();
        e.setQtdJogadores(N);

        e.registraPontos();

        System.out.println("Pontos de Saque: " + String.format("%.2f", e.calculaAproveitamentoSaque()) + " %.");
        System.out.println("Pontos de Bloqueio: " + String.format("%.2f", e.calculaAproveitamentoBloqueio())+ " %.");
        System.out.println("Pontos de Ataque: " + String.format("%.2f", e.calculaAproveitamentoAtaque())+ " %.");


    }

}

class Equipe {
    Scanner dado = new Scanner(System.in);
    private int qtdJogadores;
    private ArrayList<Integer> pontosTentados = new ArrayList<Integer>();
    private ArrayList<Integer> pontosFeitos = new ArrayList<Integer>();
    private double contadorSaquesTentados =0.0 ;
    private double contadorBloqueiosTentados = 0.0;
    private double contadorAtaquesTentados = 0.0;
    private double contadorSaquesFeitos =0.0 ;
    private double contadorBloqueiosFeitos = 0.0;
    private double contadorAtaquesFeitos = 0.0;

    private String nomeJogador;

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getQtdJogadores() {
        return qtdJogadores;
    }

    public void setQtdJogadores(int qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
    }

    public List getPontosTentados() {
        return pontosTentados;
    }

    public void setPontosTentados(ArrayList<Integer> pontosTentados) {
        this.pontosTentados = pontosTentados;
    }

    public List getPontosFeitos() {
        return pontosFeitos;
    }

    public void setPontosFeitos(ArrayList<Integer>  pontosFeitos) {
        this.pontosFeitos = pontosFeitos;
    }
    public void registraPontos(){


        for(int i = 0 ; i < qtdJogadores ; i++){
            nomeJogador = dado.next();

            pontosTentados.add(0, dado.nextInt());
            pontosTentados.add(1, dado.nextInt());
            pontosTentados.add(2, dado.nextInt());
            contadorSaquesTentados = contadorSaquesTentados + pontosTentados.get(0) ;
            contadorBloqueiosTentados = contadorBloqueiosTentados + pontosTentados.get(1);
            contadorAtaquesTentados = contadorAtaquesTentados + pontosTentados.get(2);


            pontosFeitos.add(0, dado.nextInt());
            pontosFeitos.add(1, dado.nextInt());
            pontosFeitos.add(2, dado.nextInt());
            contadorSaquesFeitos = contadorSaquesFeitos + pontosFeitos.get(0) ;
            contadorBloqueiosFeitos = contadorBloqueiosFeitos + pontosFeitos.get(1);
            contadorAtaquesFeitos = contadorAtaquesFeitos + pontosFeitos.get(2);
        }

    }
    public double calculaAproveitamentoSaque(){
        double aproveitamentoSaque;

        aproveitamentoSaque = contadorSaquesFeitos / contadorSaquesTentados;

        return aproveitamentoSaque*100;
    }
    public double calculaAproveitamentoBloqueio(){
        double aproveitamentoBloqueio;

        aproveitamentoBloqueio = contadorBloqueiosFeitos / contadorBloqueiosTentados;

        return aproveitamentoBloqueio*100;
    }
    public double calculaAproveitamentoAtaque(){
        double aproveitamentoAtaque;

        aproveitamentoAtaque = contadorAtaquesFeitos / contadorAtaquesTentados;

        return aproveitamentoAtaque*100;
    }
}
