public class AgrininPizzaMain {
    public static void main(String[] args) {
        AgrininPizza pizza = new PizzaPohja();

        pizza = new Kebab(pizza);
        //pizza = new Feta(pizza); // Voi lisätä feta päällyste
        pizza = new Juusto(pizza);

        System.out.println("Pizza: " + pizza.getKuvaus());
        System.out.println("Hinta: " + pizza.getHinta() + " euroa");
    }
}
