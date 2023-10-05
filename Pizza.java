import java.util.ArrayList;

public abstract class Pizza {
    public String name, dough, sauce;
    public ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Prepare: " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
        for (String topping : toppings) {
            System.out.println("Adding toppings: " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String setName() {
        return name;
    }

    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("-" + name + "-\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
//Susan Sarahi Ponce Mejia 19211712