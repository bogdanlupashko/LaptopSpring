package org.bl.spring.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/all_context.xml")
public class Config {

//    public static ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");


}
