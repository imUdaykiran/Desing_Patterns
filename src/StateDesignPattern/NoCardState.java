package StateDesignPattern;

public class NoCardState implements ATMState{

    ATMMachine atm;

    public NoCardState(ATMMachine atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card Inserted!");
        atm.setState(atm.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("No Card to eject!");
    }

    @Override
    public void enterPin() {
        System.out.println("Insert Card First!");
    }

    @Override
    public void withDrawCash(int amount) {
        System.out.println("Insert Card First!");
    }
}
