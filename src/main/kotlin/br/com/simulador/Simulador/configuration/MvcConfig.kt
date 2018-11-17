package br.com.simulador.Simulador.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter



//@Configuration
//class MvcConfig : WebMvcConfigurer {
//    override fun addViewControllers(registry: ViewControllerRegistry) {
//
//        registry.addViewController("/home").setViewName("home")
//        registry.addViewController("/").setViewName("home")
//        registry.addViewController("/hello").setViewName("hello")
//        registry.addViewController("/login").setViewName("login")
//
////        super.addViewControllers(registry)
//    }
//
//    @Bean
//    fun corsConfigurer(): WebMvcConfigurer {
//        return object : WebMvcConfigurer {
//            override fun addCorsMappings(registry: CorsRegistry) {
//                registry.addMapping("/team").allowedOrigins("http://localhost:3000")
//                super.addCorsMappings(registry)
//            }
//        }
//    }
//}