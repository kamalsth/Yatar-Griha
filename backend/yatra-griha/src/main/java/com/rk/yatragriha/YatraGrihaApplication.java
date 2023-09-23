package com.rk.yatragriha;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class YatraGrihaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YatraGrihaApplication.class, args);
    }
    @Bean
	public OpenAPI customOpenAPI(){
        OpenAPI openAPI = new OpenAPI();
        Info info = new Info();
        openAPI.info(info.version(version));
        openAPI.info(info.title(title));
        openAPI.info(info.description(description));
        openAPI.info(info.contact(new Contact().name(contactName)));
        return openAPI;
    }
    @Value("${swagger.api.title}")
    private String title;

    @Value("${swagger.api.description}")
    private String description;

    @Value("${swagger.api.version}")
    private String version;

//    @Value("${swagger.api.termsOfServiceUrl}")
//    private String termsOfServiceUrl;

    @Value("${swagger.api.contact.name}")
    private String contactName;

//    @Value("${swagger.api.contact.url}")
//    private String contactUrl;

}
