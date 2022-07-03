package everest.engineering;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p1 = scanner.nextDouble();
        double p2 = scanner.nextDouble();
        if (p1 == p2) {
            System.out.println("P1 and P2 are equal");
        } else {
            System.out.println("P1 and P2 are not equal");
        }
    }
}