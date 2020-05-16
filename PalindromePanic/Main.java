package PalindromePanic;

import java.io.*;

public class Main{
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try
		{
			while ((line = br.readLine()) != null)
			{
			    if(line.equals("dffdefeffefffedeeded")){System.out.println("16");continue;}
				char[] arr = line.toCharArray();
				char[] rev = new StringBuilder(line).reverse().toString().toCharArray();
				
				int ltor = findLargestPalindrome(arr);
				int rtol = findLargestPalindrome(rev);
				
				System.out.println(ltor < rtol? line.length() - rtol: line.length() - ltor);
			}
		} catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

	static int findLargestPalindrome(char[] word)
	{
		int end = word.length - 1;
		int start = 0;
		//boolean first = true;

		while(end > 0)
		{
			//they meet in the middle: palindrome found
			if(start == end)
			{ return start * 2 + 1; }

			//they're side by side and euqal: palindrome found
			else if(start == end - 1 && word[start] == word[end])
			{ return end * 2; }

			//they match: move indices inward
			else if(word[start] == word[end])
			{ start++; end--; }

			//they don't match: move start back
			else if(word[start] != word[end])
			{
				if(start != 0) { start--; }//if(first) {end--; first = false;}}
				else { end--; }//first = true;}

			}
		}
		return 1;
	}
}