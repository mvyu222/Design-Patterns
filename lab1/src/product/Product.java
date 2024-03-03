package product;

import money.Money;

public interface Product {

    Money getPrice();

    void setPrice(Money money);

    String getName();

    void setName(String name);

    void setCategory(String category);

    String getCategory();

}


