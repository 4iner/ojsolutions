Link to problem [here](https://dmoj.ca/problem/ecoo14r1p4)

Fischer Random Chess is just like regular chess except that the starting positions of the pieces are randomized. The game was proposed by grand master Bobby Fischer to make it virtually impossible for players to memorize a set of opening moves.

In Fischer Random Chess, the back row of 8 pieces (two Bishops, two Knights, two Rooks, a King and a Queen) can be placed in any order as long as the King is between the two Rooks (to enable the castling move) and the Bishops are on opposite colors.

In the boards below, K=King, Q=Queen, R=Rook, B=Bishop and N=Knight. The first arrangement is legal. The second two are not.

R	K	N	R	Q	B	B	N

R	B	N	R	K	N	B	Q

B	R	K	N	B	R	Q	N
Of course any arrangement that contains the wrong mix of pieces (e.g. three bishops and one knight) is also illegal.

The input will contain 10 test cases. Each test case consists of a single line of 8 characters, representing a partially constructed back row. Pieces that have been filled in are represented with one of the capital letters K, Q, R, B or N (see the key above) and spaces that have not been filled are represented with the underscore character _ (ASCII code 95).

Your job is to output a single number representing the number of legal Fischer Random Chess arrangements that can be created by filling in the blanks with the remaining pieces.

# Sample Input
<pre>
NR____RN
___BB___
_R____R_
___KQ___
___QK___
NBRK____
__Q___B_
__Q___NN
_RKR____
RKRBN__Q
</pre>
# Sample Output
<pre>
8
60
72
32
32
12
40
6
18
1
</pre>