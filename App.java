import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Interest Calculator");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("1. Calculate Simple Interest");
                System.out.println("2. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter principal amount: ");

                        if (!scanner.hasNextDouble()) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            scanner.next();
                            continue;
                        }

                        double principal = scanner.nextDouble();

                        System.out.print("Enter rate of interest: ");

                        if (!scanner.hasNextDouble()) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            scanner.next();
                            continue;
                        }
                        double rate = scanner.nextDouble();

                        System.out.print("Enter time period (in years): ");

                        if (!scanner.hasNextDouble()) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            scanner.next();
                            continue;
                        }

                        double time = scanner.nextDouble();

                        double simpleInterest = calculateSimpleInterest(principal, rate, time);
                        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
                    }
                    case 2 -> {
                        System.out.println("Thank you visiting Simple Interest Calculator");
                        System.exit(0);
                    }
                    default ->
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        }
    }

    private static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}