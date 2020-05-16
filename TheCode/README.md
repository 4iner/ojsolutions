Link to problem [here](https://dmoj.ca/problem/tsoc15c2p1)

The students notice several sketchy papers on Mr. Venom's desk, each containing N (3≤N≤10000) integers. "A code!" Tom cries. "But how do we crack it?" replies Alex. They then see some instructions on a sticky note on one of Mr. Benum's computer monitors:

Why do they keep making me use these stupid codes?! Note to self: Start at the first integer i1 on the paper, then skip ahead i1 positions (or behind, if i1 is negative). The integer you land on decodes to an uppercase alphabetic character (1=A,2=B,3=C…26=Z). Move to the next integer ix after the one you just decoded and skip ahead (or behind if ix is negative) ix spaces from there. Repeat until you (at any point) move to a 0, at which point the program should terminate immediately. Hey, at least you will always skip to a position that's actually on the page, and there will always be a number after that. Who even designed this stupid code?

# Input Specification
The first line of input consists of integer N, the number of integers on the paper. The next N lines of input contain the integers on the paper in order.

# Output Specification
The output is the decoded message in uppercase.

# Sample Input 1
<pre>
9
2
22
5
-2
10
12
0
9
-3
</pre>
# Sample Output 1
<pre>
EVIL
</pre>
Explanation of Sample Output 1
You first skip forwards by 2 from the first integer on the page. The 5 decodes to an E. The next number after 5 is −2, so you skip 2 backwards from there, landing on the 22 which decodes to a V. The next integer is a 5, so you skip forward by 5 to 9, which decodes to I. You then skip backward by 3 from −3, landing on a 12, which decodes to L. The next number is 0, so the program terminates.

# Sample Input 2
<pre>
20
9
1
4
12
4
0
3
1
5
11
-10
16
5
16
-3
14
-9
5
-14
0
</pre>
# Sample Output 2
<pre>
KIDNAPPED
</pre>