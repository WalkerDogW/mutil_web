package site.java.admin.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tao
 * @Date 2020/7/13
 * @Time 20:10
 */
@RestController
public class Hello {
    @GetMapping("/api/hello")
    public String hello(){
        System.out.println("*************************hello");
        return "hello,u8c";
    }
}
