package AbstractFactory;

public interface GUIAbstractFactory {
    public static Ifactory createFactory(String osType)
    {
        if(osType.equals("windows"))
        {
            return new WinFactory();
        }
        else if(osType.equals("mac"))
        {
            return new MacFactory();
        }
        return new MacFactory(); //default one
    }
}
