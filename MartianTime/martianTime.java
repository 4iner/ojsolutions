package MartianTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class martianTime {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=in.readLine())!=null){
			String[] ok=line.split(" ");
			double eSec=0;
			double eD=Integer.parseInt(ok[0]);
			double eH=Integer.parseInt(ok[1]);
			double eM=Integer.parseInt(ok[2]);
			eSec+=eD*86400+eH*3600+eM*60;


			double mH=88642.663/24;
			double mM=mH/60;
			int mDo=0, mHo=0, mMo=0;
			eSec = eSec - 86400;
			mDo= (int) (eSec/88642.663);
			eSec=eSec-(mDo*88642.663);
			mHo= (int) (eSec/mH);
			eSec=eSec-(mHo*mH);
			mMo= (int) (eSec/mM);
			if(mHo<10&&mMo<10)
				System.out.println("Day "+(mDo+1)+", 0"+mHo+":0"+mMo);
			else if(mHo<10)
		    		System.out.println("Day "+(mDo+1)+", 0"+mHo+":"+mMo);
			else if(mMo<10)
				System.out.println("Day "+(mDo+1)+", "+mHo+":0"+mMo);
			else System.out.println("Day "+(mDo+1)+", "+mHo+":"+mMo);
		}
		in.close();
	}

}