package br.com.cognitosb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@org.springframework.context.annotation.Configuration
@EnableWebSecurity
public class Configuration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
			http
			 	.authorizeHttpRequests(authorize -> authorize
					.anyRequest().authenticated())
				.oauth2Login(withDefaults());
			return http.build();
		}
	}


