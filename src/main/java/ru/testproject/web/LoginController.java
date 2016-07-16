package ru.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by SmirnAA on 16.07.2016.
 */
@Controller
public class LoginController {

    private static final String HELLO_VIEW = "hello";

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("subject", "world");
        return HELLO_VIEW;
    }
}
