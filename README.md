# CQ HTTP组件 Springboot快速启动器

## 使用
首先，引入依赖；
```xml
<dependency>
    <groupId>io.github.ForteScarlet.simple-robot</groupId>
    <artifactId>component-cqhttp-spring-boot-starter</artifactId>
    <version>${version}</version>
</dependency>
```

然后编写好配置类（与Springboot公用一个`application.properties`配置类）
配置编好后在启动类上使用`@SimpleRobotSpringBootApplication`代替`@SpringbootApplication`注解，并启动Springboot即可。
```java
@SimpleRobotSpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(Test1.class, args);
    }
}
```
