package ktds.cloud.cloudkvtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;


/**
 * Created By Cheetah on 2025-06-18.
 */
@Configuration
@EnableMethodSecurity
public class WebSecurity {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
           http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
               .csrf(AbstractHttpConfigurer::disable);
           return http.build();

    }
}
