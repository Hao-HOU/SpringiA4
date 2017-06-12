package com.springinaction.pizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hao HOU on 2017/6/12.
 */

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String redirectToFlow() {
        return "redirect:/pizza";
    }
}
