package org.bl.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/resources/all_context.xml")
@ComponentScan(basePackages = {"org.bl.spring.service"},
        scopeResolver = org.springframework.context.annotation.Jsr330ScopeMetadataResolver.class)
public class Config  {

}
