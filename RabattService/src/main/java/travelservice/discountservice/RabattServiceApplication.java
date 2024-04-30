package travelservice.discountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DiscountConfig.class)
public class RabattServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabattServiceApplication.class, args);
    }

}
