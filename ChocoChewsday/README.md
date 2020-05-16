Link to problem [here]()

Author: Andrew Seidel
At the local candy factory, every Tuesday, there is a contest for whoever can come up with the best new chocolate. To make a decision on whether or not each chocolate is a winner, there is a panel of impartial judges that come in from the community. The judges are given the following criteria for judging:

* Packaging (P), up to 1 point
* Flavour (F), up to 2 points
* Minimal ingredients (G), up to 3 points
A score S is given to each chocolate from each judge assigned to that chocolate (0≤S≤6). There will be a random number of judges J, assigned to each chocolate (1≤J≤100).

Your task is to declare the winner based on the highest total score in the competition. If there is a tie for the highest total score, it can sometimes be broken using the total scores for P, F and G (try G first, then F, then P).

The competition is not really fair because some chocolates get more judges than others. But that's life at the candy factory.

# Input Specifications
The input will contain 10 competitions. The first line of each competition will contain a single integer N, to indicate the number of chocolates in the competition (1≤N≤100). For each of the N chocolates, there will be J+1 lines in the file. The 1st line is the name of the chocolate (a single word with no spaces) and the next J lines will contain the judges' scores (1≤J≤100). Each score will be contained on a single line, starting with the letter J followed by the 3 integers P, F, and G separated by spaces. Each competitions ends with an asterisk * (ASCII 42).

# Output Specifications
Output the name of the winner. If there is more than one winner, print out all winners on a single line separated by commas (order does not matter − i.e., an output of A,B is the same as B,A).

# Sample Input 1
<pre>
2
C1
J 0 1 1
J 0 1 0
J 1 0 0
C2
J 1 2 3
*
</pre>
# Sample Output 1
<pre>
C2
</pre>
Note: Only 1 case is shown in this sample.

# Sample Input 2
<pre>
4
ChocolateOfChocolates
J 0 2 2
J 0 1 2
J 1 2 0
Choco-Fun
J 1 2 3
J 1 2 0
ChocolateHaven
J 1 2 0
J 0 2 3
J 1 0 1
ChocolatesRock
J 1 2 1
J 1 2 0
J 1 2 0
*
1
ChocolateFilledCandy
J 0 0 0
*
</pre>
# Sample Output 2
<pre>
ChocolateOfChocolates
ChocolateFilledCandy
</pre>
Note: Only 2 cases are shown in this sample.

Explanation of Sample 2
For the first competition, there is a tie between ChocolateOfChocolates, ChocolateHaven, and ChocolatesRock. We then had to look at the G values, which were tiedfor ChocolateOfChocolates and ChocolateHaven. Consequently, we had to then check the F value. At this point, ChocolateOfChocolates has the higher value.