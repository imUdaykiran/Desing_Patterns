package NullObjectDesignPattern;

public class AnimalFactory {
    public static Animal getAnimal(String type)
    {
        if("dog".equalsIgnoreCase(type))
        {
            return new Dog();
        }
        return new NullAnimal(); //Instead of returning null
    }
}
