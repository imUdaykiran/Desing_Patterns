package DecoratorPattern;

public class ExtraCheese extends BurgerDecorator{
   public Burger burger;
   public ExtraCheese(Burger burger)
   {
       this.burger=burger;
   }

    @Override
    public String getDescription() {
        return burger.getDescription()+" with extra cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost()+10.0;
    }
}
