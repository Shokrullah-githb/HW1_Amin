import java.util.*;

class Juice {
    double h;
    double v;
    double ratio;

    Juice(double h, double v) {
        this.h = h;
        this.v = v;
        this.ratio = h / v;  // Happiness in each l
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading of n and V
        int n = sc.nextInt();
        double V = sc.nextDouble();

        List<Juice> juices = new ArrayList<>();

        // Reading of Happy and v of each juice
        for (int i = 0; i < n; i++) {
            double h = sc.nextDouble();
            double v = sc.nextDouble();
            juices.add(new Juice(h, v));
        }

        // Sorting of each juice from large to small
        juices.sort((a, b) -> Double.compare(b.ratio, a.ratio));

        double totalHappiness = 0.0; // Sum of Happiness
        double remaining = V;         //  V of stomach

        // counting of final Happiness
        for (Juice j : juices) {
            if (remaining == 0) break;          // if stomach fill break
            double amount = Math.min(j.v, remaining);
            totalHappiness += amount * j.ratio;
            remaining -= amount;
        }
        // Print the output
        System.out.println("%.1f\n", totalHappiness);
    }
}
