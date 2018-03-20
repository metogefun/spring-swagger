# spring-swagger

spring boot与swagger绑定。



Without Spring Boot, you don’t have the luxury of auto-configuration of your resource handlers. Swagger UI adds a set of resources which you must configure as part of a class that extends WebMvcConfigurerAdapter, and is annotated with @EnableWebMvc.

``` java
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("swagger-ui.html")
      .addResourceLocations("classpath:/META-INF/resources/");
 
    registry.addResourceHandler("/webjars/**")
      .addResourceLocations("classpath:/META-INF/resources/webjars/");
}
```