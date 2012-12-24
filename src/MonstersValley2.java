import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;
import java.util.*;

public class MonstersValley2 {
   public int minimumPrice(int[] dread, int[] price) {
	   int n = dread.length;
	   int res =Integer.MAX_VALUE;
	   
	   
	   
	   
	   if(true)
		   
	   for (int mask = 0; mask < (1<<n); mask++) {
		   ArrayList<Integer> l = new ArrayList<Integer>();
		   int []bribed=new int[n];
		   for (int i = 0; i < n; i++) {
			   if((mask & (1<<i)) > 0){
				   bribed[i]=1;
			   }  
		   }
		   
		   if(bribed[0]==1){
//			   print(bribed);
			   long dreadx = 0;
			   int cost=0;
			   boolean valid=true; 
			   for (int i = 0; i < bribed.length; i++) {
				   if(bribed[i]==1){
					  dreadx+=dread[i];
					  cost+=price[i];
				   }else{
					   if(dreadx<dread[i])
						   valid=false;
				   }
			   }
			   if(valid)
				   res=min(res,cost);
		   }
		   
	   }
	   return res;
   }
   int dp[][];
   int prices[];
   int dread[];
   
   int go(int i,int c, long dr){
	   if(dp[i][c]==-1){
		   int res = 1<<30;
		   if(dr>=dread[i]){
			   int res = go(i+1,c,dr);
			   res = max(res, prices[i]+go(i+1,c+prices[i], dr));
		   }else{
			   return 1<<30;
		   }
		   dp[i][c]=res;
	   }
	   return dp[i][c];
   }
// BEGIN CUT HERE

	private static void print(Object... rs) {
		System.err.println(Arrays.deepToString(rs).replace("]", "]\n"));
	}
	
	static String tl="";
	private static void printTree() {
		try{
			String[] drawing = new Util.treeDrawing.TreeDrawing().draw(new String[]{tl});
			System.err.println(Arrays.deepToString(drawing).replaceAll("\\[|\\]", "").replaceAll(", ", "\n")+"\n");
		}catch (Exception ex){
			System.err.println("invalid tree>"+tl);
		}	
		tl="";
	}
	private static void tn(Object...o){tl+="("+Arrays.deepToString(o).replaceAll(" |\\[|\\]", "")+")";}
	private static void tb(){tl+="[]";}
	private static void tns(){tl+="[";}
	private static void tne(){tl+="]";}
   

public static void main(String[] args) {
		if (args.length == 0) {
			MonstersValley2Harness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				MonstersValley2Harness.run_test(Integer.valueOf(args[i]));
		}
	}

    
    

// END CUT HERE
}

// BEGIN CUT HERE
class MonstersValley2Harness {
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
			int[] dread               = {8, 5, 10};
			int[] price               = {1, 1, 2};
			int expected__            = 2;

			return verifyCase(casenum__, expected__, new MonstersValley2().minimumPrice(dread, price));
		}
		case 1: {
			int[] dread               = {1, 2, 4, 1000000000};
			int[] price               = {1, 1, 1, 2};
			int expected__            = 5;

			return verifyCase(casenum__, expected__, new MonstersValley2().minimumPrice(dread, price));
		}
		case 2: {
			int[] dread               = {200, 107, 105, 206, 307, 400};
			int[] price               = {1, 2, 1, 1, 1, 2};
			int expected__            = 2;

			return verifyCase(casenum__, expected__, new MonstersValley2().minimumPrice(dread, price));
		}
		case 3: {
			int[] dread               = {5216, 12512, 613, 1256, 66, 17202, 30000, 23512, 2125, 33333};
			int[] price               = {2, 2, 1, 1, 1, 1, 2, 1, 2, 1};
			int expected__            = 5;

			return verifyCase(casenum__, expected__, new MonstersValley2().minimumPrice(dread, price));
		}
		case 4: {
			int d=2000000000;
			int[] dread               = {d-1,d,d};
//			fill(dread,d);
			int[] price               = {2, 2, 2};
			int expected__            = 4;

			return verifyCase(casenum__, expected__, new MonstersValley2().minimumPrice(dread, price));
		}

		// custom cases

/*      case 4: {
			int[] dread               = ;
			int[] price               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new MonstersValley2().minimumPrice(dread, price));
		}*/
/*      case 5: {
			int[] dread               = ;
			int[] price               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new MonstersValley2().minimumPrice(dread, price));
		}*/
/*      case 6: {
			int[] dread               = ;
			int[] price               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new MonstersValley2().minimumPrice(dread, price));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
