package _Archive;

// BEGIN CUT HERE
// END CUT HERE
import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.util.Collections.*;

public class WaterPressure {
    public int howLong(String[] layout) {
        int res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new WaterPressure()).howLong(new String[] {
               ".0",
               "0X"}),0);
            eq(1,(new WaterPressure()).howLong(new String[] {
               ".0",
               "00"}),1);
            eq(2,(new WaterPressure()).howLong(new String[] {
               ".5",
               "44"}),14);
            eq(3,(new WaterPressure()).howLong(new String[] {".23456789"}),71);
            eq(4,(new WaterPressure()).howLong(new String[] {
               ".X0",
               "X00"}),-1);
            eq(5,(new WaterPressure()).howLong(new String[] {
               ".85773817518159249980260123498780838839X6384717463",
               "242194445126058X5X93973323184X3X2747X842171X286218",
               "598X67822897X5X61920060240170X31256497102692827551",
               "54X36408X2548801X136636X63X9233X5949346X2274580162",
               "5108021354X77X4477509918743895XXX159760734682X9115",
               "50675439X0922X79916947371X01901217614357X0397201X3",
               "27186118593416001273104X29X76977141883369859598888",
               "80914X110594111X436841522027X668157791200228638293",
               "940105447111X78X25011577574123524X04XXX51614492051",
               "8804363635177X8246382862576X601870X74X139993345821",
               "X48877009143171494700XX3X16138573259477742520850X9",
               "1612588394913980186365912312794180464979928X986475",
               "595353627322252222412X883094875X522435782213598237",
               "17391130462739808923430X258255508957X4539278411137",
               "161196X087X1959308152303433460329X6588920868810551",
               "5X05897317154867X286045721X246725361349XX31742455X",
               "X6356984801056259X735653998127X568670314628X485224",
               "9320088X74859675156365X779X1X326767X79844419358X2X",
               "501055497X39933X951356690965X4X0844917186293X57985",
               "33413302X1903266448066612423X8038586XX5638903X7517",
               "2976X251488X07X87464805678010167X32X54795816434863",
               "18X8XX869283086X940798825X85739462998X3X3834428505",
               "2555044879X7309586526260751345349591446476X7010X13",
               "3233684019X20X770513442033X6950060849326X814045XX1",
               "7378853595549545X9334157X55988471X21X3295375894550",
               "7X9037779323X31807337002826035684828290777975X01X4",
               "88X7X979X7X39506209854X7415XX8999X2253016X25035787",
               "7683015X17268X16694392X6X101441658747937X198485622",
               "1624X697868860600X030X577356X121482831384673XX7334",
               "4662712538X13X4168850436576272047034855X5933218977",
               "363X88X712383950892X775895613479X5287X01182X614158",
               "0944515500373672425X6066X2108X3247524582717066X178",
               "637664873632165059897471275828595X6527260271X84X40",
               "305512X0X86260235207058X57705027964497905850617962",
               "935138076111582XX0369X62229X178X921961753325422758",
               "9987594X029815548549X858304X3181752985X5927X716348",
               "631347X74X23510X703201850X965X8803X5794257X7X32012",
               "597X2244071123X41X44196191328874040522673675346X00",
               "9501X65935X9375252X55199X261467XXX8118871789524X62",
               "732087503876417410X23X95740041509X58104X7543083124",
               "175978X56605686460653815X08585X89XX137855313405573",
               "51593131735080324921X2253417397314274XX231X5293926",
               "XX778362173333574X333953005142250501X79X21757X1264",
               "57350X7252505123850942501148X63526X106805090642546",
               "2331X884X085X068X18X612328531670865X09525594XX98X6",
               "6935X60327121102150643X49857600X77316813X362130791",
               "331X29776535751774789772426596X1961969905180339X10",
               "358X6622772195016X79558982X1024678439091439835013X",
               "305362575995391477X2744272460098891730534152558XX1",
               "28318306546365480X775289935065X4X48610794894231736"}),18566);
        } catch( Exception exx) {
            System.err.println(exx);
            exx.printStackTrace(System.err);
        }
    }
    private static void eq(int n,int a, int b) {
        if (a==b) {
            System.err.println("Case "+n+" passed.");
        } else {
            System.err.println("Case "+n+" failed: "+received+" "+a+" "+expected+" "+b+".");
        }
    }

    private static void eq(int n,double a, double b) {
        if (a==b) {
            System.err.println("Case "+n+" passed.");
        } else {
            System.err.println("Case "+n+" failed: "+received+" '"+a+"' "+expected+" '"+b+"'.");
        }
    }

    private static void eq(int n,char a, char b) {
        if (a==b) {
            System.err.println("Case "+n+" passed.");
        } else {
            System.err.println("Case "+n+" failed: "+received+" '"+a+"' "+expected+" '"+b+"'.");
        }
    }

    private static void eq(int n,long a, long b) {
        if (a==b) {
            System.err.println("Case "+n+" passed.");
        } else {
            System.err.println("Case "+n+" failed: "+received+" '"+a+"L' "+expected+" '"+b+"L'.");
        }
    }

    private static void eq(int n,boolean a, boolean b) {
        if (a==b) {
            System.err.println("Case "+n+" passed.");
        } else {
            System.err.println("Case "+n+" failed: "+received+" '"+a+"' "+expected+" '"+b+"'.");
        }
    }

    private static void eq(int n,String a, String b) {
        if (a!=null&&a.equals(b)) {
            System.err.println("Case "+n+" passed.");
        } else {
            System.err.println("Case "+n+" failed: "+received+" \""+a+"\" "+expected+" \""+b+"\".");
        }
    }

    private static void eq(int n,int[] a, int[] b) {
        if (a.length!=b.length) {
            System.err.println("Case "+n+" failed: different lengths");
            print(received+"<"+a.length+"> ", a);
            print(expected+"<"+b.length+"> ", b);
            return;
        }
        for (int i = 0; i<a.length; i++) {
            if (a[i]!=b[i]) {
                System.err.println("Case "+n+" failed. "+received+" and "+expected+" array differ in position "+i);
                print(received+" ", a);
                print(expected+" ", b);
                return;
            }
        }
        System.err.println("Case "+n+" passed.");
    }

    private static void eq(int n,long[] a, long[] b) {
        if (a.length!=b.length) {
            System.err.println("Case "+n+" failed: different lengths");
            print(received+"<"+a.length+"> ", a);
            print(expected+"<"+b.length+"> ", b);
            return;
        }
        for (int i = 0; i<a.length; i++) {
            if (a[i]!=b[i]) {
                System.err.println("Case "+n+" failed. "+received+" and "+expected+" array differ in position "+i);
                print(received, a);
                print(expected, b);
                return;
            }
        }
        System.err.println("Case "+n+" passed.");
    }

    private static void eq(int n,double[] a, double[] b) {
        if (a.length!=b.length) {
            System.err.println("Case "+n+" failed: different lengths");
            print(received+"<"+a.length+"> ", a);
            print(expected+"<"+b.length+"> ", b);
            return;
        }
        for (int i = 0; i<a.length; i++) {
            if (a[i]!=b[i]) {
                System.err.println("Case "+n+" failed. "+received+" and "+expected+" array differ in position "+i);
                print(received, a);
                print(expected, b);
                return;
            }
        }
        System.err.println("Case "+n+" passed.");
    }

    private static void eq(int n,String[] a, String[] b) {
        if (a.length!=b.length) {
            System.err.println("Case "+n+" failed: different lengths");
            print(received+"<"+a.length+"> ", (Object[]) a);
            print(expected+"<"+b.length+"> ", (Object[]) b);
            return;
        }
        for (int i = 0; i<a.length; i++) {
            if (!a[i].equals(b[i])) {
                System.err.println("Case "+n+" failed. "+received+" and "+expected+" array differ in position "+i);
                print(received, (Object[]) a);
                print(expected, (Object[]) b);
                return;
            }
        }
        System.err.println("Case "+n+" passed.");
    }

    private static void print(String msg, Object... rs) {
        String x = deepToString(rs);
        if(x.indexOf("[[")==0)
            x=x.substring(1,x.length()-1);
        System.err.println(msg+" "+x);
    }
    
    static String expected = "  expe";
    static String received = "  rChi";
// END CUT HERE
}
