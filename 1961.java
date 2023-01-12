/*
Jumping Frog

In each stage of the Jumping Frog game you must safely get your amphibian through a sequence of pipes of different heights to the rightmost pipe. Nevertheless the frog just survives if the height difference of consecutive pipes is at most the frog jump height. If the next pipe height is too high, the frog hits the pipe and fall. If the next pipe height is too low, the frog does not survive the fall. The frog always starts on the top of the leftmost pipe.

In this game the distance of pipes is irrelevant, which means that the frog always can reach the next pipe with a jump.

You must write a program that, given the pipe heights and the frog jump height, show if the game stage can be beaten or not.

Input
The input is given in two lines. The first one has two positive integer numbers P and N, the frog jump height and the number of pipes (1 ≤ P ≤ 5 and 2 ≤ N ≤ 100). The second line has N positive integer numbers that indicate the pipes heights ordered from left to right. There are no height greater than 10.

Output
The output is given in a single line. If the frog can reach the rightmost pipe write "YOU WIN". If the frog fails, write "GAME OVER".
*/
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Sapo s = new Sapo();
        Canos c = new Canos();

        int P = c.dado.nextInt();
        s.setAlturaPulos(P);
        int N = c.dado.nextInt();
        c.setQtdCanos(N);

        c.registrarAlturaCanos();

        System.out.println(s.defineSePassa(c));


    }
}

class Sapo {
    private int alturaPulos;

    public int getAlturaPulos() {
        return alturaPulos;
    }

    public void setAlturaPulos(int alturaPulos) {
        this.alturaPulos = alturaPulos;
    }

    public String defineSePassa(Canos c) {
        String controlador = "YOU WIN";
        int a = 0;
        int b = 0;

        for (int i = 0; i < (c.getQtdCanos() - 1); i++) {
            a = (int) c.getAlturaCanos().get(i);
            b = (int) c.getAlturaCanos().get(i + 1);

            if (a + getAlturaPulos() < b || a - getAlturaPulos() > b) {
                controlador = "GAME OVER";
            }


        }

        return controlador;
    }
}

class Canos {
    private int qtdCanos;
    private List alturaCanos = new ArrayList();
    Scanner dado = new Scanner(System.in);

    public int getQtdCanos() {
        return qtdCanos;
    }

    public void setQtdCanos(int qtdCanos) {
        this.qtdCanos = qtdCanos;
    }

    public List getAlturaCanos() {
        return alturaCanos;
    }

    public void setAlturaCanos(List alturaCanos) {
        this.alturaCanos = alturaCanos;
    }

    public void registrarAlturaCanos(){
        for(int i = 0 ; i < qtdCanos ; i++){
            alturaCanos.add(i, dado.nextInt());
        }
    }

}
