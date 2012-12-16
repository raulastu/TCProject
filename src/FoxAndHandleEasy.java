import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class FoxAndHandleEasy {
   public String isPossible(String S, String T) {
	   for (int i = 0; i < S.length(); i++) {
		   String s = new StringBuffer(S).insert(i,S).toString();
		   if(s.equals(T))
			   return "Yes";
	   }
	   return "No";
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			FoxAndHandleEasyHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				FoxAndHandleEasyHarness.run_test(Integer.valueOf(args[i]));
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
class FoxAndHandleEasyHarness {
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
	
	static boolean compareOutput(String expected, String result) { return expected.equals(result); }
	static String formatResult(String res) {
		return String.format("\"%s\"", res);
	}
	
	static int verifyCase(int casenum, String expected, String received) { 
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
			String S                  = "Ciel";
			String T                  = "CieCiell";
			String expected__         = "Yes";

			return verifyCase(casenum__, expected__, new FoxAndHandleEasy().isPossible(S, T));
		}
		case 1: {
			String S                  = "Ciel";
			String T                  = "FoxCiel";
			String expected__         = "No";

			return verifyCase(casenum__, expected__, new FoxAndHandleEasy().isPossible(S, T));
		}
		case 2: {
			String S                  = "FoxCiel";
			String T                  = "FoxFoxCielCiel";
			String expected__         = "Yes";

			return verifyCase(casenum__, expected__, new FoxAndHandleEasy().isPossible(S, T));
		}
		case 3: {
			String S                  = "FoxCiel";
			String T                  = "FoxCielCielFox";
			String expected__         = "No";

			return verifyCase(casenum__, expected__, new FoxAndHandleEasy().isPossible(S, T));
		}
		case 4: {
			String S                  = "Ha";
			String T                  = "HaHaHaHa";
			String expected__         = "No";

			return verifyCase(casenum__, expected__, new FoxAndHandleEasy().isPossible(S, T));
		}
		case 5: {
			String S                  = "TheHandleCanBeVeryLong";
			String T                  = "TheHandleCanBeVeryLong";
			String expected__         = "No";

			return verifyCase(casenum__, expected__, new FoxAndHandleEasy().isPossible(S, T));
		}
		case 6: {
			String S                  = "Long";
			String T                  = "LongLong";
			String expected__         = "Yes";

			return verifyCase(casenum__, expected__, new FoxAndHandleEasy().isPossible(S, T));
		}

		// custom cases

/*      case 7: {
			String S                  = ;
			String T                  = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new FoxAndHandleEasy().isPossible(S, T));
		}*/
/*      case 8: {
			String S                  = ;
			String T                  = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new FoxAndHandleEasy().isPossible(S, T));
		}*/
/*      case 9: {
			String S                  = ;
			String T                  = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new FoxAndHandleEasy().isPossible(S, T));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
