package DecoratorPattern;

public class OrderDemo {

    public static void main(String args[])
    {
        Burger burger=new TandooriBurger();
        Burger burger1=new ZingerBurger();

        System.out.println(burger.getDescription()+" "+burger.getCost());
        burger =new ExtraCheese(burger);
        System.out.println(burger.getDescription()+" "+burger.getCost());
        burger=new ExtraMayoonese(burger);
        System.out.println(burger.getDescription()+" "+burger.getCost());
    }
}
