package Judges_UVA;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main {

    static char ch[][];
	static int visit[][];
	static int suma = 0;
	static int X[] = { 0, 1, -1, 0 };
	static int Y[] = { 1, 0, 0, -1 };

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
//		Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in)));
		PrintWriter out = new PrintWriter(System.out);

		int indice=1;
		while (true) {
			String cad[] = in.readLine().split(" ");

			int width = Integer.parseInt(cad[0]);
			int height = Integer.parseInt(cad[1]);

			if (width == 0 && height == 0)break;

			ch = new char[height][width];
			visit = new int[height][width];

			// obtener datos de la cadena y rellenarlos en el arreglo
			for (int i = 0; i < height; i++) {
				String txt = in.readLine();
				ch[i] = txt.toCharArray();
			}
			
			System.out.println("Throw "+indice+"\n1 2 3\n");
		}

		in.close();
		out.close();
	}
}
