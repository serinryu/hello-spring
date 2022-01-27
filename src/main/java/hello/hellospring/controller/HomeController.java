package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home"; //“/” 에 get 으로 접속시 “home” 템플릿이 띄워진다.
    }
}