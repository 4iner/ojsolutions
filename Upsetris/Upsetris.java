package Upsetris;

import java.util.*;
import java.io.*;

public class Upsetris {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		for(int cases = 0; cases < 5; cases++) {
			ArrayList<char[]> board = new ArrayList<>();
			while(!(line = in.readLine()).matches("[|]=*[|]")) {
				board.add(line.toCharArray());
			}
			Collections.reverse(board);
			for(int i = 0; i < board.size(); i++) {
				board.set(i, new StringBuilder(new String(board.get(i))).reverse().toString().toCharArray()); 
			}
			//board.add(line.toCharArray());
			int N = line.length();

			//System.out.println(board);
			for(int i = 1; i < N-1; i++) {
				for(int c = board.size() - 1; c >= 0; c--) {
					int range = 0;
					boolean found = false;
					while(c-range>=0 && board.get(c-range)[i] != 'O') {range++;}
					if(range > 0 && c - range >= 0 && board.get(c - range)[i] == 'O') {
						found = true;
						board.get(c)[i] = 'O';
						board.get(c-range)[i] = ' ';
					}
					if(!found) break;
					//System.out.println("range: "+range);
				}
			}
			board.add(line.toCharArray());
			int emptyLines = 0;
			for(char[] ca:board) {
				if(!(countO(ca) < N-2))
					emptyLines++;
			}
			for(int addLine = 0; addLine < emptyLines; addLine++) {
				System.out.println("|"+repeat(N-2," ")+"|");
			}
			for(char[] ca:board) {
				if(countO(ca) < N-2)
					System.out.println(new String(ca));
			}
		}
		
	}
	public static int countO(char[] arr) {
		int total = 0;
		for(char c:arr) {
			if(c == 'O') total++;
		}
		return total;
	}
	public static String repeat(int count, String with) {
		return new String(new char[count]).replace("\0",with);
	}
}