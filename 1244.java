/* 
Sort by Length

Create a program to sort a set of strings by their size. Its program is to receive a set of strings and return by this same size ordered set of words, if the size of the strings are equal, must maintain the original order of the set.

Input
The first line of input has a unique integer N that indicates the number of sets of strings, each set may contain between 1 and 50 inclusive elements, and each of the strings of the set may contain between 1 and 50 inclusive characters.

Output
The output should contain the set of input strings ordered by the length of strings.A blank space must be printed between two words.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        int N = Integer.parseInt(dado.nextLine());
        
        ArrayList<String> texto = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            String[] palavras = dado.nextLine().split(" ");

            for(int j = 0 ; j < palavras.length; j++){
                texto.add(palavras[j]);
            }
            Collections.sort(texto, new Comparador());

            for (int k = 0 ; k < texto.size() ; k++){
                if(k != texto.size() - 1){
                    System.out.print(texto.get(k) + " ");
                }
                else{
                    System.out.print(texto.get(k));
                }
            }
            System.out.println();
            texto.clear();
        }
    }
}
class Comparador implements Comparator<String> {
    public int compare(String t1,  String t2){
        return -(t1.length() - t2.length());
    }

}
