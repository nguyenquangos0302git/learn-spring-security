package com.eazybytes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    @Order(1)
    SecurityFilterChain defaultSecurityFilterChain1(HttpSecurity http) throws Exception {
        http
                .cors().disable()
                .csrf().disable()
                .securityMatcher(AntPathRequestMatcher.antMatcher("/api/**/login"))
                .authorizeHttpRequests(request -> request.anyRequest().authenticated());
        http.formLogin();
        http.httpBasic();
        return http.build();
    }

    @Bean
    @Order(2)
    SecurityFilterChain defaultSecurityFilterChain2(HttpSecurity http) throws Exception {
        http
                .cors().disable()
                .csrf().disable()
                .securityMatcher(AntPathRequestMatcher.antMatcher("/h2-console/**"))
                .authorizeHttpRequests(request -> request.anyRequest().permitAll());
        return http.build();
    }

    @Bean
    @Order(3)
    SecurityFilterChain defaultSecurityFilterChain3(HttpSecurity http) throws Exception {
        http
                .cors().disable()
                .csrf().disable()
                .authorizeHttpRequests(request -> request.anyRequest().authenticated());
        http.formLogin();
        http.httpBasic();
        return http.build();
    }

}
