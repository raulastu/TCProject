import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class PastingPaintingDivTwo {
	public long countColors(String[] clipboard, int T) {
		
		char [][] ch= new char[clipboard.length][clipboard[0].length()];
		long r=0;
		for (int i = 0; i < clipboard.length; i++) {
			ch[i]=clipboard[i].toCharArray();
			r+=clipboard[i].replace(".", "").length();
		}
		
	
		int diag[][] = new int[ch.length][ch[0].length];
		boolean di[][] = new boolean[ch.length][ch[0].length];
		
		for (int i = 0; i < diag[0].length; i++) {
//			diag[0][i]=0;
			int xi=0;
			int j=i;
//			print(xi,j);
			long c=0;
			while(j < ch[0].length && xi<ch.length){
				if(ch[xi][j]=='B'){
					di[0][i]=true;
					diag[0][i]=T-1;
					r+=c;
					c=0;
				}else{
					if(diag[0][i]>0){
						c++;
						diag[0][i]--;
//						r++;
					}	
				}
				xi++;
				j++;
			}
		}
		for (int i = 1; i < diag.length; i++) {
//			diag[i][0]=0;
			int xi=i;
			int j=0;
			int c=0;
			while(xi<ch.length && j<ch[0].length){
				if(ch[xi][j]=='B'){
					di[i][0]=true;
					diag[i][0]=T-1;
					r+=c;
					c=0;
				}else{
					if(diag[i][0]>0){
						c++;
						diag[i][0]--;
//						r++;
					}
						
				}
				xi++;
				j++;
			}
		}
//		printm(diag);
//		print(r);
		for (int i = 0; i < diag.length; i++) {
			for (int j = 0; j < diag[i].length; j++) {
				if(di[i][j]){
					r+=(T-1);
				}
			}
		}
		return r;

	}

	// BEGIN CUT HERE
	public static void main(String[] args) {
		if (args.length == 0) {
			PastingPaintingDivTwoHarness.run_test(-1);
		} else {
			for (int i = 0; i < args.length; ++i)
				PastingPaintingDivTwoHarness.run_test(Integer.valueOf(args[i]));
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
class PastingPaintingDivTwoHarness {
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
			String[] clipboard = { "..B", "B..", "BB." };
			int T = 3;
			long expected__ = 10;

			return verifyCase(casenum__, expected__,
					new PastingPaintingDivTwo().countColors(clipboard, T));
		}
		case 1: {
			String[] clipboard = { "B...", "....", "....", "...B" };
			int T = 2;
			long expected__ = 4;

			return verifyCase(casenum__, expected__,
					new PastingPaintingDivTwo().countColors(clipboard, T));
		}
		case 2: {
			String[] clipboard = { "BBB" };
			int T = 10000;
			long expected__ = 30000;

			return verifyCase(casenum__, expected__,
					new PastingPaintingDivTwo().countColors(clipboard, T));
		}
		case 3: {
			String[] clipboard = { "." };
			int T = 1000000000;
			long expected__ = 0;

			return verifyCase(casenum__, expected__,
					new PastingPaintingDivTwo().countColors(clipboard, T));
		}
		case 4: {
			String[] clipboard = { "BB.", ".B." };
			int T = 100;
			long expected__ = 201;

			return verifyCase(casenum__, expected__,
					new PastingPaintingDivTwo().countColors(clipboard, T));
		}
		case 5: {
			String[] clipboard = { "..........B..........",
					".........B.B.........", "........B...B........",
					".......B.....B.......", "......B..B.B..B......",
					".....B...B.B...B.....", "....B...........B....",
					"...B...B.....B...B...", "..B.....BBBBBB....B..",
					".B..........BB.....B.", "BBBBBBBBBBBBBBBBBBBBB" };
			int T = 1000000000;
			long expected__ = 21000000071L;

			return verifyCase(casenum__, expected__,
					new PastingPaintingDivTwo().countColors(clipboard, T));
		}

		// custom cases

		/*
		 * case 6: { String[] clipboard = ; int T = ; long expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * PastingPaintingDivTwo().countColors(clipboard, T)); }
		 */
		/*
		 * case 7: { String[] clipboard = ; int T = ; long expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * PastingPaintingDivTwo().countColors(clipboard, T)); }
		 */
		/*
		 * case 8: { String[] clipboard = ; int T = ; long expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * PastingPaintingDivTwo().countColors(clipboard, T)); }
		 */
		default:
			return -1;
		}
	}
}

// END CUT HERE
