import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class HyperKnight {
   public long countCells(int a, int b, int numRows, int numColumns, int k) {
	   if(k==0 || k%2!=0)
		   return 0;
	   switch (k) {
	case 2:
		break;
	case 4:
		break;
	case 6:
		break;
	case 8:
		int max=min(a,b);
		long l1 = numRows-max*2;
		long l2 = numColumns-max*2;
		return l1*l2-4;
	default:
		break;
	}
	   return 1;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			HyperKnightHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				HyperKnightHarness.run_test(Integer.valueOf(args[i]));
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
class HyperKnightHarness {
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
	
	static boolean compareOutput(long expected, long result) { return expected == result; }
	static String formatResult(long res) {
		return String.format("%d", res);
	}
	
	static int verifyCase(int casenum, long expected, long received) { 
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
			int a                     = 2;
			int b                     = 1;
			int numRows               = 8;
			int numColumns            = 8;
			int k                     = 4;
			long expected__           = 20;

			return verifyCase(casenum__, expected__, new HyperKnight().countCells(a, b, numRows, numColumns, k));
		}
		case 1: {
			int a                     = 3;
			int b                     = 2;
			int numRows               = 8;
			int numColumns            = 8;
			int k                     = 2;
			long expected__           = 16;

			return verifyCase(casenum__, expected__, new HyperKnight().countCells(a, b, numRows, numColumns, k));
		}
		case 2: {
			int a                     = 1;
			int b                     = 3;
			int numRows               = 7;
			int numColumns            = 11;
			int k                     = 0;
			long expected__           = 0;

			return verifyCase(casenum__, expected__, new HyperKnight().countCells(a, b, numRows, numColumns, k));
		}
		case 3: {
			int a                     = 3;
			int b                     = 2;
			int numRows               = 10;
			int numColumns            = 20;
			int k                     = 8;
			long expected__           = 56;

			return verifyCase(casenum__, expected__, new HyperKnight().countCells(a, b, numRows, numColumns, k));
		}
		case 4: {
			int a                     = 1;
			int b                     = 4;
			int numRows               = 100;
			int numColumns            = 10;
			int k                     = 6;
			long expected__           = 564;

			return verifyCase(casenum__, expected__, new HyperKnight().countCells(a, b, numRows, numColumns, k));
		}
		case 5: {
			int a                     = 2;
			int b                     = 3;
			int numRows               = 1000000000;
			int numColumns            = 1000000000;
			int k                     = 8;
			long expected__           = 999999988000000036L;

			return verifyCase(casenum__, expected__, new HyperKnight().countCells(a, b, numRows, numColumns, k));
		}

		// custom cases

/*      case 6: {
			int a                     = ;
			int b                     = ;
			int numRows               = ;
			int numColumns            = ;
			int k                     = ;
			long expected__           = ;

			return verifyCase(casenum__, expected__, new HyperKnight().countCells(a, b, numRows, numColumns, k));
		}*/
/*      case 7: {
			int a                     = ;
			int b                     = ;
			int numRows               = ;
			int numColumns            = ;
			int k                     = ;
			long expected__           = ;

			return verifyCase(casenum__, expected__, new HyperKnight().countCells(a, b, numRows, numColumns, k));
		}*/
/*      case 8: {
			int a                     = ;
			int b                     = ;
			int numRows               = ;
			int numColumns            = ;
			int k                     = ;
			long expected__           = ;

			return verifyCase(casenum__, expected__, new HyperKnight().countCells(a, b, numRows, numColumns, k));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
