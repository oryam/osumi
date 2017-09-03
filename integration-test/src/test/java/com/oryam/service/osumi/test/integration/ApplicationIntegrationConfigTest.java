package com.oryam.service.osumi.test.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.oryam.service.osumi.common.CommonConfig;
import com.oryam.service.osumi.domain.DomainConfig;
import com.oryam.service.osumi.persistence.jpa.PersistenceConfig;
import com.oryam.service.osumi.web.WebConfig;

@SpringBootApplication
@Import({ CommonConfig.class, DomainConfig.class, PersistenceConfig.class, WebConfig.class })
public class ApplicationIntegrationConfigTest {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationIntegrationConfigTest.class, args);
    }

}
