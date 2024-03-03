package money;

public class Dollar extends MoneyImpl {
    public Dollar(int wholeUnits, int cents) {
        super(wholeUnits, cents);
    }
    @Override
    public void printAmount() {
        System.out.println("Total amount in dollar : " + getWholePart() + "," + getFractionalPart());
    }

}
