package study.shopstudys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ShopStudysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopStudysApplication.class, args);

    }

}

