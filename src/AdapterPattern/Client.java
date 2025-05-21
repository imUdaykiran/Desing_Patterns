package AdapterPattern;

public class Client {
    public static void main(String args[])
    {
        ModernPrinter printer = new PrinterAdapter(new OldPrinter());
        printer.print("Hello World");
    }
}
