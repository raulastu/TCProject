import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class ZigZag {
	public int longestZigZag(int[] sequence) {
		if (sequence.length == 1)
			return 1;
		int N = sequence.length;
		int S[] = new int[N];
		int S2[] = new int[N];
		fill(S, 1);
		fill(S2, 1);

		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (sequence[j] < sequence[i]) {
					S[i] = max(S[i], S2[j] + 1);
				}else if (sequence[j] > sequence[i]) {
					S2[i] = max(S2[i], S[j] + 1);
				}
			}
			print(sequence, S, S2);
		}
		return max(S[N - 1], S2[N - 1]);
	}

	// BEGIN CUT HERE

	private static void print(Object... rs) {
		System.err.println(Arrays.deepToString(rs).replace("]", "]\n"));
	}

	static String tl = "";

	private static void printTree() {
		try {
			String[] drawing = new Util.treeDrawing.TreeDrawing()
					.draw(new String[] { tl });
			System.err.println(Arrays.deepToString(drawing)
					.replaceAll("\\[|\\]", "").replaceAll(", ", "\n")
					+ "\n");
		} catch (Exception ex) {
			System.err.println("invalid tree>" + tl);
		}
		tl = "";
	}

	private static void tn(Object... o) {
		tl += "(" + Arrays.deepToString(o).replaceAll(" |\\[|\\]", "") + ")";
	}

	private static void tb() {
		tl += "[]";
	}

	private static void tns() {
		tl += "[";
	}

	private static void tne() {
		tl += "]";
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			ZigZagHarness.run_test(-1);
		} else {
			for (int i = 0; i < args.length; ++i)
				ZigZagHarness.run_test(Integer.valueOf(args[i]));
		}
	}

	// END CUT HERE
}

// BEGIN CUT HERE
class ZigZagHarness {
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
			int[] sequence = { 1, 7, 4, 9, 2, 5 };
			int expected__ = 6;

			return verifyCase(casenum__, expected__,
					new ZigZag().longestZigZag(sequence));
		}
		case 1: {
			int[] sequence = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
			int expected__ = 7;

			return verifyCase(casenum__, expected__,
					new ZigZag().longestZigZag(sequence));
		}
		case 2: {
			int[] sequence = { 44 };
			int expected__ = 1;

			return verifyCase(casenum__, expected__,
					new ZigZag().longestZigZag(sequence));
		}
		case 3: {
			int[] sequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int expected__ = 2;

			return verifyCase(casenum__, expected__,
					new ZigZag().longestZigZag(sequence));
		}
		case 4: {
			int[] sequence = { 70, 55, 13, 2, 99, 2, 80, 80, 80, 80, 100, 19,
					7, 5, 5, 5, 1000, 32, 32 };
			int expected__ = 8;

			return verifyCase(casenum__, expected__,
					new ZigZag().longestZigZag(sequence));
		}
		case 5: {
			int[] sequence = { 374, 40, 854, 203, 203, 156, 362, 279, 812, 955,
					600, 947, 978, 46, 100, 953, 670, 862, 568, 188, 67, 669,
					810, 704, 52, 861, 49, 640, 370, 908, 477, 245, 413, 109,
					659, 401, 483, 308, 609, 120, 249, 22, 176, 279, 23, 22,
					617, 462, 459, 244 };
			int expected__ = 36;

			return verifyCase(casenum__, expected__,
					new ZigZag().longestZigZag(sequence));
		}
		case 6: {
			int[] sequence = { 3, 3, 3, 3 };
			int expected__ = 1;

			return verifyCase(casenum__, expected__,
					new ZigZag().longestZigZag(sequence));
		}

		// custom cases

		/*
		 * case 6: { int[] sequence = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * ZigZag().longestZigZag(sequence)); }
		 */
		/*
		 * case 7: { int[] sequence = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * ZigZag().longestZigZag(sequence)); }
		 */
		/*
		 * case 8: { int[] sequence = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * ZigZag().longestZigZag(sequence)); }
		 */
		default:
			return -1;
		}
	}
}

// END CUT HERE
