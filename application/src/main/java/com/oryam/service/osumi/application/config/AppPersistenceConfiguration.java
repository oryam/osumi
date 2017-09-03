package com.oryam.service.osumi.application.config;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

import com.oryam.service.osumi.persistence.jpa.PersistenceConfig;

@Profile("module-persistence")
@Import(PersistenceConfig.class)
public class AppPersistenceConfiguration {

}
