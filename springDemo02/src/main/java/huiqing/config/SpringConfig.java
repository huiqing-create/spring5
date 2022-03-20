package huiqing.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 用配置类替代配置文件，实现完全注解开发
 */
@Configuration
@ComponentScan(basePackages = {"huiqing"})
public class SpringConfig {

}
