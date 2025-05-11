package StateDesignPattern;

public class CorrectPinState implements ATMState{

    ATMMachine atm;

    public CorrectPinState(ATMMachine atm) {
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
        System.out.println("Pin Already Entered!");
    }

    @Override
    public void withDrawCash(int amount) {
        if(amount>atm.getCashInMachine())
        {
            System.out.println("Insufficient amount!");
            atm.setState(atm.getNoCardState());
            return;
        }
        System.out.println(amount+" withdrawn successfully!");

    }
}
