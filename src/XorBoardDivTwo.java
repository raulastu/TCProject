import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class XorBoardDivTwo {
	public int theMax(String[] board) {
		int res;
		int maxro = 0;
		int total1=0;
		int itoflip=0;
		char[][] mat= new char[board.length][board[0].length()];
		for (int i = 0; i < mat.length; i++) {
			mat[i]=board[i].toCharArray();
		}
		for (int i = 0; i < board.length; i++) {
			String x = new String(mat[i]);
			String temp= x;
			x=x.replaceAll("1", "X");
			x=x.replaceAll("0", "1");
			x=x.replaceAll("X", "0");
			board[i]=x;
			mat[i]=x.toCharArray();			
			for (int j = 0; j < board[0].length(); j++) {
				for (int j2 = 0; j2 < mat.length; j2++) {
					if(mat[j2][j]=='1')
						mat[j2][j]='0';
					else
						mat[j2][j]='1';
				}
				maxro=max(maxro,count(mat));
				for (int j2 = 0; j2 < board.length; j2++) {
					if(mat[j2][j]=='0')
						mat[j2][j]='1';
					else
						mat[j2][j]='0';
				}
			}
			mat[i]=temp.toCharArray();
		}
		return maxro;
	}
	public int count(char [][] arg){
		int c=0;
		for (int i = 0; i < arg.length; i++) {
			for (int j = 0; j < arg[0].length; j++) {
				if(arg[i][j]=='1')c++;
			}
		}
		return c;
	}
	// BEGIN CUT HERE
	public static void main(String[] args) {
		try {
			eq(0,
					(new XorBoardDivTwo()).theMax(new String[] { "101", "010",
							"101" }), 9);
			eq(1,
					(new XorBoardDivTwo()).theMax(new String[] { "111", "111",
							"111" }), 5);
			eq(2,
					(new XorBoardDivTwo()).theMax(new String[] { "0101001",
							"1101011" }), 9);
			eq(3,
					(new XorBoardDivTwo()).theMax(new String[] { "000", "001",
							"010", "011", "100", "101", "110", "111" }), 15);
			eq(4,
					(new XorBoardDivTwo()).theMax(new String[] {
							"000000000000000000000000",
							"011111100111111001111110",
							"010000000100000001000000",
							"010000000100000001000000",
							"010000000100000001000000",
							"011111100111111001111110",
							"000000100000001000000010",
							"000000100000001000000010",
							"000000100000001000000010",
							"011111100111111001111110",
							"000000000000000000000000" }), 105);
		} catch (Exception exx) {
			System.err.println(exx);
			exx.printStackTrace(System.err);
		}
	}

	private static void eq(int n, int a, int b) {
		if (a == b) {
			System.err.println("Case " + n + " passed.");
		} else {
			System.err.println("Case " + n + " failed: " + received + " " + a
					+ " " + expected + " " + b + ".");
		}
	}

	private static void eq(int n, double a, double b) {
		if (a == b) {
			System.err.println("Case " + n + " passed.");
		} else {
			System.err.println("Case " + n + " failed: " + received + " '" + a
					+ "' " + expected + " '" + b + "'.");
		}
	}

	private static void eq(int n, char a, char b) {
		if (a == b) {
			System.err.println("Case " + n + " passed.");
		} else {
			System.err.println("Case " + n + " failed: " + received + " '" + a
					+ "' " + expected + " '" + b + "'.");
		}
	}

	private static void eq(int n, long a, long b) {
		if (a == b) {
			System.err.println("Case " + n + " passed.");
		} else {
			System.err.println("Case " + n + " failed: " + received + " '" + a
					+ "L' " + expected + " '" + b + "L'.");
		}
	}

	private static void eq(int n, boolean a, boolean b) {
		if (a == b) {
			System.err.println("Case " + n + " passed.");
		} else {
			System.err.println("Case " + n + " failed: " + received + " '" + a
					+ "' " + expected + " '" + b + "'.");
		}
	}

	private static void eq(int n, String a, String b) {
		if (a != null && a.equals(b)) {
			System.err.println("Case " + n + " passed.");
		} else {
			System.err.println("Case " + n + " failed: " + received + " \"" + a
					+ "\" " + expected + " \"" + b + "\".");
		}
	}

	private static void eq(int n, int[] a, int[] b) {
		if (a.length != b.length) {
			System.err.println("Case " + n + " failed: different lengths");
			print(received + "<" + a.length + "> ", a);
			print(expected + "<" + b.length + "> ", b);
			return;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				System.err
						.println("Case " + n + " failed. " + received + " and "
								+ expected + " array differ in position " + i);
				print(received + " ", a);
				print(expected + " ", b);
				return;
			}
		}
		System.err.println("Case " + n + " passed.");
	}

	private static void eq(int n, long[] a, long[] b) {
		if (a.length != b.length) {
			System.err.println("Case " + n + " failed: different lengths");
			print(received + "<" + a.length + "> ", a);
			print(expected + "<" + b.length + "> ", b);
			return;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				System.err
						.println("Case " + n + " failed. " + received + " and "
								+ expected + " array differ in position " + i);
				print(received, a);
				print(expected, b);
				return;
			}
		}
		System.err.println("Case " + n + " passed.");
	}

	private static void eq(int n, double[] a, double[] b) {
		if (a.length != b.length) {
			System.err.println("Case " + n + " failed: different lengths");
			print(received + "<" + a.length + "> ", a);
			print(expected + "<" + b.length + "> ", b);
			return;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				System.err
						.println("Case " + n + " failed. " + received + " and "
								+ expected + " array differ in position " + i);
				print(received, a);
				print(expected, b);
				return;
			}
		}
		System.err.println("Case " + n + " passed.");
	}

	private static void eq(int n, String[] a, String[] b) {
		if (a.length != b.length) {
			System.err.println("Case " + n + " failed: different lengths");
			print(received + "<" + a.length + "> ", (Object[]) a);
			print(expected + "<" + b.length + "> ", (Object[]) b);
			return;
		}
		for (int i = 0; i < a.length; i++) {
			if (!a[i].equals(b[i])) {
				System.err
						.println("Case " + n + " failed. " + received + " and "
								+ expected + " array differ in position " + i);
				print(received, (Object[]) a);
				print(expected, (Object[]) b);
				return;
			}
		}
		System.err.println("Case " + n + " passed.");
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

	static String expected = "  expe";
	static String received = "  rChi";
	// END CUT HERE
}
