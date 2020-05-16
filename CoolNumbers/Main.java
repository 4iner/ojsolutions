package CoolNumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int out = 0;
        for(int i = 1;Math.pow(i,6) <= b; i++){
            if(Math.pow(i,6) >= a){
                out++;
            }
            
        }
        System.out.println(out);
        in.close();
    }
    
}