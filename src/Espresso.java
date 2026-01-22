public class Espresso extends Coffee {

    private int numberOfShots;

    public Espresso(String name, String roast, double price, int numberOfShots) {
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

    @Override
    public void grindBeans() {
        System.out.println("\nGrinding espresso beans finely...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("Brewing espresso under high pressure...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Servings: " + numberOfShots);
        System.out.println("Total bill: $" + (price * numberOfShots));
    }
}
