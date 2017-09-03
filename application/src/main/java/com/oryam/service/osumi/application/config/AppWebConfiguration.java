package com.oryam.service.osumi.application.config;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

import com.oryam.service.osumi.web.WebConfig;

@Profile("module-web")
@Import(WebConfig.class)
public class AppWebConfiguration {

}
