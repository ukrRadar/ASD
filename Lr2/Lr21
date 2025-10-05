import static java.lang.Math.*;
import java.util.ArrayList;

public class Lr21 {

    public static void main(String[] args) {
        double[] x = new double[]{-2.3, 0.6, 4.8};

        printTask(1, x, task1(x));
        printTask(2, x, task2(x));
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

    public static ArrayList<Double> task1(double[] x) {
        double a = 2.3;
        double u = 0.0;
        double y = 0;

        ArrayList<Double> result = new ArrayList<Double>();
        for (int i = 0; i < x.length; i++) {
            u = sin(x[i] + a);
            if (u < -0.5) {
                y = pow(log(0.5 * a - u), 2);
            } else if (-0.5 <= u && u <= pow(10, -3)) {
                y = (2 * x[i] - a) / (7 * PI + x[i] + u);
            } else if (u > pow(10, -3)) {
                y = log10(u + x[i]) - exp(x[i]);
            } else {
                y = 0;
            }
            result.add(y);
        }
        return result;
    }

    public static ArrayList<Double> task2(double[] x) {
        double y = 0;
        double[] z = new double[3];
        ArrayList<Double> result = new ArrayList<Double>();

        for (int i = 0; i < x.length; i++) {
            z[0] = asin(pow(x[i], 3));
            z[1] = pow(acos(x[i]), 2);
            z[2] = tan(x[i]);
            
            for (int j = 0; j < z.length; j++) {
                if (z[j] > -0.5){ 
                    y = pow((2 * z[j] + 1), 2) / (3.71 - x[i] * x[i]);
                } else if (-0.5 <= z[j] && z[j] <= pow(10, -3)) {
                    y = pow(sin(z[j]), 3) - sin(z[j] / (3 * PI));
                } else if (z[j] > pow(10, -3)) {
                    y = (tan(z[j] + x[i]) - exp(PI)) / (3.5 / x[i]);
                } else {
                    y = 0;
                }
                result.add(y);
            }
        }
        return result;
    }
}
