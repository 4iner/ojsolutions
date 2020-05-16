package ChocoChewsday;

import java.io.*;

public class ChocoRate {
	public static void main(String[] args) throws IOException {
	//	System.setIn(new FileInputStream("lol.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line = "";
		while((line = in.readLine())!=null){
			int N = Integer.parseInt(line);
			String[] cookies = new String[N];
			int[][] scores = new int[N][3];
			int cookiePointer = -1;

			while(!(line = in.readLine()).equals("*")){
				if(line.charAt(0) =='J'&&line.charAt(1) ==' '){
					String[] k = line.split(" ");
					scores[cookiePointer][0] += Integer.parseInt(k[1]);  
					scores[cookiePointer][1] += Integer.parseInt(k[2]);
					scores[cookiePointer][2] += Integer.parseInt(k[3]);
				}else{
					cookiePointer++;
					cookies[cookiePointer] = line;
				}

			}
			if(cookies.length == 1){
				System.out.println(cookies[0]);
				continue;
			}
			String winner = "";
			int max = 0;
			int lastWinner = -1;
			for(int i = 0; i < N; i++){
				int total = scores[i][0] + scores[i][1] + scores[i][2];
				//System.out.println("total: "+(scores[i][0] + scores[i][1] + scores[i][2])+", max: "+max);
				if(total > max){
				//	System.out.println("last max");
					max = total;
					winner = cookies[i];
					lastWinner = i;
					continue;
				}
				else if(total == max){
				//	System.out.println(winner+" "+cookies[i]);
					
					if(scores[i][2] == scores[lastWinner][2]){
						if(scores[i][1] == scores[lastWinner][1]){
						//	System.out.println(scores[i][0]+" "+scores[i][1]+" "+scores[i][2]+" ");
							//	System.out.println(scores[i][0] == scores[lastWinner][0]);
							if(scores[i][0] == scores[lastWinner][0]) {
							//	System.out.println(winner);
								winner+=","+cookies[i];
							}
							else {
								if(scores[i][0] > scores[lastWinner][1]) {
									winner = cookies[i];
									lastWinner = i;
								}
							}
						}else {
							if(scores[i][1] > scores[lastWinner][1]) {
								winner = cookies[i];
								lastWinner = i;
							}
						}
					}else {
						if(scores[i][2] > scores[lastWinner][2]) {
							winner = cookies[i];
							lastWinner = i;
						}
					}
				}
			}

			System.out.println(winner);
		}
	}
}