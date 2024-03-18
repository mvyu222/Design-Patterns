package factory_method;

import java.util.List;

public interface SubscriptionFactory {
    Subscription createSubscription(int monthlyFee, int minPeriod, List<String> channels);
}
