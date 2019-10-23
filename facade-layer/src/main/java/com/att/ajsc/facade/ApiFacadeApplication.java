package com.att.ajsc.facade;

import com.att.ajsc.facade.filters.pre.PreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ApiFacadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFacadeApplication.class, args);
	}

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
}
