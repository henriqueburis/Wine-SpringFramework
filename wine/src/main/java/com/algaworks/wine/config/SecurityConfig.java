package com.algaworks.wine.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//Setando o usuario na classe sem banco de dados
		auth.inMemoryAuthentication()
		.withUser("buris").password("buris").roles("").and();
//		.withUser("admin").password("admin").roles("ROLE_CADASTRO");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/layout/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		//Define Qual pagina vai ser bloqueio pela Role
//		.antMatchers("/vinhos/novo").hasRole("ROLE_CADASTRO")
		.anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and()
				.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}

}
