import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;



public class CowCrossTheRoad{
    public static void main(String[] args) throws IOException{
        Kattio io = new Kattio("circlecross");
        String longString = io.nextLine();
        //aoidjpfoiajdfoiaj
        char[] letters = longString.toCharArray();
        int pairs = 0;
        for(int i = 0; i < letters.length;i++){
            for(int j = i + 1; j<letters.length;j++){
                String pair = "" + letters[i] + letters[j];
                //ab
                int check = longString.indexOf(pair);
                if(check != -1 && longString.indexOf(pair, check + 1) != -1){
                    pairs++;
                }
            }
        }
        io.print(pairs);
        io.flush();

    }



    static class Kattio extends PrintWriter {
    private BufferedReader r;
    private StringTokenizer st;

    // Standard input
    public Kattio() {
        this(System.in, System.out);
    }

    public Kattio(InputStream i, OutputStream o) {
        super(o);
        r = new BufferedReader(new InputStreamReader(i));
    }

    // USACO-style file input
    public Kattio(String problemName) throws IOException {
        super(problemName + ".out");
        r = new BufferedReader(new FileReader(problemName + ".in"));
    }

    // Reads the next token
    public String next() {
        try {
            while (st == null || !st.hasMoreTokens()) {
                String line = r.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        } catch (Exception e) {
            return null;
        }
    }

    // Reads the next integer
    public int nextInt() {
        return Integer.parseInt(next());
    }

    // Reads the next double
    public double nextDouble() {
        return Double.parseDouble(next());
    }

    // Reads the next long
    public long nextLong() {
        return Long.parseLong(next());
    }

    // Reads the next full line
    public String nextLine() {
        try {
            st = null;
            return r.readLine();
        } catch (Exception e) {
            return null;
        }
    }
}
}