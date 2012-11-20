import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class ConnectTheCities {
   public int minimalRange(int distance, int funds, int[] position) {

   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			ConnectTheCitiesHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				ConnectTheCitiesHarness.run_test(Integer.valueOf(args[i]));
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
class ConnectTheCitiesHarness {
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
			int distance              = 10;
			int funds                 = 5;
			int[] position            = { 3, 7, 9 };
			int expected__            = 3;

			return verifyCase(casenum__, expected__, new ConnectTheCities().minimalRange(distance, funds, position));
		}
		case 1: {
			int distance              = 20;
			int funds                 = 100;
			int[] position            = { 0, 0, 0, 0 };
			int expected__            = 4;

			return verifyCase(casenum__, expected__, new ConnectTheCities().minimalRange(distance, funds, position));
		}
		case 2: {
			int distance              = 63;
			int funds                 = 19;
			int[] position            = { 34, 48, 19, 61, 24 };
			int expected__            = 12;

			return verifyCase(casenum__, expected__, new ConnectTheCities().minimalRange(distance, funds, position));
		}

		// custom cases

/*      case 3: {
			int distance              = ;
			int funds                 = ;
			int[] position            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new ConnectTheCities().minimalRange(distance, funds, position));
		}*/
/*      case 4: {
			int distance              = ;
			int funds                 = ;
			int[] position            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new ConnectTheCities().minimalRange(distance, funds, position));
		}*/
/*      case 5: {
			int distance              = ;
			int funds                 = ;
			int[] position            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new ConnectTheCities().minimalRange(distance, funds, position));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
