package micronaut.rabbit.test0.myproduct;

import com.rabbitmq.client.BasicProperties;
import com.rabbitmq.client.Envelope;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import java.util.List;

@Controller
public class MyProductController {

    @Inject MyProductRepo repo;
    @Inject
    MyProductBarProducer barProducer;
    @Inject MyProductBooProducer booProducer;
    @Post("/products1/{product}")
    public void addProduct1(String product){
        barProducer.send(product);
    }
    @Post("/products2/{product}")
    public void addProduct2(String product){
        barProducer.send("product2",product);
    }
    @Post("/products3/{product}")
    public void addProduct3(String product){

        booProducer.send(product);
    }
    @Post("/products4/{product}")
    public void addProduct4(String product){

        booProducer.send(product,"product4","boooo");
    }
    @Get("/products")
    public List<String> getProducts(){
        return repo.products;
    }
}
