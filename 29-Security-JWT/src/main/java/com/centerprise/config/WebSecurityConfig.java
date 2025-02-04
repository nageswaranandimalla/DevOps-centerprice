package com.centerprise.config;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@Configuration
@EnableWebFluxSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

}
