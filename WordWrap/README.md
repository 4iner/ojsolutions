Link to problem [here](https://dmoj.ca/problem/ecoo15r1p2)

Text editors like Notepad usually contain a "word wrap" feature. When it's enabled, long lines will be broken up to fit the screen in such a way that most of the time words don't get chopped up. For example, suppose your viewing window is only 10 characters wide. Then with word wrap turned on, the text below would be formatted as shown.

## Original	
The quick brown fox jumps over the dog

## Word wrapped	
The quick
brown fox
jumps over
the dog

Sometimes a text document might contain a word that is no longer than the width of the viewing window. In that case, the word will have to be split, but also will be positioned so that it starts in the leftmost position on its line. This is shown below for a window that is 17 characters wide:

## Original	
One of the longest words in English is antidisestablishmentarianism
## Word wrapped	
One of the
longest words in
English is
antidisestablishm
entarianism

The input will contain 10 test cases.

The first line of each test case will consist of an integer W, where 1≤W≤100. This number represents the width of the viewing window. The next line will contain a list of words, each separated from the next by a single space character. The words consist only of letter characters and there are no punctuation characters.

Your job is to present the list of words according to the word wrapping principles described above. You should print a single line of five = characters immediately after each test case and there must be no blank lines in your output.

Note that the sample input below only contains 5 test cases, but the input files used for judging will contain 10 test cases.

# Sample Input
<pre>
14
Spiderman Spiderman does whatever a spider can
10
Spins a web any size
11
Catches thieves just like flies
7
Look Out
7
Here comes the Spiderman
</pre>

# Sample Output
<pre>
Spiderman
Spiderman does
whatever a
spider can
=====
Spins a
web any
size
=====
Catches
thieves
just like
flies
=====
Look
Out
=====
Here
comes
the
Spiderm
an
=====
</pre>