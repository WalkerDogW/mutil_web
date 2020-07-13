package site.java.u8c.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tao
 * @Date 2020/7/13
 * @Time 20:10
 */
@RestController
public class Hello2 {
    @GetMapping("/api/hello2")
    public String hello(){
        System.out.println("*************************hello");
        return "hello,u8c";
    }
}
