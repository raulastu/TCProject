import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class TypingDistance {
   public int minDistance(String keyboard, String word) {
	   	char [] k = keyboard.toCharArray();
	   	char [] w = word.toCharArray();
	   	int [][] m = new int[26][26];
	   	for (int i = 0; i < k.length; i++) {
	   		for (int j = 0; j < k.length; j++) {
	   			m[k[i]-'a'][k[j]-'a']=abs(j-i);
	   			m[k[j]-'a'][k[i]-'a']=abs(j-i);
			}
		}
//	   	System.err.println(m['p'-'a']['o'-'a']);
//	   	print(m);
	   	if(w.length==1)
	   		return 0;
	   	int r=0;
	   	for (int i = 1; i < w.length; i++) {
	   		r+=m[w[i]-'a'][w[i-1]-'a'];
		}
	   	return r;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			TypingDistanceHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				TypingDistanceHarness.run_test(Integer.valueOf(args[i]));
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
class TypingDistanceHarness {
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
			String keyboard           = "qwertyuiop";
			String word               = "potter";
			int expected__            = 8;

			return verifyCase(casenum__, expected__, new TypingDistance().minDistance(keyboard, word));
		}
		case 1: {
			String keyboard           = "tc";
			String word               = "tctcttccctccccttc";
			int expected__            = 9;

			return verifyCase(casenum__, expected__, new TypingDistance().minDistance(keyboard, word));
		}
		case 2: {
			String keyboard           = "a";
			String word               = "aaaaaaaaaaa";
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new TypingDistance().minDistance(keyboard, word));
		}
		case 3: {
			String keyboard           = "kwadrutove";
			String word               = "rowerowe";
			int expected__            = 39;

			return verifyCase(casenum__, expected__, new TypingDistance().minDistance(keyboard, word));
		}
		case 4: {
			String keyboard           = "qwertyuiopasdfghjklzxcvbnm";
			String word               = "topcodersingleroundmatchgoodluckhavefun";
			int expected__            = 322;

			return verifyCase(casenum__, expected__, new TypingDistance().minDistance(keyboard, word));
		}

		// custom cases

/*      case 5: {
			String keyboard           = ;
			String word               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new TypingDistance().minDistance(keyboard, word));
		}*/
/*      case 6: {
			String keyboard           = ;
			String word               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new TypingDistance().minDistance(keyboard, word));
		}*/
/*      case 7: {
			String keyboard           = ;
			String word               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new TypingDistance().minDistance(keyboard, word));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
