package se.bahram.springbootgraalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootGraalvmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGraalvmApplication.class, args);
    }

}

@RestController
@RequestMapping("/graalvm")
class GraalVmController {

    @GetMapping("/")
    String sayHello() {
        return "Hello GraalVM";
    }
}