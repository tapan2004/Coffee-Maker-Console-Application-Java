public class Coffee {
    String name;                // like "Espresso", "Latte", "Mocha"
    String roast;               // like "light", "medium", "dark"
    int caffeineLevelInMg;      // calculated based on the roast
    double price;               // in dollars, 2.50

    public Coffee(String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;

        setCaffeineLevel();
    }
    public void setCaffeineLevel(){
        if (roast.equals("light")){
            caffeineLevelInMg=50;
        } else if (roast.equals("medium")) {
            caffeineLevelInMg=100;
        } else if (roast.equals("dark")) {
            caffeineLevelInMg=150;
        }else {
            caffeineLevelInMg=0;
        }
    }

    public void grindBeans() {
        System.out.println("\nGrinding beans for " + name + "...");
    }

    public void brewCoffee() {
        System.out.println("\nBrewing your favorite " + name + "...");
    }

    public void printInfo() {
        System.out.println("\nYou ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + caffeineLevelInMg + " mg.");
    }
}