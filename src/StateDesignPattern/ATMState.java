package StateDesignPattern;

public interface ATMState {
    public void insertCard();
    public void ejectCard();
    public void enterPin();
    public void withDrawCash(int amount);
}
