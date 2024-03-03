package money;

public class Euro extends MoneyImpl{
    public Euro(int wholeUnits, int cents) {
        super(wholeUnits, cents);
    }

    @Override
    public void printAmount() {
        System.out.println("Total amount in euro : " + getWholePart() + "," + getFractionalPart());
    }


}
