import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class APlusB {

	public static void main(String[] args) throws IOException{
		//System.setIn(new FileInputStream("lol.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while((line = in.readLine())!= null){
			int N = Int(line);
			for(int i = 0; i < N; i++) {
				String[] nums = in.readLine().split(" ");
				String	numA = nums[0];
				String	numB = nums[1];
				boolean mode; // true for addition, false for subtraction
				boolean negA = numA.charAt(0) == '-';
				boolean negB = numB.charAt(0) == '-';
				int nA = numA.length();
				int nB = numB.length();
				if((negA && negB) || !(negA || negB)) {
					mode = true;
					//do additions
					StringBuilder newInt = new StringBuilder("");

					int pos = 0;

					if(negA) {
						numA = numA.substring(1, nA--);
						numB = numB.substring(1, nB--);
					}
					int carry = 0;
					//	System.out.println("Num A: "+numA);
					//	System.out.println("Num B: "+numB);
					int a, b, c;
					for(c = 0; c < (nA > nB ? nA : nB); c++) {
						if(c < nA)
							a = numA.charAt(nA-c - 1) - '0';
						else a = 0;
						if(c < nB)
							b = numB.charAt(nB-c - 1) - '0';
						else b = 0;
						int sum = a + b + carry;
						if(sum >= 10) {
							carry = 1;
							sum -= 10;
						}
						else {
							carry = 0;
						}
						newInt.append(sum);
					}
					if(carry == 1) newInt.append('1');
					newInt.reverse();
					if(negA) newInt.insert(0, '-');
					System.out.println(newInt.toString());
				}
				else {
					boolean negOut;
					mode = false;
					if(negA) numA = numA.substring(1, nA--);
					else numB = numB.substring(1, nB--);
					String big, small;
					boolean ABigger = true;
					if(nA != nB) {
						ABigger = nA > nB;
						big = ABigger ? numA : numB;
						small = ABigger ? numB : numA;
					}else {
						ABigger = true;
						boolean same = true;
						for(int g = 0; g < nA; g++) {
							int a = numA.charAt(g) - '0';
							int b = numB.charAt(g) - '0';
							if(a == b) continue;
							same = false;
							if(a < b) {
								ABigger = false;
							}
							break;
						}

						if(same) {
							System.out.println(0);
							continue;
						}

						big = ABigger ? numA : numB;
						small = ABigger ? numB : numA;

					}
					StringBuilder newInt = new StringBuilder();
					
					negOut = (negA && ABigger) || (negB && !ABigger);
					
					int a, b, c;
					int carry = 0;
					nA = big.length();
					nB = small.length();
					for(c = 0; c < nA; c++) {
						if(c < nA)
							a = big.charAt(nA-c - 1) - '0';
						else a = 0;
						if(c < nB)
							b = small.charAt(nB-c - 1) - '0';
						else b = 0;
						
						int sum = a - b - carry;
						if(sum < 0) {
							sum += 10;
							carry = 1;
						}
						else {
							carry = 0;
						}
						newInt.append(sum);
					}
					while(newInt.charAt(newInt.length() - 1)=='0') newInt.deleteCharAt(newInt.length() - 1);
					newInt.reverse();
					if(negOut) newInt.insert(0, '-');
					
					
					System.out.println(newInt.toString());

				}

			}

		}
	}
	public static int Int(String n) {
		return Integer.parseInt(n);
	}


}