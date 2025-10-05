import static java.lang.Math.*;
import java.util.Date;
import java.util.Scanner;

public class Lr1
{
    public static void main(String[] args)
    {
        double W, Y;
        double a = 1.5;
        double b = 15.5;
        double x = -2.8;
        W = calcR(a, b, x);
        Y = calcS(a, b, x);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("a");
        a = scanner.nextDouble();
        
        System.out.println("b");
        b = scanner.nextDouble();
        
        System.out.println("x");
        x = scanner.nextDouble();
        
        W = calcR(a, b, x);
        Y = calcS(a, b, x);

        outputDate();
    }
    public static double calcR(double a, double b, double x)
    {
        System.out.printf("Calculating W. Input: a = %f, b = %f, x = %f ", a, b, x);
        double w = sqrt(x * x + b) - b * b * pow(sin((x + a)), 3)/x;
        System.out.printf("Output W = %.3f%n", w);
        return w;
    }
    public static double calcS(double a, double b, double x)
    {
        System.out.printf("Calculating Y. Input: a = %f, b = %f, x = %f ", a, b, x);
        double y = pow(cos(x*x*x), 2) - (x / sqrt(a * a + b * b));
        System.out.printf("Output Y = %.3f%n", y);
        return y;
    }
    public static void outputDate()
    {
        Date d = new Date();
        System.out.printf("%tT %tA", d, d);
    }
}
