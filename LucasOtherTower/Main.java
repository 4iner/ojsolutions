package LucasOtherTower;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        StringTokenizer st;
        while((line = in.readLine())!=null){
            st = new StringTokenizer(line);
            System.out.println((Integer.parseInt(st.nextToken())) * 2 - 1);
        }
    }
}