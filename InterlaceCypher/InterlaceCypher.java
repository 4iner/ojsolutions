package InterlaceCypher;

import java.util.*;
import java.io.*;
public class InterlaceCypher {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null){
		    if(line.equals("encode")){//encode
		        line = in.readLine();
			    ArrayList<String> strings = new ArrayList<>(Arrays.asList(line.split(" ")));
			    int currentIndex = 0;
			    String output = "";
			    while(output.length() != line.length() - strings.size()){
			        //System.out.println("output: "+output);
			        for(String s: strings){
			            if(currentIndex < s.length()){
			                 output += s.charAt(currentIndex);
			            }
			            else continue;
			        }
			     currentIndex++;
    		    }
    		    int[] spaces = new int[strings.size() + 1];
    		    spaces[0] = 0;
    		    currentIndex = 1;
    		    for(String s: strings){
    		        spaces[currentIndex] = s.length() + spaces[currentIndex - 1] + 1; 
    		        currentIndex++;
    		    }

    		    StringBuilder sb = new StringBuilder(output);
    		    for(int i : spaces){
    		        if(i == 0) continue;
    		        sb.insert(i - 1, " ");
    		    }
			    System.out.println(sb.toString());
 		        
 		    }
 		    else{//decode
 		        line = in.readLine();
 		        ArrayList<String> strings = new ArrayList<>(Arrays.asList(line.split(" ")));
 		        ArrayList<String> outS = new ArrayList<>();
 		        int[] stringLengths = new int[strings.size()];
 		        for(int i = 0; i < strings.size(); i++){
 		            stringLengths[i] = strings.get(i).length();
 		            outS.add(new String());
 		        }
 		        int currentIndex = 0;
 		        
 		        for(int i = 0; i < line.length(); i++){
 		            if(line.charAt(i) ==' ') continue;
 		            
 		            while(currentIndex < stringLengths.length && stringLengths[currentIndex] == 0){
 		                currentIndex++;
 		            }
 		            
 		            if(currentIndex == stringLengths.length) currentIndex = 0;
 		             while(currentIndex < stringLengths.length && stringLengths[currentIndex] == 0){
 		                currentIndex++;
 		            }
 		            outS.set(currentIndex, outS.get(currentIndex)+line.charAt(i));
 		          //  output+= 
 		            stringLengths[currentIndex] -= 1;
    	            currentIndex++;
 		            if(currentIndex == stringLengths.length) currentIndex = 0;
 		        }
 		        
 		 //      for(int i : stringLengths){
 		 //           System.out.print(i+" ");
 		  //      }
 		        System.out.println(String.join(" ",outS));
 		    }
 		}
		in.close();
	}
}