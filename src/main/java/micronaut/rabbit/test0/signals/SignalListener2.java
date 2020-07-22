package micronaut.rabbit.test0.signals;

import io.micronaut.configuration.rabbitmq.annotation.Queue;
import io.micronaut.configuration.rabbitmq.annotation.RabbitListener;

import javax.inject.Inject;

@RabbitListener(connection = "signals-connection2")
public class SignalListener2 {

    @Inject SignalRepo repo;

    @Queue("${my.signals.signal-queue}")
    public void receive(String signal){
        repo.save("connection2, queue1: "+signal);
    }

    @Queue("signal_queue2")
    public void receive2(String signal){
        repo.save("connection2, queue2: "+signal);
    }
}
