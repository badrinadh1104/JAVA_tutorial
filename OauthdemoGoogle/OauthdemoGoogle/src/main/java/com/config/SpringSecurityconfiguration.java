package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.oauth.config.CustomOauth2UserService;
import com.oauth.config.Oauth2LoginSuccessHandler;
import com.service.CustomerService;

@Configuration
@EnableWebSecurity
public class SpringSecurityconfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	@Autowired
	private CustomJwtAuthenticationFilter customJwtAuthenticationFilter;
	@Autowired
	private CustomOauth2UserService customOAuth2UserService;
	@Autowired
	 private Oauth2LoginSuccessHandler oAuth2AuthenticationSuccessHandler;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customerService).passwordEncoder(passwordEncoder());
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.cors();
	    http.csrf().disable();
	    http.formLogin();
	    http.authorizeRequests()
	        .antMatchers("/helloadmin").hasRole("ADMIN")
	        .antMatchers("/hellouser").hasAnyRole("USER")
	        .antMatchers("/authenticate", "/register").permitAll()
	        .antMatchers("/oauth2/**").permitAll()
	        .anyRequest().authenticated()
	        .and()
	        .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint)
	        .and()
	        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	        .and()
	        .oauth2Login()
	            .loginPage("/login")
	            .userInfoEndpoint().userService(customOAuth2UserService)
	            .and()
	            .successHandler(oAuth2AuthenticationSuccessHandler)
	         
	        .and()
	        .addFilterBefore(customJwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
	        
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
