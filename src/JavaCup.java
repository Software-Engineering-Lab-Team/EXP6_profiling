import java.util.ArrayList;
import java.util.Scanner;

public class JavaCup {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        temp();
        //stringProcessorUnoptimized();
        stringProcessorOptimized();
        eval(i, j, k);
    }
    public static void eval(int i, int j, int k)
    {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k)
        {
            System.out.println("YES");
        }
        else { System.out.println("NO"); }
    }
    public static void temp() {
        long sum = 0;

        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 20000; j++) {
                sum += (i + j);
            }
        }
    }

    public static void stringProcessorUnoptimized() {
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += i;
        }
        System.out.println("Unoptimized processing done. Length: " + result.length());
    }

    public static void stringProcessorOptimized() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        String result = sb.toString();
        System.out.println("Optimized processing done. Length: " + result.length());
    }

}
