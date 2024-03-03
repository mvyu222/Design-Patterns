package reporting;

import warehouse.Warehouse;

public class ProductsReceiptImpl implements ProductsReceipt {

    @Override
    public void registerProductsReceipt(Warehouse warehouse) {
        System.out.print(warehouse.getName());
    }
}
