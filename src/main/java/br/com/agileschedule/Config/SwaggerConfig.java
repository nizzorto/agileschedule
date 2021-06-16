package br.com.agileschedule.Config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.agileschedule"))
                .paths(PathSelectors.regex("/.*"))
                .build()
                .apiInfo(metaInfo());
    }
        private ApiInfo metaInfo(){
            ApiInfo apiInfo = new ApiInfo("AgileSchedule", "Sistema de gerenciamento dos estagiarios", "Criado pela Squad-4", "Terms",
                    new Contact("Sptint4-SpringBoot","https://github.com/nizzorto/agileschedule", null), null, null,
                    new ArrayList<VendorExtension>()
                    );
            return apiInfo;


    }
}
