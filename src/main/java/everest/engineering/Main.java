package everest.engineering;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidProbabilityException {
        Scanner scanner = new Scanner(System.in);
        double probabilityValue = scanner.nextDouble();
        double anotherProbabilityValue = scanner.nextDouble();
        Probability probability = new Probability(probabilityValue);
        Probability anotherProbability = new Probability(anotherProbabilityValue);
        if (probability.equals(anotherProbability)) {
            System.out.println("both probabilities are equal");
        } else {
            System.out.println("both probabilities are not equal");
        }
    }
}