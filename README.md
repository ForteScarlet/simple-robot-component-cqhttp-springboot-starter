# CQ HTTP组件 Springboot快速启动器

[![](https://img.shields.io/badge/simple--robot-core-green)](https://github.com/ForteScarlet/simple-robot-core) [![img](https://camo.githubusercontent.com/f8464f5d605886b8369ab6daf28d7130a72fd80e/68747470733a2f2f696d672e736869656c64732e696f2f6d6176656e2d63656e7472616c2f762f696f2e6769746875622e466f727465536361726c65742f73696d706c652d726f626f742d636f7265)](https://search.maven.org/artifact/io.github.ForteScarlet/simple-robot-core) <br>[![](https://img.shields.io/badge/simple--robot-component--cqhttp-green)](https://github.com/ForteScarlet/simple-robot-component-coolHttpApi)  [![](https://img.shields.io/maven-central/v/io.github.ForteScarlet.simple-robot-core/component-forcoolqhttpapi)](https://search.maven.org/artifact/io.github.ForteScarlet.simple-robot-core/component-forcoolqhttpapi) <br>[![](https://img.shields.io/badge/simple--robot-core--springboot--starter-green)](https://github.com/ForteScarlet/simple-robot-core-springboot-starter) <br>[![](https://img.shields.io/badge/simple--robot-component--cqhttp--springboot--starter-green)](https://github.com/ForteScarlet/simple-robot-component-cqhttp-springboot-starter)[![](https://img.shields.io/maven-central/v/io.github.ForteScarlet.simple-robot/component-cqhttp-spring-boot-starter)](https://search.maven.org/artifact/io.github.ForteScarlet.simple-robot/component-cqhttp-spring-boot-starter)<br>[![](https://img.shields.io/badge/%E7%9C%8B%E4%BA%91%E6%96%87%E6%A1%A3-doc-green)](https://www.kancloud.cn/forte-scarlet/simple-coolq-doc)  [![](https://img.shields.io/badge/QQ%E7%BE%A4-782930037-blue)](https://jq.qq.com/?_wv=1027&k=57ynqB1)  

## 使用
首先，引入依赖；
> https://search.maven.org/artifact/io.github.ForteScarlet.simple-robot/component-cqhttp-spring-boot-starter

**Maven**
```xml
<dependency>
    <groupId>io.github.ForteScarlet.simple-robot</groupId>
    <artifactId>component-cqhttp-spring-boot-starter</artifactId>
    <version>${version}</version>
</dependency>
```
**Gradle**
```
implementation 'io.github.ForteScarlet.simple-robot:component-cqhttp-spring-boot-starter:${version}'
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
其中，`@SimpleRobotSpringBootApplication`是[核心启动器](https://github.com/ForteScarlet/simple-robot-core)所提供的，如果切换官方启动器，理论上不需要变更代码。

## 其他链接

#### 核心

https://github.com/ForteScarlet/simple-robot-core

#### CQ HTTP组件

https://github.com/ForteScarlet/simple-robot-component-coolHttpApi

#### 核心Springboot启动器

https://github.com/ForteScarlet/simple-robot-core-springboot-starter

