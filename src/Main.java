public class Main {
    public static void main(String[] args) {
        // Calculates the HCF of 25 and 15.
        System.out.println(getGreatestCommonDivisor(25, 15));

        // Calculates the HCF of 12 and 30.
        System.out.println(getGreatestCommonDivisor(12, 30));

        // Calculates the HCF of 9 and 18.
        System.out.println(getGreatestCommonDivisor(9, 18));

        // Calculates the HCF of 81 and 153.
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    /**
     * Calculates the HCF between two numbers.
     */
    public static int getGreatestCommonDivisor(int first, int second) {
        // Checks for invalid value.
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        // Stores the hcf.
        int hcf = 1;

        for (int i = 1; i <= Math.min(first, second); i++) {
            if ((first % i == 0) && (second % i == 0)) {
                hcf = i;
            }
        }
        return hcf;
    }
}