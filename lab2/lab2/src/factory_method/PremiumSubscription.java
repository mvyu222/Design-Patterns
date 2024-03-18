package factory_method;

import java.util.List;

public class PremiumSubscription extends SubscriptionImpl {
    public PremiumSubscription(double monthlyFee, int minSubscriptionPeriod, List<String> channels) {
        super(monthlyFee, minSubscriptionPeriod, channels);
    }
}
