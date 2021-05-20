package com.flolep.metier.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.flolep.metier.repository")
public class RepositoryConfiguration {
}
