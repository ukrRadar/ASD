import static java.lang.Math.*;
import static java.lang.System.out;
import java.util.Scanner;

public class Lr3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int[] a = new int[]{1,0,0,0,-2,-6,7,-8,9,-10};
        int[] b = new int[]{0,0,8,-9,-12,-55,-66,-8,-99,1};
        int[] result;
        double[] task3Input = new double[2];
        
        out.println("\nCALCULATING TASK 1:");
        task1(3.5,10.5 ,0.2);
        
        out.println("\nCALCULATING TASK 2:");
        result = task2(a);
        out.printf("\nPositive number coun:%d, Negative numbers count:%d, Zero count:%d\n", result[0], result[1], result[2]);
        result = task2(b);
        out.printf("\nPositive number coun:%d, Negative numbers count:%d, Zero count:%d\n", result[0], result[1], result[2]);
        
        out.println("\nCALCULATING TASK 3:");
        out.print("Input x:\n");
        
        for(int i = 0; i < task3Input.length; i++)
        {
            out.printf("X%d: ", i+1);
            task3Input[i] = scanner.nextDouble();
        }
        for (double d : task3Input) 
        {
            task3(d);
        }
    }
    public static void task1(double start, double end, double h)
    {
        double y = 0;
        double z = 0;
        double x = 0;
        
        for(x = start; x <= end; x+= h)
        {
            y = exp(1/sqrt(x)) * sin(x);
            z = tan(sqrt(x)) * sin(x - PI/2);
            out.printf("X:%.2f, Y(x):%.4f, Z(x):%.4f \n", x, y, z);
        }
    }
    public static int[] task2(int[] arr)
    {
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        
        for (int d : arr) 
        {
            out.printf("%d ", d);
            
            if(d > 0)
            {
                countPositive++;
            }
            else if(d < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }
        }
        return new int[]{countPositive, countNegative, countZero};
    }
    static void task3(double x) 
    {
        double y = 0;
        int k = 0;
        for (k = 1; k <= 4; k++) 
        {
            y += pow(-1, k) * pow(x, 2 * k - 1) / (pow(2, k) * factorial(k));
        }
        while (k <= 8) 
        {
            y += pow(-1, k) * pow(x, 2 * k - 1) / (pow(2, k) * factorial(k));
            k++;
        }
        out.printf("Input X: %.1f, Output Y: %.4f\n", x, y);
    }
    public static int factorial(int x)
    {
        int factorial = 1;
        
        for(int i = 2; i <= x; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
}
