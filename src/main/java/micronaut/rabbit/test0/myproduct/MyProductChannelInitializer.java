package micronaut.rabbit.test0.myproduct;

import com.rabbitmq.client.Channel;
import io.micronaut.configuration.rabbitmq.connect.ChannelInitializer;

import javax.inject.Singleton;
import java.io.IOException;
@Singleton
public class MyProductChannelInitializer extends ChannelInitializer {
    @Override
    public void initialize(Channel channel) throws IOException {
       channel.exchangeDeclare("myproduct_exchange","topic");
       channel.queueDeclare("product_queue1",false,false,false,null);
       channel.queueDeclare("product_queue2",false,false,false,null);
       channel.queueDeclare("product_queue3",false,false,false,null);
       channel.queueDeclare("product_queue4",false,false,false,null);
       channel.queueBind("product_queue1","myproduct_exchange","product1");
       channel.queueBind("product_queue2","myproduct_exchange","product2");
       channel.queueBind("product_queue3","myproduct_exchange","product3");
       channel.queueBind("product_queue4","myproduct_exchange","product4");
    }
}
