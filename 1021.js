/*
Banknotes and Coins

Read a value of floating point with two decimal places. This represents a monetary value. 
After this, calculate the smallest possible number of notes and coins on which the value can be decomposed. 
The considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01. 
Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.

Input
The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).

Output
Print the minimum quantity of banknotes and coins necessary to change the initial value, as the given example.
*/
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift(); };

var a = parseFloat(prompt('valor:'))
var N = parseInt(a);
var y = ((a - N)*100).toFixed(2)

var H = (N/100);
var F = ((N%100)/50);
var Ty = (((N%100)%50)/20);
var Tn = ((((N%100)%50)%20)/10);
var Fv = (((((N%100)%50)%20)%10)/5);
var Tw = ((((((N%100)%50)%20)%10)%5)/2);
var On = ((((((N%100)%50)%20)%10)%5)%2);
var ft = (y/50)
var tf = ((y%50)/25)
var tc = (((y%50)%25)/10)
var fc = ((((y%50)%25)%10)/5)
var oc = ((((y%50)%25)%10)%5)


console.log('NOTAS:')
console.log(parseInt(H) +' nota(s) de R$ 100.00');
console.log(parseInt(F) +' nota(s) de R$ 50.00');
console.log(parseInt(Ty) +' nota(s) de R$ 20.00');
console.log(parseInt(Tn) +' nota(s) de R$ 10.00');
console.log(parseInt(Fv) +' nota(s) de R$ 5.00');
console.log(parseInt(Tw) +' nota(s) de R$ 2.00');
console.log('MOEDAS:')
console.log(parseInt(On) +' moeda(s) de R$ 1.00');
console.log(parseInt(ft) +' moeda(s) de R$ 0.50');
console.log(parseInt(tf) +' moeda(s) de R$ 0.25');
console.log(parseInt(tc) +' moeda(s) de R$ 0.10');
console.log(parseInt(fc) +' moeda(s) de R$ 0.05');
console.log(parseInt(oc) +' moeda(s) de R$ 0.01');
