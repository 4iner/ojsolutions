package Blindfold;

import java.io.*;

public class HelloWorld {
    static final int DIR_UP = 0;
    static final int DIR_RIGHT = 1;
    static final int DIR_DOWN = 2;
    static final int DIR_LEFT = 3;
    static final int[] DIR = {
        DIR_UP,
        DIR_RIGHT,
        DIR_DOWN,
        DIR_LEFT
    };
    static final String[] DIRECTIONS = {
        "UP",
        "RIGHT",
        "DOWN",
        "LEFT"
    };
    static final int[] DIR_X = {
        0,
        1,
        0,
        -1
    };
    static final int[] DIR_Y = {
        -1,
        0,
        1,
        0
    };
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());
        char[][] map = new char[r][c];
        for (int i = 0; i < r; i++) {
            map[i] = in.readLine().toCharArray();
        }
        int m = Integer.parseInt( in .readLine());
        StringBuilder movesB = new StringBuilder("");
        for (int i = 0; i < m; i++) {
            movesB.append( in.readLine());
        }
        String moves = movesB.toString();
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if(map[row][col] == 'X') continue;
               // System.out.println("Attempting new position at: "+col+","+row+"\n");
                for (int initialDir: DIR) {
                    boolean okay = true;
                    int cr = row;
                    int cc = col;
                    int dir = initialDir;

                    for (char move: moves.toCharArray()) {
                     //   System.out.println("Current move: " + move + ", current pos: " + cc + "," + cr + " facing " + DIRECTIONS[dir]);
                        switch (move) {

                            case 'F':
                                int nr = cr + DIR_Y[dir];
                                int nc = cc + DIR_X[dir];
                                if (nr < r && nr >= 0 && nc < c && nc >= 0 && map[nr][nc] != 'X') {

                                    cr = nr;
                                    cc = nc;

                                } else okay = false;
                                break;
                            case 'R':
                                dir++;
                                if (dir > 3) dir = 0;
                                break;
                            case 'L':
                                dir--;
                                if (dir < 0) dir = 3;
                                break;
                        }
                        if (!okay) break;
                    }
                    if (okay) {
                //        System.out.println("okay at " + cc+ " " + cr +"\n");
                        map[cr][cc] = '*';
                    } else {
               //         System.out.println("Failed, finding new dir\n");
                    }
                }
            }
        }
        for (char[] arr: map) {
            for (char g: arr) {
                System.out.print(g);
            }
            System.out.println();
        }
    }
}