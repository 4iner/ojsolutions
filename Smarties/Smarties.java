package Smarties;

import java.io.*;
public class Smarties {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = "empty";
		for(int i= 0; i < 10; i++){
		    int[] colors = new int[8];
		    if((line = in.readLine()) == null) break;
		   // int red = 0, orange = 0, blue = 0, pink = 0, violet = 0, brown = 0, yellow = 0, green = 0;
		    while(!line.equals("end of box")){
		        switch(line){
		            case "red":
		                colors[0]++;
		                break;
		            case "orange":
		                colors[1]++;
		                break;
		            case "blue":
		                colors[2]++;
		                break;
		            case "pink":
		                colors[3]++;
		                break;
		            case "violet":
		                colors[4]++;
		                break;
		            case "brown":
		                colors[5]++;
		                break;
		            case "yellow":
		                colors[6]++;
		                break;
		            case "green":
		                colors[7]++;
		                break;
		        }
		        //System.out.println(line);
		        line = in.readLine();
		    }
		    int totalTime = colors[0]*16;
		    for(int c = 1; c < colors.length;c++){
		        totalTime += colors[c]/7*13 + (colors[c]%7 > 0? 13:0);
		    }
		    System.out.println(totalTime);
		}
		in.close();
	}
	
}