package kr.ac.kopo.ctc.spring.board.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    AuthProvider authProvider;
    
    @Override
    public void configure(WebSecurity web) throws Exception {
        // 허용되어야 할 경로들
        web.ignoring().antMatchers("/resources/**");
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        	.antMatchers("/register").permitAll()
        	.antMatchers("/**").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
        	.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
            .anyRequest().authenticated()
        .and()
        	.formLogin()
            .loginPage("/login")
            .permitAll()
        .and()
	        .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/login")
			.invalidateHttpSession(true)
		.and()
			.csrf()
			.disable();
    }

}

