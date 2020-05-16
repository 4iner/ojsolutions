In the game of Spindie, players take turns spinning a spinner and rolling a die.

On each turn, they spin the spinner three times and roll the die between each pair of spins (i.e. the sequence on a single turn is: Spin, Roll, Spin, Roll, Spin). Each spin of the spinner lands on some integer and each roll of the die results in an integer from 1 to 6. The first spinner number is the base score. Then if a die roll is 1 through 5, the player adds the next spinner number to their score. If they roll a 6, the next number is used to multiply their score. The winner is the player with the highest score after a set number of rounds.

Here are some example turns of Spindie:
Spin|Roll|Spin|Roll|Spin|Score
----|----|----|----|----|-----
10|4|7|1|8|(10+7)+8=25
1|3|2|6|5|(1+2)×5=15
6|6|6|6|6|(6×6)×6=216

The input will contain 10 test cases.

The first line of each test case will consist of an integer N representing the number of integers on the spinner, where 1≤N≤5000.

The next line contains the N integers on the spinner, S1 through SN, separated by spaces, where 1≤Si≤100.

The next line will contain five target integers T1 through T5 separated by spaces, where 1≤Ti≤106.

For each test case, your program should output a single line consisting of 5 letters. Each letter should represent one of the five targets (in order). If the target represents a possible score in a single round of Spindie, then output a T. If it is not possible, output an F.

Note that the sample data below contains only 5 test cases, but the test data will contain 10.

# Sample Input
<pre>
5
23 74 7 64 47
128605 205 2162 2709 71346
3
26 5 11
407 962 455 21 902
4
23 75 89 24
933 484 13248 102 44640
9
23 61 77 83 12 92 1 7 65
72900 144 5704 145 6370
7
87 20 94 99 14 26 87
241956 177 749331 221 4066
</pre>
# Sample Output
<pre>
FFTFF
TTFTF
FFTFF
FTTTF
TFTFF
</pre>