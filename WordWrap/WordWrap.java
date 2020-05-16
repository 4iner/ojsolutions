package WordWrap;

import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
public class WordWrap {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null){
			int N = Integer.parseInt(line);
			ArrayList<String> words = new ArrayList<String>(Arrays.asList(in.readLine().split(" "))); 
			while(words.size() > 0){
				String out = "";
				int length = 0;
				int j = 0;
				if (words.get(j).length() > N){
					String word = words.get(j);
					words.set(j,word.substring(N, word.length()));
					out+=word.substring(0, N)+"\n";
					System.out.print(out);
					continue;
				}
				else {
					while (length < N && words.size() > 0 && words.get(j).length() + length <= N){
							out+=(words.get(j))+" ";
							length += words.get(j).length() + 1;
							words.remove(words.get(j));
					}
					System.out.println(out);
				}
			}
			System.out.println("=====");
		}
		in.close();
	}
	
}
