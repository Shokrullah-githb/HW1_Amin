import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>(n * 2);
        for (int i = 0; i < n; i++) {
            String s = br.readLine().trim();
            // guaranteed length >= p, q by statement
            String pref = s.substring(0, p);
            String suff = s.substring(s.length() - q);
            // combine with a character that cannot appear in input.
            set.add(pref + "#" + suff);
        }
        System.out.println(set.size());
    }
}
