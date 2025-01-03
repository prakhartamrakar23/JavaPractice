package JavaPractice;

import java.util.Scanner;

abstract class Series {
    abstract int nextTerm();
}

class GeometricSeries extends Series {
    private int resource;
    private int ratio;
    private int planetCount;
    private int currentTerm;

    public GeometricSeries(int resource, int ratio, int planetCount) {
        this.resource = resource;
        this.ratio = ratio;
        this.planetCount = planetCount;
        this.currentTerm = resource;
    }

    // Implementing the nextTerm() method to calculate the next term in the
    // geometric progression
    @Override
    public int nextTerm() {
        int term = currentTerm;
        currentTerm *= ratio;
        return term;
    }

    // Method to print the resource levels for all planets
    public void printResourceLevels() {
        for (int i = 0; i < planetCount; i++) {
            System.out.print(nextTerm() + " ");
        }
    }
}

public class GpMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: initial resource level, growth ratio, number of planets
        int resource = scanner.nextInt();
        int ratio = scanner.nextInt();
        int planets = scanner.nextInt();

        // Create an instance of GeometricSeries
        GeometricSeries series = new GeometricSeries(resource, ratio, planets);

        // Print the predicted resource levels for each planet
        series.printResourceLevels();

        scanner.close();
    }
}
