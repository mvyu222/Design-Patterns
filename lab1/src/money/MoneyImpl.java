package money;


public class MoneyImpl implements Money {

    private int wholePart;
    private int fractionalPart;

    public MoneyImpl(int wholeUnits, int cents) {
        this.wholePart = wholeUnits;
        this.fractionalPart = cents;
    }

    @Override
    public int getWholePart() {
        return wholePart;
    }

    @Override
    public void setWholePart(int wholePart) {
        this.wholePart = wholePart;
    }

    @Override
    public int getFractionalPart() {
        return fractionalPart;
    }

    @Override
    public void setFractionalPart(int fractionalPart) {
        this.fractionalPart = fractionalPart;
    }

    @Override
    public void setMoney(int wholePart, int fractionalPart) {
        this.fractionalPart = fractionalPart;
        this.wholePart = wholePart;
    }

    @Override
    public void printAmount() {
        System.out.print("Total amount : " + wholePart + "," + fractionalPart);
    }

}