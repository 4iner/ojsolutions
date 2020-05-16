package RotatingLetters;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        String[] arr = line.split("[IOSHZXN]");
        if(arr.length == 0)
            System.out.println("YES");
            else System.out.println("NO");
        in.close();
    }
}