Link to problem [here](https://dmoj.ca/problem/ccc15j3)

Canadian Computing Competition: 2015 Stage 1, Junior #3
In Sweden, there is a simple child's game similar to Pig Latin called Rövarspråket (Robbers Language).

In the CCC version of Rövarspråket, every consonant is replaced by three letters, in the following order:

* the consonant itself;
* the vowel closest to the consonant in the alphabet (e.g., if the consonant is d, then the closest vowel is e), with the rule that if the consonant falls exactly between two vowels, then the vowel closer to the start of the alphabet will be chosen (e.g., if the consonant is c, then the closest vowel is a);
* the next consonant in the alphabet following the original consonant (e.g., if the consonant is d, then the next consonant is f) except if the original consonant is z, in which case the next consonant is z as well.
Vowels in the word remain the same. (Vowels are a, e, i, o, u and all other letters are consonants.) Write a program that translates a word from English into Rövarspråket.

# Input Specification
The input consists of one word entirely composed of lower-case letters. There will be at least one letter and no more than 30 letters in this word.

# Output Specification
Output the word as it would be translated into Rövarspråket on one line.

# Sample Input 1
<pre>joy</pre>
# Output for Sample Input 1
<pre>jikoyuz</pre>
# Sample Input 2
<pre>ham</pre>
# Output for Sample Input 2
<pre>hijamon</pre>