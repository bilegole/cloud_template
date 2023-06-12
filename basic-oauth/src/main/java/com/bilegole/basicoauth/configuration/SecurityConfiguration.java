package com.bilegole.basicoauth.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.DefaultCookieSerializer;

import java.util.ArrayList;

@Configuration
@EnableRedisHttpSession
@EnableWebSecurity
public class SecurityConfiguration {

	@Autowired
	@Lazy
	PasswordEncoder passwordEncoder;

	@Bean
	DefaultCookieSerializer getCookieSerializer(){
		DefaultCookieSerializer serializer = new DefaultCookieSerializer();
		serializer.setCookiePath("/");
		serializer.setCookieMaxAge(-1);
		return serializer;
	}

	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception{
		return http
//				.csrf().disable()
				.authorizeHttpRequests((authorizeHttpRequests) ->
						authorizeHttpRequests
//								.requestMatchers("/**").hasRole("USER")
								.requestMatchers("/test/hello").permitAll()
								.requestMatchers("/test/login").authenticated()
								.anyRequest().authenticated()
				)
				.formLogin(Customizer.withDefaults())
				.build();
	}

	@Bean
	public UserDetailsManager userDetailsService(){
		User user = new User("yuang", passwordEncoder.encode("123456"), new ArrayList<>());
		return new InMemoryUserDetailsManager(user);
	}

	@Bean
	@Lazy
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}