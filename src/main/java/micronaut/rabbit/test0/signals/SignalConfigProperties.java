package micronaut.rabbit.test0.signals;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("my.signals")
public class SignalConfigProperties {

    String signalQueue;
    String signalExchange;
    String signalBinding;

    public String getSignalQueue() {
        return signalQueue;
    }

    public void setSignalQueue(String signalQueue) {
        this.signalQueue = signalQueue;
    }

    public String getSignalExchange() {
        return signalExchange;
    }

    public void setSignalExchange(String signalExchange) {
        this.signalExchange = signalExchange;
    }

    public String getSignalBinding() {
        return signalBinding;
    }

    public void setSignalBinding(String signalBinding) {
        this.signalBinding = signalBinding;
    }
}
