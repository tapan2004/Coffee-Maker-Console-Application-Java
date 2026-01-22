import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeMaker cafeCoffeeMaker = new CoffeeMaker();

        while (true) {
            System.out.println("\nWelcome to the Coffee Machine!");
            System.out.println("Select an option to continue:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    String espressoName = "Espresso";
                    double espressoPrice = 2.50;

                    System.out.print("What Roast would you like? (light, medium, dark): ");
                    String espressoRoast = sc.next();

                    System.out.print("How many servings would you like?: ");
                    int numberOfShots = sc.nextInt();

                    Espresso espresso = new Espresso(
                            espressoName,
                            espressoRoast,
                            espressoPrice,
                            numberOfShots
                    );

                    cafeCoffeeMaker.prepareCoffee(espresso);
                    espresso.printInfo();
                    break;
                }

                case 2: {
                    String latteName = "Latte";
                    double lattePrice = 3.50;

                    System.out.print("What Roast would you like? (light, medium, dark): ");
                    String latteRoast = sc.next();

                    System.out.print("What milk type would you like? (whole, skim, almond, oat): ");
                    String milkType = sc.next();

                    System.out.print("Would you like syrup? (yes/no): ");
                    String syrupWanted = sc.next();

                    String syrupFlavor = "no";
                    if (syrupWanted.equalsIgnoreCase("yes")) {
                        System.out.print("Which flavor? (vanilla, caramel, hazelnut): ");
                        syrupFlavor = sc.next();
                    }

                    Latte latte = new Latte(
                            latteName,
                            latteRoast,
                            lattePrice,
                            milkType,
                            syrupFlavor
                    );

                    cafeCoffeeMaker.prepareCoffee(latte);
                    latte.printInfo();
                    break;
                }

                case 3:
                    System.out.println("Thank you for using the Coffee Machine!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
