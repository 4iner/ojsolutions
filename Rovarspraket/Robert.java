package Rovarspraket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Robert {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String consonants = "aeiou";
        StringBuilder output = new StringBuilder();
        String line = in.readLine();
        
        for(int i = 0; i < line.length(); i++){
            char curr = line.charAt(i);
            if(!consonants.contains(curr+"")){
                output.append(curr);
                int leftVowel = -1;
                int rightVowel = -1;
                int distanceLeft = 0;
                int distanceRight = 0;
                int c_pos = alphabet.indexOf(curr);
                int c = c_pos;
                while(true){
                    if(consonants.contains(alphabet.charAt(c)+"")) break;
                    c--;
                    distanceLeft++;
                }
                
                leftVowel = c;
                c = c_pos;
                
                while(true){
                    if(consonants.contains(alphabet.charAt(c)+"")) break;
                    c++;
                    distanceRight++;
                    if(c>25) break;
                }
                if(c < 25)
                	rightVowel = c;
             //   System.out.println("c_pos: "+c_pos+", LeftV: "+leftVowel+", rightV: "+rightVowel
               // 		+ ", char leftV: "+alphabet.charAt(leftVowel)+ ", char rightV: "+alphabet.charAt(rightVowel));
               // System.out.println("Distance left: "+distanceLeft+", distance right: "+distanceRight);
                if(leftVowel == -1) distanceLeft = 27;
                if(rightVowel == -1) distanceRight = 500;
                if(distanceLeft == distanceRight){
                  //  System.out.println(curr);
                 //   System.out.println("They are equal!");
                    output.append(leftVowel<rightVowel?alphabet.charAt(leftVowel):alphabet.charAt(rightVowel));
                }
                else output.append((distanceLeft < distanceRight) ? alphabet.charAt(leftVowel):alphabet.charAt(rightVowel));
                c = c_pos+1;
                if(curr == 'z'){
                    output.append('z');
                }
               
                else while(true){
                    if(!consonants.contains(alphabet.charAt(c)+"")){
                        output.append(alphabet.charAt(c));
                        break;
                    }else c++;
                }
                
            }
            else output.append(line.charAt(i));
        }
        System.out.println(output);
    
    }
}