import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class BlockTower1 {
	public int getTallest(int[] blockHeights) {
		int r = 0;
		int lastodd = -1;
		int lasteven = -1;
		block= blockHeights;
		memo =new int[block.length][51];
		for (int i = 0; i < blockHeights.length; i++) {
			fill(memo[i],-1);
		}
		r = go(0,50);
		return r;
	}
	int block[];
	int memo[][];
	int go(int i, int lastone){
		if(i==block.length){
			return 0;
		}
		if(memo[i][lastone]!=-1){
			return memo[i][lastone];
		}
		int a = Integer.MIN_VALUE;
		if(lastone==50 || block[i]%2!=0 || ((block[i]%2==0 && block[lastone]%2==0))){
			a = block[i]+go(i+1,i);
		}
		int b = go(i+1,lastone);
		memo[i][lastone]=max(a,b);
		return memo[i][lastone];
	}

	// BEGIN CUT HERE
	public static void main(String[] args) {
		if (args.length == 0) {
			BlockTowerHarness.run_test(-1);
		} else {
			for (int i = 0; i < args.length; ++i)
				BlockTowerHarness.run_test(Integer.valueOf(args[i]));
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
class BlockTowerHarness {
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
			int[] blockHeights = { 4, 7 };
			int expected__ = 11;

			return verifyCase(casenum__, expected__,
					new BlockTower1().getTallest(blockHeights));
		}
		case 1: {
			int[] blockHeights = { 7, 4 };
			int expected__ = 7;

			return verifyCase(casenum__, expected__,
					new BlockTower1().getTallest(blockHeights));
		}
		case 2: {
			int[] blockHeights = { 7 };
			int expected__ = 7;

			return verifyCase(casenum__, expected__,
					new BlockTower1().getTallest(blockHeights));
		}
		case 3: {
			int[] blockHeights = { 4 };
			int expected__ = 4;

			return verifyCase(casenum__, expected__,
					new BlockTower1().getTallest(blockHeights));
		}
		case 4: {
			int[] blockHeights = { 48, 1, 50, 1, 50, 1, 48 };
			int expected__ = 196;

			return verifyCase(casenum__, expected__,
					new BlockTower1().getTallest(blockHeights));
		}
		case 5: {
			int[] blockHeights = { 49, 2, 49, 2, 49 };
			int expected__ = 147;

			return verifyCase(casenum__, expected__,
					new BlockTower1().getTallest(blockHeights));
		}
		case 6: {
			int[] blockHeights = { 44, 3, 44, 3, 44, 47, 2, 47, 2, 47, 2 };
			int expected__ = 273;

			return verifyCase(casenum__, expected__,
					new BlockTower1().getTallest(blockHeights));
		}
		case 7: {
			int[] blockHeights = { 101,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,100 };
			int expected__ = 128;

			return verifyCase(casenum__, expected__,
					new BlockTower1().getTallest(blockHeights));
		}

		// custom cases

		/*
		 * case 7: { int[] blockHeights = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * BlockTower().getTallest(blockHeights)); }
		 */
		/*
		 * case 8: { int[] blockHeights = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * BlockTower().getTallest(blockHeights)); }
		 */
		/*
		 * case 9: { int[] blockHeights = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * BlockTower().getTallest(blockHeights)); }
		 */
		default:
			return -1;
		}
	}
}

// END CUT HERE
