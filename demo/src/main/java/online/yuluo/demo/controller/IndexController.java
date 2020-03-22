package online.yuluo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index() {
        return "Hello,World";
    }
}
