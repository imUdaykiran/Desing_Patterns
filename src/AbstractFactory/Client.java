package AbstractFactory;

import java.util.Scanner;

public class Client {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter os type: ");

        String osType=sc.nextLine();

        Ifactory fact=GUIAbstractFactory.createFactory(osType);

        IButton button = fact.createButton();
        button.press();

        ITextBox textBox = fact.createTextBox();
        textBox.showText();
    }
}
