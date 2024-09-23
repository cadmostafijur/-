// // package admin_user.configurations;

// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.context.annotation.Bean;
// // import org.springframework.context.annotation.Configuration;
// // import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// // import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// // import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// // import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// // import org.springframework.security.crypto.password.PasswordEncoder;
// // import org.springframework.security.web.SecurityFilterChain;
// // import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

// // import admin_user.service.CustomSuccessHandler;
// // import admin_user.service.CustomUserDetailsService;

// // @Configuration
// // @EnableWebSecurity
// // public class SecurityConfig {
	
	
// // 	@Autowired
// // 	CustomSuccessHandler customSuccessHandler;
	
// // 	@Autowired
// // 	CustomUserDetailsService customUserDetailsService;
	
// // 	@Bean
// // 	public static PasswordEncoder passwordEncoder() {
// // 		return new BCryptPasswordEncoder();
// // 	}
	
	
// // 	@Bean
// // 	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		
// // 		http.csrf(c -> c.disable())
		
// // 		.authorizeHttpRequests(request -> request.requestMatchers("/admin-page")
		
// // 				.hasAuthority("ADMIN").requestMatchers("/user-page").hasAuthority("USER")
// // 				.requestMatchers("/home,/registration", "/css/**").permitAll()
// // 				.anyRequest().authenticated())
		
// // 		.formLogin(form -> form.loginPage("/login").loginProcessingUrl("/login")
// // 				.successHandler(customSuccessHandler).permitAll())
		
// // 		.logout(form -> form.invalidateHttpSession(true).clearAuthentication(true)
// // 				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
// // 				// .logoutSuccessUrl("/login?logout").permitAll());
// // 				.logoutSuccessUrl("/home").permitAll());
		
// // 		return http.build();
		
// // 	}
	
// // 	@Autowired
// // 	public void configure (AuthenticationManagerBuilder auth) throws Exception {
// // 		auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
// // 	}

// // }
// package admin_user.configurations;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


// import admin_user.service.CustomUserDetailsService;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

//     @Autowired
//     CustomUserDetailsService customUserDetailsService;

//     @Bean
//     public static PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//         http.csrf(csrf -> csrf.disable())
//             .authorizeHttpRequests(auth -> auth
//                 .requestMatchers("/", "/home", "/registration","/about","/services","/contact","/agroshop", "/css/**").permitAll()  // Updated to include the root URL
//                 .requestMatchers("/admin-page").hasAuthority("ADMIN")
//                 .requestMatchers("/user-page").hasAuthority("USER")
//                 .anyRequest().authenticated())
//             .formLogin(form -> form
//                 .loginPage("/login")
//                 .loginProcessingUrl("/login")
//                 .permitAll())
//             .logout(logout -> logout
//                 .invalidateHttpSession(true)
//                 .clearAuthentication(true)
//                 .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                 .logoutSuccessUrl("/home")
//                 .permitAll());

//         return http.build();
//     }

//     @Autowired
//     public void configure(AuthenticationManagerBuilder auth) throws Exception {
//         auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
//     }
// }
// package admin_user.configurations;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

// import admin_user.service.CustomUserDetailsService;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

//     @Autowired
//     CustomUserDetailsService customUserDetailsService;

//     @Bean
//     public static PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//         http.csrf(csrf -> csrf.disable())
//             .authorizeHttpRequests(auth -> auth
//                 .requestMatchers("/", "/home", "/registration", "/about", "/services", "/contact", "/agroshop", "/css/**").permitAll()  
//                 .requestMatchers("/admin-page").hasAuthority("ADMIN")
//                 .requestMatchers("/user-page").hasAuthority("USER")
//                 .anyRequest().authenticated())
//             .formLogin(form -> form
//                 .loginPage("/login")
//                 .loginProcessingUrl("/login")
//                 .defaultSuccessUrl("/user-page", true)  // Redirects to /user-page after successful login
//                 .permitAll())
//             .logout(logout -> logout
//                 .invalidateHttpSession(true)
//                 .clearAuthentication(true)
//                 .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                 .logoutSuccessUrl("/home")
//                 .permitAll());

//         return http.build();
//     }

//     @Autowired
//     public void configure(AuthenticationManagerBuilder auth) throws Exception {
//         auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
//     }
// }


package admin_user.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import admin_user.service.CustomUserDetailsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    CustomUserDetailsService customUserDetailsService;

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/home", "/registration", "/about", "/services", "/contact", "/agroshop", "/css/**").permitAll()
                .requestMatchers("/admin-page").hasAuthority("ADMIN")
                .requestMatchers("/user-page", "/sell").hasAuthority("USER")
                .anyRequest().authenticated())
            .formLogin(form -> form
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .successHandler(customSuccessHandler()) // Custom success handler for role-based redirection
                .permitAll())
            .logout(logout -> logout
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/home")
                .permitAll());

        return http.build();
    }

    @Bean
    public AuthenticationSuccessHandler customSuccessHandler() {
        return new AuthenticationSuccessHandler() {
            @Override
            public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, 
                                                org.springframework.security.core.Authentication authentication) 
                                                throws IOException, ServletException {
                String role = authentication.getAuthorities().stream()
                        .map(auth -> auth.getAuthority())
                        .findFirst()
                        .orElse("");

                if ("ADMIN".equals(role)) {
                    response.sendRedirect("/admin-page");
                } else if ("USER".equals(role)) {
                    response.sendRedirect("/user-page");
                } else {
                    response.sendRedirect("/home");
                }
            }
        };
    }

    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
    }
}
