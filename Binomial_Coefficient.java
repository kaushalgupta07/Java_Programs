public class Binomial_Coefficient {
    public static void main(String[] args) {
        int n = 5; // Example value for n
        int r = 2; // Example value for r

        // Calculate factorial of n
        int nFact = 1;
        for (int i = 1; i <= n; i++) {
            nFact = nFact * i;
        }

        // Calculate factorial of r
        int rFact = 1;
        for (int j = 1; j <= r; j++) {
            rFact = rFact * j;
        }

        // Calculate factorial of (n - r)
        int nMinusRFact = 1;
        for (int k = 1; k <= (n - r); k++) {
            nMinusRFact = nMinusRFact * k;
        }

        // Calculate binomial coefficient
        int binomialCoefficient = nFact / (rFact * nMinusRFact);

        // Print result
        System.out.println("Binomial Coefficient C(" + n + "," + r + ") = " + binomialCoefficient);
    }
}
