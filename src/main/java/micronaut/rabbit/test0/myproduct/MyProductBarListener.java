package micronaut.rabbit.test0.myproduct;

import com.rabbitmq.client.Envelope;


import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;
import jakarta.inject.Inject;

@RabbitListener(connection = "bar-connection")
public class MyProductBarListener {

    @Inject MyProductRepo repo;
    @Queue("product_queue1")
    public void receive(String product){
        repo.save("queue1:"+product);
    }
    @Queue("product_queue2")
    public void receive(String product, Envelope envelope){
        repo.save("queue2:"+product+" "+envelope.getRoutingKey());
    }
}
