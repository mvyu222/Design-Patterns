package factory_method;

import java.util.List;

public class DomesticSubscription extends SubscriptionImpl {
    public DomesticSubscription(double monthlyFee, int minSubscriptionPeriod, List<String> channels) {
        super(monthlyFee, minSubscriptionPeriod, channels);
    }
}
