Link to problem [here](https://dmoj.ca/problem/ecoo15r1p3)

Ten Pin bowling is a popular game played around the world. Ten pins are arranged in an equilateral triangle. The pins are numbered to help with visualization and scoring. The head pin (the pin at the bottom of the triangle) is pin 1. As you move up the triangle, the subsequent pins are numbered from left to right (from the bowler's perspective), with the leftmost pin of each row being 1 more than the rightmost pin of the previous row. This gives the following arrangement for all 10 pins:

<pre>
7   8   9   10
  4   5   6
    2   3
      1
</pre>

We're designing a bowling video game and we need to know the positions of the pins in screen coordinates - that is if the screen is laid out on a Cartesian plane we need to know the X and Y coordinates for each pin, assuming the following is true:

The Y value of any pin is always greater than or equal to the Y value of a pin with a lower numbering;
The X value of any pin is always greater than or equal to the X value of a pin to the left of it;
If you draw a straight line through any 2 pins (like the examples on the diagram below) all pins on that line are distributed evenly along its length
The input will contain 10 test cases. Each test case consists of 6 lines. The first line contains 2 floating point** values X and Y (−1000 < X < 1000, −1000 < Y < 1000), a third floating point value S (−1000 < S < 1000), and an integer value N (0 < N < 10). The X and Y values designate the positions of the head pin. The S value is the length of a side of the triangle formed by the 10 bowling pins. The N value is the precision** of the position of each pin. The next 5 lines each contain 2 floating point numbers X and Y (−10000 < X < 10000,−10000 < Y < 10000) representing the position of one of the 10 pins. Your objective is to output the number of the pin that is closest to that position. Output all the pin numbers for each test case on one line separated by spaces.

**Pin position are represented to a precision of N digits using a pair of numbers - a coefficient followed by an integer exponent. The coefficient is a fixed point number consisting of a single digit followed (if necessary) by a decimal point and then up to N digits to the right of the decimal point. This means that each coefficient has N+1 digits in total. If the coefficient is negative it will start with a minus sign. The exponent is expressed as a positive or negative integer. To calculate the true value of a number expressed in this notation you multiply the coefficient by 10 raised to the power of the exponent.

Here are some examples:

1.2345 -1 =1.2345×10^−1=1.2345×0.1=0.12345

-1.25 2 =−1.25×10^2=−1.25×100=−125

3.01989 -2 =3.01989×10^−2=3.01989×0.01=0.0301989

Note that the sample input below only contains 5 test cases with 2 pin positions (3 lines per test case), but the input files used for judging will contain 10 test cases with 5 pin positions (6 lines per test case).

# Sample Input
<pre>
0 0 0 0 1 0 5
-1.66667 -1 2.88675 -1
5 -1 8.66025 -1
1 1 1 1 8.66 0 5
1 1 1.49999 1
1.14433 1 1.24999 1
-1 1 1 1 8.66 0 5
-1 1 1 1
-1 1 1.49999 1
0 0 1.72222 1 1 2 5
-1.66667 1 4.60897 1
-5 1 1.03825 2
6 -1 6 -1 6 -2 5
5.7 -1 6.51962 -1
6.1 -1 6.17321 -1
</pre>
# Sample Output
<pre>
2 10
5 3
1 5
2 7
7 3
</pre>