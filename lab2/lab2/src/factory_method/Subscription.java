package factory_method;

import java.util.List;

public interface Subscription {

     double getMonthlyFee();

     void setMonthlyFee(double monthlyFee);

     int getMinSubscriptionPeriod();

     void setMinSubscriptionPeriod(int minSubscriptionPeriod);

     List<String> getChannels();

     void setChannels(List<String> channels);
}
