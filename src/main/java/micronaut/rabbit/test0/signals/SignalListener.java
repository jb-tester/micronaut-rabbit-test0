package micronaut.rabbit.test0.signals;

import com.rabbitmq.client.Envelope;

import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;
import jakarta.inject.Inject;

@RabbitListener(connection = "signals-connection")
public class SignalListener {

    public static final String QUEUE_2 = "signal_queue2";

    @Inject SignalRepo repo;

    @Queue("${my.signals.signal-queue}")
    public void receive(String signal, Envelope envelope){
        repo.save("connection1: queue1: "+ signal+" via "+envelope.getRoutingKey());
    }

    @Queue(QUEUE_2)
    public void receive2(String signal, Envelope envelope){
        repo.save("connection1: queue2: "+ signal+" via "+envelope.getRoutingKey());
    }
}
