package warehouse;

import product.Product;

public interface Warehouse extends Product {

    String getUnitOfMeasure();

    void setUnitOfMeasure(String unitOfMeasure);

    int getQuantity();

    void setQuantity(int quantity);
}