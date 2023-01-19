package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * @EnableAutoConfiguration
 *      @AutoConfigurationPackage -> @Import(AutoConfigurationPackages.Registrar.class) -> AutoConfigurationPackages.Registrar: register package location as bean definition
 *      @Import(AutoConfigurationImportSelector.class) -> group selector -> selectImports -> spring internal beans
 */
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //debug
        //1.construct SpringApplication
        //1.1 confirm which webApplicationType
        //2.SpringApplication run
        SpringApplication.run(Example.class, args);
    }

}