package LuHanBday;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = in.readLine())!= null){
            int A = 0, B = 0, C = 0, D = 0;
            
            String[] intString = line.split(" ");
            try {
            A = Integer.parseInt(intString[0]);
            B = Integer.parseInt(intString[1]);
            C = Integer.parseInt(intString[2]);
            D = Integer.parseInt(intString[3]); 
                
            }
            catch(Exception E){System.out.println(line);break;}
            int[] primes = primeRange(A,B);
            long sum =0;
            for(int i = 0; i < primes.length; i++){
                //System.out.println("prime "+primes[i]);
                int k = 1;
                while(k * primes[i] < C) k++;
                while(k * primes[i] <= D){
                    //System.out.println(k * primes[i]);
                    sum += k * primes[i];
                    k++;
                }
            }
            System.out.println(sum%2016420);
        }
    }
    public static int[] primeRange(int start, int finish){
        int[] array = new int[1000000];
        int c = 0;
        for(int i = start; i <= finish; i++)
            if(isPrime(i))
                array[c++] = i;
                
        int[] ret = new int[c];
        for(int i = 0; i < c; i++){
            ret[i] = array[i];
        }    
        return ret;
    }
    public static boolean isPrime(int num){
        if (num > 2 && num%2 == 0) return false;
    
        int factor = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < factor; i+=2)
            if(num % i == 0) return false;
        
        return true; 
    }
}