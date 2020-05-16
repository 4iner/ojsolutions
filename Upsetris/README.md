The game of Upsetris is played just like the classic game of Tetris, but with a twist. Just like in Tetris, puzzle pieces, each made of four square bricks, fall from above and the user has to decide where they will land to try and make full rows of blocks. The game ends when the pile reaches the top of the screen.


![Image of Tetris](https://dmoj.algome.me/media/martor/89414521-e4e4-4bb5-9f2e-0b3926c92488.png) ![Image2 tetris](https://dmoj.algome.me/media/martor/17c686c9-f73a-4b8c-bd02-1d3e5d360048.png) ![Image3 tetris](https://dmoj.algome.me/media/martor/b0a41571-114d-450c-8ab3-84a4ba34b36b.png) ![Image4 tetris](https://dmoj.algome.me/media/martor/736da10a-dc21-4119-8eea-702fd15fe986.png)

In the game shown above, a straight vertical piece is falling. If the user drops it in the left most column (picture 1), she will make the bottom four rows full (picture 2), and the full rows will disappear allowing the pile to move down (picture 3).

If the player makes bad decisions about where to put pieces, they can end up with boards with "holes" in them as shown at above-right. These holes will eventually cost them the game.

In Upsetris, the "twist" (pun intended) is that the user has a one-time-only chance to "upset" the board by rotating it 180 degrees. When this happens, all the individual bricks separate and fall to the floor. This eliminates the holes and sometimes makes new rows.

Here's an example of the "upset" process in action:

|          | |==========| |          | |          | |          |

|          | |O OOOOO OO| |O OOOOO OO| |          | |          |

|          | |OOOOO     | |OOOOO     | |          | |          |
>|          | | OOOOO OO | | OOOOO OO | |          | |          |
>| O   OOO O| |O OO O O  | |O OO O O  | |  OO      | |          |
>|O O  OOOO | | OOOO  O O| | OOOO  O O| |  OOO     | |  OO      |
>|  O O OO O| |O OOO   O | |O OOO   O | |O OOO     | |  OOO     |
>| OO OOOOO | |          | |          | |OOOOOO OO | |O OOO     |
>|     OOOOO| |          | |          | |OOOOOO OOO| |OOOOOO OO |
>|OO OOOOO O| |          | |          | |OOOOOOOOOO| |OOOOOO OOO|
>|==========| |          | |==========| |==========| |==========|`
    1             2	            3	        4	        5

In the example above, the bricks are represented by capital O's and the floor is a row of equal signs. The original board (1) is rotated 180 degrees (2), then the floor of the board is moved to the bottom (3), then the pieces all settle to the new floor (4) making a single complete row which gets removed (5).

The input contains five different Upsetris boards, each with from 5 to 20 rows (not including the "floor") and from 5 to 20 columns (not including the walls). You must simulate the "upset" operation and show the final result for each board. You must show the complete board in your output, including the "floor" row. During judging, you will be allowed to scroll the output screen horizontally or vertically if necessary. The output must be in a fixed-width font (e.g. Courier).

If you are unable to configure your IDE to use a fixed width font, you may copy and paste the output of your program into a text editor that uses a fixed-width font during judging. Note that all the boards in the sample input are the same size and have the same number of rows as columns, but this might not be true of the data sets you will be judged on. The side characters for the board | are ASCII code 124.

# Sample Input
|          |
|          |
|O         |
|O OO  O O |
|    O O   |
| O   O OO |
|  O     OO|
|O O       |
|   O  O O |
|O      O  |
|==========|
|          |
|          |
|          |
|    O     |
|   O  OO O|
|   O     O|
|    O  O  |
|       OO |
|O         |
|   O     O|
|==========|
|          |
|          |
|          |
|          |
| O   OOO O|
|O O  OOOO |
|  O O OO O|
| OO OOOOO |
|     OOOOO|
|OO OOOOO O|
|==========|
|          |
|          |
|          |
|          |
|          |
|          |
|          |
|          |
| O     O  |
|     O   O|
|==========|
|          |
|          |
|          |
|          |
|OO OO OOOO|
| O OOOOOOO|
|O OOOO OOO|
| OOOOOOOO |
|OOOO O O  |
|O  OOO OOO|
|==========|

# Sample Output

|          |
|          |
|          |
|          |
|          |
|          |
|          |
| O       O|
| O O   O O|
| OOO  OO O|
|==========|
|          |
|          |
|          |
|          |
|          |
|          |
|          |
|O O   O   |
|O O  OO   |
|OOOO OO  O|
|==========|
|          |
|          |
|          |
|          |
|          |
|  OO      |
|  OOO     |
|O OOO     |
|OOOOOO OO |
|OOOOOO OOO|
|==========|
|          |
|          |
|          |
|          |
|          |
|          |
|          |
|          |
|          |
|O O O   O |
|==========|
|          |
|          |
|          |
|          |
|          |
|          |
|          |
|  O   O   |
| OO OOO   |
|OOO OOO OO|
|==========|
