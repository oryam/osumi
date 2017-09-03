package com.oryam.service.osumi.application.config;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

import com.oryam.service.osumi.common.CommonConfig;

@Profile("module-common")
@Import(CommonConfig.class)
public class AppCommonConfiguration {

}
