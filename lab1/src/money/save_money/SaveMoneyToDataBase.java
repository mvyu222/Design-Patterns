package money.save_money;

import money.Money;

public class SaveMoneyToDataBase implements SaveMoney {
    @Override
    public void save(Money money) {
        System.out.print("save" + money.toString() + "to database");
    }
}
