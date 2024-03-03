package product;

import money.Money;

public class PriceReducibleImpl implements PriceReducible {

    @Override
    public void reducePrice(Money money, Product product) {
        if (money.getWholePart() < 0 || money.getFractionalPart() < 0) {
            throw new IllegalArgumentException("Reduction amount must be a non-negative value");
        }

        Money currentSum = product.getPrice();
        currentSum.setMoney(currentSum.getWholePart() - money.getWholePart(), currentSum.getFractionalPart() - money.getFractionalPart());
        product.setPrice(currentSum);

    }
}
