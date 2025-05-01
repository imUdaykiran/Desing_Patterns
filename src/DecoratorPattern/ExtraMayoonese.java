package DecoratorPattern;

public class ExtraMayoonese extends BurgerDecorator{

    Burger burger;

    public ExtraMayoonese(Burger burger)
    {
        this.burger=burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+" with extra mayoonese";
    }

    @Override
    public double getCost() {
        return burger.getCost()+20.0;
    }
}
