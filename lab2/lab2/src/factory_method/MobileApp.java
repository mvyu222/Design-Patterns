package factory_method;

import java.util.List;

public class MobileApp implements SubscriptionFactory {
    @Override
    public Subscription createSubscription(int monthlyFee, int minPeriod, List<String> channels) {
        return new EducationalSubscription(monthlyFee, minPeriod, channels);
    }
}
