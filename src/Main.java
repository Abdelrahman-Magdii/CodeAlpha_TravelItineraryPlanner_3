import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        // Input destinations and dates
        System.out.println("Welcome to the Travel Itinerary Planner!");
        System.out.print("Enter number of destinations: ");
        int numDestinations =scanner.nextInt();
        scanner.nextLine();
        String[] destinations = new String[numDestinations];
        String[] dates = new String[numDestinations];

        for (int i = 0; i < numDestinations; i++) {
            System.out.print("Enter destination " + (i + 1) + ": ");
            destinations[i] = scanner.nextLine();
            System.out.print("Enter date for destination " + (i + 1) + ": ");
            dates[i] = scanner.nextLine();
        }

        // Input preferences
        System.out.println("Please provide your travel preferences:");
        System.out.print("Preferred transportation (car, train, plane): ");
        String transportation = scanner.nextLine();
        System.out.print("Maximum budget: ");
        double budget = scanner.nextDouble();

        // Display itinerary
        System.out.println("\nYour Travel Itinerary:");
        for (int i = 0; i < numDestinations; i++) {
            System.out.println("Destination: " + destinations[i]);
            System.out.println("Date: " + dates[i]);
            // Additional features like maps and weather information can be integrated here
        }

        // Calculate and display budget information
        System.out.println("\nBudget Information:");
        // Sample budget calculation
        double averageCostPerDay = 100; // Sample average cost per day
        double totalCost = averageCostPerDay * numDestinations;
        System.out.println("Total estimated cost: $" + totalCost);
        if (totalCost <= budget) {
            System.out.println("Your budget is sufficient for this trip.");
        } else {
            System.out.println("Your budget is not sufficient for this trip.");
        }

        System.out.println("Thank you for using the Travel Itinerary Planner!");
        scanner.close();

    }
}