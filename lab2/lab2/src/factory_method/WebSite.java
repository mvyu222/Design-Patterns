package factory_method;

import java.util.List;

public class WebSite implements SubscriptionFactory {
    @Override
    public Subscription createSubscription(int monthlyFee, int minPeriod, List<String> channels) {
        return new DomesticSubscription(monthlyFee, minPeriod, channels);
    }
}
