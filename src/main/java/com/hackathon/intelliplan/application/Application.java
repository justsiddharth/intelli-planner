package com.hackathon.intelliplan.application;

import com.hackathon.intelliplan.configuration.ElasticsearchConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hackathon.intelliplan")
@EnableAutoConfiguration(exclude = {ElasticsearchConfiguration.class})
public class Application {
    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }
}
