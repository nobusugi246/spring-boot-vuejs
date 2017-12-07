package com.example.vue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class VueController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
