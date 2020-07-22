package micronaut.rabbit.test0.mymessage;

import com.rabbitmq.client.Channel;
import io.micronaut.configuration.rabbitmq.connect.ChannelInitializer;

import javax.inject.Singleton;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class MyMessageChannelInitializer extends ChannelInitializer {
    @Override
    public void initialize(Channel channel) throws IOException {
        Map<String, Object> args = new HashMap<>();
        args.put("x-max-priority", 100);
        channel.queueDeclare("micronaut-test0", false, false, false, args);
    }
}
