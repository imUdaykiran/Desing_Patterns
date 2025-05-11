package StateDesignPattern;

public class HasCardState implements ATMState{

    ATMMachine atm;

    public HasCardState(ATMMachine atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card Already Inserted!");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected!");
        atm.setState(atm.getNoCardState());
    }

    @Override
    public void enterPin() {
        System.out.println("Pin Entered Successfully!");
        atm.setState(atm.getCorrectPinState());
    }

    @Override
    public void withDrawCash(int amount) {
        System.out.println("Enter Pin first!");
    }
}
