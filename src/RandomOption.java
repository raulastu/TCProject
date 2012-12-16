import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class RandomOption {
   public double getProbability(int keyCount, int[] badLane1, int[] badLane2) {

   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			RandomOptionHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				RandomOptionHarness.run_test(Integer.valueOf(args[i]));
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
class RandomOptionHarness {
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
	
	static final double MAX_DOUBLE_ERROR = 1E-9;
	static boolean compareOutput(double expected, double result){ if(Double.isNaN(expected)){ return Double.isNaN(result); }else if(Double.isInfinite(expected)){ if(expected > 0){ return result > 0 && Double.isInfinite(result); }else{ return result < 0 && Double.isInfinite(result); } }else if(Double.isNaN(result) || Double.isInfinite(result)){ return false; }else if(Math.abs(result - expected) < MAX_DOUBLE_ERROR){ return true; }else{ double min = Math.min(expected * (1.0 - MAX_DOUBLE_ERROR), expected * (1.0 + MAX_DOUBLE_ERROR)); double max = Math.max(expected * (1.0 - MAX_DOUBLE_ERROR), expected * (1.0 + MAX_DOUBLE_ERROR)); return result > min && result < max; } }
	static double relativeError(double expected, double result) { if (Double.isNaN(expected) || Double.isInfinite(expected) || Double.isNaN(result) || Double.isInfinite(result) || expected == 0) return 0; return Math.abs(result-expected) / Math.abs(expected); }
	
	static String formatResult(double res) {
		return String.format("%.10g", res);
	}
	
	static int verifyCase(int casenum, double expected, double received) { 
		System.err.print("Example " + casenum + "... ");
		if (compareOutput(expected, received)) {
			System.err.print("PASSED");
			double rerr = relativeError(expected, received);
			if (rerr > 0) System.err.printf(" (relative error %g)", rerr);
			System.err.println();
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
			int keyCount              = 5;
			int[] badLane1            = {0};
			int[] badLane2            = {3};
			double expected__         = 0.6;

			return verifyCase(casenum__, expected__, new RandomOption().getProbability(keyCount, badLane1, badLane2));
		}
		case 1: {
			int keyCount              = 5;
			int[] badLane1            = {0, 1, 2};
			int[] badLane2            = {1, 2, 0};
			double expected__         = 0.1;

			return verifyCase(casenum__, expected__, new RandomOption().getProbability(keyCount, badLane1, badLane2));
		}
		case 2: {
			int keyCount              = 5;
			int[] badLane1            = {2, 2, 2, 2};
			int[] badLane2            = {0, 1, 3, 4};
			double expected__         = 0.0;

			return verifyCase(casenum__, expected__, new RandomOption().getProbability(keyCount, badLane1, badLane2));
		}
		case 3: {
			int keyCount              = 7;
			int[] badLane1            = {0, 1, 2};
			int[] badLane2            = {6, 5, 4};
			double expected__         = 0.3904761904761904;

			return verifyCase(casenum__, expected__, new RandomOption().getProbability(keyCount, badLane1, badLane2));
		}
		case 4: {
			int keyCount              = 7;
			int[] badLane1            = {3, 5, 1, 0, 2, 6, 4};
			int[] badLane2            = {0, 2, 4, 6, 1, 5, 3};
			double expected__         = 0.09166666666666667;

			return verifyCase(casenum__, expected__, new RandomOption().getProbability(keyCount, badLane1, badLane2));
		}

		// custom cases

/*      case 5: {
			int keyCount              = ;
			int[] badLane1            = ;
			int[] badLane2            = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new RandomOption().getProbability(keyCount, badLane1, badLane2));
		}*/
/*      case 6: {
			int keyCount              = ;
			int[] badLane1            = ;
			int[] badLane2            = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new RandomOption().getProbability(keyCount, badLane1, badLane2));
		}*/
/*      case 7: {
			int keyCount              = ;
			int[] badLane1            = ;
			int[] badLane2            = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new RandomOption().getProbability(keyCount, badLane1, badLane2));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
