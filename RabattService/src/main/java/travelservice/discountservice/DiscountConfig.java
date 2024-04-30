package travelservice.discountservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")
public class DiscountConfig {

    @Bean
    public DiscountService discountService() {
        return new DiscountServiceImpl();
    }

    private String message = "Message from backend is: %s <br/> Services: %s";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
