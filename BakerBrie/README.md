Link to problem [here](https://dmoj.ca/problem/ecoo17r3p1)

Author: Andrew Seidel
Baker Brie is holding a celebration for being in business for 13 years, and having opened its 130th franchise. Baker Brie wants to congratulate franchises that have performed well throughout the years. Baker Brie also wants to congratulate everyone for performing well on certain days of the year!

Baker Brie wants to offer congratulations as follows:

If, in a single day, all franchises combined sell an amount of baked goods that is equivalent to a multiple of a baker's dozen (13), then all franchises will receive a bonus.
If an individual franchise, throughout its entire existence, has sold an amount of baked goods that is equivalent to a multiple of a baker's dozen (13), then that franchise will receive a bonus.
# Input Specifications
The input will contain 10 datasets.

On the first line of each dataset there will be the values F and D separated by a space where F(4≤F≤130) represents the number of franchises that Baker Brie has, and D(2≤D≤4745) represents the number of days of information.

On the next D lines, there will be F integers separated by spaces (each in the range 1 through 13000), such that the ith integer on line j represents the number of baked goods sold by franchise i on day j.

# Output Specifications
You must determine, both for each day (across all franchises) and for each franchise (across all days), whether or not the number of baked goods sold is a multiple of 13. If it is, you need to track how many baker's dozens were sold. Report the total number of baker's dozens as a single integer on its own line.

# Sample Input
<pre>
4 5
4 3 2 4
3 3 2 1
8 2 4 1
2 2 4 3
9 3 2 3
4 2
4 4 4 1
1 1 3 4
</pre>
# Sample Output
<pre>
4
1
</pre>
Note: Only 2 cases are shown in this sample.

# Explanation of Sample Output
In the first case, the first franchise sold a total of 26 baked goods (which is 2 baker's dozens), the second franchise sold a total of 13 baked goods (which is 1 baker's dozen), and finally, all franchises together sold 13 baked goods on the first day (which is 1 baker's dozen). This totals to 4 baker's dozens.

For the second dataset, no franchises made enough baked goods on their own, but there was a single baker's dozen created among them all on the first day. This totals to 1 baker's dozen.