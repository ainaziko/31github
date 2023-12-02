package whz.pti.pizzaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PizzaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PizzaProjectApplication.class, args);
    }

}
