package com.eazybytes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class ProjectSecurityConfig {

    /**
     * below is the custom security configurations
     */
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .cors().disable()
                .csrf().disable()
                .authorizeHttpRequests((requests) -> {
                    requests.requestMatchers(AntPathRequestMatcher.antMatcher("/api/**/login")).permitAll();
//                    requests.requestMatchers("/api/**/login").permitAll();
                    requests.requestMatchers("/test").authenticated();
                });
        http.formLogin();
        http.httpBasic();
        return http.build();
    }

}
