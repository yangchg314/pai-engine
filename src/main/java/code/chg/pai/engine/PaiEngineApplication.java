package code.chg.pai.engine;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaiEngineApplication {

    public static void main(String[] args) {

        BeanFactory beanFactory=SpringApplication.run(PaiEngineApplication.class, args);
    }

}
