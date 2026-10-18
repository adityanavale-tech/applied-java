import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;



public class MixingMilk {
    public static void main(String[] args) throws IOException{
        Kattio io = new Kattio("mixmilk");
        //c1,c2,c3 are the capacities
        //m1,m2,m3 are the starting amounts
        int c1 = io.nextInt();
        int m1 = io.nextInt();
        int c2 = io.nextInt();
        int m2 = io.nextInt();
        int c3 = io.nextInt();
        int m3 = io.nextInt();


        //Pour 1
        if(c1 == m1 || c2 == m2 || c3 == m3){
            io.println(m1);
            io.println(m2);
            io.println(m3);
        }else{
            m2 = m1 + m2;
            if(m2 > c2){
                m1 = m2 - c2;
                m2 = c2;
            }else{
                m1 = 0;
            }
            //POUR 1 Done
            //Pour 2
            m3 = m2 + m3;
            if(m3 > c3){
                m2 = m3 - c3;
                m3 = c3;
            }else{
                m2 = 0;
            }
            //POUR 2 DONE
            //Pour 3
            m1 = m3 + m1;
            //m1 = 12
            if(m1 > c1){
                m3 = m1 - c1;
                m1 = c1;
            }else{
                m3 = 0;
            }
            //POUR 3 Done
            //Pour 4
            m2 = m1 + m2;
            if(m2 > c2){
                m1 = m2 - c2;
                m2 = c2;
            }else{
                m1 = 0;
            }

            io.println(m1);
            io.println(m2);
            io.println(m3);

    }

            io.close();

}
    static class Kattio extends PrintWriter {
		private BufferedReader r;
		private StringTokenizer st;
		// standard input
		public Kattio() { this(System.in, System.out); }
		public Kattio(InputStream i, OutputStream o) {
			super(o);
			r = new BufferedReader(new InputStreamReader(i));
		}
		// USACO-style file input
		public Kattio(String problemName) throws IOException {
			super(problemName + ".out");
			r = new BufferedReader(new FileReader(problemName + ".in"));
		}
		// returns null if no more input
		public String next() {
			try {
				while (st == null || !st.hasMoreTokens())
					st = new StringTokenizer(r.readLine());
				return st.nextToken();
			} catch (Exception e) { }
			return null;
		}
		public int nextInt() { return Integer.parseInt(next()); }
		public double nextDouble() { return Double.parseDouble(next()); }
		public long nextLong() { return Long.parseLong(next()); }
	}
    
}