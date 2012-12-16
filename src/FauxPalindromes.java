import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class FauxPalindromes {
   public String classifyIt(String word) {
	   if(isP(word))
		   return "PALINDROME";
	   System.err.println(isP(word));
	   char c = word.charAt(0);
	   String s = c+"";
	   for (int i = 1; i < word.length(); i++) {
		   char c2 = word.charAt(i);
		   if(c!=c2){
			   c=c2;
			   s+=c2;
		   }
	   }
	   if(isP(s))
		   return "FAUX";
	   return "NOT EVEN FAUX";
				  
   }
   boolean isP(String s){
//	   System.err.println(new StringBuilder(s).reverse());
	   return new StringBuilder(s).reverse().toString().equals(s);
   }

// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			FauxPalindromesHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				FauxPalindromesHarness.run_test(Integer.valueOf(args[i]));
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
class FauxPalindromesHarness {
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
			String word               = "ANA";
			String expected__         = "PALINDROME";

			return verifyCase(casenum__, expected__, new FauxPalindromes().classifyIt(word));
		}
		case 1: {
			String word               = "AAAAANNAA";
			String expected__         = "FAUX";

			return verifyCase(casenum__, expected__, new FauxPalindromes().classifyIt(word));
		}
		case 2: {
			String word               = "LEGENDARY";
			String expected__         = "NOT EVEN FAUX";

			return verifyCase(casenum__, expected__, new FauxPalindromes().classifyIt(word));
		}
		case 3: {
			String word               = "XXXYTYYTTYX";
			String expected__         = "FAUX";

			return verifyCase(casenum__, expected__, new FauxPalindromes().classifyIt(word));
		}
		case 4: {
			String word               = "TOPCOODEREDOOCPOT";
			String expected__         = "PALINDROME";

			return verifyCase(casenum__, expected__, new FauxPalindromes().classifyIt(word));
		}
		case 5: {
			String word               = "TOPCODEREDOOCPOT";
			String expected__         = "FAUX";

			return verifyCase(casenum__, expected__, new FauxPalindromes().classifyIt(word));
		}
		case 6: {
			String word               = "XXXXYYYYYZZXXYYY";
			String expected__         = "NOT EVEN FAUX";

			return verifyCase(casenum__, expected__, new FauxPalindromes().classifyIt(word));
		}

		// custom cases

/*      case 7: {
			String word               = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new FauxPalindromes().classifyIt(word));
		}*/
/*      case 8: {
			String word               = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new FauxPalindromes().classifyIt(word));
		}*/
/*      case 9: {
			String word               = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new FauxPalindromes().classifyIt(word));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
