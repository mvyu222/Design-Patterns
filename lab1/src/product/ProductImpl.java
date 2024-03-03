package product;

import money.Money;

public class ProductImpl implements Product {
    private String name;
    private Money price;
    private String category;

    public ProductImpl(String name, Money price, String category) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money money) {
        this.price = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }


}
