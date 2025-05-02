package AbstractFactory;

public class WinButton implements IButton{
    @Override
    public void press() {
        System.out.println("Window Button pressed! ");
    }
}
