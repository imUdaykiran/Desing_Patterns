package NullObjectDesignPattern;

public class NullObjectDesignPattern {
    public static void main(String[] args)
    {
        Animal a1 = AnimalFactory.getAnimal("dog");
        Animal a2 = AnimalFactory.getAnimal("cat");

        a1.makeSound();//woof!
        a2.makeSound();//Does nothing, no error
    }
}
