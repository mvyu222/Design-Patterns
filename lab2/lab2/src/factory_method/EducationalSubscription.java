package factory_method;

import java.util.List;

public class EducationalSubscription extends SubscriptionImpl {
    public EducationalSubscription(double monthlyFee, int minSubscriptionPeriod, List<String> channels) {
        super(monthlyFee, minSubscriptionPeriod, channels);
    }
}
