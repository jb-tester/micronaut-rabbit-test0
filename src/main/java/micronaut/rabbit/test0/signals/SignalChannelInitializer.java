package micronaut.rabbit.test0.signals;

import com.rabbitmq.client.Channel;

import io.micronaut.rabbitmq.connect.ChannelInitializer;
import jakarta.inject.Singleton;
import java.io.IOException;

@Singleton
public class SignalChannelInitializer extends ChannelInitializer {
    @Override
    public void initialize(Channel channel, String name) throws IOException {
        channel.exchangeDeclare("signals_exchange","topic");
        channel.queueDeclare("signal_queue1",false,false,false,null);
        channel.queueDeclare("signal_queue2",false,false,false,null);
        channel.queueBind("signal_queue1","signals_exchange","signal1");
        channel.queueBind("signal_queue2","signals_exchange","signal2");


    }
}
