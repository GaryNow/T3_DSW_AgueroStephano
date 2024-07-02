package pe.edu.cibertec.dsw2_t3_aguerostephano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Dsw2T3AgueroStephanoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dsw2T3AgueroStephanoApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer configGlobalCors(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("api/v1/**")
                        .allowedMethods("GET", "POST", "PUT")
                        .allowedOrigins("https://www.cibertec.edu.pe");
            }
        };
    }

}
