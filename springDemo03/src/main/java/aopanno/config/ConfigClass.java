package aopanno.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 该类为完全注解开发的配置类，下面三个注解不能少
 */
@Configuration
@ComponentScan(basePackages = {"aopanno"})  //相当于配置文件中的组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true) //相当于配置文件中的生成代理对象的配置

public class ConfigClass {
}
