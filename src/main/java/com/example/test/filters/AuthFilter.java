package com.example.test.filters;

import com.example.test.utility.RoleConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;

public class AuthFilter {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
            JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
            jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(new RoleConverter());
            httpSecurity
                    .authorizeHttpRequests(request ->
                            request
                                    .requestMatchers("/api/test").permitAll()
//                                    .requestMatchers("/api/swipe").hasRole("EMPLOYEE")
                                    .anyRequest()
                                    .authenticated()
                    )
                    .oauth2ResourceServer()
                    .jwt()
                    .jwtAuthenticationConverter(jwtAuthenticationConverter);
            return httpSecurity.build();
        }
}
