package com.example.profilesPOC;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Profile("dev") // Esta config unicamente va a ser loaded cuando el profile activo sea DEV.
@Configuration
public class AppConfigDev {

    @PostConstruct
    public void test(){
        System.out.println("AppConfig loaded : DEV environment");
    }
}
