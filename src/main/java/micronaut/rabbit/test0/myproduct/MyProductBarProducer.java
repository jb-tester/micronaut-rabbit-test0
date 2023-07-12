package micronaut.rabbit.test0.myproduct;


import io.micronaut.rabbitmq.annotation.Binding;
import io.micronaut.rabbitmq.annotation.RabbitClient;

@RabbitClient(value = "myproduct_exchange", connection = "bar-connection")
public interface MyProductBarProducer {
    @Binding("product1")
    void send(String product);

    void send(@Binding String binding, String product);
}
