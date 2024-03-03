package warehouse;


import money.Money;

public class WarehouseImpl implements Warehouse {

    private String unitOfMeasure;
    private String name;
    private int quantity;
    private String category;
    private Money price;

    public WarehouseImpl(String unitOfMeasure, int quantity, Money price, String name, String category) {
        this.unitOfMeasure = unitOfMeasure;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.category = category;
    }

    @Override
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @Override
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Money getPrice() {
        return price;
    }

    @Override
    public void setPrice(Money money) {
        this.price = money;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
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