// Pizzapohja
public class PizzaPohja implements AgrininPizza {
    @Override
    public String getKuvaus() {
        return "Pizzan pohja";
    }

    @Override
    public double getHinta() {
        return 5.0;
    }
}
