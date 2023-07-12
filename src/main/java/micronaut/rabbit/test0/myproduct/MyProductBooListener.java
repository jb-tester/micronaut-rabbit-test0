package micronaut.rabbit.test0.myproduct;

import com.rabbitmq.client.BasicProperties;
import com.rabbitmq.client.Envelope;

import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;
import io.micronaut.rabbitmq.annotation.RabbitProperty;
import jakarta.inject.Inject;

@RabbitListener(connection = "boo-connection")
//@RabbitProperty(name = "userId", value = "irina")
public class MyProductBooListener {

    @Inject MyProductRepo repo;

    @Queue("product_queue3")
    public void receive(String product, @RabbitProperty("messageId") String messageId, @RabbitProperty("priority") Integer priority){
        repo.save("queue3:"+product+" "+messageId+priority);
    }
    @Queue("product_queue4")
    public void receive(String product, BasicProperties basicProperties, Envelope envelope){
        repo.save("queue4:"+product+" "+envelope.getRoutingKey()+" "+basicProperties.getMessageId());
    }
}
