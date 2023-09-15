package me.devlopery.actuatorstudy.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibarayInfoEndpointConfig {

    @Bean
    public MyLibraryInfoEndpoint myLibraryInfoEndpoint(){
        return new MyLibraryInfoEndpoint();
    }
}
