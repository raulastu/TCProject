import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class BoxUnion {
	public int area(String[] rectangles) {
		Shape sh = 
		int[][] rec = new int[20001][20001];
		int res=0;
		for (int i = 0; i < rectangles.length; i++) {
			String[] ar = rectangles[i].split(" ");
			int x1 = parseInt(ar[0]);
			int y1 = parseInt(ar[1]);
			int x2 = parseInt(ar[2]);
			int y2 = parseInt(ar[3]);
			for (int j = x1; j <= x2; j++) {
				for (int j2 = y1; j2 <= y2; j2++) {
					if(rec[j][j2]==0){
						rec[j][j2]=1;
						res++;
					}
					
				}
			}
		}
		return res;
	}

	// BEGIN CUT HERE
	public static void main(String[] args) {
		if (args.length == 0) {
			BoxUnionHarness.run_test(-1);
		} else {
			for (int i = 0; i < args.length; ++i)
				BoxUnionHarness.run_test(Integer.valueOf(args[i]));
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
				line += a[i][j] + " ";
			}
			System.err.println("[" + line.trim() + "]");
		}
		System.err.println("");
	}

	// END CUT HERE
}

// BEGIN CUT HERE
class BoxUnionHarness {
	public static void run_test(int casenum) {
		if (casenum != -1) {
			if (runTestCase(casenum) == -1)
				System.err.println("Illegal input! Test case " + casenum
						+ " does not exist.");
			return;
		}

		int correct = 0, total = 0;
		for (int i = 0;; ++i) {
			int x = runTestCase(i);
			if (x == -1) {
				if (i >= 100)
					break;
				continue;
			}
			correct += x;
			++total;
		}

		if (total == 0) {
			System.err.println("No test cases run.");
		} else if (correct < total) {
			System.err.println("Some cases FAILED (passed " + correct + " of "
					+ total + ").");
		} else {
			System.err.println("All " + total + " tests passed!");
		}
	}

	static boolean compareOutput(int expected, int result) {
		return expected == result;
	}

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
		switch (casenum__) {
		case 0: {
			String[] rectangles = { "200 300 203 304" };
			int expected__ = 12;

			return verifyCase(casenum__, expected__,
					new BoxUnion().area(rectangles));
		}
		case 1: {
			String[] rectangles = { "0 0 10 10", "20 20 30 30" };
			int expected__ = 200;

			return verifyCase(casenum__, expected__,
					new BoxUnion().area(rectangles));
		}
		case 2: {
			String[] rectangles = { "0 500 20000 501", "500 0 501 20000" };
			int expected__ = 39999;

			return verifyCase(casenum__, expected__,
					new BoxUnion().area(rectangles));
		}
		case 3: {
			String[] rectangles = { "4 6 18 24", "7 2 12 19", "0 0 100 100" };
			int expected__ = 10000;

			return verifyCase(casenum__, expected__,
					new BoxUnion().area(rectangles));
		}
		case 4: {
			String[] rectangles = { "1 3 5 6", "3 1 7 5", "4 4 9 7" };
			int expected__ = 35;

			return verifyCase(casenum__, expected__,
					new BoxUnion().area(rectangles));
		}
		case 5: {
			String[] rectangles = { "0 0 20000 20000", "0 0 20000 20000",
					"0 0 20000 20000" };
			int expected__ = 400000000;

			return verifyCase(casenum__, expected__,
					new BoxUnion().area(rectangles));
		}

		// custom cases

		/*
		 * case 6: { String[] rectangles = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * BoxUnion().area(rectangles)); }
		 */
		/*
		 * case 7: { String[] rectangles = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * BoxUnion().area(rectangles)); }
		 */
		/*
		 * case 8: { String[] rectangles = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * BoxUnion().area(rectangles)); }
		 */
		default:
			return -1;
		}
	}
}

// END CUT HERE
