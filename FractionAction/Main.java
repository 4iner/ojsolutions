package FractionAction;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int D = Integer.parseInt(in.readLine());
        int n = 0;
        while(N >= D){
            N -= D;
            n++;
        }
        int gcd = findGCD(N, D);
        N = N/gcd;
        D = D/gcd;
        if(n != 0) System.out.print(n+" ");
        System.out.println(N == 0 ? "" : N+"/"+D);
    }
    private static int findGCD(int number1, int number2) { //base case 
    if(number2 == 0){ return number1; }
    return findGCD(number2, number1%number2); 
        
    }

}