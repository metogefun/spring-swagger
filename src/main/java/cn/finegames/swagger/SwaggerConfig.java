package cn.finegames.swagger;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * TODO
 *
 * @author wang zhaohui
 * @since 1.0.0
 */
@Configurable
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.finegames.swagger.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring Boot Swagger2")
                //创建人
                .contact(new Contact("Wang", "http://www.edianzu.com", ""))
                //版本号
                .version("1.0.0")
                //描述
                .description("API")
                .build();
    }
}
