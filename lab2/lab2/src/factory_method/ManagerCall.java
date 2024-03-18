package factory_method;

import java.util.List;

public class ManagerCall implements SubscriptionFactory {
    @Override
    public Subscription createSubscription(int monthlyFee, int minPeriod, List<String> channels) {
        return new PremiumSubscription(monthlyFee, minPeriod, channels);
    }
}
