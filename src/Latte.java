public class Latte extends Coffee {
    String milkType;
    String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, price);
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    @Override
    public void grindBeans() {
        System.out.println("\nGrinding coffee beans coarsely for a latte (medium grind).");
    }

    @Override
    public void brewCoffee() {
        System.out.println("Brewing coffee for a latte...");
        if (!syrupFlavor.equals("no")) {
            System.out.println("Adding " + syrupFlavor + " syrup to the cup...");
            System.out.println("Steaming " + milkType + " milk...");
            System.out.println("Combining coffee and steamed milk...");
            System.out.println("Adding a layer of foam on top...");
        }
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");
    }
}
