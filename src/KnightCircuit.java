import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class KnightCircuit {
	class node {
		int x, y, c;

		node(int x, int y, int c) {
			this.x = x;
			this.y = y;
			this.c = c;
		}
	}

	public long maxSize(int w, int h, int a, int b) {
		int di[] = { a, a, -a, -a, -b, -b, b, b };
		int dj[] = { b, -b, b, -b, a, -a, a, -a };
		LinkedList<node> q = new LinkedList<KnightCircuit.node>();
		q.add(new node(0, 0, 0));
		boolean memo[][] = new boolean[h][w];
		long c=0;
		while (!q.isEmpty()) {
			node p = q.poll();
			for (int i = 0; i < 8; i++) {
				int X = p.x + di[i];
				int Y = p.y + dj[i];
				if (X >= 0 && X < h && Y >= 0 && Y < w && !memo[X][Y]) {
					memo[X][Y] = true;
					q.add(new node(X, Y, p.c + 1));
					c++;
				}
			}
		}
		return c;
	}

	// BEGIN CUT HERE
	public static void main(String[] args) {
		if (args.length == 0) {
			KnightCircuitHarness.run_test(-1);
		} else {
			for (int i = 0; i < args.length; ++i)
				KnightCircuitHarness.run_test(Integer.valueOf(args[i]));
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
class KnightCircuitHarness {
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

	static boolean compareOutput(long expected, long result) {
		return expected == result;
	}

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
		switch (casenum__) {
		case 0: {
			int w = 1;
			int h = 1;
			int a = 2;
			int b = 1;
			long expected__ = 1;

			return verifyCase(casenum__, expected__,
					new KnightCircuit().maxSize(w, h, a, b));
		}
		case 1: {
			int w = 3;
			int h = 20;
			int a = 1;
			int b = 3;
			long expected__ = 11;

			return verifyCase(casenum__, expected__,
					new KnightCircuit().maxSize(w, h, a, b));
		}
		case 2: {
			int w = 100000;
			int h = 100000;
			int a = 1;
			int b = 2;
			long expected__ = 10000000000L;

			return verifyCase(casenum__, expected__,
					new KnightCircuit().maxSize(w, h, a, b));
		}
		case 3: {
			int w = 3;
			int h = 3;
			int a = 1;
			int b = 2;
			long expected__ = 8;

			return verifyCase(casenum__, expected__,
					new KnightCircuit().maxSize(w, h, a, b));
		}
		case 4: {
			int w = 30;
			int h = 30;
			int a = 8;
			int b = 4;
			long expected__ = 64;

			return verifyCase(casenum__, expected__,
					new KnightCircuit().maxSize(w, h, a, b));
		}
		case 5: {
			int w = 32;
			int h = 34;
			int a = 6;
			int b = 2;
			long expected__ = 136;

			return verifyCase(casenum__, expected__,
					new KnightCircuit().maxSize(w, h, a, b));
		}

		// custom cases

		/*
		 * case 6: { int w = ; int h = ; int a = ; int b = ; long expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * KnightCircuit().maxSize(w, h, a, b)); }
		 */
		/*
		 * case 7: { int w = ; int h = ; int a = ; int b = ; long expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * KnightCircuit().maxSize(w, h, a, b)); }
		 */
		/*
		 * case 8: { int w = ; int h = ; int a = ; int b = ; long expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * KnightCircuit().maxSize(w, h, a, b)); }
		 */
		default:
			return -1;
		}
	}
}

// END CUT HERE
