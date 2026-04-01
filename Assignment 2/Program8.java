import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();

        double futureValue = p + (p * r * t / 100);

        System.out.println("Future Value: " + futureValue);

        sc.close();
    }
}
