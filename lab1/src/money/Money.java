package money;

public interface Money {

    void setMoney(int wholePart, int fractionalPart);

    void printAmount();

    int getWholePart();

    public void setWholePart(int wholePart);

    public int getFractionalPart();

    public void setFractionalPart(int fractionalPart);

}


