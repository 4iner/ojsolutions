package Diamonds;

import java.io.*;
//really by me 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        for(int i = N/2+1; i > 0; i-=1){
            int c, g;
            for(c = 0; c < i; c++)
                System.out.print('*');
            for(g = c; g < N - c; g++)
                System.out.print(' ');
            for(c = g; c < N; c++)
                System.out.print('*');
            System.out.println();
        }
        for(int i = 2; i < N/2+1; i++){
            int c, g;
            for(c = 0; c < i; c++)
                System.out.print('*');
            for(g = c; g < N - c; g++)
                System.out.print(' ');
            for(c = g; c < N; c++)
                System.out.print('*');
            System.out.println();
        }
        for(int c = 0; c < N; c++)
            System.out.print('*');
        
    }
}