import money.Dollar;
import money.MoneyImpl;
import money.save_money.SaveMoney;
import money.save_money.SaveMoneyToDataBase;
import product.PriceReducible;
import product.PriceReducibleImpl;
import product.Product;
import product.ProductImpl;
import reporting.*;
import warehouse.Warehouse;
import warehouse.WarehouseImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //money impl
        MoneyImpl money = new Dollar(12, 10);
        money.printAmount();

        //save in dataBase
        SaveMoney saverMoney = new SaveMoneyToDataBase();
        saverMoney.save(money);

        // product impl
        Product product = new ProductImpl("Product 1", money, "Some category");

        product.getPrice().printAmount();
        // priceReducible impl
        PriceReducible priceReducible = new PriceReducibleImpl();
        priceReducible.reducePrice(money, product);

        product.getPrice().printAmount();

        //reporting
        InventoryReport inventoryReport = new InventoryReportImpl();
        ProductsDispatch productsDispatch = new ProductsDispatchImpl();
        ProductsReceipt productsReceipt = new ProductsReceiptImpl();
        Reporting reporting = new ReportingImpl();
        reporting.report(productsReceipt, productsDispatch, inventoryReport);

        Warehouse warehouse = new WarehouseImpl("Measure", 12, money, "name", "category");
        productsReceipt.registerProductsReceipt(warehouse);



    }
}