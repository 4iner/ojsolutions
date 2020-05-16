package TenPinTrig;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = in.readLine())!=null){
            String[] firstLine = line.split(" ");
            double x1 = Double.parseDouble(firstLine[0]);
            int xp1 = Integer.parseInt(firstLine[1]);
            double y1 = Double.parseDouble(firstLine[2]);
            int xp2 = Integer.parseInt(firstLine[3]);
            double S = Double.parseDouble(firstLine[4]);
            int xp3 = Integer.parseInt(firstLine[5]);
            int N = Integer.parseInt(firstLine[6]) ;
            x1 = x1 * Math.pow(10, xp1);
            y1 = y1 * Math.pow(10, xp2);
            S = S * Math.pow(10, xp3);
            x1 = (double)Math.round(x1 * Math.pow(10,N)) / Math.pow(10, N);
            y1 =(double) Math.round(y1 * Math.pow(10,N)) / Math.pow(10, N);
            S = (double)Math.round(S * Math.pow(10,N)) / Math.pow(10, N);
            
            double xStep = ((double)1/6) * S;
            double yStep = ((double)1/3) * Math.sin(30) * S * - 1;
            xStep =(double) Math.round(xStep * Math.pow(10,N)) / Math.pow(10, N);
            yStep =(double) Math.round(yStep * Math.pow(10,N)) / Math.pow(10, N);
            double[][] pins = new double[10][2];
            pins[0][0] = x1;
            pins[0][1] = y1;
            pins[1][0] = x1 - xStep;
            pins[1][1] = y1 + yStep;
            pins[2][0] = x1 + xStep;
            pins[2][1] = y1 + yStep;
            pins[3][0] = x1 - 2 * xStep;
            pins[3][1] = y1 + 2 * yStep;
            pins[4][0] = x1;
            pins[4][1] = y1 + 2 * yStep;
            pins[5][0] = x1 + 2 * xStep;
            pins[5][1] = y1 + 2 * yStep;
            pins[6][0] = x1 - 3 * xStep;
            pins[6][1] = y1 + 3 * yStep;
            pins[7][0] = x1 - xStep;
            pins[7][1] = y1 + 3 * yStep;
            pins[8][0] = x1 + xStep;
            pins[8][1] = y1 + 3 * yStep;
            pins[9][0] = x1 + 3 * xStep;
            pins[9][1] = y1 + 3 * yStep;


            double[][] points = new double[5][2];
            for(int i = 0; i < points.length; i++){
                line = in.readLine();
                String[] beepboop = line.split(" ");
                double x11 = Double.parseDouble(beepboop[0]);
                double xp11 = Double.parseDouble(beepboop[1]);
                double y11 = Double.parseDouble(beepboop[2]);
                double xp12 = Double.parseDouble(beepboop[3]);
                points[i][0] = x11 * Math.pow(10,xp11);
                points[i][1] = y11 * Math.pow(10,xp12);
            }
            
            for(double[] point: points){
                int closestPin = -1;
                double leastDis = 2000000000;
                for(int i = 0; i < pins.length; i++){
                    double[] pin = pins[i];

                    double distance = Math.sqrt(Math.pow(pin[0]-point[0],2)+Math.pow(pin[1]-point[1],2));
                    if(distance < leastDis){
                        leastDis = distance;
                        closestPin = i + 1;
                    }
                }
                System.out.print(closestPin+" ");
            }
            System.out.println(" ");
        }
    }
}