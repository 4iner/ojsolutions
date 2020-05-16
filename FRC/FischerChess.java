package FRC;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.*;
public class FischerChess {
	static Set<String> combos;
	static String line;
	static String chars = "RRKQBBNN";
	int count;
	static ArrayList<Character> charg = new ArrayList<Character>();
	public static void main(String[] args) throws IOException {
		
		{
		for(char c:chars.toCharArray()){
			charg.add(c);
			}
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader in = new BufferedReader(new FileReader("lol.txt"));
		
		while((line = in.readLine()) != null){
			combos = new HashSet<>();
			System.out.println(recursive(line));
		}
		in.close();

	//	System.out.println("Total execution time: "+(totalTime/1000000) +"ms");
	}
	public static int recursive(String pieces){
		if(combos.contains(pieces)) return 0;
		boolean full = true;
		ArrayList<Character> chars = new ArrayList<Character>();
		for(char c:pieces.toCharArray()){
			chars.add(c);
			if(c == '_') full = false;
		}
		
		ArrayList<Character> rem = findRemPieces(chars);
		
		if(rem.size() > 0 && full) return 0;
		
		if(isValid(pieces)) return 1;
		else
		if(full){
			return 0;
		}
		int count = 0;
		int j = 0;
		while(chars.get(j)!='_')j++;

		for(int i = 0; i < rem.size(); i++){
			chars.set(j, rem.get(i));
			String n = "";
			for(char c:chars){
				n+=c;
			}
			count+=recursive(n);
		}
		return count;
	}
	
	public static ArrayList<Character> findRemPieces(ArrayList<Character> pieces){
		ArrayList<Character> change = new ArrayList<Character>(charg);
		for(char c:pieces){
			if(c!='_' && change.contains(c)){
				change.remove(change.indexOf(c));
			}
		}

		return change;
	}
	
	public static boolean isValid(String pieces){
		if( pieces.split("[QBN]*R[QBN]*K[QBN]*R[QBN]*").length == 0){
			int i = 0;
			while(i < pieces.length() && pieces.charAt(i)!='B') i++;
			int firstB = i++;
			while(i < pieces.length() && pieces.charAt(i)!='B') i++;
			if ((firstB%2 == 0 && i%2 == 1) || (firstB%2 == 1 && i%2 == 0)){
				combos.add(pieces);
			return true;
			}
		}
		return false;
	}
}