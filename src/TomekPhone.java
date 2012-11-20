import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class TomekPhone {
   public int minKeystrokes(int[] frequencies, int[] keySizes) {
	   
	   int []keyS = new int [keySizes.length];
	   for (int i = 0; i < keyS.length; i++) {
		keyS[i]=keySizes[i];
	}
	   print(keySizes);
	   int r = 0;
	   sort(frequencies);
	   int j=0;
	   for (int i = frequencies.length-1; i >=0; i--) {
		   boolean done=false;
		   int n=keySizes.length;
		   while(n-->0){
			   print(keySizes);
			   System.err.println(j);
			   if(keySizes[j]>0){
				   keySizes[j]--;
				   int xx = frequencies[i]*(keyS[j]-keySizes[j]);
				   r+=xx;
				   System.err.println(frequencies[i]+" "+xx);
				   done=true;
				   j++;
				   if(j==keySizes.length)
					   j=0;
				   break;
				
			   }
			   j++;
			   if(j==keySizes.length)
				   j=0;
		   }
		   if(!done)
			   return -1;
	   }
	   return r;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			TomekPhoneHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				TomekPhoneHarness.run_test(Integer.valueOf(args[i]));
		}
	}

    private static void print(Object... rs) {
        System.err.println(Arrays.deepToString(rs));
    }

    private static void printm(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.err.println("[" + a[i] + "]");
        }
    }

    private static void printm(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.err.println("[" + new String(a[i]) + "]");
        }
    }
    
    private static void printm(int[][] a) {
    	System.err.println("");
        for (int i = 0; i < a.length; i++) {
        	String line = "";
        	for (int j = 0; j < a[i].length; j++) {
				line+=a[i][j]+" ";
			}
            System.err.println("[" + line.trim() + "]");
        }
        System.err.println("");
    }
    

// END CUT HERE
}

// BEGIN CUT HERE
class TomekPhoneHarness {
	public static void run_test(int casenum) {
		if (casenum != -1) {
			if (runTestCase(casenum) == -1)
				System.err.println("Illegal input! Test case " + casenum + " does not exist.");
			return;
		}
		
		int correct = 0, total = 0;
		for (int i=0;; ++i) {
			int x = runTestCase(i);
			if (x == -1) {
				if (i >= 100) break;
				continue;
			}
			correct += x;
			++total;
		}
		
		if (total == 0) {
			System.err.println("No test cases run.");
		} else if (correct < total) {
			System.err.println("Some cases FAILED (passed " + correct + " of " + total + ").");
		} else {
			System.err.println("All " + total + " tests passed!");
		}
	}
	
	static boolean compareOutput(int expected, int result) { return expected == result; }
	static String formatResult(int res) {
		return String.format("%d", res);
	}
	
	static int verifyCase(int casenum, int expected, int received) { 
		System.err.print("Example " + casenum + "... ");
		if (compareOutput(expected, received)) {
			System.err.println("PASSED");
			return 1;
		} else {
			System.err.println("FAILED");
			System.err.println("    Expected: " + formatResult(expected)); 
			System.err.println("    Received: " + formatResult(received)); 
			return 0;
		}
	}

	static int runTestCase(int casenum__) {
		switch(casenum__) {
		case 0: {
			int[] frequencies         = {7,3,4,1};
			int[] keySizes            = {2,2};
			int expected__            = 19;

			return verifyCase(casenum__, expected__, new TomekPhone().minKeystrokes(frequencies, keySizes));
		}
		case 1: {
			int[] frequencies         = {13,7,4,20};
			int[] keySizes            = {2,1};
			int expected__            = -1;

			return verifyCase(casenum__, expected__, new TomekPhone().minKeystrokes(frequencies, keySizes));
		}
		case 2: {
			int[] frequencies         = {11,23,4,50,1000,7,18};
			int[] keySizes            = {3,1,4};
			int expected__            = 1164;

			return verifyCase(casenum__, expected__, new TomekPhone().minKeystrokes(frequencies, keySizes));
		}
		case 3: {
			int[] frequencies         = {100,1000,1,10};
			int[] keySizes            = {50};
			int expected__            = 1234;

			return verifyCase(casenum__, expected__, new TomekPhone().minKeystrokes(frequencies, keySizes));
		}
		case 4: {
			int[] frequencies         = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
			int[] keySizes            = {10,10,10,10,10,10,10,10};
			int expected__            = 3353;

			return verifyCase(casenum__, expected__, new TomekPhone().minKeystrokes(frequencies, keySizes));
		}

		// custom cases

/*      case 5: {
			int[] frequencies         = ;
			int[] keySizes            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new TomekPhone().minKeystrokes(frequencies, keySizes));
		}*/
/*      case 6: {
			int[] frequencies         = ;
			int[] keySizes            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new TomekPhone().minKeystrokes(frequencies, keySizes));
		}*/
/*      case 7: {
			int[] frequencies         = ;
			int[] keySizes            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new TomekPhone().minKeystrokes(frequencies, keySizes));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
