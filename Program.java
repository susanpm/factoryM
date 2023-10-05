

public class Program {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        // NY Pizza Store
        System.out.println("NY Pizza Store");
        System.out.println("");
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println( pizza.setName() + "\n");
        pizza = nyStore.orderPizza("clam");
        System.out.println(pizza.setName() + "\n");
        pizza = nyStore.orderPizza("veggie");
        System.out.println(pizza.setName() + "\n");
        pizza = nyStore.orderPizza("pepperoni");
        System.out.println(pizza.setName() + "\n");

        // Chicago Pizza Store
        System.out.println("Chicago Pizza Store");
        System.out.println("");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.setName() + "\n");
        pizza = chicagoStore.orderPizza("clam");
        System.out.println(pizza.setName() + "\n");
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println(pizza.setName() + "\n");
        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println(pizza.setName() + "\n");
    }
}
//Susan Sarahi Ponce Mejia 19211712
