/*
Alarm Clock

Daniela is a nurse in a large hospital, which causes her working shifts to constantly change. To make it worse, she has deep sleep, and a big difficulty to wake up using alarm clocks.

Recently she got a digital clock as a gift, with several different options of alarm sounds, and she hopes that it might help solve her problem. But lately, she's been very tired and wants to enjoy every single moment of rest. So she carries her new clock to every place she goes, and whenever she has some spare time, she tries to sleep, setting her alarm clock to the time when she needs to wake up. But, with so much anxiety to sleep, she ends up with some difficulty to fall asleep and enjoy some rest.

A problem that has been tormenting her is to know how many minutes of sleep she would have if she felt asleep immediately and woken up when the alarm clock ringed. But she is not very good with numbers, and asked you for help to write a program that, given the current time and the alarm time, find out the number of minutes she could sleep.

Input
The input contains several test cases. Each test case is described in one line, containing four integers H1, M1, H2 and M2, with H1 : M1 representing the current hour and minute, and H2:M2 representing the time (hour and minute) when the alarm clock is set to ring (0≤H1≤23, 0≤M1≤59, 0≤H2≤23, 0≤M2 ≤59).

The end of the input is indicated by a line containing only four zeros, separated by blank spaces.

Output
For each test case, your program must print one line, containing a single integer, indicating the number of minutes Daniela has to sleep.
*/

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function (texto) { return lines.shift();}


var [h1, m1, h2, m2] = prompt("").split(" " ).map(Number)

while(h1!=0 || m1!=0 || h2!=0 || m2!=0){
    
    var mt1 = m1 + h1*60
    var mt2 = m2 + h2*60
    
    if(mt1<mt2){
        mf = mt2 - mt1
        
    }else{
        mf = ((24*60)-mt1) + mt2
        
    }
    console.log(mf)
    
    var [h1, m1, h2, m2] = prompt("").split(" ").map(Number)
    
}
