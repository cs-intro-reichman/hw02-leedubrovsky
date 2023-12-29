import java.util.Random;

public class OneOfEachStats {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Random rand = new Random();
        int family2 = 0;
        int family3 = 0;
        int family4More = 0;
        int sum = 0;

        for (int i = 0; i < T; i++) {
            int count = 1;  // Initialize count for each family
            double p = rand.nextDouble();
            String str = (p < 0.5) ? "b " : "g ";

            while (p < 0.5) {
                p = rand.nextDouble();
                count++;
                str += "b ";
            }

            while (p >= 0.5) {
                p = rand.nextDouble();
                count++;
                str += "g ";
            }

            sum += count;

            // Add the last child to make sure there's at least one of each gender
            str += (str.charAt(str.length() - 2) == 'g') ? "b" : "g";

            if (count == 2) {
                family2++;
            } else if (count == 3) {
                family3++;
            } else if (count >= 4) {
                family4More++;
            }
        }

        double average = (double) sum / T;

        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + family2);
        System.out.println("Number of families with 3 children: " + family3);
        System.out.println("Number of families with 4 or more children: " + family4More);

        // Determine the most common number of children
        if (family2 >= family3 && family2 >= family4More) {
            System.out.println("The most common number of children is 2.");
        } else if (family3 >= family2 && family3 >= family4More) {
            System.out.println("The most common number of children is 3.");
        } else {
            System.out.println("The most common number of children is 4 or more.");
        }
    }
}
