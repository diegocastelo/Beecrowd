/*
Grenais

The Federação Gaúcha de Futebol invited you to write a program to present a statistical result of several GRENAIS.
Write a program that read the number of goals scored by Inter and the number of goals scored by Gremio in a GRENAL. 
Write the message "Novo grenal (1-sim 2-nao)" and request a response. 
If the answer is 1, two new numbers must be read (another input case) asking the number of goals scored by the teams in a new departure, 
otherwise the program must be finished, printing:

- How many GRENAIS were part of the statistics.
- The number of victories of Inter.
- The number of victories of Gremio.
- The number of Draws.
- A message indicating the team that won the largest number of GRENAIS (or the message: "Não houve vencedor" if both team won the same quantity of GRENAIS).

Input
The input contains two integer values, corresponding to the goals scored by both teams. Then there is an integer (1 or 2),
corresponding to the repetition of the algorithm.

Output
After each reading of the goals it must be printed the message "Novo grenal (1-sim 2-nao)".
When the program is finished, the program must print the statistics as the example below.
*/
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift(); };

var prompt = function(texto) { return lines.shift(); };

var i = 1
var vi = 0
var vg = 0
var em = 0
var qnt = 0

while(i==1){
    var [x, y] = (prompt(' ').split(' ').map(Number))
    if(x > y){
        vi = vi + 1
    }
    else if(x < y){
        vg = vg + 1
    }
    else if(x == y){
        em = em + 1
    }
    qnt = qnt + 1

    console.log("Novo grenal (1-sim 2-nao)")
    var i = prompt("")
}
console.log(qnt + " grenais")
console.log("Inter:" + vi)
console.log("Gremio:" + vg)
console.log("Empates:" + em)

if(vi > vg){
    console.log("Inter venceu mais")
}
else if(vg > vi){
    console.log("Gremio venceu mais")
}
else if(vi == vg){
    console.log("Nao houve vencedor")
}
