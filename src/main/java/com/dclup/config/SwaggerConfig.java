package com.dclup.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {

    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                //在下面的方法中设置API的一些基本信息：标题、描述、版本号
                .apiInfo(buildApiInfo())
                //启动用于api选择的生成器
                .select()
                //拦截要生成API的包的名称
                .apis(RequestHandlerSelectors.basePackage("com.dclup.controller"))
                //拦截要声称API的具体接口，any代表所有
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo buildApiInfo() {
        //创建联系人对象
        Contact contact=new Contact("二狗","https://dclup.com","78133262@qq.com");
        return new ApiInfoBuilder()
                //文档标题
                .title("用户接口")
                //文档描述
                .description("用户的增删改查")
                //联系人
                .contact(contact)
                //版本号
                .version("1.0")
                //构建文档
                .build();
    }
}
