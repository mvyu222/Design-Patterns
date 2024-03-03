package reporting;

public class ReportingImpl implements Reporting {

    @Override
    public void report(ProductsReceipt productsReceipt, ProductsDispatch productsDispatch, InventoryReport inventoryReport) {
        System.out.println("reporting");
    }



}
