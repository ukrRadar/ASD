
import static java.lang.Math.max;
import static java.lang.Math.tan;
import java.util.ArrayList;
import java.util.Scanner;

public class Lr22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] inputTask3 = new double[3];
        double[][] inputTask4 = new double[3][3];

        System.out.println("Etner 3 variables for task3 :");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d:", 1 + i);
            inputTask3[i] = scanner.nextDouble();
        }

        printTask(3, inputTask3, task3(inputTask3));

        System.out.println("Etner 3 pairs of variables for task4: ");
        for (int i = 0; i < inputTask4.length; i++) {
            System.out.printf("Enter %d pair\n", 1 + i);
            for (int j = 0; j < inputTask4[i].length; j++) {
                System.out.printf("Enter %d pair variable %d: ", 1 + i, 1 + j);
                inputTask4[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        System.out.println("Task4 input:");
        for (int i = 0; i < inputTask4.length; i++) {
            System.out.printf("pair %d: ", i);
            for (int j = 0; j < inputTask4[i].length; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        System.out.println("calculating Task4");
        for (int i = 0; i < inputTask4.length; i++) {
            System.out.println(task4(inputTask4[i][0], inputTask4[i][1], inputTask4[i][2]));
        }
    }

    public static void printTask(int taskNumber, double[] input, ArrayList<Double> result) {
        System.out.printf("calculating Task%d\n", taskNumber);
        System.out.println("Input:");
        for (Double x : input) {
            System.out.println(x);
        }
        System.out.println("Output:");
        for (Double res : result) {
            System.out.printf("%.4f\n", res);
        }
    }

    public static ArrayList<Double> task3(double[] radians) {

        ArrayList<Double> result = new ArrayList<Double>();

        for (int i = 0; i < radians.length; i++) {
            if (tan(radians[i]) > 1 / tan(radians[i])) {
                System.out.printf("tan is bigger, tan: %f.4,\n", tan(radians[i]));
                result.add(tan(radians[i]));
            } else {
                System.out.printf("cotan is bigger, cotan: %f.4\n", 1 / tan(radians[i]));
                result.add(1 / tan(radians[i]));
            }
        }
        return result;
    }

    public static boolean task4(double a, double b, double c) {
        double max = max(a, max(b, c));
        return max < (a + b + c) - max;
    }
}
