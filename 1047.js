/*
Game Time with Minutes

Read the start time and end time of a game, in hours and minutes (initial hour, initial minute, final hour, final minute). 
Then print the duration of the game, knowing that the game can begin in a day and finish in another day,

Obs.: With a maximum game time of 24 hours and the minimum game time of 1 minute.

Input
Four integer numbers representing the start and end time of the game.

Output
Print the duration of the game in hours and minutes, in this format: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” . 
Which means: the game lasted XXX hour(s) and YYY minutes.
*/

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift(); };


var [a, b, c, d] = prompt('').split(' ').map(Number)

var h1 = ((24-a)+c)
var h2 = c - a
var m1 = ((60-b)+d)
var m2 = d - b

if(a == c){
    
        if (b < d){
        console.log('O JOGO DUROU 0 HORA(S) E ' +m2 +' MINUTO(S)')
    }
    else if (b > d){
        console.log('O JOGO DUROU 23 HORA(S) E ' +m1 +' MINUTO(S)')
    }
    else if (b == d){
        console.log('O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)')
    }
    
}

else if (a > c){
  if (h1 >= 24){
      if (b > d){
        console.log('O JOGO DUROU ' +(h1 - 1) +' HORA(S) E ' +m1 +' MINUTO(S)')
    }
    else if (b < d){
        console.log('O JOGO DUROU ' +h1 +' HORA(S) E ' +m2 +' MINUTO(S)')
    }
    else if (b == d){
        console.log('O JOGO DUROU ' +h1 +' HORA(S) E 0 MINUTO(S)')
    }
}
   else{
    if (b > d){
        console.log('O JOGO DUROU ' +(h1 - 1) +' HORA(S) E ' +m1 +' MINUTO(S)')
    }
    else if (b < d){
        console.log('O JOGO DUROU ' +h1 +' HORA(S) E ' +m2 +' MINUTO(S)')
    }
    else if (b == d){
        console.log('O JOGO DUROU ' +h1 +' HORA(S) E 0 MINUTO(S)')
    }
   }
}
else if (a < c){
    if (b > d){
        console.log('O JOGO DUROU ' +(h2 - 1) +' HORA(S) E ' +m1 +' MINUTO(S)')
    }
    else if (b < d){
        console.log('O JOGO DUROU ' +h2 +' HORA(S) E ' +m2 +' MINUTO(S)')
    }
    else if (b == d){
        console.log('O JOGO DUROU ' +h2 +' HORA(S) E 0 MINUTO(S)')
    }
}



