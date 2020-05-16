package ListMinimum;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int[] n = new int[N];
        for(int i = 0; i < N; i++){
            n[i] = Integer.parseInt(in.readLine());
        }
        Arrays.sort(n);
        for(int i = 0; i < N; i++){
            System.out.println(n[i]);
        }
        
    }
}