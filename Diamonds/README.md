Link to problem [here](https://dmoj.ca/problem/tsoc15c2p2)

The students have successfully decrypted Mr. Venom's notes, resulting in Mr. Benum's location! They have also decrypted various incriminating messages between Mr. Venom and a shady drug trafficking organization! This is a big no-no, so the students prepare for the long walk to the specified coordinates. They pack their prescribed herbal supplements, say goodbye to their friends and family and start the journey.

At the coordinates, the students find a series of underground passageways that they start to call “the caves”. Inside the caves, Boris notices columns of stalactites and stalagmites, where the empty spaces formed by two columns resemble a diamond. Boris studies them in hopes of finally solving Stalactites. Meanwhile, the group further explores the cave and joyfully abandons him. Boris is never seen again.

In memory of Boris, print out a diamond structure of height H (3≤H≤151). H is guaranteed to be odd. Output lines 1 and H are comprised of H asterisks (*). On lines 2 and H−1, the same should be printed, except with the middle asterisk replaced by a single space. The next pair of lines have 2 more centered spaces, replacing 2 more asterisks for a total of 3 centered spaces. The remaining pairs of lines continue this pattern. The middle line should have only two asterisks, one at the start and one at the end, with the remainder of the line being filled by spaces.

# Input Specification
The integer H, on one line.

# Output Specification
A visual representation of the specified diamond structure.

# Sample Input 1
<pre>
5
</pre>
# Sample Output 1
<pre>
*****
** **
*   *
** **
*****
</pre>
# Sample Input 2
<pre>
11
</pre>
# Sample Output 2
<pre>
***********
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
***********
</pre>