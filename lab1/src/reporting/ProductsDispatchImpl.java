package reporting;

import warehouse.Warehouse;

public class ProductsDispatchImpl implements ProductsDispatch {

    @Override
    public void registerProductsDispatch(Warehouse product) {
        System.out.print(product.getName());
    }
}
