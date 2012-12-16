import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class CucumberMarket {
   public String check(int[] price, int budget, int k) {
	   sort(price);
	   int xs=0;
	   for (int i = price.length-1; i >= 0; i--) {
		   if(k-->0)
			   xs+=price[i];
	   }
	   if(xs>budget)
		   return "NO";
	   return "YES";
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			CucumberMarketHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				CucumberMarketHarness.run_test(Integer.valueOf(args[i]));
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
class CucumberMarketHarness {
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
			int[] price               = {1000,1,10,100};
			int budget                = 1110;
			int k                     = 3;
			String expected__         = "YES";

			return verifyCase(casenum__, expected__, new CucumberMarket().check(price, budget, k));
		}
		case 1: {
			int[] price               = {1000,1,10,100};
			int budget                = 1109;
			int k                     = 3;
			String expected__         = "NO";

			return verifyCase(casenum__, expected__, new CucumberMarket().check(price, budget, k));
		}
		case 2: {
			int[] price               = {33,4};
			int budget                = 33;
			int k                     = 1;
			String expected__         = "YES";

			return verifyCase(casenum__, expected__, new CucumberMarket().check(price, budget, k));
		}
		case 3: {
			int[] price               = {1,1,1,1,1,1};
			int budget                = 2;
			int k                     = 4;
			String expected__         = "NO";

			return verifyCase(casenum__, expected__, new CucumberMarket().check(price, budget, k));
		}
		case 4: {
			int[] price               = {1000,1000,1000,1000,1000,1000,1000,1000,1000};
			int budget                = 10000;
			int k                     = 9;
			String expected__         = "YES";

			return verifyCase(casenum__, expected__, new CucumberMarket().check(price, budget, k));
		}

		// custom cases

/*      case 5: {
			int[] price               = ;
			int budget                = ;
			int k                     = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new CucumberMarket().check(price, budget, k));
		}*/
/*      case 6: {
			int[] price               = ;
			int budget                = ;
			int k                     = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new CucumberMarket().check(price, budget, k));
		}*/
/*      case 7: {
			int[] price               = ;
			int budget                = ;
			int k                     = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new CucumberMarket().check(price, budget, k));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
