package design_pattern.creational_patterns.singleton.springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {
    // 스프링 싱글톤 예제
    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringExample.class);
        String hello = applicationContext.getBean("hello", String.class);
    }
}
