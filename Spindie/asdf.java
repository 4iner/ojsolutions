package Spindie;

import java.io.*;
import java.util.*;

public class asdf {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int NumOfTargets = 5;
		while((line = in.readLine())!=null){
			Set<Integer> set = new HashSet<>();
			//if(line == "") break;
			int NumOfIntegers = Integer.parseInt(line);
			//	int[] nums = new int[NumOfIntegers];
			String[] AllIntegers = in.readLine().split(" ");
			for(int i = 0; i < NumOfIntegers; i++){
				set.add(Integer.parseInt(AllIntegers[i]));
				//		nums[i] = Integer.parseInt(AllIntegers[i]);

				//		System.out.println("Targets: "+nums[i]);
			}
			String[] targetLine = in.readLine().split(" ");
			int[] targets = new int[NumOfTargets];
			for(int i = 0; i < NumOfTargets; i++){
				targets[i] = Integer.parseInt(targetLine[i]);
			}


			for(int q = 0; q < targets.length; q++){
				boolean targetGet = false;
				for(int i:set) {
					for(int c:set) {
						for(int j:set) {
							if((i + c) * j == targets[q] || i + c + j == targets[q] ||  i*c+j == targets[q]|| i*c*j == targets[q]){
								System.out.print("T");
								//								i = nums.length; c = nums.length; j = nums.length;// q = targets.length;
																targetGet = true;                           
								//							}
							}
							if(targetGet) break;
						}
						if(targetGet) break;
					}
					if(targetGet) break;
				}

				if(!targetGet)System.out.print("F");
			}

			System.out.println();
		}

		in.close();
	}
}