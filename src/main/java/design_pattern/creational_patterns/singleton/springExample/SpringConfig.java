package design_pattern.creational_patterns.singleton.springExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public String hello(){
        return "hello";
    }
}
