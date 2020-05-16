package TheCode;

import java.io.*;
//really by me
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int[] map = new int[N];
        for(int i = 0; i < N; i++){
            map[i] = Integer.parseInt(in.readLine());
        }
        
        int c = 0;
        while(map[c]!=0){
            c += map[c];
            if(c < 0) c += N;
            else if(c >= N) c-= N;
            char g = (char) (map[c] + 64);
            
            if(map[c] == 0) break;
            System.out.print(g);
            c++;
        }
    }
}