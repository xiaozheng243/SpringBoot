package online.yuluo.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuluo
 */
@Api(value = "index测试类", description = "描述信息")
@RestController
@RequestMapping("/index")
public class IndexController {

    @ApiOperation(value = "index", notes = "home测试方法") // tags
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index() {
        return "Hello,World";
    }
}
