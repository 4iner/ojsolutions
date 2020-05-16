Lu Han, EXO member and K-pop idol wakes up to find that it's his birthday, April 20! Following his birthday tradition, he starts to reread his favourite book.

Given integers A, B, C and D, determine the sum, for all primes p such that A≤p≤B, of the sum of every multiple m of each prime, such that C ≤ m ≤ D. That is, you are taking a sum of sums, and each sum is of a prime's multiples. The only line of input will contain four space-separated integers A, B, C, D as described. Print the required sum as output. Reason for failing: Wasn't sure whether or not to modulo the final answer. Please do not perform as he/she did, and instead, please modulo the answer by 2016420.

Lu Han Solo now continues his birthday tradition by copying code, in the spirit of bobhob314 himself. Helpfully submit your code to him via this problem, and you will be rewarded with some points!

# Constraints
2 ≤ A < B ≤ 10^9 , B − A ≤ 10^5, 2 ≤ C < D ≤ 10^9.

Subtask 1 [20%]
A,B,C,D ≤ 200

Subtask 2 [80%]
No further constraints.

# Input
One line with four space-separated integers A, B, C, D.

# Output
One integer, the required answer modulo 2016420.

# Sample Input
<pre>
2 3 2 10
</pre>

# Sample Output
<pre>48</pre>

# Explanation
2 and 3 are the only primes in the range [2,3]. The multiples of 2 in the range [2,10] are 2, 4, 6, 8 and 10. Likewise, The multiples of 3 in the range [2,10] are 3, 6 and 9. The sum of these numbers is equal to 48, unless the aforementioned book needs a sequel already.