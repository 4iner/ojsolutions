Link to problem [here](https://dmoj.ca/problem/ecoo15r2p1)

The Interlace Cypher is a method of encrypting text by scrambling the letters in a message. The letters are rearranged so that the original words are interlaced by alternating letters from each word. Then the resulting letter set is broken up into "words" that match the lengths of the words in the original message:

## Original	
the interlace cypher
## Encoded	
tic hnyetpehr elrace

The first three letters of the encrypted message tic come from the first letters of each word. The next three letters hny come from the second letters of each word.

The letters etp are the third letter of each word, but then we run out of letters from the word the, so the letters are in pairs after that: the letters eh are the fourth letters of the second and third words, and so on. The last three letters ace are all from the middle word in the original message.

The input will contain 10 test cases. Each test case consists of 2 lines.

The first line will contain either the word encode or the word decode (all lowercase). The next line will contain a message consisting entirely of lowercase letters and space characters.

You should output one line representing the Interlace Cypher encoding or decoding of that message (according to the instruction on the first line).

Note that the sample input below only contains 2 test cases, but the real data files will contain 10.

# Sample Input
<pre>
encode
whatever you do dont put the blame on you
decode
biotr yy lt nha eeae iaam nhhe
</pre>
# Sample Output
<pre>
wyddptbo yho oo uhln oau nte auttm ee ver
blame it on the rain yeah yeah
</pre>