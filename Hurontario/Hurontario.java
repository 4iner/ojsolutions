package Hurontario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hurontario {
	private static String output = "";

	public static void main(String[] args) throws IOException {

	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine())!=null) {
			String[] strings = line.split(" ");
			if(strings.length != 2) break;
			
			String bef = strings[0];
			String aft = strings[1];
			if(bef.length() == 0) {
				System.out.println(aft);
				break;
			}
			if(aft.length() == 0) {
				System.out.println(bef);
				break;
			}
			
			
			for(int k = aft.length() - 1; k >= 0; k--) {
				//System.out.println(k);
				//System.out.println(aft.charAt(k));
				int i = bef.length() - 1;
				while(i - k < 0) k--;
				int match = 0;
				while(aft.charAt(k)==bef.charAt(i)) {
					match++;
				//	System.out.println(aft.charAt(k)+" "+bef.charAt(i));
					if(k == 0){
						output = bef + aft.substring(match, aft.length());
					    break;
					}
					k--; i--;
				}
				
			}
			if(output.length() == 0) System.out.println(bef+aft);
			else System.out.println(output);
			//long endTime = System.nanoTime();
			//System.out.println("Execution time: "+(endTime-startTime)/1000+"us");

		}
	}
	}