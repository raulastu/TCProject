import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class Pathfinding {
   public int getDirections(int x, int y) {

   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			PathfindingHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				PathfindingHarness.run_test(Integer.valueOf(args[i]));
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
class PathfindingHarness {
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
			int x                     = 0;
			int y                     = -4;
			int expected__            = 8;

			return verifyCase(casenum__, expected__, new Pathfinding().getDirections(x, y));
		}
		case 1: {
			int x                     = 5;
			int y                     = -4;
			int expected__            = 9;

			return verifyCase(casenum__, expected__, new Pathfinding().getDirections(x, y));
		}
		case 2: {
			int x                     = 5;
			int y                     = 4;
			int expected__            = 9;

			return verifyCase(casenum__, expected__, new Pathfinding().getDirections(x, y));
		}
		case 3: {
			int x                     = -1;
			int y                     = -4;
			int expected__            = 7;

			return verifyCase(casenum__, expected__, new Pathfinding().getDirections(x, y));
		}
		case 4: {
			int x                     = 0;
			int y                     = 0;
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new Pathfinding().getDirections(x, y));
		}

		// custom cases

/*      case 5: {
			int x                     = ;
			int y                     = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Pathfinding().getDirections(x, y));
		}*/
/*      case 6: {
			int x                     = ;
			int y                     = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Pathfinding().getDirections(x, y));
		}*/
/*      case 7: {
			int x                     = ;
			int y                     = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Pathfinding().getDirections(x, y));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
