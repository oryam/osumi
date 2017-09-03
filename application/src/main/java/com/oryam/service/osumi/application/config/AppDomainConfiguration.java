package com.oryam.service.osumi.application.config;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

import com.oryam.service.osumi.domain.DomainConfig;

@Profile("module-domain")
@Import(DomainConfig.class)
public class AppDomainConfiguration {

}
