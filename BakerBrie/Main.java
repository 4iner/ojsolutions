package BakerBrie;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = in.readLine())!= null){
            int F = 0, D = 0;
            String[] intString = line.split(" ");
            try {
            F = Integer.parseInt(intString[0]);
            D = Integer.parseInt(intString[1]);
            }catch(Exception E){System.out.println(line);break;}
            int[][] array = new int[D][F];
            for(int i = 0; i < D; i++){
                String[] Fs = in.readLine().split(" ");
                for(int c = 0; c < Fs.length; c++){
                    array[i][c] = Integer.parseInt(Fs[c]);
                }
            }
            int totalDs = 0;
            for(int i = 0; i < D; i++){
                int dayTotal = 0;
                for(int c = 0; c < F; c++){
                    dayTotal += array[i][c];
                }
                if(dayTotal % 13 == 0 && dayTotal > 0){
                    totalDs +=dayTotal/13;
                }
            }
            for(int i = 0; i < F; i++){
                int FranchiseTotal = 0;
                for(int c = 0; c < D; c++){
                    FranchiseTotal += array[c][i];
                }
                if(FranchiseTotal%13 == 0 && FranchiseTotal>0) totalDs+=FranchiseTotal/13;
            }
            System.out.println(totalDs);
            
            
        }
    }
    
}