package micronaut.rabbit.test0.myproduct;

import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
@Singleton
public class MyProductRepo {
    List<String> products = new ArrayList<>();
    public void save(String pr){
        this.products.add(pr);
    }
    public List<String> display(){
        return products;
    }
}
