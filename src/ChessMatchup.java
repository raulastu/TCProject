import java.math.BigInteger;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class ChessMatchup {
	public int maximumScore(int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		int mayot = 0;
		for (int j2 = 0; j2 < array2.length; j2++) {

			int suma = 0;
			for (int j = 0; j < array2.length; j++) {
				if (array1[j] > array2[j]) {
					suma += 2;
				} else if (array1[j] < array2[j]) {
					suma += 0;

				} else if (array1[j] == array2[j]) {
					suma += 1;
				}

			}
			mayot = Math.max(mayot, suma);

			if (array1.length > 1)
				for (int j3 = 0; j3 < array2.length - 1; j3++) {

					int temp = array1[j3];
					array1[j3] = array1[j3 + 1];
					array1[j3 + 1] = temp;

				}

		}
		return mayot;

	}

	// BEGIN CUT HERE
	public static void main(String[] args) {
		if (args.length == 0) {
			ChessMatchupHarness.run_test(-1);
		} else {
			for (int i = 0; i < args.length; ++i)
				ChessMatchupHarness.run_test(Integer.valueOf(args[i]));
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
class ChessMatchupHarness {
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
			int[] us = { 5, 8 };
			int[] them = { 7, 3 };
			int expected__ = 4;

			return verifyCase(casenum__, expected__,
					new ChessMatchup().maximumScore(us, them));
		}
		case 1: {
			int[] us = { 7, 3 };
			int[] them = { 5, 8 };
			int expected__ = 2;

			return verifyCase(casenum__, expected__,
					new ChessMatchup().maximumScore(us, them));
		}
		case 2: {
			int[] us = { 10, 5, 1 };
			int[] them = { 10, 5, 1 };
			int expected__ = 4;

			return verifyCase(casenum__, expected__,
					new ChessMatchup().maximumScore(us, them));
		}
		case 3: {
			int[] us = { 1, 10, 7, 4 };
			int[] them = { 15, 3, 8, 7 };
			int expected__ = 5;

			return verifyCase(casenum__, expected__,
					new ChessMatchup().maximumScore(us, them));
		}

		// custom cases

		/*
		 * case 4: { int[] us = ; int[] them = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * ChessMatchup().maximumScore(us, them)); }
		 */
		/*
		 * case 5: { int[] us = ; int[] them = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * ChessMatchup().maximumScore(us, them)); }
		 */
		/*
		 * case 6: { int[] us = ; int[] them = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * ChessMatchup().maximumScore(us, them)); }
		 */
		default:
			return -1;
		}
	}
}

// END CUT HERE
