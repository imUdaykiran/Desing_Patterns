package AbstractFactory;

public class WinTextBox implements ITextBox{
    @Override
    public void showText() {
        System.out.println("Windows TextBox pressed! ");
    }
}
