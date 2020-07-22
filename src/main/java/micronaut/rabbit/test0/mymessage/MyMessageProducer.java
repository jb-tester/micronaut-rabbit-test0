package micronaut.rabbit.test0.mymessage;

import io.micronaut.configuration.rabbitmq.annotation.Binding;
import io.micronaut.configuration.rabbitmq.annotation.RabbitClient;

@RabbitClient(connection = "foo-connection")
public interface MyMessageProducer {
    @Binding("micronaut-test0")
    void send(String data);

    @Binding("micronaut-test0")
    void send();
}