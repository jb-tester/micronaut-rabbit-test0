package micronaut.rabbit.test0.signals;


import io.micronaut.rabbitmq.annotation.Binding;
import io.micronaut.rabbitmq.annotation.RabbitClient;

@RabbitClient(value = "signals_exchange",connection = "signals-connection2")
public interface SignalProducer2 {
    @Binding("${my.signals.signal-binding}")
    void send(String signal);
    @Binding("signal2")
    void send2(String signal);

}
