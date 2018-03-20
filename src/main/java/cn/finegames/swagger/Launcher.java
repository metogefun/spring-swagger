package cn.finegames.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * TODO
 *
 * @author wang zhaohui
 * @since 1.0.0
 */
@EnableSwagger2
@SpringBootApplication
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }
}
