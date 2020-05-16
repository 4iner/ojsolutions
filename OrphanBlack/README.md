Link to problem [here](https://dmoj.ca/problem/ecoo14r1p2)

In the season finale of the Canadian TV show Orphan Black, the main characters discover a message written into their DNA using binary coded ASCII (pronounced "ASKee"). ASCII is a system for numbering letters and other printable characters. Binary coded ASCII uses 8-bit binary integers instead of regular decimal integers. The table below shows the decimal and binary ASCII codes for uppercase letters and the space character.

<pre>
Space	32	00100000    I	73	01001001   R	82	01010010
A	65	01000001        J	74	01001010   S	83	01010011
B	66	01000010        K	75	01001011   T	84	01010100
C	67	01000011        L	76	01001100   U	85	01010101
D	68	01000100        M	77	01001101   V	86	01010110
E	69	01000101        N	78	01001110   W	87	01010111
F	70	01000110        O	79	01001111   X	88	01011000
G	71	01000111        P	80	01010000   Y	89	01011001
H	72	01001000        Q	81	01010001   Z	90	01011010
</pre>

Binary integers are just like regular decimal integers except that the only digits allowed are 1 and 0 and instead of place values rising by 10s they rise by 2s. In decimal integers, the rightmost digit is the 1's place, then 10's then 100's and so on. In binary the rightmost digit (bit) is the 1's place, then the next is 2's, then 4's and so on.

DNA comes in a double strand made up of four bases (A, C, G, and T). A pairs with T and C pairs with G so that in a double strand, A's and T's are always across from each other and so are C's and G's, like this:

<pre>
CAACACGTGGCGTGCCAGTGACCTTGGCAGGTTGCGTCGAAATCCC
GTTGTGCACCGCACGGTCACTGGAACCGTCCAACGCAGCTTTAGGG
</pre>

To turn the above DNA into a binary string, just assign one of the base pairs (AT or CG) to be a 1 and the other to be a 0. So the above DNA string might represent this binary number:

<pre>
1001011011110111010101100111011001110110000111
</pre>

Or it might represent this one:

<pre>
0110100100001000101010011000100110001001111000
</pre>

In this case, the correct one is the second one and the message starts at the fourth position with a few bits left over at the end:

<pre>
011 01001000 01000101 01001100 01001100 01001111 000
       H        E        L        L        O
</pre>

The input will contain 10 test cases. Each test case will consist of two lines representing a pair of chromosomes. Each pair contains a coded message as described above, with from 0 to 7 extra bits on the beginning and another 0 to 7 extra bits at the end (the chemists who read the DNA weren’t exactly sure where the message was). The messages themselves consist entirely of the capital letters A through Z and space characters.

# Sample Input
<pre>
ACCAATGTAGATATCATACTCTCTTGCTATGTTCGTTACATGCCCAA
TGGTTACATCTATAGTATGAGAGAACGATACAAGCAATGTACGGGTT
ACACTTTTGGTGTTCGTATCAACCGCAGATCCGATGTTACACTTCATATTTGATCGTCACTATCTC
TGTGAAAACCACAAGCATAGTTGGCGTCTAGGCTACAATGTGAAGTATAAACTAGCAGTGATAGAG
CCAGACGAGTAGTCCGACAGAGCCTGTGAGAGGGGCGTCGGGGGTGCCGTAGTCCGGCTGAGCAAGCCAGGTTCACC
GGTCTGCTCATCAGGCTGTCTCGGACACTCTCCCCGCAGCCCCCACGGCATCAGGCCGACTCGTTCGGTCCAAGTGG
AACCCCACTAATCCTGAAATTCTGTGTAGTTGTGAACATGTCCTAGATCATATTTGTTGCGGTCAAGCCTAAA
TTGGGGTGATTAGGACTTTAAGACACATCAACACTTGTACAGGATCTAGTATAAACAACGCCAGTTCGGATTT
ACCAGTTATACTACATAAAAGATTACTTACTTTAATCTTTAGCTTGTTTTATGTTAGTTA
TGGTCAATATGATGTATTTTCTAATGAATGAAATTAGAAATCGAACAAAATACAATCAAT
ACGACGCAGTCGACCGCCGAGGCTTCCCACGCCCGTGGCTTTCGACGGCGGAGGAGCCCC
TGCTGCGTCAGCTGGCGGCTCCGAAGGGTGCGGGCACCGAAAGCTGCCGCCTCCTCGGGG
AACCTGGTGGTCCACCGGGCTCCACTCCCAGGCGGCTCGAGTAGGTGGCCGGAGGATGG
TTGGACCACCAGGTGGCCCGAGGTGAGGGTCCGCCGAGCTCATCCACCGGCCTCCTACC
ACAGTGGTACTGGTGCCCGGTCCATACGCAGCGCGCTGGAATACGAGGGCCCTGTGGGCA
TGTCACCATGACCACGGGCCAGGTATGCGTCGCGCGACCTTATGCTCCCGGGACACCCGT
CACTGGCTGGAGCCCGGTGAGCACGCTCCGCCGACACCTAGCAGGCGCCTCTCTGGCAACAC
GTGACCGACCTCGGGCCACTCGTGCGAGGCGGCTGTGGATCGTCCGCGGAGAGACCGTTGTG
CACCCACACACTCTCGACGCCGGACTCTACGCTCCGGGGACAGTAAGCACGCGGGTGATGGCC
GTGGGTGTGTGAGAGCTGCGGCCTGAGATGCGAGGCCCCTGTCATTCGTGCGCCCACTACCGG
</pre>
# Sample Output
<pre>
HELLO
CLONE ME
KEEP CALM
CARRY ON
A B C D
E F G H
I J K L
M N O P
Q R S T
U V W X
</pre>