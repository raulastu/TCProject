import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class PoolFiller {
	public int getCapacity(String[] layout) {
		int res;
		grid = new int[layout.length][layout[0].length()];
		for (int i = 0; i < layout.length; i++) {
			for (int j = 0; j < layout[0].length(); j++) {
				grid[i][j] = parseInt(layout[i].charAt(j) + "");
			}
		}
		res = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				memo = new int[grid.length][grid[0].length];
				for (int j2 = 1; j2 < memo.length-1; j2++) {
					Arrays.fill(memo[j2],1,memo[j2].length-1, -1);
				}
//				printm(memo);
//				memo[i][j]=0;
				int cost = go(i, j);
				if (cost > 0) {
					System.err.println(i + " " + j + " " + cost);
				}
				res += cost;
			}
		}
		return res;
	}

	int di[] = { 0, 0, -1, 1 };
	int dj[] = { -1, 1, 0, 0 };
	int[][] grid;
	int[][] memo;

	int go(int x, int y) {
		
		if(memo[x][y]!=-1)
			return memo[x][y];

		int mincost = Integer.MAX_VALUE;
		for (int i = 0; i < di.length; i++) {
			int X = x + di[i];
			int Y = y + dj[i];
			if (X >= 0 && X < grid.length && Y >= 0 && Y < grid[X].length) {
				int newcost = 0;
				if (grid[X][Y] > grid[x][y]) {
					newcost = grid[X][Y] - grid[x][y];
				}
				mincost = min(newcost + go(X, Y), mincost);
			}
		}
		memo[x][y]=mincost;
		return mincost;
	}

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new PoolFiller()).getCapacity(new String[] {
               "16661",
               "61116",
               "16661"
               }),15);
            eq(1,(new PoolFiller()).getCapacity(new String[] {
               "999999",
               "955119",
               "955119",
               "999999"
               }),48);
            eq(2,(new PoolFiller()).getCapacity(new String[] {
               "111111111",
               "115111611",
               "131516161",
               "115111611",
               "111111111"
               }),7);
            eq(3,(new PoolFiller()).getCapacity(new String[] {
               "1111111111111",
               "1555555555551",
               "1511111111151",
               "1511199911151",
               "1511192911151",
               "1511199911151",
               "1511111111151",
               "1555555555551",
               "1111111111111"
               }
               
               ),151);
        } catch( Exception exx) {
            System.err.println(exx);
            exx.printStackTrace(System.err);
        }
    }
   private static void eq(int n, int a, int b) {
        if (a == b) {
            System.err.println("Case " + n + " passed.");
        } else {
            System.err.println("Case " + n + " failed: " + received + " " + a + " " + expected + " " + b + ".");
        }
    }

    private static void eq(int n, double a, double b) {
        if (a == b) {
            System.err.println("Case " + n + " passed.");
        } else {
            System.err.println("Case " + n + " failed: " + received + " '" + a + "' " + expected + " '" + b + "'.");
        }
    }

    private static void eq(int n, char a, char b) {
        if (a == b) {
            System.err.println("Case " + n + " passed.");
        } else {
            System.err.println("Case " + n + " failed: " + received + " '" + a + "' " + expected + " '" + b + "'.");
        }
    }

    private static void eq(int n, long a, long b) {
        if (a == b) {
            System.err.println("Case " + n + " passed.");
        } else {
            System.err.println("Case " + n + " failed: " + received + " '" + a + "L' " + expected + " '" + b + "L'.");
        }
    }

    private static void eq(int n, boolean a, boolean b) {
        if (a == b) {
            System.err.println("Case " + n + " passed.");
        } else {
            System.err.println("Case " + n + " failed: " + received + " '" + a + "' " + expected + " '" + b + "'.");
        }
    }

    private static void eq(int n, String a, String b) {
        if (a != null && a.equals(b)) {
            System.err.println("Case " + n + " passed.");
        } else {
            System.err.println("Case " + n + " failed: " + received + " \"" + a + "\" " + expected + " \"" + b + "\".");
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
                System.err.println("Case " + n + " failed. " + received + " and " + expected + " array differ in position " + i);
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
                System.err.println("Case " + n + " failed. " + received + " and " + expected + " array differ in position " + i);
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
                System.err.println("Case " + n + " failed. " + received + " and " + expected + " array differ in position " + i);
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
                System.err.println("Case " + n + " failed. " + received + " and " + expected + " array differ in position " + i);
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
    static String expected = "  expe";
    static String received = "  rChi";
// END CUT HERE
}


// BEGIN CUT HERE

// END CUT HERE
