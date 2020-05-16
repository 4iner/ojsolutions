Link to problem [here](https://dmoj.ca/problem/ecoo14r1p3)

The word search puzzle below contains a secret message. To get this message, you have to find all the clue words in the puzzle (the words shown beside it) and circle them. Then you read any un-circled letters that remain from top left to bottom right to get the secret message. The clue words might appear horizontally, vertically, or diagonally. They might read forwards, backwards, downwards or upwards. Clue words can share any number of letters. Each clue word appears exactly once in the puzzle.

Puzzle: 
![puzzle](https://dmoj.algome.me/data/ecoo/ecoo14/ecoo14r1p3.0.png) 

Word list:
<pre>
ADDICTIVE	DARK	PUDDING
BAKING	DECADENT	SEMISWEET
BARS	DELICIOUS	SUGAR
BITTERSWEET	DESSERT	SWISS
BROWNIES	DRINKS	SYRUP
CAKES	FILLING	TREAT
CANDY	FONDUE	TRUFFLES
CHIPS	FOOD	UNSWEETENED
CHOCOLATIERS	FUDGE	WHITE
COCOA	ICE CREAM	
CONFECTIONERY	ICING	
COOKIES	INGREDIENT	
CREAM PIE	MILK	
CUPCAKE	MOUSSE	
</pre>

In this case, the secret message is "CHOCOLATE ORIGINATES FROM THE SEEDS OF THE THEOBROAMA CACAO TREE". The locations of the words in the puzzle are shown below.

The input will contain 5 test cases.

Each test case starts with a line containing two integers R and C separated by a space character. R and C represent the number of rows and columns in the board (1≤R,C≤30). This is followed by R lines, each containing C uppercase letters. This is the puzzle board.

The next line contains an integer M representing the number of clue words (M<100) and then the next M lines contain one clue word each. Clue words will be written in uppercase and will contain fewer than 100 characters, but they might contain spaces, apostrophes or other punctuation, all of which should be ignored when searching for the words on the board.

Note that the sample input below contains only a single test case, but the real data files will contain 5 test cases, one after another, with no blank lines in between.

Word Search puzzles courtesy of
Livewire Puzzles (http://www.puzzles.ca)
# Sample Input
</pre>
17 17
KLIMTSEINWORBCHOC
CGOLYNASEMISWEETT
EHNCSDENETEEWSNUO
RCIIOENIIGFILLING
SIOPKCLADNABFTESE
KFRNSAOFCEIOOMCTV
NRHEFDBAFTRSOEHEI
ICATAERTTUIGDDOGT
RORDSNCECCRONSCNC
DOWEFTRTEUTTUIOII
GKHTASPCIRPOHFLDD
NIIEWMRUEOICOTADD
IETESEPSRCNNAHTUA
CSESAESIIYDEBKIPO
ITIMBERLEUSAROEAM
AWFUDGECEARCAYRSO
SUGARDTESSUOMRSEE
37
ADDICTIVE
BAKING
BARS
BITTERSWEET
BROWNIES
CAKES
CANDY
CHIPS
CHOCOLATIERS
COCOA
CONFECTIONERY
COOKIES
CREAM PIE
CUPCAKE
DARK
DECADENT
DELICIOUS
DESSERT
DRINKS
FILLING
FONDUE
FOOD
FUDGE
ICE CREAM
ICING
INGREDIENT
MILK
MOUSSE
PUDDING
SEMISWEET
SUGAR
SWISS
SYRUP
TREAT
TRUFFLES
UNSWEETENED
WHITE
</pre>
# Sample Output
<pre>
CHOCOLATEORIGINATESFROMTHESEEDSOFTHETHEOBROAMACACAOTREE
</pre>

# Locations of the Words (Shown for Reference Only)

![solution](https://dmoj.algome.me/data/ecoo/ecoo14/ecoo14r1p3.1.png)