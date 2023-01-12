/*The national math exam is done every leap year in Nlogonia. Every citizen is evaluated, so it is possible to study the development of logic and math in the country along the years.

After their exams are graded, the citizens are sorted according to their grades (the higher the grade, the better the citizen). They get discounts in their taxes according to their positions in this rank.

The Statistic Central Office (SCO) is in charge of processing the grades obtained in the exam. This year, however, Vasya, one of the people in charge, is at the hospital, and so you were hired to finish his job.

Write a program that, given the number of citizens and their grades, answers queries informing the grade of the citizen that is ranked at a given position.

Input
The input contains several test cases. The first line of each test case contains two integers N (1 ≤ N ≤ 100) and Q (1 ≤ Q ≤ 100), the number of citizens and the number of queries.

Each of the next N lines contains the grade ni obtained by the i-th citizen (0 ≤ ni ≤ 30000).

Each of the next Q lines contains a position pi.

The input ends with end-of-file (EOF).

Output
For each test case, print, for each query, a line containing the grade of the citizen that is ranked at position pi.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.RecursiveTask;
*/

public class Main {

    public static void main(String[] args) throws IOException {
    
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while(in.ready()) {
            Avaliacao a = new Avaliacao();
            String[] str = in.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int q = Integer.parseInt(str[1]);

            for (int i = 0; i < n; i++) {
                a.adicionarNota(new Cidadao(Integer.parseInt(in.readLine())));
            }
            a.ordenarNotas();

            for (int i = 0; i < q; i++) {
                int consulta = a.consultarCidadao(Integer.parseInt(in.readLine()));
                System.out.println(consulta);
            }
        }
    }

}

class Avaliacao {

    private Cidadao cidadao;

    private List<Cidadao> notasExame;

    public Avaliacao() {
        this.notasExame = new ArrayList<>();
    }

    public void adicionarNota(Cidadao cidadao) {
        this.cidadao = cidadao;
        this.notasExame.add(this.cidadao);
    }

    public void ordenarNotas() {
        Collections.sort(this.notasExame, new ordena());
    }

    public int consultarCidadao(int posicao) {
        ordenarNotas();


        return this.notasExame.get(posicao - 1).getNota();
    }

    public Cidadao getCidadao() {
        return cidadao;
    }

}

class Cidadao {

    private int nota;

    public Cidadao() {

    }

    public Cidadao(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
class ordena implements Comparator<Cidadao> {

    @Override
    public int compare(Cidadao c1, Cidadao c2) {
        return c2.getNota() - c1.getNota();

    }
}
