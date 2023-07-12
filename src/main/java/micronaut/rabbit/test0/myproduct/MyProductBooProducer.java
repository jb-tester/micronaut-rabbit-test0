package micronaut.rabbit.test0.myproduct;


import io.micronaut.rabbitmq.annotation.Binding;
import io.micronaut.rabbitmq.annotation.RabbitClient;
import io.micronaut.rabbitmq.annotation.RabbitProperty;

@RabbitClient(value = "myproduct_exchange", connection = "boo-connection")
//@RabbitProperty(name = "userId", value = "irina")
public interface MyProductBooProducer {
    @Binding("product3")
    @RabbitProperty(name = "priority", value = "1")
    @RabbitProperty(name = "messageId", value = "boo")
    void send(String product);

    void send(String product, @Binding String binding, @RabbitProperty("messageId") String property);
}
