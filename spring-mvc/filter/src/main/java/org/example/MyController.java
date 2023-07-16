package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// 过滤器拦截每一个请求
@Controller
public class MyController {
    @PostMapping("/filter")
    @ResponseBody
    public String filter(@RequestBody String body) {
        System.out.println(body);
        return "filterResponse";
    }

}
