package pl.lotto.domain;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class LottoSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(LottoSpringBootApplication.class, args);
    }

}
