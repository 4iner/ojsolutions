package PassFail;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Pass_or_fail {
    public static void main(String[] args) throws IOException{
    //	long startTime = System.nanoTime();
        //BufferedReader in = new BufferedReader(new FileReader("lol.txt"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = in.readLine())!=null){
            String[] weightStrings = line.split(" ");
            int[] weights = new int[weightStrings.length];
                weights[0] = Integer.parseInt(weightStrings[0]);
                weights[1] = Integer.parseInt(weightStrings[1]);
                weights[2] = Integer.parseInt(weightStrings[2]);
                weights[3] = Integer.parseInt(weightStrings[3]);
            
            int pass = 0;
            int students = Integer.parseInt(in.readLine());
            for(int i = 0; i < students; i++){
                line = in.readLine();
                int grade = 0;
                String[] marksStrings = line.split(" ");
                grade = weights[0] * Integer.parseInt(marksStrings[0]) +weights[1] * Integer.parseInt(marksStrings[1]) +weights[2] * Integer.parseInt(marksStrings[2]) +weights[3] * Integer.parseInt(marksStrings[3]);
//                for(int g = 0; g < marksStrings.length; g++){
//                    grade += weights[g] * Integer.parseInt(marksStrings[g]);
//                }
                if(grade >= 5000) pass++;
            }
            System.out.println(pass);
        }
        in.close();
//		long endTime   = System.nanoTime();

	//	long totalTime = endTime - startTime;

	//	System.out.println("Total execution time: "+(totalTime/1000) +"ns");
    }
}