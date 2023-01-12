/*
Perfect Number

In mathematics, a perfect number is an integer for which the sum of all its own positive divisors (excluding itself) is equal to the number itself. For example the number 6 is perfect, because 1+2+3 is equal to 6. Your task is to write a program that read integer numbers and print a message informing if these numbers are perfect or are not perfect.

Input
The input contains several test cases. The first contains the number of test cases N (1 ≤ N ≤ 100). Each one of the following N lines contains an integer X (1 ≤ X ≤ 108), that can be or not a perfect number.

Output
For each test case print the message “X eh perfeito” (X is perfect) or “X nao eh perfeito” (X isn't perfect) according with to above specification.
*/
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};

var n = parseInt(prompt(""));
  var x;
  var soma = 0;
  var teste;

  for (i = 0; i < n; i++) {
    x = parseInt(prompt(""));
    for (y = 1; y < x; y++) {
      if (x % y == 0) {
        soma = soma + y;
        teste = 0;
      } else {
        teste = 1;
      }
    }
    if (soma == x) {
      console.log(x + " eh perfeito");
    } else if (teste == 1) {
      console.log(x + " nao eh perfeito");
    }
    soma = 0
  }
