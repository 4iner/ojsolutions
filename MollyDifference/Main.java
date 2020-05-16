package MollyDifference;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int[] nums = new int[N];
        String[] numsS = in.readLine().split(" ");
        for(int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(numsS[i]);
        }
        int least = 1000000000;
        boolean quit = false;
        Arrays.sort(nums);
        for(int i = 0; i < N - 1; i++){
            
                int calc = Math.abs(nums[i] - nums[i + 1]);
                if(calc == 0){
                    System.out.println(0);
                    quit = true;
                    break;
                }
                if(calc < least) least = calc;
                
            
        }
        if(!quit) System.out.println(least);
    }
}