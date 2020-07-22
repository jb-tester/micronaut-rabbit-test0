package micronaut.rabbit.test0.signals;

import io.micronaut.configuration.rabbitmq.annotation.Binding;
import io.micronaut.configuration.rabbitmq.annotation.RabbitClient;

@RabbitClient(value = "${my.signals.signal-exchange}",connection = "signals-connection")
public interface SignalProducer {
    @Binding("${my.signals.signal-binding}")
    void send(String signal);
    @Binding("signal2")
    void send2(String signal);
}
