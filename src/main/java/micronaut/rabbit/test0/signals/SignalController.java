package micronaut.rabbit.test0.signals;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import jakarta.inject.Inject;
import java.util.List;

@Controller
public class SignalController {

    @Inject SignalProducer producer;
    @Inject SignalRepo repo;

    @Post("/signals/add/{signal}")
    public void addSignal(String signal){
        producer.send(signal);
        producer.send2(signal);
    }
    @Get("/all_signals")
    public List<String> getAll(){
        return repo.display();
    }
}
