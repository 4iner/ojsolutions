package OilSpill;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class OilSpill {
    
    static char[][] grid = new char[10][10];
    static boolean[][] visited = new boolean[10][10];
    public static void main(String[] args) throws IOException{
    //	System.setIn(new FileInputStream("lol.txt"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = in.readLine())!= null){
            int i = 0;
            int[] interest = null;
            while(!line.equals("==========")){
            	for(int c = 0; c < 10; c++) {
            		visited[i][c] = false;
            	}
                grid[i] = line.toCharArray();
               // if(interest == null){
                    for(int c = 0; c < grid[i].length; c++){
                    	visited[i][c] = false;
                        if(grid[i][c] == 'A'){
                            interest = new int[2];
                            interest[0] = i;
                            interest[1] = c;
                      //      break;
                        }
                    }
                //}
                i++;
                line = in.readLine();
            }
            System.out.println(1+recursive(interest[0],interest[1]));

            
        }
    }
    public static int recursive(int x, int y){
        if(x > grid.length  || x < 0 || y > grid[0].length - 1 || y < 0) return 0;
        int total = 0;
        //System.out.println(x+" "+y);
        if(grid[x][y] == '.') return 0;
        if(!visited[x+1][y] && grid[x+1][y] == '#') {visited[x+1][y] = true;total += 1 + recursive(x + 1, y);}
        if(!visited[x][y+1] && grid[x][y + 1] == '#') {visited[x][y+1] = true; total += 1 + recursive(x, y +1);}
        if(!visited[x-1][y] && grid[x - 1][y] == '#') {visited[x-1][y] = true; total += 1 + recursive(x - 1, y);}
        if(!visited[x][y-1] && grid[x][y - 1] == '#'){visited[x][y-1] = true; total += 1 + recursive(x, y - 1);}
        return total;
    }
}