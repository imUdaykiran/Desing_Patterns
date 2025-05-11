package StateDesignPattern;

public class ATMMachine {
    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState correctPinState;
    private ATMState noCashState;

    private ATMState currentState;
    private int cashInMachine = 1000;

    public ATMMachine() {
        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        correctPinState = new CorrectPinState(this);

        currentState = noCardState;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin();
    }

    public void withdrawCash(int amount) {
        currentState.withDrawCash(amount);
    }

    // Getters and Setters
    public void setState(ATMState state) {
        currentState = state;
    }

    public ATMState getNoCardState() { return noCardState; }
    public ATMState getHasCardState() { return hasCardState; }
    public ATMState getCorrectPinState() { return correctPinState; }
    public ATMState getNoCashState() { return noCashState; }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public void setCashInMachine(int cash) {
        cashInMachine = cash;
    }

}
