package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Hao HOU on 2017/6/11.
 */
@Controller
@RequestMapping("/homepage")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        return "home";
    }
}
