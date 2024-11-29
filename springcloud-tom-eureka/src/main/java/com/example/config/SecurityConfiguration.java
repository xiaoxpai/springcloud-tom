//package com.example.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
////@Configuration
//public class SecurityConfiguration {
//
////    @Bean
////    public WebSecurityCustomizer webSecurityCustomizer() {
////
////        return (web) -> web.ignoring().antMatchers("/eureka/**");
////    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//// http.sessionManagement()
////                .sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
////                .and().requestMatchers().antMatchers("/eureka/**")
////                .and().authorizeRequests().antMatchers("/eureka/**")
////                .hasRole("SYSTEM").anyRequest().denyAll()
////                .and()
////                .httpBasic().and().csrf().disable();
//        //example
//        // http
//        //        .authorizeHttpRequests((authorize) -> authorize
//        //	    .requestMatchers("/endpoint").hasAuthority("USER")
//        //            .anyRequest().authenticated()
//        //        )
//        return http
//                .authorizeHttpRequests(authorize ->authorize.requestMatchers().hasAuthority("SYSTEM")
//                                        .anyRequest().authenticated()
////                        requests.anyRequest().authenticated()
////                        .requestMatchers("/eureka/**")
////                        .hasRole("SYSTEM").anyRequest().denyAll()
//                )
//                .httpBasic(Customizer.withDefaults())
//                // .csrf(AbstractHttpConfigurer::disable)
//                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable))
//                .build();
//
//    }
//
//}