package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import spittr.Spitter;
import spittr.data.SpitterRepository;
import spittr.data.SpittleRepository;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

/**
 * Created by Hao HOU on 2017/6/11.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {
    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        System.out.println("-----------------------------测试1-----------------------");
        model.addAttribute(new Spitter());
        System.out.println("-----------------------------测试2-----------------------");
        return "registerForm";
    }

    //TODO 报错 Exception evaluating SpringEL expression: "#fields.hasErrors('*')"
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(
            @Valid SpitterForm spitterForm,
            Errors errors) throws IllegalStateException, IOException {
        if (errors.hasErrors()) {
            return "registerForm";
        }

        System.out.println("-----------------------------测试3-----------------------");
        Spitter spitter = spitterForm.toSpitter();
        spitterRepository.save(spitter);
        System.out.println("-----------------------------测试4-----------------------");

//        MultipartFile profilePicture = spitterForm.getProfilePicture();
//        profilePicture.transferTo(new File("/tmp/spittr/" + spitter.getUsername() + ".jpg"));
        System.out.println("-----------------------------测试5-----------------------");
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(
            @PathVariable String username, Model model) {
        if (!model.containsAttribute("spitter")) {
            model.addAttribute(spitterRepository.findByUsername(username));
        }
        return "profile";
    }
}
