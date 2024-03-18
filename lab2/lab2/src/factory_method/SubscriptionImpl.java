package factory_method;

import java.util.List;

public class SubscriptionImpl implements Subscription {
    protected double monthlyFee;
    protected int minSubscriptionPeriod;
    protected List<String> channels;

    public SubscriptionImpl(double monthlyFee, int minSubscriptionPeriod, List<String> channels) {
        this.monthlyFee = monthlyFee;
        this.minSubscriptionPeriod = minSubscriptionPeriod;
        this.channels = channels;
    }

    @Override
    public double getMonthlyFee() {
        return monthlyFee;
    }

    @Override
    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    @Override
    public int getMinSubscriptionPeriod() {
        return minSubscriptionPeriod;
    }

    @Override
    public void setMinSubscriptionPeriod(int minSubscriptionPeriod) {
        this.minSubscriptionPeriod = minSubscriptionPeriod;
    }

    @Override
    public List<String> getChannels() {
        return channels;
    }

    @Override
    public void setChannels(List<String> channels) {
        this.channels = channels;
    }
}
